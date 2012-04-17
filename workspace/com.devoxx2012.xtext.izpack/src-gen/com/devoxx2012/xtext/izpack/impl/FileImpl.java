/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.File;
import com.devoxx2012.xtext.izpack.IzpackPackage;
import com.devoxx2012.xtext.izpack.OS;
import com.devoxx2012.xtext.izpack.OverrideFlag;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.FileImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.FileImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.FileImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.FileImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.FileImpl#getOs <em>Os</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File
{
  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected String destination = DESTINATION_EDEFAULT;

  /**
   * The default value of the '{@link #getOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverride()
   * @generated
   * @ordered
   */
  protected static final OverrideFlag OVERRIDE_EDEFAULT = OverrideFlag.TRUE;

  /**
   * The cached value of the '{@link #getOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverride()
   * @generated
   * @ordered
   */
  protected OverrideFlag override = OVERRIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOs()
   * @generated
   * @ordered
   */
  protected static final OS OS_EDEFAULT = OS.ALL;

  /**
   * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOs()
   * @generated
   * @ordered
   */
  protected OS os = OS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IzpackPackage.Literals.FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.FILE__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.FILE__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(String newDestination)
  {
    String oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.FILE__DESTINATION, oldDestination, destination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverrideFlag getOverride()
  {
    return override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverride(OverrideFlag newOverride)
  {
    OverrideFlag oldOverride = override;
    override = newOverride == null ? OVERRIDE_EDEFAULT : newOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.FILE__OVERRIDE, oldOverride, override));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OS getOs()
  {
    return os;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOs(OS newOs)
  {
    OS oldOs = os;
    os = newOs == null ? OS_EDEFAULT : newOs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.FILE__OS, oldOs, os));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IzpackPackage.FILE__PATH:
        return getPath();
      case IzpackPackage.FILE__ALIAS:
        return getAlias();
      case IzpackPackage.FILE__DESTINATION:
        return getDestination();
      case IzpackPackage.FILE__OVERRIDE:
        return getOverride();
      case IzpackPackage.FILE__OS:
        return getOs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IzpackPackage.FILE__PATH:
        setPath((String)newValue);
        return;
      case IzpackPackage.FILE__ALIAS:
        setAlias((String)newValue);
        return;
      case IzpackPackage.FILE__DESTINATION:
        setDestination((String)newValue);
        return;
      case IzpackPackage.FILE__OVERRIDE:
        setOverride((OverrideFlag)newValue);
        return;
      case IzpackPackage.FILE__OS:
        setOs((OS)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IzpackPackage.FILE__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case IzpackPackage.FILE__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case IzpackPackage.FILE__DESTINATION:
        setDestination(DESTINATION_EDEFAULT);
        return;
      case IzpackPackage.FILE__OVERRIDE:
        setOverride(OVERRIDE_EDEFAULT);
        return;
      case IzpackPackage.FILE__OS:
        setOs(OS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IzpackPackage.FILE__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case IzpackPackage.FILE__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case IzpackPackage.FILE__DESTINATION:
        return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
      case IzpackPackage.FILE__OVERRIDE:
        return override != OVERRIDE_EDEFAULT;
      case IzpackPackage.FILE__OS:
        return os != OS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (path: ");
    result.append(path);
    result.append(", alias: ");
    result.append(alias);
    result.append(", destination: ");
    result.append(destination);
    result.append(", override: ");
    result.append(override);
    result.append(", os: ");
    result.append(os);
    result.append(')');
    return result.toString();
  }

} //FileImpl
