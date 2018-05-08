// AspectJ Extension
/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.aspectj.ajdt.internal.compiler;

import org.aspectj.org.eclipse.jdt.internal.compiler.Compiler;
import org.aspectj.org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration;
import org.aspectj.org.eclipse.jdt.internal.compiler.env.ICompilationUnit;

/**
 * This DefaultCompilerAdapter preserves the original behaviour of the 
 * JDT compiler.
 */
public class DefaultCompilerAdapter implements ICompilerAdapter {
	private Compiler compiler;
	
	public DefaultCompilerAdapter(Compiler compiler) {
		this.compiler = compiler;
	}
	
	/* (non-Javadoc)
	 * @see org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ICompilerAdapter#beforeCompiling(org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.env.ICompilationUnit[])
	 */
	public void beforeCompiling(ICompilationUnit[] sourceUnits) {}

	/* (non-Javadoc)
	 * @see org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ICompilerAdapter#afterCompiling()
	 */
	public void afterCompiling(CompilationUnitDeclaration[] units) {}
	
	/* (non-Javadoc)
	 * @see org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ICompilerAdapter#beforeProcessing(org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration)
	 */
	public void beforeProcessing(CompilationUnitDeclaration unit) {}
	
	/* (non-Javadoc)
	 * @see org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ICompilerAdapter#afterProcessing(org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration)
	 */
	public void afterProcessing(CompilationUnitDeclaration unit, int unitIndex) {
		unit.cleanUp();
		compiler.requestor.acceptResult(unit.compilationResult.tagAsAccepted());
		compiler.unitsToProcess[unitIndex] = null;
	}
	
	public void beforeAnalysing(CompilationUnitDeclaration unit) {
		// no-op
	}
	
	/* (non-Javadoc)
	 * @see org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ICompilerAdapter#beforeResolving(org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.env.ICompilationUnit, boolean, boolean, boolean)
	 */
	public void beforeResolving(CompilationUnitDeclaration unit,
			ICompilationUnit sourceUnit, boolean verifyMethods,
			boolean analyzeCode, boolean generateCode){
		// no-op
	}
	
	/* (non-Javadoc)
	 * @see org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ICompilerAdapter#afterResolving(org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration, org.aspectj.org.aspectj.org.eclipse.jdt.internal.compiler.env.ICompilationUnit, boolean, boolean, boolean)
	 */
	public void afterResolving(CompilationUnitDeclaration unit,
			ICompilationUnit sourceUnit, boolean verifyMethods,
			boolean analyzeCode, boolean generateCode) {
		if (compiler.unitsToProcess != null) compiler.unitsToProcess[0] = null; // release reference to processed unit declaration
		compiler.requestor.acceptResult(unit.compilationResult.tagAsAccepted());
	}

	public void beforeResolving(CompilationUnitDeclaration unit) {
		// TODO Auto-generated method stub
		
	}

	public void afterResolving(CompilationUnitDeclaration unit) {
		// TODO Auto-generated method stub
		
	}

	public void afterAnalysing(CompilationUnitDeclaration unit) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGenerating(CompilationUnitDeclaration unit) {
		// TODO Auto-generated method stub
		
	}

	public void afterGenerating(CompilationUnitDeclaration unit) {
		// TODO Auto-generated method stub
		
	}

	public void afterDietParsing(CompilationUnitDeclaration[] units) {
		// TODO Auto-generated method stub
		
	}
}
// End AspectJ Extension