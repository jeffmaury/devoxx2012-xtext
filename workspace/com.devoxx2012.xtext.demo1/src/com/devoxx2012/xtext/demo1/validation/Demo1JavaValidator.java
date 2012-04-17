package com.devoxx2012.xtext.demo1.validation;

import org.eclipse.xtext.validation.Check;

import com.devoxx2012.xtext.demo1.demo1.Category;
import com.devoxx2012.xtext.demo1.demo1.Demo1Package;
 

public class Demo1JavaValidator extends AbstractDemo1JavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	@Check
	public void checkCategory(Category category) {
		if (!Character.isUpperCase(category.getName().charAt(0))) {
			error("Le nom de catégorie doit commencer par une majuscule", Demo1Package.eINSTANCE.getCategory_Name(), -1, "CategoryNameFirstChar");
		}
	}

}
