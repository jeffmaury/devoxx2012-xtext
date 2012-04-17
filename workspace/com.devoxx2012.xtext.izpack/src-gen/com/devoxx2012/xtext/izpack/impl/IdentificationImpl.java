/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.Identification;
import com.devoxx2012.xtext.izpack.IzpackPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.IdentificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.IdentificationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.IdentificationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.IdentificationImpl#getWebdir <em>Webdir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentificationImpl extends MinimalEObjectImpl.Container implements Identification
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getWebdir() <em>Webdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebdir()
   * @generated
   * @ordered
   */
  protected static final String WEBDIR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWebdir() <em>Webdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebdir()
   * @generated
   * @ordered
   */
  protected String webdir = WEBDIR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentificationImpl()
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
    return IzpackPackage.Literals.IDENTIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.IDENTIFICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.IDENTIFICATION__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.IDENTIFICATION__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWebdir()
  {
    return webdir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWebdir(String newWebdir)
  {
    String oldWebdir = webdir;
    webdir = newWebdir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.IDENTIFICATION__WEBDIR, oldWebdir, webdir));
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
      case IzpackPackage.IDENTIFICATION__NAME:
        return getName();
      case IzpackPackage.IDENTIFICATION__VERSION:
        return getVersion();
      case IzpackPackage.IDENTIFICATION__URL:
        return getUrl();
      case IzpackPackage.IDENTIFICATION__WEBDIR:
        return getWebdir();
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
      case IzpackPackage.IDENTIFICATION__NAME:
        setName((String)newValue);
        return;
      case IzpackPackage.IDENTIFICATION__VERSION:
        setVersion((String)newValue);
        return;
      case IzpackPackage.IDENTIFICATION__URL:
        setUrl((String)newValue);
        return;
      case IzpackPackage.IDENTIFICATION__WEBDIR:
        setWebdir((String)newValue);
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
      case IzpackPackage.IDENTIFICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IzpackPackage.IDENTIFICATION__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case IzpackPackage.IDENTIFICATION__URL:
        setUrl(URL_EDEFAULT);
        return;
      case IzpackPackage.IDENTIFICATION__WEBDIR:
        setWebdir(WEBDIR_EDEFAULT);
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
      case IzpackPackage.IDENTIFICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IzpackPackage.IDENTIFICATION__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case IzpackPackage.IDENTIFICATION__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case IzpackPackage.IDENTIFICATION__WEBDIR:
        return WEBDIR_EDEFAULT == null ? webdir != null : !WEBDIR_EDEFAULT.equals(webdir);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", version: ");
    result.append(version);
    result.append(", url: ");
    result.append(url);
    result.append(", webdir: ");
    result.append(webdir);
    result.append(')');
    return result.toString();
  }

} //IdentificationImpl
