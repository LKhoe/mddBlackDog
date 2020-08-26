/*
 * generated by Xtext 2.21.0
 */
package br.ufes.nemo.ledzeppllin.blackdog.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BlackDogGenerator extends AbstractGenerator {
	
	@Inject DjangoFilesGenerator djangoFilesGenerator
	
	@Inject HelpersGenerator helpersGenerator
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		djangoFilesGenerator.doGenerate(input, fsa, context);
		
		helpersGenerator.doGenerate(input, fsa, context);
	}

	}
