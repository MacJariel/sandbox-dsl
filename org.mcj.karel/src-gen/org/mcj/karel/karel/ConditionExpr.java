/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.ConditionExpr#isNegation <em>Negation</em>}</li>
 *   <li>{@link org.mcj.karel.karel.ConditionExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mcj.karel.karel.KarelPackage#getConditionExpr()
 * @model
 * @generated
 */
public interface ConditionExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negation</em>' attribute.
   * @see #setNegation(boolean)
   * @see org.mcj.karel.karel.KarelPackage#getConditionExpr_Negation()
   * @model
   * @generated
   */
  boolean isNegation();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.ConditionExpr#isNegation <em>Negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negation</em>' attribute.
   * @see #isNegation()
   * @generated
   */
  void setNegation(boolean value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' attribute.
   * The literals are from the enumeration {@link org.mcj.karel.karel.ConditionKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' attribute.
   * @see org.mcj.karel.karel.ConditionKind
   * @see #setExpr(ConditionKind)
   * @see org.mcj.karel.karel.KarelPackage#getConditionExpr_Expr()
   * @model
   * @generated
   */
  ConditionKind getExpr();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.ConditionExpr#getExpr <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' attribute.
   * @see org.mcj.karel.karel.ConditionKind
   * @see #getExpr()
   * @generated
   */
  void setExpr(ConditionKind value);

} // ConditionExpr
