/**
 * 
 */
package com.devoxx2012.xtext.demo1.ui.quickfix;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.devoxx2012.xtext.demo1.demo1.Category;
import com.devoxx2012.xtext.demo1.demo1.Demo1Package;

/**
 * @author jeffmaury
 *
 */
public class MyDemo1QuickfixProvider extends Demo1QuickfixProvider {
	@Inject
	ILinkingService linkingService;
	
  @Fix("myFirstIssue")
  public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
		/*acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
			@Override
			public void apply(IModificationContext context) throws Exception {
				IXtextDocument xtextDocument = context.getXtextDocument();
				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
			}
		});*/
	  acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new ISemanticModification() {
		
		@Override
		public void apply(EObject element, IModificationContext context)
				throws Exception {
			INode node = NodeModelUtils.getNode(element);
			List<EObject> refs = linkingService.getLinkedObjects(element.eContainer(), Demo1Package.eINSTANCE.getTestExpression_Category(), node);
			String name = ((Category)element).getName();
			((Category)element).setName(name.substring(0, 1).toUpperCase() + name.substring(1));
					}
	});
	}
}
