/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1.impl;

import com.devoxx2012.xtext.demo1.demo1.Demo1Package;
import com.devoxx2012.xtext.demo1.demo1.RatioExpression;
import com.devoxx2012.xtext.demo1.demo1.RuleExpression;
import com.devoxx2012.xtext.demo1.demo1.TestExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.impl.RuleExpressionImpl#getTest <em>Test</em>}</li>
 *   <li>{@link com.devoxx2012.xtext.demo1.demo1.impl.RuleExpressionImpl#getRatio <em>Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleExpressionImpl extends MinimalEObjectImpl.Container implements RuleExpression
{
  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected TestExpression test;

  /**
   * The cached value of the '{@link #getRatio() <em>Ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatio()
   * @generated
   * @ordered
   */
  protected RatioExpression ratio;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleExpressionImpl()
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
    return Demo1Package.Literals.RULE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestExpression getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTest(TestExpression newTest, NotificationChain msgs)
  {
    TestExpression oldTest = test;
    test = newTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Demo1Package.RULE_EXPRESSION__TEST, oldTest, newTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest(TestExpression newTest)
  {
    if (newTest != test)
    {
      NotificationChain msgs = null;
      if (test != null)
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Demo1Package.RULE_EXPRESSION__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Demo1Package.RULE_EXPRESSION__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Demo1Package.RULE_EXPRESSION__TEST, newTest, newTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RatioExpression getRatio()
  {
    return ratio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRatio(RatioExpression newRatio, NotificationChain msgs)
  {
    RatioExpression oldRatio = ratio;
    ratio = newRatio;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Demo1Package.RULE_EXPRESSION__RATIO, oldRatio, newRatio);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRatio(RatioExpression newRatio)
  {
    if (newRatio != ratio)
    {
      NotificationChain msgs = null;
      if (ratio != null)
        msgs = ((InternalEObject)ratio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Demo1Package.RULE_EXPRESSION__RATIO, null, msgs);
      if (newRatio != null)
        msgs = ((InternalEObject)newRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Demo1Package.RULE_EXPRESSION__RATIO, null, msgs);
      msgs = basicSetRatio(newRatio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Demo1Package.RULE_EXPRESSION__RATIO, newRatio, newRatio));
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
      case Demo1Package.RULE_EXPRESSION__TEST:
        return basicSetTest(null, msgs);
      case Demo1Package.RULE_EXPRESSION__RATIO:
        return basicSetRatio(null, msgs);
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
      case Demo1Package.RULE_EXPRESSION__TEST:
        return getTest();
      case Demo1Package.RULE_EXPRESSION__RATIO:
        return getRatio();
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
      case Demo1Package.RULE_EXPRESSION__TEST:
        setTest((TestExpression)newValue);
        return;
      case Demo1Package.RULE_EXPRESSION__RATIO:
        setRatio((RatioExpression)newValue);
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
      case Demo1Package.RULE_EXPRESSION__TEST:
        setTest((TestExpression)null);
        return;
      case Demo1Package.RULE_EXPRESSION__RATIO:
        setRatio((RatioExpression)null);
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
      case Demo1Package.RULE_EXPRESSION__TEST:
        return test != null;
      case Demo1Package.RULE_EXPRESSION__RATIO:
        return ratio != null;
    }
    return super.eIsSet(featureID);
  }

} //RuleExpressionImpl
