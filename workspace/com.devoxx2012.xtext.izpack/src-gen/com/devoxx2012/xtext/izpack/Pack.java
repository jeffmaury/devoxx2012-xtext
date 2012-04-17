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
 * A representation of the model object '<em><b>Pack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Pack#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Pack#getLabel <em>Label</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Pack#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Pack#isLoose <em>Loose</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Pack#isKeep <em>Keep</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Pack#getParent <em>Parent</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Pack#getFiles <em>Files</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Pack#getOs <em>Os</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack()
 * @model
 * @generated
 */
public interface Pack extends EObject
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
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Pack#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Pack#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Pack#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Returns the value of the '<em><b>Loose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loose</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loose</em>' attribute.
   * @see #setLoose(boolean)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack_Loose()
   * @model
   * @generated
   */
  boolean isLoose();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Pack#isLoose <em>Loose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loose</em>' attribute.
   * @see #isLoose()
   * @generated
   */
  void setLoose(boolean value);

  /**
   * Returns the value of the '<em><b>Keep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keep</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keep</em>' attribute.
   * @see #setKeep(boolean)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack_Keep()
   * @model
   * @generated
   */
  boolean isKeep();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Pack#isKeep <em>Keep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keep</em>' attribute.
   * @see #isKeep()
   * @generated
   */
  void setKeep(boolean value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Pack)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack_Parent()
   * @model
   * @generated
   */
  Pack getParent();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Pack#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Pack value);

  /**
   * Returns the value of the '<em><b>Files</b></em>' containment reference list.
   * The list contents are of type {@link com.devoxx2012.xtext.izpack.File}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Files</em>' containment reference list.
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack_Files()
   * @model containment="true"
   * @generated
   */
  EList<File> getFiles();

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
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getPack_Os()
   * @model
   * @generated
   */
  OS getOs();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Pack#getOs <em>Os</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Os</em>' attribute.
   * @see com.devoxx2012.xtext.izpack.OS
   * @see #getOs()
   * @generated
   */
  void setOs(OS value);

} // Pack
