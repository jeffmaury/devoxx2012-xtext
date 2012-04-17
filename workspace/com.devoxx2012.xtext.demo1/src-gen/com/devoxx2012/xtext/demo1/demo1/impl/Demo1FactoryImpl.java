/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1.impl;

import com.devoxx2012.xtext.demo1.demo1.*;

import org.eclipse.emf.ecore.EClass;
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
public class Demo1FactoryImpl extends EFactoryImpl implements Demo1Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Demo1Factory init()
  {
    try
    {
      Demo1Factory theDemo1Factory = (Demo1Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.devoxx2012.com/xtext/demo1/Demo1"); 
      if (theDemo1Factory != null)
      {
        return theDemo1Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Demo1FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Demo1FactoryImpl()
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
      case Demo1Package.MODEL: return createModel();
      case Demo1Package.CATEGORY: return createCategory();
      case Demo1Package.RULE: return createRule();
      case Demo1Package.RULE_EXPRESSION: return createRuleExpression();
      case Demo1Package.TEST_EXPRESSION: return createTestExpression();
      case Demo1Package.RATIO_EXPRESSION: return createRatioExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category createCategory()
  {
    CategoryImpl category = new CategoryImpl();
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleExpression createRuleExpression()
  {
    RuleExpressionImpl ruleExpression = new RuleExpressionImpl();
    return ruleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestExpression createTestExpression()
  {
    TestExpressionImpl testExpression = new TestExpressionImpl();
    return testExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RatioExpression createRatioExpression()
  {
    RatioExpressionImpl ratioExpression = new RatioExpressionImpl();
    return ratioExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Demo1Package getDemo1Package()
  {
    return (Demo1Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Demo1Package getPackage()
  {
    return Demo1Package.eINSTANCE;
  }

} //Demo1FactoryImpl
