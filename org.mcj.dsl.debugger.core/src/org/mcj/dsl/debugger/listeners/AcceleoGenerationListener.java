package org.mcj.dsl.debugger.listeners;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class AcceleoGenerationListener implements
		IAcceleoTextGenerationListener {

	@Override
	public void textGenerated(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void filePathComputed(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void fileGenerated(AcceleoTextGenerationEvent event) {
	}

	@Override
	public void generationEnd(AcceleoTextGenerationEvent event) {
		System.out.println("Generation ended.");
		// We are going to create the traceability model here.
		EObject eo = event.getTraceabilityInformation();
		try {
			URI uri = URI.createPlatformResourceURI("/org.mcj.karel.example/trace-model.xmi", false);
			Resource res = new XMIResourceImpl(uri); // TODO use better path
			Map<String, Boolean> options = new HashMap<String, Boolean>();
			
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			// options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
			options.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
			//options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			res.getContents().add(eo);
			res.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean listensToGenerationEnd() {
		return true;
	}

}
