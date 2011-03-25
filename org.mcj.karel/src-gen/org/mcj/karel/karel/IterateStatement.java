/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterate Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.IterateStatement#getTimes <em>Times</em>}</li>
 *   <li>{@link org.mcj.karel.karel.IterateStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mcj.karel.karel.KarelPackage#getIterateStatement()
 * @model
 * @generated
 */
public interface IterateStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Times</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Times</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Times</em>' attribute.
   * @see #setTimes(int)
   * @see org.mcj.karel.karel.KarelPackage#getIterateStatement_Times()
   * @model
   * @generated
   */
  int getTimes();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.IterateStatement#getTimes <em>Times</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Times</em>' attribute.
   * @see #getTimes()
   * @generated
   */
  void setTimes(int value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.mcj.karel.karel.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.mcj.karel.karel.KarelPackage#getIterateStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // IterateStatement
