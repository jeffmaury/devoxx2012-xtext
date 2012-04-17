/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.Rule#getFirst <em>First</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.Rule#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(RuleExpression)
   * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getRule_First()
   * @model containment="true"
   * @generated
   */
  RuleExpression getFirst();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.demo1.demo1.Rule#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(RuleExpression value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(EObject)
   * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getRule_Next()
   * @model containment="true"
   * @generated
   */
  EObject getNext();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.demo1.demo1.Rule#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(EObject value);

} // Rule
