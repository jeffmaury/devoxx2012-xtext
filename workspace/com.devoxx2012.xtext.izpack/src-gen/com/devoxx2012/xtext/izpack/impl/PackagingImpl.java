/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.IzpackPackage;
import com.devoxx2012.xtext.izpack.Option;
import com.devoxx2012.xtext.izpack.Packaging;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackagingImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.PackagingImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackagingImpl extends MinimalEObjectImpl.Container implements Packaging
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected JvmTypeReference class_;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<Option> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackagingImpl()
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
    return IzpackPackage.Literals.PACKAGING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(JvmTypeReference newClass, NotificationChain msgs)
  {
    JvmTypeReference oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IzpackPackage.PACKAGING__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(JvmTypeReference newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.PACKAGING__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IzpackPackage.PACKAGING__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.PACKAGING__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Option> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<Option>(Option.class, this, IzpackPackage.PACKAGING__OPTIONS);
    }
    return options;
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
      case IzpackPackage.PACKAGING__CLASS:
        return basicSetClass(null, msgs);
      case IzpackPackage.PACKAGING__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case IzpackPackage.PACKAGING__CLASS:
        return getClass_();
      case IzpackPackage.PACKAGING__OPTIONS:
        return getOptions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IzpackPackage.PACKAGING__CLASS:
        setClass((JvmTypeReference)newValue);
        return;
      case IzpackPackage.PACKAGING__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends Option>)newValue);
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
      case IzpackPackage.PACKAGING__CLASS:
        setClass((JvmTypeReference)null);
        return;
      case IzpackPackage.PACKAGING__OPTIONS:
        getOptions().clear();
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
      case IzpackPackage.PACKAGING__CLASS:
        return class_ != null;
      case IzpackPackage.PACKAGING__OPTIONS:
        return options != null && !options.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PackagingImpl
