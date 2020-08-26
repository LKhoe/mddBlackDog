/**
 * generated by Xtext 2.21.0
 */
package br.ufes.nemo.ledzeppllin.blackdog.generator;

import br.ufes.nemo.ledzeppllin.blackdog.generator.DjangoFilesGenerator;
import br.ufes.nemo.ledzeppllin.blackdog.generator.HelpersGenerator;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BlackDogGenerator extends AbstractGenerator {
  @Inject
  private DjangoFilesGenerator djangoFilesGenerator;
  
  @Inject
  private HelpersGenerator helpersGenerator;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.djangoFilesGenerator.doGenerate(input, fsa, context);
    this.helpersGenerator.doGenerate(input, fsa, context);
  }
}
