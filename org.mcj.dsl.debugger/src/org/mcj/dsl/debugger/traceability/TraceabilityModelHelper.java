package org.mcj.dsl.debugger.traceability;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.jws.WebParam.Mode;

import org.eclipse.acceleo.traceability.GeneratedFile;
import org.eclipse.acceleo.traceability.GeneratedText;
import org.eclipse.acceleo.traceability.InputElement;
import org.eclipse.acceleo.traceability.ModelFile;
import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;

public class TraceabilityModelHelper {

	private TraceabilityModelHelper() {
		throw new AssertionError();
	}

	private static class Region implements Comparable<Region> {
		int startOffset;
		int endOffset;
		
		@Override
		public int compareTo(Region o) {
			int result = this.startOffset - o.startOffset;
			if (result == 0) {
				result = this.endOffset - o.endOffset;
			}
			return result;
		}
	}

	public static SimpleMapping getMappingToJava(IResource source, int lineNumber, TraceabilityModel traceModel,
			EObject dslProgramModel) {

		SimpleMapping simpleMapping = new SimpleMapping();
		simpleMapping.sourceLineNumber = lineNumber;
		simpleMapping.source = source;

		if (fillMappingToJava(simpleMapping, traceModel, dslProgramModel)) {
			return simpleMapping;
		} else {
			return null;
		}

	}

	public static boolean fillMappingToJava(SimpleMapping simpleMapping, TraceabilityModel traceModel,
			EObject dslProgramModel) {
		EObject eo = getElementForLine(simpleMapping.sourceLineNumber, dslProgramModel);
		InputElement associatedInputElement = getAssociatedInputElement(eo, traceModel);

		if (associatedInputElement != null) {
			for (GeneratedFile gFile : traceModel.getGeneratedFiles()) {
				// There are generally more regions that forms the generated
				// code. These regions should be merged to one.
				List<Region> regions = new ArrayList<Region>();
				for (GeneratedText gText : gFile.getGeneratedRegions()) {
					if (gText.getSourceElement() == associatedInputElement) {
						Region region = new Region();
						region.startOffset = gText.getStartOffset();
						region.endOffset = gText.getEndOffset();
						regions.add(region);
						// simpleMapping.targetStartChar =
						// gText.getStartOffset();
						// simpleMapping.targetEndChar = gText.getEndOffset();
						/*
						 * try { URI targetURI = new URI("file",
						 * gText.getOutputFile().getPath(), ""); IWorkspaceRoot
						 * root = ResourcesPlugin.getWorkspace().getRoot();
						 * IFile[] files =
						 * root.findFilesForLocationURI(targetURI); if
						 * (files.length > 1) { // TODO: What if the target file
						 * is represented by more than one resource? } if
						 * (files.length != 0) { simpleMapping.target =
						 * files[0]; return true; } } catch (URISyntaxException
						 * e) { e.printStackTrace(); }
						 */
					}
				}
				if (regions.size() > 0) {
					Collections.sort(regions);
					// TODO: This does not consider holes between regions, but it is sufficient for now.
					simpleMapping.targetStartChar = regions.get(0).startOffset;
					simpleMapping.targetEndChar = regions.get(regions.size() - 1).endOffset;
					
					try {
						URI targetURI = new URI("file", gFile.getPath(), "");
						IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
						IFile[] files = root.findFilesForLocationURI(targetURI);
						if (files.length > 1) {
							// TODO: What if the target file is represented by
							// more than one resource?
						}
						if (files.length != 0) {
							simpleMapping.target = files[0];
							return true;
						}
					} catch (URISyntaxException e) {
						e.printStackTrace();
					}

				}
			}
		}
		return false;

	}

	private static boolean equals(CompositeNode cNode1, CompositeNode cNode2) {
		return cNode1 != null && cNode2 != null && cNode1.getOffset() == cNode2.getOffset()
				&& cNode1.getTotalOffset() == cNode2.getTotalOffset()
				&& cNode1.getTotalLength() == cNode2.getTotalLength();
	}

	public static InputElement getAssociatedInputElement(EObject eo, TraceabilityModel traceModel) {
		CompositeNode cNode1 = getCompositeNodeForEObject(eo);
		InputElement result = null;

		if (cNode1 != null) {
			for (ModelFile modelFile : traceModel.getModelFiles()) {
				for (InputElement ie : modelFile.getInputElements()) {
					EObject modelElement = ie.getModelElement();
					CompositeNode cNode2 = getCompositeNodeForEObject(modelElement);
					if (equals(cNode1, cNode2)) {
						result = ie;

					}
				}
			}
		}
		return result;
	}

	public static EObject getElementForLine(int lineNumber, EObject dslProgramModel) {
		AbstractNode aNode = getCompositeNodeForEObject(dslProgramModel);
		return getElementForAbstractNode(aNode, lineNumber);
	}

	public static EObject getElementForAbstractNode(AbstractNode aNode, int lineNumber) {
		if (lineNumber == aNode.getLine() || (lineNumber > aNode.getLine() && lineNumber <= aNode.endLine())) {
			if (aNode instanceof CompositeNode) {
				for (AbstractNode childNode : ((CompositeNode) aNode).getChildren()) {
					EObject result = getElementForAbstractNode(childNode, lineNumber);
					if (result != null) {
						return result;
					}
				}
			} else {
				return NodeUtil.getNearestSemanticObject(aNode);
			}

		} else {
			return null;
		}
		return null;
	}

	public static CompositeNode getCompositeNodeForEObject(EObject eo) {
		NodeAdapter nodeAdapter = NodeUtil.getNodeAdapter(eo);
		if (nodeAdapter != null) {
			return nodeAdapter.getParserNode();
		}
		return null;
	}

}
