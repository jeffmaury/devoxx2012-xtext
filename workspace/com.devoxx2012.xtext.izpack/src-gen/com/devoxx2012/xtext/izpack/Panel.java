/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Panel#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Panel#getClassname <em>Classname</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Panel#getJar <em>Jar</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPanel()
 * @model
 * @generated
 */
public interface Panel extends EObject
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
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPanel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Panel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Classname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' containment reference.
   * @see #setClassname(JvmTypeReference)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPanel_Classname()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getClassname();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Panel#getClassname <em>Classname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' containment reference.
   * @see #getClassname()
   * @generated
   */
  void setClassname(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Jar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jar</em>' attribute.
   * @see #setJar(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPanel_Jar()
   * @model
   * @generated
   */
  String getJar();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Panel#getJar <em>Jar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jar</em>' attribute.
   * @see #getJar()
   * @generated
   */
  void setJar(String value);

} // Panel
