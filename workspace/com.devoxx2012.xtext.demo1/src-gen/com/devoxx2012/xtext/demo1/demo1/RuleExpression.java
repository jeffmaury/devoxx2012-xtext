/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.RuleExpression#getTest <em>Test</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.RuleExpression#getRatio <em>Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getRuleExpression()
 * @model
 * @generated
 */
public interface RuleExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(TestExpression)
   * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getRuleExpression_Test()
   * @model containment="true"
   * @generated
   */
  TestExpression getTest();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.demo1.demo1.RuleExpression#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(TestExpression value);

  /**
   * Returns the value of the '<em><b>Ratio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ratio</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ratio</em>' containment reference.
   * @see #setRatio(RatioExpression)
   * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getRuleExpression_Ratio()
   * @model containment="true"
   * @generated
   */
  RatioExpression getRatio();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.demo1.demo1.RuleExpression#getRatio <em>Ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ratio</em>' containment reference.
   * @see #getRatio()
   * @generated
   */
  void setRatio(RatioExpression value);

} // RuleExpression
