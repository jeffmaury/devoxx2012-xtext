/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.devoxx2012.xtext.demo1.demo1.Demo1Package
 * @generated
 */
public interface Demo1Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Demo1Factory eINSTANCE = com.devoxx2012.xtext.demo1.demo1.impl.Demo1FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category</em>'.
   * @generated
   */
  Category createCategory();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Rule Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Expression</em>'.
   * @generated
   */
  RuleExpression createRuleExpression();

  /**
   * Returns a new object of class '<em>Test Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Expression</em>'.
   * @generated
   */
  TestExpression createTestExpression();

  /**
   * Returns a new object of class '<em>Ratio Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ratio Expression</em>'.
   * @generated
   */
  RatioExpression createRatioExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Demo1Package getDemo1Package();

} //Demo1Factory
