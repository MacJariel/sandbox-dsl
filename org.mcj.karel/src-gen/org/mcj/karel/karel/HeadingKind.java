/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Heading Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mcj.karel.karel.KarelPackage#getHeadingKind()
 * @model
 * @generated
 */
public enum HeadingKind implements Enumerator
{
  /**
   * The '<em><b>NORTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORTH_VALUE
   * @generated
   * @ordered
   */
  NORTH(0, "NORTH", "NORTH"),

  /**
   * The '<em><b>SOUTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUTH_VALUE
   * @generated
   * @ordered
   */
  SOUTH(1, "SOUTH", "SOUTH"),

  /**
   * The '<em><b>WEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEST_VALUE
   * @generated
   * @ordered
   */
  WEST(2, "WEST", "WEST"),

  /**
   * The '<em><b>EAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EAST_VALUE
   * @generated
   * @ordered
   */
  EAST(3, "EAST", "EAST");

  /**
   * The '<em><b>NORTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NORTH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NORTH
   * @model
   * @generated
   * @ordered
   */
  public static final int NORTH_VALUE = 0;

  /**
   * The '<em><b>SOUTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOUTH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOUTH
   * @model
   * @generated
   * @ordered
   */
  public static final int SOUTH_VALUE = 1;

  /**
   * The '<em><b>WEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WEST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEST
   * @model
   * @generated
   * @ordered
   */
  public static final int WEST_VALUE = 2;

  /**
   * The '<em><b>EAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EAST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EAST
   * @model
   * @generated
   * @ordered
   */
  public static final int EAST_VALUE = 3;

  /**
   * An array of all the '<em><b>Heading Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final HeadingKind[] VALUES_ARRAY =
    new HeadingKind[]
    {
      NORTH,
      SOUTH,
      WEST,
      EAST,
    };

  /**
   * A public read-only list of all the '<em><b>Heading Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<HeadingKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Heading Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HeadingKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      HeadingKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Heading Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HeadingKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      HeadingKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Heading Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HeadingKind get(int value)
  {
    switch (value)
    {
      case NORTH_VALUE: return NORTH;
      case SOUTH_VALUE: return SOUTH;
      case WEST_VALUE: return WEST;
      case EAST_VALUE: return EAST;
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
  private HeadingKind(int value, String name, String literal)
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
  
} //HeadingKind
