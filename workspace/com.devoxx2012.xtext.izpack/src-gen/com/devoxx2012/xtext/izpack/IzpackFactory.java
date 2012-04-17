/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.devoxx2012.xtext.izpack.IzpackPackage
 * @generated
 */
public interface IzpackFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IzpackFactory eINSTANCE = com.devoxx2012.xtext.izpack.impl.IzpackFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Installer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Installer</em>'.
   * @generated
   */
  Installer createInstaller();

  /**
   * Returns a new object of class '<em>Locale</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Locale</em>'.
   * @generated
   */
  Locale createLocale();

  /**
   * Returns a new object of class '<em>Identification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identification</em>'.
   * @generated
   */
  Identification createIdentification();

  /**
   * Returns a new object of class '<em>Author</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Author</em>'.
   * @generated
   */
  Author createAuthor();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Uninstall</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uninstall</em>'.
   * @generated
   */
  Uninstall createUninstall();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns a new object of class '<em>Packaging</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Packaging</em>'.
   * @generated
   */
  Packaging createPackaging();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Pack</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pack</em>'.
   * @generated
   */
  Pack createPack();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  File createFile();

  /**
   * Returns a new object of class '<em>Panel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Panel</em>'.
   * @generated
   */
  Panel createPanel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IzpackPackage getIzpackPackage();

} //IzpackFactory
