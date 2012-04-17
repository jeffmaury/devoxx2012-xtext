/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Packaging#getClass_ <em>Class</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Packaging#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPackaging()
 * @model
 * @generated
 */
public interface Packaging extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(JvmTypeReference)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPackaging_Class()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getClass_();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Packaging#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link com.devoxx2012.xtext.izpack.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPackaging_Options()
   * @model containment="true"
   * @generated
   */
  EList<Option> getOptions();

} // Packaging
