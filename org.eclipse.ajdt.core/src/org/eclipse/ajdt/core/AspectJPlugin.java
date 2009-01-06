/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Matt Chapman - initial version
 *     Helen Hawkins - updated for new ajde interface (bug 148190)
 *******************************************************************************/
package org.eclipse.ajdt.core;

import java.util.HashMap;

import org.eclipse.ajdt.core.codeconversion.ITDAwareNameEnvironment;
import org.eclipse.ajdt.core.javaelements.ITDAwareSourceTypeInfo;
import org.eclipse.ajdt.core.model.AJProjectModelFacade;
import org.eclipse.ajdt.core.parserbridge.AJCompilationUnitProblemFinder;
import org.eclipse.ajdt.internal.core.CompilerConfigResourceChangeListener;
import org.eclipse.ajdt.internal.core.ajde.CoreCompilerFactory;
import org.eclipse.ajdt.internal.core.ajde.ICompilerFactory;
import org.eclipse.ajdt.internal.core.contentassist.ContentAssistProvider;
import org.eclipse.ajdt.internal.core.ras.NoFFDC;
import org.eclipse.contribution.jdt.IsWovenTester;
import org.eclipse.contribution.jdt.itdawareness.INameEnvironmentProvider;
import org.eclipse.contribution.jdt.itdawareness.ITDAwarenessAspect;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.WorkingCopyOwner;
import org.eclipse.jdt.internal.compiler.SourceElementParser;
import org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration;
import org.eclipse.jdt.internal.compiler.env.ISourceType;
import org.eclipse.jdt.internal.core.CompilationUnit;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.jdt.internal.core.SearchableEnvironment;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jdt.internal.core.SourceTypeElementInfo;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class AspectJPlugin extends Plugin implements NoFFDC {
	//The shared instance.
	private static AspectJPlugin plugin;

	// id of this plugin
	public static final String PLUGIN_ID = "org.eclipse.ajdt.core"; //$NON-NLS-1$

	// plugin containing aspectjtools.jar, or the contents thereof
    public static final String TOOLS_PLUGIN_ID = "org.aspectj.ajde"; //$NON-NLS-1$

	// plugin containing aspectjweaver.jar, or the contents thereof
    public static final String WEAVER_PLUGIN_ID = "org.aspectj.weaver"; //$NON-NLS-1$

	// the plugin containing aspectjrt.jar
	public static final String RUNTIME_PLUGIN_ID = "org.aspectj.runtime"; //$NON-NLS-1$

	public static final String ID_BUILDER = PLUGIN_ID + ".ajbuilder"; //$NON-NLS-1$

	/**
	 * The name of the default build config file for an AspectJ project
	 */
	public static final String DEFAULT_CONFIG_FILE = ".generated.lst"; //$NON-NLS-1$

	public static final String UI_PLUGIN_ID = "org.eclipse.ajdt.ui"; //$NON-NLS-1$	
	public static final String ID_NATURE = UI_PLUGIN_ID + ".ajnature"; //$NON-NLS-1$

	public static final String JAVA_NATURE_ID = "org.eclipse.jdt.core.javanature"; //$NON-NLS-1$
	
	public static final String AJ_FILE_EXT = "aj"; //$NON-NLS-1$
	
	public static final String ASPECTJRT_CONTAINER = PLUGIN_ID + ".ASPECTJRT_CONTAINER"; //$NON-NLS-1$
	
	// AspectJ keywords
    public static final String[] ajKeywords = { "aspect", "pointcut", "privileged", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// Pointcut designators: methods and constructora
		"call", "execution", "initialization", "preinitialization" , //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		// Pointcut designators: exception handlers
		"handler", //$NON-NLS-1$
		// Pointcut designators: fields
		"get", "set", //$NON-NLS-1$ //$NON-NLS-2$
		// Pointcut designators: static initialization
		"staticinitialization", //$NON-NLS-1$
		// Pointcut designators: object
		// (this already a Java keyword)
		"target", "args", //$NON-NLS-1$ //$NON-NLS-2$
		// Pointcut designators: lexical extents
		"within", "withincode", //$NON-NLS-1$ //$NON-NLS-2$
		// Pointcut designators: control flow
		"cflow", "cflowbelow", //$NON-NLS-1$ //$NON-NLS-2$
		// Pointcut Designators for annotations
		"annotation", //$NON-NLS-1$
		// Advice
		"before", "after", "around", "proceed", "throwing" , "returning" , //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
		"adviceexecution" , //$NON-NLS-1$
		// Declarations
		"declare", "parents" , "warning" , "error", "soft" , "precedence" , //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
		// variables
		"thisJoinPoint" , "thisJoinPointStaticPart" , "thisEnclosingJoinPointStaticPart" , //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// Associations
		"issingleton", "perthis", "pertarget", "percflow", "percflowbelow", "pertypewithin",  //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
		// Declare annotation
		"@type", "@method", "@field" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    
    
    public static final String[] declareAnnotationKeywords = { "type", "method", "field" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    
	/**
	 * Folder separator used by Eclipse in paths irrespective if on Windows or
	 * *nix.
	 */
	public static final String NON_OS_SPECIFIC_SEPARATOR = "/"; //$NON-NLS-1$

	public static final boolean USING_CU_PROVIDER = checkForCUprovider();
	

	/**
	 * The compiler factory
	 */
	private ICompilerFactory compilerFactory;

	/**
	 * The constructor.
	 */
	public AspectJPlugin() {
		super();
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		checkForCUprovider();
		getWorkspace().addResourceChangeListener(
				new CompilerConfigResourceChangeListener(),
				IResourceChangeEvent.POST_CHANGE | IResourceChangeEvent.PRE_DELETE);
		setCompilerFactory(new CoreCompilerFactory());
		
		ITDAwarenessAspect.provider = new INameEnvironmentProvider() {
            public SearchableEnvironment getNameEnvironment(
                    JavaProject project, WorkingCopyOwner owner) {
                try {
                    return new ITDAwareNameEnvironment(project, owner, null);
                } catch (JavaModelException e) {
                    return null;
                }
            }

            public SearchableEnvironment getNameEnvironment(
                    JavaProject project, ICompilationUnit[] workingCopies) {
                try {
                    return new ITDAwareNameEnvironment(project, workingCopies);
                } catch (JavaModelException e) {
                    return null;
                }
            }
            
            public ISourceType transformSourceTypeInfo(ISourceType info) {
                return new ITDAwareSourceTypeInfo(info, 
                        (SourceType) ((SourceTypeElementInfo) info).getHandle());
            }

            public CompilationUnitDeclaration problemFind(
                    CompilationUnit unitElement, SourceElementParser parser,
                    WorkingCopyOwner workingCopyOwner, HashMap problems,
                    boolean creatingAST, int reconcileFlags,
                    IProgressMonitor monitor) throws JavaModelException {
                return AJCompilationUnitProblemFinder.processAJ(unitElement, parser, workingCopyOwner, problems, creatingAST, reconcileFlags, monitor);
            }

		};
		
		ITDAwarenessAspect.contentAssistProvider = new ContentAssistProvider();
		
		AJProjectModelFacade.installListener();
	}

	/**
	 * Sets the usingCUprovider flag if the experimental JDT extension is available
	 *
	 */
	private static boolean checkForCUprovider() {
	    
	    try {
	        return IsWovenTester.isWeavingActive();
	    } catch (Exception e) {
	        return false;
	    }
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 */
	public static AspectJPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns the workspace instance.
	 */
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	/**
	 * Returns true if the given project has the AspectJ nature. Returns
	 * false otherwise, or if the nature could not be determined (e.g. the
	 * project is closed).
	 * @param project
	 * @return
	 */
	public static boolean isAJProject(IProject project) {
		// Fix for 106707 - check that project is open
		if(project.isOpen()) {			
			try {
				if ((project!=null) && project.hasNature(ID_NATURE)) {
					return true;
				}
			} catch (CoreException e) {
			}
		}
		return false;
	}
			
	public void setAJLogger(IAJLogger logger) {
		AJLog.setLogger(logger);
	}
	
	public ICompilerFactory getCompilerFactory() {
		return compilerFactory;
	}

	public void setCompilerFactory(ICompilerFactory compilerFactory) {
		this.compilerFactory = compilerFactory;
	}
}
