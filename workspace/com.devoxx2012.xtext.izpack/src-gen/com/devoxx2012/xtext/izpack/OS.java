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
 * A representation of the literals of the enumeration '<em><b>OS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.devoxx2012.xtext.izpack.IzpackPackage#getOS()
 * @model
 * @generated
 */
public enum OS implements Enumerator
{
  /**
   * The '<em><b>ALL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_VALUE
   * @generated
   * @ordered
   */
  ALL(0, "ALL", "all"),

  /**
   * The '<em><b>UNIX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNIX_VALUE
   * @generated
   * @ordered
   */
  UNIX(1, "UNIX", "unix"),

  /**
   * The '<em><b>WINDOWS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WINDOWS_VALUE
   * @generated
   * @ordered
   */
  WINDOWS(2, "WINDOWS", "windows"),

  /**
   * The '<em><b>MAC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAC_VALUE
   * @generated
   * @ordered
   */
  MAC(3, "MAC", "mac");

  /**
   * The '<em><b>ALL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL
   * @model literal="all"
   * @generated
   * @ordered
   */
  public static final int ALL_VALUE = 0;

  /**
   * The '<em><b>UNIX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNIX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNIX
   * @model literal="unix"
   * @generated
   * @ordered
   */
  public static final int UNIX_VALUE = 1;

  /**
   * The '<em><b>WINDOWS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WINDOWS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WINDOWS
   * @model literal="windows"
   * @generated
   * @ordered
   */
  public static final int WINDOWS_VALUE = 2;

  /**
   * The '<em><b>MAC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAC
   * @model literal="mac"
   * @generated
   * @ordered
   */
  public static final int MAC_VALUE = 3;

  /**
   * An array of all the '<em><b>OS</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OS[] VALUES_ARRAY =
    new OS[]
    {
      ALL,
      UNIX,
      WINDOWS,
      MAC,
    };

  /**
   * A public read-only list of all the '<em><b>OS</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>OS</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OS get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OS result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OS</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OS getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OS result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>OS</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OS get(int value)
  {
    switch (value)
    {
      case ALL_VALUE: return ALL;
      case UNIX_VALUE: return UNIX;
      case WINDOWS_VALUE: return WINDOWS;
      case MAC_VALUE: return MAC;
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
  private OS(int value, String name, String literal)
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
  
} //OS
