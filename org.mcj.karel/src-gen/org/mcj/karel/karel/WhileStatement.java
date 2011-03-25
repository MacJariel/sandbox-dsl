/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.WhileStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.mcj.karel.karel.WhileStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mcj.karel.karel.KarelPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(ConditionExpr)
   * @see org.mcj.karel.karel.KarelPackage#getWhileStatement_Condition()
   * @model containment="true"
   * @generated
   */
  ConditionExpr getCondition();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.WhileStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(ConditionExpr value);

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
   * @see org.mcj.karel.karel.KarelPackage#getWhileStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // WhileStatement
