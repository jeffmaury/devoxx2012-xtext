/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1.impl;

import com.devoxx2012.xtext.demo1.demo1.Demo1Package;
import com.devoxx2012.xtext.demo1.demo1.Rule;
import com.devoxx2012.xtext.demo1.demo1.RuleExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.impl.RuleImpl#getFirst <em>First</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.impl.RuleImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected RuleExpression first;

  /**
   * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected EObject next;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return Demo1Package.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleExpression getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirst(RuleExpression newFirst, NotificationChain msgs)
  {
    RuleExpression oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Demo1Package.RULE__FIRST, oldFirst, newFirst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(RuleExpression newFirst)
  {
    if (newFirst != first)
    {
      NotificationChain msgs = null;
      if (first != null)
        msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Demo1Package.RULE__FIRST, null, msgs);
      if (newFirst != null)
        msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Demo1Package.RULE__FIRST, null, msgs);
      msgs = basicSetFirst(newFirst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Demo1Package.RULE__FIRST, newFirst, newFirst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNext(EObject newNext, NotificationChain msgs)
  {
    EObject oldNext = next;
    next = newNext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Demo1Package.RULE__NEXT, oldNext, newNext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(EObject newNext)
  {
    if (newNext != next)
    {
      NotificationChain msgs = null;
      if (next != null)
        msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Demo1Package.RULE__NEXT, null, msgs);
      if (newNext != null)
        msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Demo1Package.RULE__NEXT, null, msgs);
      msgs = basicSetNext(newNext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Demo1Package.RULE__NEXT, newNext, newNext));
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
      case Demo1Package.RULE__FIRST:
        return basicSetFirst(null, msgs);
      case Demo1Package.RULE__NEXT:
        return basicSetNext(null, msgs);
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
      case Demo1Package.RULE__FIRST:
        return getFirst();
      case Demo1Package.RULE__NEXT:
        return getNext();
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
      case Demo1Package.RULE__FIRST:
        setFirst((RuleExpression)newValue);
        return;
      case Demo1Package.RULE__NEXT:
        setNext((EObject)newValue);
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
      case Demo1Package.RULE__FIRST:
        setFirst((RuleExpression)null);
        return;
      case Demo1Package.RULE__NEXT:
        setNext((EObject)null);
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
      case Demo1Package.RULE__FIRST:
        return first != null;
      case Demo1Package.RULE__NEXT:
        return next != null;
    }
    return super.eIsSet(featureID);
  }

} //RuleImpl
