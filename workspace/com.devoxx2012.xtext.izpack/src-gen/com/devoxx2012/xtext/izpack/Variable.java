/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Variable#isIsDynamic <em>Is Dynamic</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Variable#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Variable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Dynamic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Dynamic</em>' attribute.
   * @see #setIsDynamic(boolean)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getVariable_IsDynamic()
   * @model
   * @generated
   */
  boolean isIsDynamic();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Variable#isIsDynamic <em>Is Dynamic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Dynamic</em>' attribute.
   * @see #isIsDynamic()
   * @generated
   */
  void setIsDynamic(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getVariable_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Variable#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Variable
