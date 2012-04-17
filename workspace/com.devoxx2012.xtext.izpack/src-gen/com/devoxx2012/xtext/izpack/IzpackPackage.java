/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.devoxx2012.xtext.izpack.IzpackFactory
 * @model kind="package"
 * @generated
 */
public interface IzpackPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "izpack";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.devoxx2012.com/xtext/Izpack";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "izpack";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IzpackPackage eINSTANCE = com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl.init();

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl <em>Installer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.InstallerImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getInstaller()
   * @generated
   */
  int INSTALLER = 0;

  /**
   * The feature id for the '<em><b>Identification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__IDENTIFICATION = 0;

  /**
   * The feature id for the '<em><b>Authors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__AUTHORS = 1;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Uninstall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__UNINSTALL = 3;

  /**
   * The feature id for the '<em><b>Summarylog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__SUMMARYLOG = 4;

  /**
   * The feature id for the '<em><b>Installation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__INSTALLATION = 5;

  /**
   * The feature id for the '<em><b>Packaging</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__PACKAGING = 6;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__VARIABLES = 7;

  /**
   * The feature id for the '<em><b>Packs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__PACKS = 8;

  /**
   * The feature id for the '<em><b>Locale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__LOCALE = 9;

  /**
   * The feature id for the '<em><b>Panels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__PANELS = 10;

  /**
   * The number of structural features of the '<em>Installer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.LocaleImpl <em>Locale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.LocaleImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getLocale()
   * @generated
   */
  int LOCALE = 1;

  /**
   * The feature id for the '<em><b>Isocodes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCALE__ISOCODES = 0;

  /**
   * The number of structural features of the '<em>Locale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCALE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.IdentificationImpl <em>Identification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.IdentificationImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getIdentification()
   * @generated
   */
  int IDENTIFICATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFICATION__VERSION = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFICATION__URL = 2;

  /**
   * The feature id for the '<em><b>Webdir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFICATION__WEBDIR = 3;

  /**
   * The number of structural features of the '<em>Identification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFICATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.AuthorImpl <em>Author</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.AuthorImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getAuthor()
   * @generated
   */
  int AUTHOR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__EMAIL = 1;

  /**
   * The number of structural features of the '<em>Author</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.ConstraintImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 4;

  /**
   * The feature id for the '<em><b>Javaversion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__JAVAVERSION = 0;

  /**
   * The feature id for the '<em><b>Required Jdk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__REQUIRED_JDK = 1;

  /**
   * The feature id for the '<em><b>Packed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__PACKED = 2;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.UninstallImpl <em>Uninstall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.UninstallImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getUninstall()
   * @generated
   */
  int UNINSTALL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNINSTALL__NAME = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNINSTALL__PATH = 1;

  /**
   * The number of structural features of the '<em>Uninstall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNINSTALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.OptionImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getOption()
   * @generated
   */
  int OPTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.PackagingImpl <em>Packaging</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.PackagingImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getPackaging()
   * @generated
   */
  int PACKAGING = 7;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGING__CLASS = 0;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGING__OPTIONS = 1;

  /**
   * The number of structural features of the '<em>Packaging</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.VariableImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__IS_DYNAMIC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.PackImpl <em>Pack</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.PackImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getPack()
   * @generated
   */
  int PACK = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__LABEL = 1;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__OPTIONAL = 2;

  /**
   * The feature id for the '<em><b>Loose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__LOOSE = 3;

  /**
   * The feature id for the '<em><b>Keep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__KEEP = 4;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__PARENT = 5;

  /**
   * The feature id for the '<em><b>Files</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__FILES = 6;

  /**
   * The feature id for the '<em><b>Os</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK__OS = 7;

  /**
   * The number of structural features of the '<em>Pack</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACK_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.FileImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getFile()
   * @generated
   */
  int FILE = 10;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__PATH = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__ALIAS = 1;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__DESTINATION = 2;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__OVERRIDE = 3;

  /**
   * The feature id for the '<em><b>Os</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__OS = 4;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.impl.PanelImpl <em>Panel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.impl.PanelImpl
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getPanel()
   * @generated
   */
  int PANEL = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Classname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANEL__CLASSNAME = 1;

  /**
   * The feature id for the '<em><b>Jar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANEL__JAR = 2;

  /**
   * The number of structural features of the '<em>Panel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.ISO3Code <em>ISO3 Code</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.ISO3Code
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getISO3Code()
   * @generated
   */
  int ISO3_CODE = 12;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.OS <em>OS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.OS
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getOS()
   * @generated
   */
  int OS = 13;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.izpack.OverrideFlag <em>Override Flag</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.izpack.OverrideFlag
   * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getOverrideFlag()
   * @generated
   */
  int OVERRIDE_FLAG = 14;


  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Installer <em>Installer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Installer</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer
   * @generated
   */
  EClass getInstaller();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.izpack.Installer#getIdentification <em>Identification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identification</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getIdentification()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Identification();

  /**
   * Returns the meta object for the containment reference list '{@link com.devoxx2012.xtext.izpack.Installer#getAuthors <em>Authors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Authors</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getAuthors()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Authors();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.izpack.Installer#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getConstraint()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.izpack.Installer#getUninstall <em>Uninstall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uninstall</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getUninstall()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Uninstall();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Installer#getSummarylog <em>Summarylog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summarylog</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getSummarylog()
   * @see #getInstaller()
   * @generated
   */
  EAttribute getInstaller_Summarylog();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Installer#isInstallation <em>Installation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Installation</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#isInstallation()
   * @see #getInstaller()
   * @generated
   */
  EAttribute getInstaller_Installation();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.izpack.Installer#getPackaging <em>Packaging</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Packaging</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getPackaging()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Packaging();

  /**
   * Returns the meta object for the containment reference list '{@link com.devoxx2012.xtext.izpack.Installer#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getVariables()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link com.devoxx2012.xtext.izpack.Installer#getPacks <em>Packs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packs</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getPacks()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Packs();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.izpack.Installer#getLocale <em>Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Locale</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getLocale()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Locale();

  /**
   * Returns the meta object for the containment reference list '{@link com.devoxx2012.xtext.izpack.Installer#getPanels <em>Panels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Panels</em>'.
   * @see com.devoxx2012.xtext.izpack.Installer#getPanels()
   * @see #getInstaller()
   * @generated
   */
  EReference getInstaller_Panels();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Locale <em>Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Locale</em>'.
   * @see com.devoxx2012.xtext.izpack.Locale
   * @generated
   */
  EClass getLocale();

  /**
   * Returns the meta object for the attribute list '{@link com.devoxx2012.xtext.izpack.Locale#getIsocodes <em>Isocodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Isocodes</em>'.
   * @see com.devoxx2012.xtext.izpack.Locale#getIsocodes()
   * @see #getLocale()
   * @generated
   */
  EAttribute getLocale_Isocodes();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Identification <em>Identification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identification</em>'.
   * @see com.devoxx2012.xtext.izpack.Identification
   * @generated
   */
  EClass getIdentification();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Identification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devoxx2012.xtext.izpack.Identification#getName()
   * @see #getIdentification()
   * @generated
   */
  EAttribute getIdentification_Name();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Identification#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see com.devoxx2012.xtext.izpack.Identification#getVersion()
   * @see #getIdentification()
   * @generated
   */
  EAttribute getIdentification_Version();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Identification#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.devoxx2012.xtext.izpack.Identification#getUrl()
   * @see #getIdentification()
   * @generated
   */
  EAttribute getIdentification_Url();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Identification#getWebdir <em>Webdir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Webdir</em>'.
   * @see com.devoxx2012.xtext.izpack.Identification#getWebdir()
   * @see #getIdentification()
   * @generated
   */
  EAttribute getIdentification_Webdir();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Author <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Author</em>'.
   * @see com.devoxx2012.xtext.izpack.Author
   * @generated
   */
  EClass getAuthor();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Author#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devoxx2012.xtext.izpack.Author#getName()
   * @see #getAuthor()
   * @generated
   */
  EAttribute getAuthor_Name();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Author#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email</em>'.
   * @see com.devoxx2012.xtext.izpack.Author#getEmail()
   * @see #getAuthor()
   * @generated
   */
  EAttribute getAuthor_Email();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see com.devoxx2012.xtext.izpack.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Constraint#getJavaversion <em>Javaversion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Javaversion</em>'.
   * @see com.devoxx2012.xtext.izpack.Constraint#getJavaversion()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Javaversion();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Constraint#isRequiredJdk <em>Required Jdk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required Jdk</em>'.
   * @see com.devoxx2012.xtext.izpack.Constraint#isRequiredJdk()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_RequiredJdk();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Constraint#isPacked <em>Packed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Packed</em>'.
   * @see com.devoxx2012.xtext.izpack.Constraint#isPacked()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Packed();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Uninstall <em>Uninstall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uninstall</em>'.
   * @see com.devoxx2012.xtext.izpack.Uninstall
   * @generated
   */
  EClass getUninstall();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Uninstall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devoxx2012.xtext.izpack.Uninstall#getName()
   * @see #getUninstall()
   * @generated
   */
  EAttribute getUninstall_Name();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Uninstall#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see com.devoxx2012.xtext.izpack.Uninstall#getPath()
   * @see #getUninstall()
   * @generated
   */
  EAttribute getUninstall_Path();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see com.devoxx2012.xtext.izpack.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Option#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devoxx2012.xtext.izpack.Option#getName()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Name();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Option#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.devoxx2012.xtext.izpack.Option#getValue()
   * @see #getOption()
   * @generated
   */
  EAttribute getOption_Value();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Packaging <em>Packaging</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Packaging</em>'.
   * @see com.devoxx2012.xtext.izpack.Packaging
   * @generated
   */
  EClass getPackaging();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.izpack.Packaging#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see com.devoxx2012.xtext.izpack.Packaging#getClass_()
   * @see #getPackaging()
   * @generated
   */
  EReference getPackaging_Class();

  /**
   * Returns the meta object for the containment reference list '{@link com.devoxx2012.xtext.izpack.Packaging#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see com.devoxx2012.xtext.izpack.Packaging#getOptions()
   * @see #getPackaging()
   * @generated
   */
  EReference getPackaging_Options();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see com.devoxx2012.xtext.izpack.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Variable#isIsDynamic <em>Is Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Dynamic</em>'.
   * @see com.devoxx2012.xtext.izpack.Variable#isIsDynamic()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_IsDynamic();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devoxx2012.xtext.izpack.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Variable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.devoxx2012.xtext.izpack.Variable#getValue()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Value();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Pack <em>Pack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pack</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack
   * @generated
   */
  EClass getPack();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Pack#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack#getName()
   * @see #getPack()
   * @generated
   */
  EAttribute getPack_Name();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Pack#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack#getLabel()
   * @see #getPack()
   * @generated
   */
  EAttribute getPack_Label();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Pack#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack#isOptional()
   * @see #getPack()
   * @generated
   */
  EAttribute getPack_Optional();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Pack#isLoose <em>Loose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loose</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack#isLoose()
   * @see #getPack()
   * @generated
   */
  EAttribute getPack_Loose();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Pack#isKeep <em>Keep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keep</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack#isKeep()
   * @see #getPack()
   * @generated
   */
  EAttribute getPack_Keep();

  /**
   * Returns the meta object for the reference '{@link com.devoxx2012.xtext.izpack.Pack#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack#getParent()
   * @see #getPack()
   * @generated
   */
  EReference getPack_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link com.devoxx2012.xtext.izpack.Pack#getFiles <em>Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Files</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack#getFiles()
   * @see #getPack()
   * @generated
   */
  EReference getPack_Files();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Pack#getOs <em>Os</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Os</em>'.
   * @see com.devoxx2012.xtext.izpack.Pack#getOs()
   * @see #getPack()
   * @generated
   */
  EAttribute getPack_Os();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see com.devoxx2012.xtext.izpack.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.File#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see com.devoxx2012.xtext.izpack.File#getPath()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Path();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.File#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see com.devoxx2012.xtext.izpack.File#getAlias()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Alias();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.File#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see com.devoxx2012.xtext.izpack.File#getDestination()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Destination();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.File#getOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see com.devoxx2012.xtext.izpack.File#getOverride()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Override();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.File#getOs <em>Os</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Os</em>'.
   * @see com.devoxx2012.xtext.izpack.File#getOs()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Os();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.izpack.Panel <em>Panel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Panel</em>'.
   * @see com.devoxx2012.xtext.izpack.Panel
   * @generated
   */
  EClass getPanel();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Panel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devoxx2012.xtext.izpack.Panel#getName()
   * @see #getPanel()
   * @generated
   */
  EAttribute getPanel_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.izpack.Panel#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classname</em>'.
   * @see com.devoxx2012.xtext.izpack.Panel#getClassname()
   * @see #getPanel()
   * @generated
   */
  EReference getPanel_Classname();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.izpack.Panel#getJar <em>Jar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jar</em>'.
   * @see com.devoxx2012.xtext.izpack.Panel#getJar()
   * @see #getPanel()
   * @generated
   */
  EAttribute getPanel_Jar();

  /**
   * Returns the meta object for enum '{@link com.devoxx2012.xtext.izpack.ISO3Code <em>ISO3 Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ISO3 Code</em>'.
   * @see com.devoxx2012.xtext.izpack.ISO3Code
   * @generated
   */
  EEnum getISO3Code();

  /**
   * Returns the meta object for enum '{@link com.devoxx2012.xtext.izpack.OS <em>OS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>OS</em>'.
   * @see com.devoxx2012.xtext.izpack.OS
   * @generated
   */
  EEnum getOS();

  /**
   * Returns the meta object for enum '{@link com.devoxx2012.xtext.izpack.OverrideFlag <em>Override Flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Override Flag</em>'.
   * @see com.devoxx2012.xtext.izpack.OverrideFlag
   * @generated
   */
  EEnum getOverrideFlag();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IzpackFactory getIzpackFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.InstallerImpl <em>Installer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.InstallerImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getInstaller()
     * @generated
     */
    EClass INSTALLER = eINSTANCE.getInstaller();

    /**
     * The meta object literal for the '<em><b>Identification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__IDENTIFICATION = eINSTANCE.getInstaller_Identification();

    /**
     * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__AUTHORS = eINSTANCE.getInstaller_Authors();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__CONSTRAINT = eINSTANCE.getInstaller_Constraint();

    /**
     * The meta object literal for the '<em><b>Uninstall</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__UNINSTALL = eINSTANCE.getInstaller_Uninstall();

    /**
     * The meta object literal for the '<em><b>Summarylog</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALLER__SUMMARYLOG = eINSTANCE.getInstaller_Summarylog();

    /**
     * The meta object literal for the '<em><b>Installation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALLER__INSTALLATION = eINSTANCE.getInstaller_Installation();

    /**
     * The meta object literal for the '<em><b>Packaging</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__PACKAGING = eINSTANCE.getInstaller_Packaging();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__VARIABLES = eINSTANCE.getInstaller_Variables();

    /**
     * The meta object literal for the '<em><b>Packs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__PACKS = eINSTANCE.getInstaller_Packs();

    /**
     * The meta object literal for the '<em><b>Locale</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__LOCALE = eINSTANCE.getInstaller_Locale();

    /**
     * The meta object literal for the '<em><b>Panels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTALLER__PANELS = eINSTANCE.getInstaller_Panels();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.LocaleImpl <em>Locale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.LocaleImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getLocale()
     * @generated
     */
    EClass LOCALE = eINSTANCE.getLocale();

    /**
     * The meta object literal for the '<em><b>Isocodes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCALE__ISOCODES = eINSTANCE.getLocale_Isocodes();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.IdentificationImpl <em>Identification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.IdentificationImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getIdentification()
     * @generated
     */
    EClass IDENTIFICATION = eINSTANCE.getIdentification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFICATION__NAME = eINSTANCE.getIdentification_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFICATION__VERSION = eINSTANCE.getIdentification_Version();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFICATION__URL = eINSTANCE.getIdentification_Url();

    /**
     * The meta object literal for the '<em><b>Webdir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFICATION__WEBDIR = eINSTANCE.getIdentification_Webdir();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.AuthorImpl <em>Author</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.AuthorImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getAuthor()
     * @generated
     */
    EClass AUTHOR = eINSTANCE.getAuthor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHOR__EMAIL = eINSTANCE.getAuthor_Email();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.ConstraintImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Javaversion</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__JAVAVERSION = eINSTANCE.getConstraint_Javaversion();

    /**
     * The meta object literal for the '<em><b>Required Jdk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__REQUIRED_JDK = eINSTANCE.getConstraint_RequiredJdk();

    /**
     * The meta object literal for the '<em><b>Packed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__PACKED = eINSTANCE.getConstraint_Packed();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.UninstallImpl <em>Uninstall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.UninstallImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getUninstall()
     * @generated
     */
    EClass UNINSTALL = eINSTANCE.getUninstall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNINSTALL__NAME = eINSTANCE.getUninstall_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNINSTALL__PATH = eINSTANCE.getUninstall_Path();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.OptionImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.PackagingImpl <em>Packaging</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.PackagingImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getPackaging()
     * @generated
     */
    EClass PACKAGING = eINSTANCE.getPackaging();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGING__CLASS = eINSTANCE.getPackaging_Class();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGING__OPTIONS = eINSTANCE.getPackaging_Options();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.VariableImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Is Dynamic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__IS_DYNAMIC = eINSTANCE.getVariable_IsDynamic();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.PackImpl <em>Pack</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.PackImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getPack()
     * @generated
     */
    EClass PACK = eINSTANCE.getPack();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK__NAME = eINSTANCE.getPack_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK__LABEL = eINSTANCE.getPack_Label();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK__OPTIONAL = eINSTANCE.getPack_Optional();

    /**
     * The meta object literal for the '<em><b>Loose</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK__LOOSE = eINSTANCE.getPack_Loose();

    /**
     * The meta object literal for the '<em><b>Keep</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK__KEEP = eINSTANCE.getPack_Keep();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACK__PARENT = eINSTANCE.getPack_Parent();

    /**
     * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACK__FILES = eINSTANCE.getPack_Files();

    /**
     * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACK__OS = eINSTANCE.getPack_Os();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.FileImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__PATH = eINSTANCE.getFile_Path();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__ALIAS = eINSTANCE.getFile_Alias();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__DESTINATION = eINSTANCE.getFile_Destination();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__OVERRIDE = eINSTANCE.getFile_Override();

    /**
     * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__OS = eINSTANCE.getFile_Os();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.impl.PanelImpl <em>Panel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.impl.PanelImpl
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getPanel()
     * @generated
     */
    EClass PANEL = eINSTANCE.getPanel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PANEL__NAME = eINSTANCE.getPanel_Name();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PANEL__CLASSNAME = eINSTANCE.getPanel_Classname();

    /**
     * The meta object literal for the '<em><b>Jar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PANEL__JAR = eINSTANCE.getPanel_Jar();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.ISO3Code <em>ISO3 Code</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.ISO3Code
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getISO3Code()
     * @generated
     */
    EEnum ISO3_CODE = eINSTANCE.getISO3Code();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.OS <em>OS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.OS
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getOS()
     * @generated
     */
    EEnum OS = eINSTANCE.getOS();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.izpack.OverrideFlag <em>Override Flag</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.izpack.OverrideFlag
     * @see com.devoxx2012.xtext.izpack.impl.IzpackPackageImpl#getOverrideFlag()
     * @generated
     */
    EEnum OVERRIDE_FLAG = eINSTANCE.getOverrideFlag();

  }

} //IzpackPackage
