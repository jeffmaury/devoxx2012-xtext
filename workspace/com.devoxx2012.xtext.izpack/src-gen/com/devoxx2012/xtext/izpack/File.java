/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.File#getPath <em>Path</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.File#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.File#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.File#getOverride <em>Override</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.File#getOs <em>Os</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject
{
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
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getFile_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.File#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getFile_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.File#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' attribute.
   * @see #setDestination(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getFile_Destination()
   * @model
   * @generated
   */
  String getDestination();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.File#getDestination <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' attribute.
   * @see #getDestination()
   * @generated
   */
  void setDestination(String value);

  /**
   * Returns the value of the '<em><b>Override</b></em>' attribute.
   * The literals are from the enumeration {@link com.devoxx2012.xtext.izpack.OverrideFlag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Override</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Override</em>' attribute.
   * @see com.devoxx2012.xtext.izpack.OverrideFlag
   * @see #setOverride(OverrideFlag)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getFile_Override()
   * @model
   * @generated
   */
  OverrideFlag getOverride();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.File#getOverride <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Override</em>' attribute.
   * @see com.devoxx2012.xtext.izpack.OverrideFlag
   * @see #getOverride()
   * @generated
   */
  void setOverride(OverrideFlag value);

  /**
   * Returns the value of the '<em><b>Os</b></em>' attribute.
   * The literals are from the enumeration {@link com.devoxx2012.xtext.izpack.OS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Os</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Os</em>' attribute.
   * @see com.devoxx2012.xtext.izpack.OS
   * @see #setOs(OS)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getFile_Os()
   * @model
   * @generated
   */
  OS getOs();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.File#getOs <em>Os</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Os</em>' attribute.
   * @see com.devoxx2012.xtext.izpack.OS
   * @see #getOs()
   * @generated
   */
  void setOs(OS value);

} // File
