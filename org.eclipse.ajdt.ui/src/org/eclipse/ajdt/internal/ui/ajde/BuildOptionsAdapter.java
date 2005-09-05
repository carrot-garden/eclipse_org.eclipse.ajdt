/**********************************************************************
Copyright (c) 2002, 2005 IBM Corporation and others.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Common Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/cpl-v10.html
Contributors:
Adrian Colyer, Andy Clement, Tracy Gardner - initial version
Ian McGrath - updated compiler option retrieving methods
Matt Chapman - reorganised for project properties (40446)
**********************************************************************/
package org.eclipse.ajdt.internal.ui.ajde;

import org.eclipse.ajdt.core.AspectJPlugin;
import org.eclipse.ajdt.core.builder.CoreBuildOptions;
import org.eclipse.ajdt.internal.ui.preferences.AspectJPreferences;
import org.eclipse.ajdt.ui.AspectJUIPlugin;
import org.eclipse.core.resources.IProject;

public class BuildOptionsAdapter extends CoreBuildOptions {

	/**
	 * @see BuildOptionsAdapter#getNonStandardOptions()
	 */
	public String getNonStandardOptions() {
		IProject currentProject = AspectJPlugin.getDefault().getCurrentProject();
		String nonStandardOptions = AspectJPreferences.getCompilerOptions(currentProject);		
		nonStandardOptions += AspectJPreferences.getLintOptions(currentProject);
		nonStandardOptions += AspectJPreferences.getAdvancedOptions(currentProject);
		if (AspectJUIPlugin.getDefault().getAjdtBuildOptionsAdapter().getShowWeaveMessages()) {
			nonStandardOptions += " -showWeaveInfo"; //$NON-NLS-1$
		}
		return nonStandardOptions;
	}

	/**
	 * @see BuildOptionsAdapter#getUseJavacMode()
	 */
	public boolean getIncrementalMode() {
		IProject currentProject = AspectJPlugin.getDefault().getCurrentProject();			
		boolean incrementalMode = AspectJPreferences.getIncrementalOption(currentProject);
		
		if (AspectJUIPlugin.DEBUG_BUILDER) {
			System.out.println(
				"BuildOptionsAdapter.getIncrementalMode called, returning :" //$NON-NLS-1$
					+ new Boolean(incrementalMode));
		}

		return incrementalMode;
	}
	
	public boolean getBuildAsm() {
		IProject currentProject = AspectJPlugin.getDefault().getCurrentProject();		
		boolean buildAsm = AspectJPreferences.getBuildASMOption(currentProject);

		if (AspectJUIPlugin.DEBUG_BUILDER) {
			System.out.println("BuildOptionsAdapter.getBuildAsm called, returning :" //$NON-NLS-1$
				+ new Boolean(buildAsm));
		}
		return buildAsm;
	}
	
	public boolean getShowWeaveMessages() {
		IProject currentProject = AspectJPlugin.getDefault().getCurrentProject();	
		boolean showweavemessages =  AspectJPreferences.getShowWeaveMessagesOption(currentProject);
		if (AspectJUIPlugin.DEBUG_BUILDER) {
			System.out.println("BuildOptionsAdapter.getShowWeaveMessages called, returning :" //$NON-NLS-1$
				+ new Boolean(showweavemessages));
		}
		return showweavemessages;
	}
	
}