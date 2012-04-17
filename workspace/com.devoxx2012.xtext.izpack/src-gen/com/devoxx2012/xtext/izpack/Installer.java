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
 * A representation of the model object '<em><b>Installer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getIdentification <em>Identification</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getAuthors <em>Authors</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getUninstall <em>Uninstall</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getSummarylog <em>Summarylog</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#isInstallation <em>Installation</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getPacks <em>Packs</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getLocale <em>Locale</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.Installer#getPanels <em>Panels</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller()
 * @model
 * @generated
 */
public interface Installer extends EObject
{
  /**
   * Returns the value of the '<em><b>Identification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identification</em>' containment reference.
   * @see #setIdentification(Identification)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Identification()
   * @model containment="true"
   * @generated
   */
  Identification getIdentification();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Installer#getIdentification <em>Identification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identification</em>' containment reference.
   * @see #getIdentification()
   * @generated
   */
  void setIdentification(Identification value);

  /**
   * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
   * The list contents are of type {@link com.devoxx2012.xtext.izpack.Author}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authors</em>' containment reference list.
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Authors()
   * @model containment="true"
   * @generated
   */
  EList<Author> getAuthors();

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(Constraint)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Constraint()
   * @model containment="true"
   * @generated
   */
  Constraint getConstraint();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Installer#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(Constraint value);

  /**
   * Returns the value of the '<em><b>Uninstall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uninstall</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uninstall</em>' containment reference.
   * @see #setUninstall(Uninstall)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Uninstall()
   * @model containment="true"
   * @generated
   */
  Uninstall getUninstall();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Installer#getUninstall <em>Uninstall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uninstall</em>' containment reference.
   * @see #getUninstall()
   * @generated
   */
  void setUninstall(Uninstall value);

  /**
   * Returns the value of the '<em><b>Summarylog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summarylog</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summarylog</em>' attribute.
   * @see #setSummarylog(String)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Summarylog()
   * @model
   * @generated
   */
  String getSummarylog();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Installer#getSummarylog <em>Summarylog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summarylog</em>' attribute.
   * @see #getSummarylog()
   * @generated
   */
  void setSummarylog(String value);

  /**
   * Returns the value of the '<em><b>Installation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Installation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Installation</em>' attribute.
   * @see #setInstallation(boolean)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Installation()
   * @model
   * @generated
   */
  boolean isInstallation();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Installer#isInstallation <em>Installation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Installation</em>' attribute.
   * @see #isInstallation()
   * @generated
   */
  void setInstallation(boolean value);

  /**
   * Returns the value of the '<em><b>Packaging</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packaging</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packaging</em>' containment reference.
   * @see #setPackaging(Packaging)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Packaging()
   * @model containment="true"
   * @generated
   */
  Packaging getPackaging();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Installer#getPackaging <em>Packaging</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Packaging</em>' containment reference.
   * @see #getPackaging()
   * @generated
   */
  void setPackaging(Packaging value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link com.devoxx2012.xtext.izpack.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

  /**
   * Returns the value of the '<em><b>Packs</b></em>' containment reference list.
   * The list contents are of type {@link com.devoxx2012.xtext.izpack.Pack}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packs</em>' containment reference list.
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Packs()
   * @model containment="true"
   * @generated
   */
  EList<Pack> getPacks();

  /**
   * Returns the value of the '<em><b>Locale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locale</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locale</em>' containment reference.
   * @see #setLocale(Locale)
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Locale()
   * @model containment="true"
   * @generated
   */
  Locale getLocale();

  /**
   * Sets the value of the '{@link com.devoxx2012.xtext.izpack.Installer#getLocale <em>Locale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Locale</em>' containment reference.
   * @see #getLocale()
   * @generated
   */
  void setLocale(Locale value);

  /**
   * Returns the value of the '<em><b>Panels</b></em>' containment reference list.
   * The list contents are of type {@link com.devoxx2012.xtext.izpack.Panel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Panels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Panels</em>' containment reference list.
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#getInstaller_Panels()
   * @model containment="true"
   * @generated
   */
  EList<Panel> getPanels();

} // Installer
