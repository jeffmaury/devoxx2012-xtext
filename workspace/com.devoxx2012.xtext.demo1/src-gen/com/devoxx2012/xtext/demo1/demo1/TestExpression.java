/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.TestExpression#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getTestExpression()
 * @model
 * @generated
 */
public interface TestExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(Category)
   * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getTestExpression_Category()
   * @model
   * @generated
   */
  Category getCategory();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.demo1.demo1.TestExpression#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  void setCategory(Category value);

} // TestExpression
