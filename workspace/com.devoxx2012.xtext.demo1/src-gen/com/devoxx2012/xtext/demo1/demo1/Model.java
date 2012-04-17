/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.Model#getCategories <em>Categories</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.Model#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
   * The list contents are of type {@link com.devoxx2012.xtext.demo1.demo1.Category}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categories</em>' containment reference list.
   * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getModel_Categories()
   * @model containment="true"
   * @generated
   */
  EList<Category> getCategories();

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(Rule)
   * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getModel_Rule()
   * @model containment="true"
   * @generated
   */
  Rule getRule();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.demo1.demo1.Model#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(Rule value);

} // Model
