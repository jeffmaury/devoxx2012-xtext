/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.Author;
import com.devoxx2012.xtext.izpack.Constraint;
import com.devoxx2012.xtext.izpack.File;
import com.devoxx2012.xtext.izpack.ISO3Code;
import com.devoxx2012.xtext.izpack.Identification;
import com.devoxx2012.xtext.izpack.Installer;
import com.devoxx2012.xtext.izpack.IzpackFactory;
import com.devoxx2012.xtext.izpack.IzpackPackage;
import com.devoxx2012.xtext.izpack.Locale;
import com.devoxx2012.xtext.izpack.Option;
import com.devoxx2012.xtext.izpack.OverrideFlag;
import com.devoxx2012.xtext.izpack.Pack;
import com.devoxx2012.xtext.izpack.Packaging;
import com.devoxx2012.xtext.izpack.Panel;
import com.devoxx2012.xtext.izpack.Uninstall;
import com.devoxx2012.xtext.izpack.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IzpackPackageImpl extends EPackageImpl implements IzpackPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass installerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uninstallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packagingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass panelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum iso3CodeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum osEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum overrideFlagEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.devoxx2012.xtext.izpack.IzpackPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private IzpackPackageImpl()
  {
    super(eNS_URI, IzpackFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link IzpackPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static IzpackPackage init()
  {
    if (isInited) return (IzpackPackage)EPackage.Registry.INSTANCE.getEPackage(IzpackPackage.eNS_URI);

    // Obtain or create and register package
    IzpackPackageImpl theIzpackPackage = (IzpackPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IzpackPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IzpackPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theIzpackPackage.createPackageContents();

    // Initialize created meta-data
    theIzpackPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theIzpackPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(IzpackPackage.eNS_URI, theIzpackPackage);
    return theIzpackPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstaller()
  {
    return installerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Identification()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Authors()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Constraint()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Uninstall()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstaller_Summarylog()
  {
    return (EAttribute)installerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstaller_Installation()
  {
    return (EAttribute)installerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Packaging()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Variables()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Packs()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Locale()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstaller_Panels()
  {
    return (EReference)installerEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocale()
  {
    return localeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocale_Isocodes()
  {
    return (EAttribute)localeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentification()
  {
    return identificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentification_Name()
  {
    return (EAttribute)identificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentification_Version()
  {
    return (EAttribute)identificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentification_Url()
  {
    return (EAttribute)identificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentification_Webdir()
  {
    return (EAttribute)identificationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthor()
  {
    return authorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuthor_Name()
  {
    return (EAttribute)authorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuthor_Email()
  {
    return (EAttribute)authorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Javaversion()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_RequiredJdk()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Packed()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUninstall()
  {
    return uninstallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUninstall_Name()
  {
    return (EAttribute)uninstallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUninstall_Path()
  {
    return (EAttribute)uninstallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOption()
  {
    return optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_Name()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOption_Value()
  {
    return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackaging()
  {
    return packagingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackaging_Class()
  {
    return (EReference)packagingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackaging_Options()
  {
    return (EReference)packagingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_IsDynamic()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Value()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPack()
  {
    return packEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPack_Name()
  {
    return (EAttribute)packEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPack_Label()
  {
    return (EAttribute)packEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPack_Optional()
  {
    return (EAttribute)packEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPack_Loose()
  {
    return (EAttribute)packEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPack_Keep()
  {
    return (EAttribute)packEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPack_Parent()
  {
    return (EReference)packEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPack_Files()
  {
    return (EReference)packEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPack_Os()
  {
    return (EAttribute)packEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFile()
  {
    return fileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFile_Path()
  {
    return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFile_Alias()
  {
    return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFile_Destination()
  {
    return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFile_Override()
  {
    return (EAttribute)fileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFile_Os()
  {
    return (EAttribute)fileEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPanel()
  {
    return panelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPanel_Name()
  {
    return (EAttribute)panelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPanel_Classname()
  {
    return (EReference)panelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPanel_Jar()
  {
    return (EAttribute)panelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getISO3Code()
  {
    return iso3CodeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOS()
  {
    return osEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOverrideFlag()
  {
    return overrideFlagEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IzpackFactory getIzpackFactory()
  {
    return (IzpackFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    installerEClass = createEClass(INSTALLER);
    createEReference(installerEClass, INSTALLER__IDENTIFICATION);
    createEReference(installerEClass, INSTALLER__AUTHORS);
    createEReference(installerEClass, INSTALLER__CONSTRAINT);
    createEReference(installerEClass, INSTALLER__UNINSTALL);
    createEAttribute(installerEClass, INSTALLER__SUMMARYLOG);
    createEAttribute(installerEClass, INSTALLER__INSTALLATION);
    createEReference(installerEClass, INSTALLER__PACKAGING);
    createEReference(installerEClass, INSTALLER__VARIABLES);
    createEReference(installerEClass, INSTALLER__PACKS);
    createEReference(installerEClass, INSTALLER__LOCALE);
    createEReference(installerEClass, INSTALLER__PANELS);

    localeEClass = createEClass(LOCALE);
    createEAttribute(localeEClass, LOCALE__ISOCODES);

    identificationEClass = createEClass(IDENTIFICATION);
    createEAttribute(identificationEClass, IDENTIFICATION__NAME);
    createEAttribute(identificationEClass, IDENTIFICATION__VERSION);
    createEAttribute(identificationEClass, IDENTIFICATION__URL);
    createEAttribute(identificationEClass, IDENTIFICATION__WEBDIR);

    authorEClass = createEClass(AUTHOR);
    createEAttribute(authorEClass, AUTHOR__NAME);
    createEAttribute(authorEClass, AUTHOR__EMAIL);

    constraintEClass = createEClass(CONSTRAINT);
    createEAttribute(constraintEClass, CONSTRAINT__JAVAVERSION);
    createEAttribute(constraintEClass, CONSTRAINT__REQUIRED_JDK);
    createEAttribute(constraintEClass, CONSTRAINT__PACKED);

    uninstallEClass = createEClass(UNINSTALL);
    createEAttribute(uninstallEClass, UNINSTALL__NAME);
    createEAttribute(uninstallEClass, UNINSTALL__PATH);

    optionEClass = createEClass(OPTION);
    createEAttribute(optionEClass, OPTION__NAME);
    createEAttribute(optionEClass, OPTION__VALUE);

    packagingEClass = createEClass(PACKAGING);
    createEReference(packagingEClass, PACKAGING__CLASS);
    createEReference(packagingEClass, PACKAGING__OPTIONS);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__IS_DYNAMIC);
    createEAttribute(variableEClass, VARIABLE__NAME);
    createEAttribute(variableEClass, VARIABLE__VALUE);

    packEClass = createEClass(PACK);
    createEAttribute(packEClass, PACK__NAME);
    createEAttribute(packEClass, PACK__LABEL);
    createEAttribute(packEClass, PACK__OPTIONAL);
    createEAttribute(packEClass, PACK__LOOSE);
    createEAttribute(packEClass, PACK__KEEP);
    createEReference(packEClass, PACK__PARENT);
    createEReference(packEClass, PACK__FILES);
    createEAttribute(packEClass, PACK__OS);

    fileEClass = createEClass(FILE);
    createEAttribute(fileEClass, FILE__PATH);
    createEAttribute(fileEClass, FILE__ALIAS);
    createEAttribute(fileEClass, FILE__DESTINATION);
    createEAttribute(fileEClass, FILE__OVERRIDE);
    createEAttribute(fileEClass, FILE__OS);

    panelEClass = createEClass(PANEL);
    createEAttribute(panelEClass, PANEL__NAME);
    createEReference(panelEClass, PANEL__CLASSNAME);
    createEAttribute(panelEClass, PANEL__JAR);

    // Create enums
    iso3CodeEEnum = createEEnum(ISO3_CODE);
    osEEnum = createEEnum(OS);
    overrideFlagEEnum = createEEnum(OVERRIDE_FLAG);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(installerEClass, Installer.class, "Installer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstaller_Identification(), this.getIdentification(), null, "identification", null, 0, 1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstaller_Authors(), this.getAuthor(), null, "authors", null, 0, -1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstaller_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstaller_Uninstall(), this.getUninstall(), null, "uninstall", null, 0, 1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstaller_Summarylog(), ecorePackage.getEString(), "summarylog", null, 0, 1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstaller_Installation(), ecorePackage.getEBoolean(), "installation", null, 0, 1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstaller_Packaging(), this.getPackaging(), null, "packaging", null, 0, 1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstaller_Variables(), this.getVariable(), null, "variables", null, 0, -1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstaller_Packs(), this.getPack(), null, "packs", null, 0, -1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstaller_Locale(), this.getLocale(), null, "locale", null, 0, 1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstaller_Panels(), this.getPanel(), null, "panels", null, 0, -1, Installer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localeEClass, Locale.class, "Locale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocale_Isocodes(), this.getISO3Code(), "isocodes", null, 0, -1, Locale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identificationEClass, Identification.class, "Identification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdentification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentification_Version(), ecorePackage.getEString(), "version", null, 0, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentification_Url(), ecorePackage.getEString(), "url", null, 0, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdentification_Webdir(), ecorePackage.getEString(), "webdir", null, 0, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAuthor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAuthor_Email(), ecorePackage.getEString(), "email", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstraint_Javaversion(), ecorePackage.getEString(), "javaversion", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_RequiredJdk(), ecorePackage.getEBoolean(), "requiredJdk", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_Packed(), ecorePackage.getEBoolean(), "packed", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uninstallEClass, Uninstall.class, "Uninstall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUninstall_Name(), ecorePackage.getEString(), "name", null, 0, 1, Uninstall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUninstall_Path(), ecorePackage.getEString(), "path", null, 0, 1, Uninstall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packagingEClass, Packaging.class, "Packaging", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackaging_Class(), theTypesPackage.getJvmTypeReference(), null, "class", null, 0, 1, Packaging.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackaging_Options(), this.getOption(), null, "options", null, 0, -1, Packaging.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_IsDynamic(), ecorePackage.getEBoolean(), "isDynamic", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packEClass, Pack.class, "Pack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPack_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPack_Label(), ecorePackage.getEString(), "label", null, 0, 1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPack_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPack_Loose(), ecorePackage.getEBoolean(), "loose", null, 0, 1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPack_Keep(), ecorePackage.getEBoolean(), "keep", null, 0, 1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPack_Parent(), this.getPack(), null, "parent", null, 0, 1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPack_Files(), this.getFile(), null, "files", null, 0, -1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPack_Os(), this.getOS(), "os", null, 0, 1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFile_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFile_Destination(), ecorePackage.getEString(), "destination", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFile_Override(), this.getOverrideFlag(), "override", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFile_Os(), this.getOS(), "os", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(panelEClass, Panel.class, "Panel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPanel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPanel_Classname(), theTypesPackage.getJvmTypeReference(), null, "classname", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPanel_Jar(), ecorePackage.getEString(), "jar", null, 0, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(iso3CodeEEnum, ISO3Code.class, "ISO3Code");
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.CAT);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.CHN);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.CZE);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.DAN);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.GLG);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.DEU);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.ENG);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.EUS);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.FIN);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.FRA);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.HUN);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.ITA);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.JPN);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.MYS);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.NED);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.NOR);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.POL);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.POR);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.PRT);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.ROM);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.RUS);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.SCG);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.SPA);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.SVK);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.SWE);
    addEEnumLiteral(iso3CodeEEnum, ISO3Code.UKR);

    initEEnum(osEEnum, com.devoxx2012.xtext.izpack.OS.class, "OS");
    addEEnumLiteral(osEEnum, com.devoxx2012.xtext.izpack.OS.ALL);
    addEEnumLiteral(osEEnum, com.devoxx2012.xtext.izpack.OS.UNIX);
    addEEnumLiteral(osEEnum, com.devoxx2012.xtext.izpack.OS.WINDOWS);
    addEEnumLiteral(osEEnum, com.devoxx2012.xtext.izpack.OS.MAC);

    initEEnum(overrideFlagEEnum, OverrideFlag.class, "OverrideFlag");
    addEEnumLiteral(overrideFlagEEnum, OverrideFlag.TRUE);
    addEEnumLiteral(overrideFlagEEnum, OverrideFlag.FALSE);
    addEEnumLiteral(overrideFlagEEnum, OverrideFlag.ASKTRUE);
    addEEnumLiteral(overrideFlagEEnum, OverrideFlag.ASKFALSE);
    addEEnumLiteral(overrideFlagEEnum, OverrideFlag.UPDATE);

    // Create resource
    createResource(eNS_URI);
  }

} //IzpackPackageImpl
