/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Identification#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Identification#getVersion <em>Version</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Identification#getUrl <em>Url</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Identification#getWebdir <em>Webdir</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getIdentification()
 * @model
 * @generated
 */
public interface Identification extends EObject
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
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getIdentification_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Identification#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getIdentification_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Identification#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getIdentification_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Identification#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Webdir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Webdir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Webdir</em>' attribute.
   * @see #setWebdir(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getIdentification_Webdir()
   * @model
   * @generated
   */
  String getWebdir();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Identification#getWebdir <em>Webdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Webdir</em>' attribute.
   * @see #getWebdir()
   * @generated
   */
  void setWebdir(String value);

} // Identification
