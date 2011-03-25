/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mcj.karel.karel.ConditionExpr;
import org.mcj.karel.karel.ConditionKind;
import org.mcj.karel.karel.KarelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.impl.ConditionExprImpl#isNegation <em>Negation</em>}</li>
 *   <li>{@link org.mcj.karel.karel.impl.ConditionExprImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionExprImpl extends MinimalEObjectImpl.Container implements ConditionExpr
{
  /**
   * The default value of the '{@link #isNegation() <em>Negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegation()
   * @generated
   * @ordered
   */
  protected static final boolean NEGATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNegation() <em>Negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegation()
   * @generated
   * @ordered
   */
  protected boolean negation = NEGATION_EDEFAULT;

  /**
   * The default value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected static final ConditionKind EXPR_EDEFAULT = ConditionKind.WALL_AHEAD;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected ConditionKind expr = EXPR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KarelPackage.Literals.CONDITION_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNegation()
  {
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegation(boolean newNegation)
  {
    boolean oldNegation = negation;
    negation = newNegation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KarelPackage.CONDITION_EXPR__NEGATION, oldNegation, negation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionKind getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(ConditionKind newExpr)
  {
    ConditionKind oldExpr = expr;
    expr = newExpr == null ? EXPR_EDEFAULT : newExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KarelPackage.CONDITION_EXPR__EXPR, oldExpr, expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KarelPackage.CONDITION_EXPR__NEGATION:
        return isNegation();
      case KarelPackage.CONDITION_EXPR__EXPR:
        return getExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KarelPackage.CONDITION_EXPR__NEGATION:
        setNegation((Boolean)newValue);
        return;
      case KarelPackage.CONDITION_EXPR__EXPR:
        setExpr((ConditionKind)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KarelPackage.CONDITION_EXPR__NEGATION:
        setNegation(NEGATION_EDEFAULT);
        return;
      case KarelPackage.CONDITION_EXPR__EXPR:
        setExpr(EXPR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KarelPackage.CONDITION_EXPR__NEGATION:
        return negation != NEGATION_EDEFAULT;
      case KarelPackage.CONDITION_EXPR__EXPR:
        return expr != EXPR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (negation: ");
    result.append(negation);
    result.append(", expr: ");
    result.append(expr);
    result.append(')');
    return result.toString();
  }

} //ConditionExprImpl
