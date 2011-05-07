package org.mcj.dsl.debugger.ui.launch.tabs;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.mcj.dsl.debugger.ui.internal.BrowseDialogsHelper;
import org.mcj.dsl.debugger.launch.DSLDebuggerConfigurationConstants;

/**
 * This is the main DSL Debuger launch configuration tab.
 * 
 * @author macjariel
 * 
 */
@SuppressWarnings("restriction")
public class DSLDebuggerMainTab extends AbstractLaunchConfigurationTab {

	@Override
	public void createControl(Composite parent) {
		Composite comp = SWTFactory.createComposite(parent, 1, 1, GridData.FILL_BOTH);

		((GridLayout) comp.getLayout()).verticalSpacing = 0;
		createDSLModelEditor(comp);
		createTraceabilityModelEditor(comp);
		setControl(comp);

	}

	protected void createDSLModelEditor(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "DSL program", 2, 1, GridData.FILL_HORIZONTAL);
		dslProgramFilenameText = SWTFactory.createSingleText(group, 1);
		Button showButton = SWTFactory.createPushButton(parent, "Select...", null);
		showButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleDSLProgramFileSelection();
			}
		});
	}

	protected void createTraceabilityModelEditor(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Traceability model", 2, 1, GridData.FILL_HORIZONTAL);
		traceabilityModelFilenameText = SWTFactory.createSingleText(group, 1);
		Button showButton = SWTFactory.createPushButton(parent, "Select...", null);
		showButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleTraceabilityModelFileSelection();
			}
		});
	}

	private void handleDSLProgramFileSelection() {
		IFile dslProgramFile = BrowseDialogsHelper.browseForFile(getShell(), ResourcesPlugin.getWorkspace().getRoot(),
				"");
		if (dslProgramFile != null) {
			dslProgramFilenameText.setText(dslProgramFile.getFullPath().toPortableString());
			setDirty(true);
			updateLaunchConfigurationDialog();
		}

	}

	private void handleTraceabilityModelFileSelection() {
		IFile traceabilityModelFile = BrowseDialogsHelper.browseForFile(getShell(), ResourcesPlugin.getWorkspace()
				.getRoot(), "");
		if (traceabilityModelFile != null) {
			traceabilityModelFilenameText.setText(traceabilityModelFile.getFullPath().toPortableString());
			setDirty(true);
			updateLaunchConfigurationDialog();
		}

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		
		try {
			dslProgramFilenameText.setText(configuration.getAttribute(DSLDebuggerConfigurationConstants.ATTR_DSL_PROGRAM_FILENAME, ""));
			traceabilityModelFilenameText.setText(configuration.getAttribute(DSLDebuggerConfigurationConstants.ATTR_TRACEABILITY_MODEL_FILENAME, ""));
		} catch (CoreException e) {
			// TODO: How come the following line works in Michal Malohlava's code??
			// DSLDebuggerUIPlugin.log(e);
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DSLDebuggerConfigurationConstants.ATTR_DSL_PROGRAM_FILENAME, dslProgramFilenameText.getText());
		configuration.setAttribute(DSLDebuggerConfigurationConstants.ATTR_TRACEABILITY_MODEL_FILENAME, traceabilityModelFilenameText.getText());

	}

	@Override
	public String getName() {
		return "DSL Debugger";
	}

	private Text dslProgramFilenameText;
	private Text traceabilityModelFilenameText;

}
