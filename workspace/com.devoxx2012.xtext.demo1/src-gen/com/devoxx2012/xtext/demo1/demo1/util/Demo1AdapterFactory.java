/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1.util;

import com.devoxx2012.xtext.demo1.demo1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package
 * @generated
 */
public class Demo1AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Demo1Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Demo1AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Demo1Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Demo1Switch<Adapter> modelSwitch =
    new Demo1Switch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCategory(Category object)
      {
        return createCategoryAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseRuleExpression(RuleExpression object)
      {
        return createRuleExpressionAdapter();
      }
      @Override
      public Adapter caseTestExpression(TestExpression object)
      {
        return createTestExpressionAdapter();
      }
      @Override
      public Adapter caseRatioExpression(RatioExpression object)
      {
        return createRatioExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.devoxx2012.xtext.demo1.demo1.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.devoxx2012.xtext.demo1.demo1.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.devoxx2012.xtext.demo1.demo1.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.devoxx2012.xtext.demo1.demo1.Category
   * @generated
   */
  public Adapter createCategoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.devoxx2012.xtext.demo1.demo1.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.devoxx2012.xtext.demo1.demo1.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.devoxx2012.xtext.demo1.demo1.RuleExpression <em>Rule Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.devoxx2012.xtext.demo1.demo1.RuleExpression
   * @generated
   */
  public Adapter createRuleExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.devoxx2012.xtext.demo1.demo1.TestExpression <em>Test Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.devoxx2012.xtext.demo1.demo1.TestExpression
   * @generated
   */
  public Adapter createTestExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.devoxx2012.xtext.demo1.demo1.RatioExpression <em>Ratio Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.devoxx2012.xtext.demo1.demo1.RatioExpression
   * @generated
   */
  public Adapter createRatioExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Demo1AdapterFactory
