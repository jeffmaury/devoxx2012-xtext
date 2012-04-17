/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack.impl;

import com.devoxx2012.xtext.izpack.IzpackPackage;
import com.devoxx2012.xtext.izpack.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.VariableImpl#isIsDynamic <em>Is Dynamic</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.izpack.impl.VariableImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
{
  /**
   * The default value of the '{@link #isIsDynamic() <em>Is Dynamic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDynamic()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DYNAMIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDynamic() <em>Is Dynamic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDynamic()
   * @generated
   * @ordered
   */
  protected boolean isDynamic = IS_DYNAMIC_EDEFAULT;

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
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return IzpackPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDynamic()
  {
    return isDynamic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDynamic(boolean newIsDynamic)
  {
    boolean oldIsDynamic = isDynamic;
    isDynamic = newIsDynamic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.VARIABLE__IS_DYNAMIC, oldIsDynamic, isDynamic));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IzpackPackage.VARIABLE__VALUE, oldValue, value));
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
      case IzpackPackage.VARIABLE__IS_DYNAMIC:
        return isIsDynamic();
      case IzpackPackage.VARIABLE__NAME:
        return getName();
      case IzpackPackage.VARIABLE__VALUE:
        return getValue();
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
      case IzpackPackage.VARIABLE__IS_DYNAMIC:
        setIsDynamic((Boolean)newValue);
        return;
      case IzpackPackage.VARIABLE__NAME:
        setName((String)newValue);
        return;
      case IzpackPackage.VARIABLE__VALUE:
        setValue((String)newValue);
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
      case IzpackPackage.VARIABLE__IS_DYNAMIC:
        setIsDynamic(IS_DYNAMIC_EDEFAULT);
        return;
      case IzpackPackage.VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IzpackPackage.VARIABLE__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case IzpackPackage.VARIABLE__IS_DYNAMIC:
        return isDynamic != IS_DYNAMIC_EDEFAULT;
      case IzpackPackage.VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IzpackPackage.VARIABLE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (isDynamic: ");
    result.append(isDynamic);
    result.append(", name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //VariableImpl
