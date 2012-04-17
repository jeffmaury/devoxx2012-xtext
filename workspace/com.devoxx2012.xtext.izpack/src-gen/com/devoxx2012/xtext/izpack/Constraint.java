/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Constraint#getJavaversion <em>Javaversion</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Constraint#isRequiredJdk <em>Required Jdk</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Constraint#isPacked <em>Packed</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Javaversion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Javaversion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Javaversion</em>' attribute.
   * @see #setJavaversion(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getConstraint_Javaversion()
   * @model
   * @generated
   */
  String getJavaversion();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Constraint#getJavaversion <em>Javaversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Javaversion</em>' attribute.
   * @see #getJavaversion()
   * @generated
   */
  void setJavaversion(String value);

  /**
   * Returns the value of the '<em><b>Required Jdk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Jdk</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Jdk</em>' attribute.
   * @see #setRequiredJdk(boolean)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getConstraint_RequiredJdk()
   * @model
   * @generated
   */
  boolean isRequiredJdk();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Constraint#isRequiredJdk <em>Required Jdk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required Jdk</em>' attribute.
   * @see #isRequiredJdk()
   * @generated
   */
  void setRequiredJdk(boolean value);

  /**
   * Returns the value of the '<em><b>Packed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packed</em>' attribute.
   * @see #setPacked(boolean)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getConstraint_Packed()
   * @model
   * @generated
   */
  boolean isPacked();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Constraint#isPacked <em>Packed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Packed</em>' attribute.
   * @see #isPacked()
   * @generated
   */
  void setPacked(boolean value);

} // Constraint
