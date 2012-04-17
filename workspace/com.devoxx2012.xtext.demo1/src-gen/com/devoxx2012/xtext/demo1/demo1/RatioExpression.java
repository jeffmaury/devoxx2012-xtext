/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.RatioExpression#getRatio <em>Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getRatioExpression()
 * @model
 * @generated
 */
public interface RatioExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Ratio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ratio</em>' attribute.
   * @see #setRatio(int)
   * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package#getRatioExpression_Ratio()
   * @model
   * @generated
   */
  int getRatio();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.demo1.demo1.RatioExpression#getRatio <em>Ratio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ratio</em>' attribute.
   * @see #getRatio()
   * @generated
   */
  void setRatio(int value);

} // RatioExpression
