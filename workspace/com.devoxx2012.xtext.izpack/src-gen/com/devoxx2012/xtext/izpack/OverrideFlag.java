/**
 * <copyright>
 * </copyright>
 *
 */
package com.devoxx2012.xtext.izpack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Override Flag</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getOverrideFlag()
 * @model
 * @generated
 */
public enum OverrideFlag implements Enumerator
{
  /**
   * The '<em><b>TRUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRUE_VALUE
   * @generated
   * @ordered
   */
  TRUE(0, "TRUE", "true"),

  /**
   * The '<em><b>FALSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FALSE_VALUE
   * @generated
   * @ordered
   */
  FALSE(1, "FALSE", "false"),

  /**
   * The '<em><b>ASKTRUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASKTRUE_VALUE
   * @generated
   * @ordered
   */
  ASKTRUE(2, "ASKTRUE", "asktrue"),

  /**
   * The '<em><b>ASKFALSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASKFALSE_VALUE
   * @generated
   * @ordered
   */
  ASKFALSE(3, "ASKFALSE", "askfalse"),

  /**
   * The '<em><b>Update</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UPDATE_VALUE
   * @generated
   * @ordered
   */
  UPDATE(4, "update", "update");

  /**
   * The '<em><b>TRUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TRUE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRUE
   * @model literal="true"
   * @generated
   * @ordered
   */
  public static final int TRUE_VALUE = 0;

  /**
   * The '<em><b>FALSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FALSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FALSE
   * @model literal="false"
   * @generated
   * @ordered
   */
  public static final int FALSE_VALUE = 1;

  /**
   * The '<em><b>ASKTRUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASKTRUE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASKTRUE
   * @model literal="asktrue"
   * @generated
   * @ordered
   */
  public static final int ASKTRUE_VALUE = 2;

  /**
   * The '<em><b>ASKFALSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASKFALSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASKFALSE
   * @model literal="askfalse"
   * @generated
   * @ordered
   */
  public static final int ASKFALSE_VALUE = 3;

  /**
   * The '<em><b>Update</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Update</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UPDATE
   * @model name="update"
   * @generated
   * @ordered
   */
  public static final int UPDATE_VALUE = 4;

  /**
   * An array of all the '<em><b>Override Flag</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OverrideFlag[] VALUES_ARRAY =
    new OverrideFlag[]
    {
      TRUE,
      FALSE,
      ASKTRUE,
      ASKFALSE,
      UPDATE,
    };

  /**
   * A public read-only list of all the '<em><b>Override Flag</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OverrideFlag> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Override Flag</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OverrideFlag get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OverrideFlag result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Override Flag</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OverrideFlag getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OverrideFlag result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Override Flag</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OverrideFlag get(int value)
  {
    switch (value)
    {
      case TRUE_VALUE: return TRUE;
      case FALSE_VALUE: return FALSE;
      case ASKTRUE_VALUE: return ASKTRUE;
      case ASKFALSE_VALUE: return ASKFALSE;
      case UPDATE_VALUE: return UPDATE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OverrideFlag(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OverrideFlag
