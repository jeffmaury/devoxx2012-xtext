/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.IzpackPackage;
import com.devoxx2012.xtext.izpack.Panel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PanelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PanelImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PanelImpl#getJar <em>Jar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PanelImpl extends MinimalEObjectImpl.Container implements Panel
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
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected JvmTypeReference classname;

  /**
   * The default value of the '{@link #getJar() <em>Jar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJar()
   * @generated
   * @ordered
   */
  protected static final String JAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJar() <em>Jar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJar()
   * @generated
   * @ordered
   */
  protected String jar = JAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PanelImpl()
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
    return IzpackPackage.Literals.PANEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PANEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getClassname()
  {
    return classname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassname(JvmTypeReference newClassname, NotificationChain msgs)
  {
    JvmTypeReference oldClassname = classname;
    classname = newClassname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IzpackPackage.PANEL__CLASSNAME, oldClassname, newClassname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassname(JvmTypeReference newClassname)
  {
    if (newClassname != classname)
    {
      NotificationChain msgs = null;
      if (classname != null)
        msgs = ((InternalEObject)classname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.PANEL__CLASSNAME, null, msgs);
      if (newClassname != null)
        msgs = ((InternalEObject)newClassname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.PANEL__CLASSNAME, null, msgs);
      msgs = basicSetClassname(newClassname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PANEL__CLASSNAME, newClassname, newClassname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJar()
  {
    return jar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJar(String newJar)
  {
    String oldJar = jar;
    jar = newJar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PANEL__JAR, oldJar, jar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IzpackPackage.PANEL__CLASSNAME:
        return basicSetClassname(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case IzpackPackage.PANEL__NAME:
        return getName();
      case IzpackPackage.PANEL__CLASSNAME:
        return getClassname();
      case IzpackPackage.PANEL__JAR:
        return getJar();
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
      case IzpackPackage.PANEL__NAME:
        setName((String)newValue);
        return;
      case IzpackPackage.PANEL__CLASSNAME:
        setClassname((JvmTypeReference)newValue);
        return;
      case IzpackPackage.PANEL__JAR:
        setJar((String)newValue);
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
      case IzpackPackage.PANEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IzpackPackage.PANEL__CLASSNAME:
        setClassname((JvmTypeReference)null);
        return;
      case IzpackPackage.PANEL__JAR:
        setJar(JAR_EDEFAULT);
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
      case IzpackPackage.PANEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IzpackPackage.PANEL__CLASSNAME:
        return classname != null;
      case IzpackPackage.PANEL__JAR:
        return JAR_EDEFAULT == null ? jar != null : !JAR_EDEFAULT.equals(jar);
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
    result.append(", jar: ");
    result.append(jar);
    result.append(')');
    return result.toString();
  }

} //PanelImpl
