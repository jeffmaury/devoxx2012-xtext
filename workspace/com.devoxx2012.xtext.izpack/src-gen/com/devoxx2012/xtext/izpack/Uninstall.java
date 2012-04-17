/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uninstall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Uninstall#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Uninstall#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getUninstall()
 * @model
 * @generated
 */
public interface Uninstall extends EObject
{
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
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getUninstall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Uninstall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getUninstall_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Uninstall#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // Uninstall
