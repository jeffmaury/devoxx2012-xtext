/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Author#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Author#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends EObject
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
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getAuthor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Author#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email</em>' attribute.
   * @see #setEmail(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getAuthor_Email()
   * @model
   * @generated
   */
  String getEmail();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Author#getEmail <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email</em>' attribute.
   * @see #getEmail()
   * @generated
   */
  void setEmail(String value);

} // Author
