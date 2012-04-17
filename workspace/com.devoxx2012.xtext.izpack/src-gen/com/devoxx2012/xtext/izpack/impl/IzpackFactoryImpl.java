/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IzpackFactoryImpl extends EFactoryImpl implements IzpackFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IzpackFactory init()
  {
    try
    {
      IzpackFactory theIzpackFactory = (IzpackFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.devoxx2012.com/xtext/Izpack"); 
      if (theIzpackFactory != null)
      {
        return theIzpackFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IzpackFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IzpackFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IzpackPackage.INSTALLER: return createInstaller();
      case IzpackPackage.LOCALE: return createLocale();
      case IzpackPackage.IDENTIFICATION: return createIdentification();
      case IzpackPackage.AUTHOR: return createAuthor();
      case IzpackPackage.CONSTRAINT: return createConstraint();
      case IzpackPackage.UNINSTALL: return createUninstall();
      case IzpackPackage.OPTION: return createOption();
      case IzpackPackage.PACKAGING: return createPackaging();
      case IzpackPackage.VARIABLE: return createVariable();
      case IzpackPackage.PACK: return createPack();
      case IzpackPackage.FILE: return createFile();
      case IzpackPackage.PANEL: return createPanel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case IzpackPackage.ISO3_CODE:
        return createISO3CodeFromString(eDataType, initialValue);
      case IzpackPackage.OS:
        return createOSFromString(eDataType, initialValue);
      case IzpackPackage.OVERRIDE_FLAG:
        return createOverrideFlagFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case IzpackPackage.ISO3_CODE:
        return convertISO3CodeToString(eDataType, instanceValue);
      case IzpackPackage.OS:
        return convertOSToString(eDataType, instanceValue);
      case IzpackPackage.OVERRIDE_FLAG:
        return convertOverrideFlagToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Installer createInstaller()
  {
    InstallerImpl installer = new InstallerImpl();
    return installer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Locale createLocale()
  {
    LocaleImpl locale = new LocaleImpl();
    return locale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identification createIdentification()
  {
    IdentificationImpl identification = new IdentificationImpl();
    return identification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Author createAuthor()
  {
    AuthorImpl author = new AuthorImpl();
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uninstall createUninstall()
  {
    UninstallImpl uninstall = new UninstallImpl();
    return uninstall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Packaging createPackaging()
  {
    PackagingImpl packaging = new PackagingImpl();
    return packaging;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pack createPack()
  {
    PackImpl pack = new PackImpl();
    return pack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Panel createPanel()
  {
    PanelImpl panel = new PanelImpl();
    return panel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISO3Code createISO3CodeFromString(EDataType eDataType, String initialValue)
  {
    ISO3Code result = ISO3Code.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertISO3CodeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OS createOSFromString(EDataType eDataType, String initialValue)
  {
    OS result = OS.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOSToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverrideFlag createOverrideFlagFromString(EDataType eDataType, String initialValue)
  {
    OverrideFlag result = OverrideFlag.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOverrideFlagToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IzpackPackage getIzpackPackage()
  {
    return (IzpackPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IzpackPackage getPackage()
  {
    return IzpackPackage.eINSTANCE;
  }

} //IzpackFactoryImpl
