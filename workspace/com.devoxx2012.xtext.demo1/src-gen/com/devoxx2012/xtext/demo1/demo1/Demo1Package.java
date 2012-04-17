/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.demo1.demo1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.devoxx2012.xtext.demo1.demo1.Demo1Factory
 * @model kind="package"
 * @generated
 */
public interface Demo1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "demo1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.devoxx2012.com/xtext/demo1/Demo1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "demo1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Demo1Package eINSTANCE = com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl.init();

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.demo1.demo1.impl.ModelImpl
   * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CATEGORIES = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.demo1.demo1.impl.CategoryImpl
   * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = 0;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.demo1.demo1.impl.RuleImpl
   * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getRule()
   * @generated
   */
  int RULE = 2;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__FIRST = 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NEXT = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.RuleExpressionImpl <em>Rule Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.demo1.demo1.impl.RuleExpressionImpl
   * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getRuleExpression()
   * @generated
   */
  int RULE_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_EXPRESSION__TEST = 0;

  /**
   * The feature id for the '<em><b>Ratio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_EXPRESSION__RATIO = 1;

  /**
   * The number of structural features of the '<em>Rule Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.TestExpressionImpl <em>Test Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.demo1.demo1.impl.TestExpressionImpl
   * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getTestExpression()
   * @generated
   */
  int TEST_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_EXPRESSION__CATEGORY = 0;

  /**
   * The number of structural features of the '<em>Test Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.RatioExpressionImpl <em>Ratio Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.devoxx2012.xtext.demo1.demo1.impl.RatioExpressionImpl
   * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getRatioExpression()
   * @generated
   */
  int RATIO_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Ratio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIO_EXPRESSION__RATIO = 0;

  /**
   * The number of structural features of the '<em>Ratio Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATIO_EXPRESSION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.demo1.demo1.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.devoxx2012.xtext.demo1.demo1.Model#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Categories</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.Model#getCategories()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Categories();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.demo1.demo1.Model#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.Model#getRule()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rule();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.demo1.demo1.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.demo1.demo1.Category#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.Category#getName()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_Name();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.demo1.demo1.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.demo1.demo1.Rule#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.Rule#getFirst()
   * @see #getRule()
   * @generated
   */
  EReference getRule_First();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.demo1.demo1.Rule#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.Rule#getNext()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Next();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.demo1.demo1.RuleExpression <em>Rule Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Expression</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.RuleExpression
   * @generated
   */
  EClass getRuleExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.demo1.demo1.RuleExpression#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.RuleExpression#getTest()
   * @see #getRuleExpression()
   * @generated
   */
  EReference getRuleExpression_Test();

  /**
   * Returns the meta object for the containment reference '{@link com.devoxx2012.xtext.demo1.demo1.RuleExpression#getRatio <em>Ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ratio</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.RuleExpression#getRatio()
   * @see #getRuleExpression()
   * @generated
   */
  EReference getRuleExpression_Ratio();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.demo1.demo1.TestExpression <em>Test Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Expression</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.TestExpression
   * @generated
   */
  EClass getTestExpression();

  /**
   * Returns the meta object for the reference '{@link com.devoxx2012.xtext.demo1.demo1.TestExpression#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.TestExpression#getCategory()
   * @see #getTestExpression()
   * @generated
   */
  EReference getTestExpression_Category();

  /**
   * Returns the meta object for class '{@link com.devoxx2012.xtext.demo1.demo1.RatioExpression <em>Ratio Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ratio Expression</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.RatioExpression
   * @generated
   */
  EClass getRatioExpression();

  /**
   * Returns the meta object for the attribute '{@link com.devoxx2012.xtext.demo1.demo1.RatioExpression#getRatio <em>Ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ratio</em>'.
   * @see com.devoxx2012.xtext.demo1.demo1.RatioExpression#getRatio()
   * @see #getRatioExpression()
   * @generated
   */
  EAttribute getRatioExpression_Ratio();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Demo1Factory getDemo1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.demo1.demo1.impl.ModelImpl
     * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CATEGORIES = eINSTANCE.getModel_Categories();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULE = eINSTANCE.getModel_Rule();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.demo1.demo1.impl.CategoryImpl
     * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.demo1.demo1.impl.RuleImpl
     * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__FIRST = eINSTANCE.getRule_First();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__NEXT = eINSTANCE.getRule_Next();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.RuleExpressionImpl <em>Rule Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.demo1.demo1.impl.RuleExpressionImpl
     * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getRuleExpression()
     * @generated
     */
    EClass RULE_EXPRESSION = eINSTANCE.getRuleExpression();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_EXPRESSION__TEST = eINSTANCE.getRuleExpression_Test();

    /**
     * The meta object literal for the '<em><b>Ratio</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_EXPRESSION__RATIO = eINSTANCE.getRuleExpression_Ratio();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.TestExpressionImpl <em>Test Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.demo1.demo1.impl.TestExpressionImpl
     * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getTestExpression()
     * @generated
     */
    EClass TEST_EXPRESSION = eINSTANCE.getTestExpression();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_EXPRESSION__CATEGORY = eINSTANCE.getTestExpression_Category();

    /**
     * The meta object literal for the '{@link com.devoxx2012.xtext.demo1.demo1.impl.RatioExpressionImpl <em>Ratio Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.devoxx2012.xtext.demo1.demo1.impl.RatioExpressionImpl
     * @see com.devoxx2012.xtext.demo1.demo1.impl.Demo1PackageImpl#getRatioExpression()
     * @generated
     */
    EClass RATIO_EXPRESSION = eINSTANCE.getRatioExpression();

    /**
     * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATIO_EXPRESSION__RATIO = eINSTANCE.getRatioExpression_Ratio();

  }

} //Demo1Package
