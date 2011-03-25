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
 * A representation of the literals of the enumeration '<em><b>Command Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mcj.karel.karel.KarelPackage#getCommandKind()
 * @model
 * @generated
 */
public enum CommandKind implements Enumerator
{
  /**
   * The '<em><b>MOVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOVE_VALUE
   * @generated
   * @ordered
   */
  MOVE(0, "MOVE", "move"),

  /**
   * The '<em><b>TURNLEFT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TURNLEFT_VALUE
   * @generated
   * @ordered
   */
  TURNLEFT(1, "TURNLEFT", "turn"),

  /**
   * The '<em><b>TURNON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TURNON_VALUE
   * @generated
   * @ordered
   */
  TURNON(2, "TURNON", "turnOn"),

  /**
   * The '<em><b>TURNOFF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TURNOFF_VALUE
   * @generated
   * @ordered
   */
  TURNOFF(3, "TURNOFF", "turnOff"),

  /**
   * The '<em><b>PUT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PUT_VALUE
   * @generated
   * @ordered
   */
  PUT(4, "PUT", "put"),

  /**
   * The '<em><b>GET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GET_VALUE
   * @generated
   * @ordered
   */
  GET(5, "GET", "get");

  /**
   * The '<em><b>MOVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MOVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOVE
   * @model literal="move"
   * @generated
   * @ordered
   */
  public static final int MOVE_VALUE = 0;

  /**
   * The '<em><b>TURNLEFT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TURNLEFT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TURNLEFT
   * @model literal="turn"
   * @generated
   * @ordered
   */
  public static final int TURNLEFT_VALUE = 1;

  /**
   * The '<em><b>TURNON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TURNON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TURNON
   * @model literal="turnOn"
   * @generated
   * @ordered
   */
  public static final int TURNON_VALUE = 2;

  /**
   * The '<em><b>TURNOFF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TURNOFF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TURNOFF
   * @model literal="turnOff"
   * @generated
   * @ordered
   */
  public static final int TURNOFF_VALUE = 3;

  /**
   * The '<em><b>PUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PUT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PUT
   * @model literal="put"
   * @generated
   * @ordered
   */
  public static final int PUT_VALUE = 4;

  /**
   * The '<em><b>GET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GET</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GET
   * @model literal="get"
   * @generated
   * @ordered
   */
  public static final int GET_VALUE = 5;

  /**
   * An array of all the '<em><b>Command Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CommandKind[] VALUES_ARRAY =
    new CommandKind[]
    {
      MOVE,
      TURNLEFT,
      TURNON,
      TURNOFF,
      PUT,
      GET,
    };

  /**
   * A public read-only list of all the '<em><b>Command Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CommandKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Command Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CommandKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CommandKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Command Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CommandKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CommandKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Command Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CommandKind get(int value)
  {
    switch (value)
    {
      case MOVE_VALUE: return MOVE;
      case TURNLEFT_VALUE: return TURNLEFT;
      case TURNON_VALUE: return TURNON;
      case TURNOFF_VALUE: return TURNOFF;
      case PUT_VALUE: return PUT;
      case GET_VALUE: return GET;
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
  private CommandKind(int value, String name, String literal)
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
  
} //CommandKind
