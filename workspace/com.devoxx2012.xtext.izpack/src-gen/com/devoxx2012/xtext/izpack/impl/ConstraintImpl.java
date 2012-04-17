/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.Constraint;
import com.devoxx2012.xtext.izpack.IzpackPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.ConstraintImpl#getJavaversion <em>Javaversion</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.ConstraintImpl#isRequiredJdk <em>Required Jdk</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.ConstraintImpl#isPacked <em>Packed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint
{
  /**
   * The default value of the '{@link #getJavaversion() <em>Javaversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaversion()
   * @generated
   * @ordered
   */
  protected static final String JAVAVERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavaversion() <em>Javaversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaversion()
   * @generated
   * @ordered
   */
  protected String javaversion = JAVAVERSION_EDEFAULT;

  /**
   * The default value of the '{@link #isRequiredJdk() <em>Required Jdk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequiredJdk()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_JDK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequiredJdk() <em>Required Jdk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequiredJdk()
   * @generated
   * @ordered
   */
  protected boolean requiredJdk = REQUIRED_JDK_EDEFAULT;

  /**
   * The default value of the '{@link #isPacked() <em>Packed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPacked()
   * @generated
   * @ordered
   */
  protected static final boolean PACKED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPacked() <em>Packed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPacked()
   * @generated
   * @ordered
   */
  protected boolean packed = PACKED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
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
    return IzpackPackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJavaversion()
  {
    return javaversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaversion(String newJavaversion)
  {
    String oldJavaversion = javaversion;
    javaversion = newJavaversion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.CONSTRAINT__JAVAVERSION, oldJavaversion, javaversion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequiredJdk()
  {
    return requiredJdk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequiredJdk(boolean newRequiredJdk)
  {
    boolean oldRequiredJdk = requiredJdk;
    requiredJdk = newRequiredJdk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.CONSTRAINT__REQUIRED_JDK, oldRequiredJdk, requiredJdk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPacked()
  {
    return packed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPacked(boolean newPacked)
  {
    boolean oldPacked = packed;
    packed = newPacked;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.CONSTRAINT__PACKED, oldPacked, packed));
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
      case IzpackPackage.CONSTRAINT__JAVAVERSION:
        return getJavaversion();
      case IzpackPackage.CONSTRAINT__REQUIRED_JDK:
        return isRequiredJdk();
      case IzpackPackage.CONSTRAINT__PACKED:
        return isPacked();
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
      case IzpackPackage.CONSTRAINT__JAVAVERSION:
        setJavaversion((String)newValue);
        return;
      case IzpackPackage.CONSTRAINT__REQUIRED_JDK:
        setRequiredJdk((Boolean)newValue);
        return;
      case IzpackPackage.CONSTRAINT__PACKED:
        setPacked((Boolean)newValue);
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
      case IzpackPackage.CONSTRAINT__JAVAVERSION:
        setJavaversion(JAVAVERSION_EDEFAULT);
        return;
      case IzpackPackage.CONSTRAINT__REQUIRED_JDK:
        setRequiredJdk(REQUIRED_JDK_EDEFAULT);
        return;
      case IzpackPackage.CONSTRAINT__PACKED:
        setPacked(PACKED_EDEFAULT);
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
      case IzpackPackage.CONSTRAINT__JAVAVERSION:
        return JAVAVERSION_EDEFAULT == null ? javaversion != null : !JAVAVERSION_EDEFAULT.equals(javaversion);
      case IzpackPackage.CONSTRAINT__REQUIRED_JDK:
        return requiredJdk != REQUIRED_JDK_EDEFAULT;
      case IzpackPackage.CONSTRAINT__PACKED:
        return packed != PACKED_EDEFAULT;
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
    result.append(" (javaversion: ");
    result.append(javaversion);
    result.append(", requiredJdk: ");
    result.append(requiredJdk);
    result.append(", packed: ");
    result.append(packed);
    result.append(')');
    return result.toString();
  }

} //ConstraintImpl
