/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.CommandStatement#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mcj.karel.karel.KarelPackage#getCommandStatement()
 * @model
 * @generated
 */
public interface CommandStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.mcj.karel.karel.CommandKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.mcj.karel.karel.CommandKind
   * @see #setKind(CommandKind)
   * @see org.mcj.karel.karel.KarelPackage#getCommandStatement_Kind()
   * @model
   * @generated
   */
  CommandKind getKind();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.CommandStatement#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.mcj.karel.karel.CommandKind
   * @see #getKind()
   * @generated
   */
  void setKind(CommandKind value);

} // CommandStatement
