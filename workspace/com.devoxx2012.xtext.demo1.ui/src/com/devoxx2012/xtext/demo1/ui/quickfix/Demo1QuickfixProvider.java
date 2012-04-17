
package com.devoxx2012.xtext.demo1.ui.quickfix;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.devoxx2012.xtext.demo1.demo1.Category;
import com.devoxx2012.xtext.demo1.demo1.TestExpression;

public class Demo1QuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(MyJavaValidator.INVALID_NAME)
//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument xtextDocument = context.getXtextDocument();
//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
//			}
//		});
//	}
	
	@Fix("CategoryNameFirstChar")
	public void fixCategoryName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize", "Force la première lettre en majuscule", null, new ISemanticModification() {
			
			@Override
			public void apply(EObject element, IModificationContext context)
					throws Exception {
				Category category = (Category)element;
				String name = category.getName();
				category.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
				Collection<Setting> settings = EcoreUtil.UsageCrossReferencer.find(category, category.eResource());
				for(Setting setting : settings) {
					TestExpression testExpression = (TestExpression)setting.getEObject();
					testExpression.setCategory(null);
					testExpression.setCategory(category);
				}
			}
		});
	}

}
