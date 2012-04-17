/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Locale#getIsocodes <em>Isocodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getLocale()
 * @model
 * @generated
 */
public interface Locale extends EObject
{
  /**
   * Returns the value of the '<em><b>Isocodes</b></em>' attribute list.
   * The list contents are of type {@link com.devoxx2012.xtext.izpack.ISO3Code}.
   * The literals are from the enumeration {@link com.devoxx2012.xtext.izpack.ISO3Code}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isocodes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isocodes</em>' attribute list.
   * @see com.devoxx2012.xtext.izpack.ISO3Code
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getLocale_Isocodes()
   * @model unique="false"
   * @generated
   */
  EList<ISO3Code> getIsocodes();

} // Locale
