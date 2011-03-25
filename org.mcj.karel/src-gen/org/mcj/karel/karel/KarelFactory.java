/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mcj.karel.karel.KarelPackage
 * @generated
 */
public interface KarelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KarelFactory eINSTANCE = org.mcj.karel.karel.impl.KarelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Init Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Section</em>'.
   * @generated
   */
  InitSection createInitSection();

  /**
   * Returns a new object of class '<em>Init Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Command</em>'.
   * @generated
   */
  InitCommand createInitCommand();

  /**
   * Returns a new object of class '<em>Init Position Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Position Command</em>'.
   * @generated
   */
  InitPositionCommand createInitPositionCommand();

  /**
   * Returns a new object of class '<em>Init Heading Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Heading Command</em>'.
   * @generated
   */
  InitHeadingCommand createInitHeadingCommand();

  /**
   * Returns a new object of class '<em>Init Board Size Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Board Size Command</em>'.
   * @generated
   */
  InitBoardSizeCommand createInitBoardSizeCommand();

  /**
   * Returns a new object of class '<em>User Defined Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Defined Command</em>'.
   * @generated
   */
  UserDefinedCommand createUserDefinedCommand();

  /**
   * Returns a new object of class '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main</em>'.
   * @generated
   */
  Main createMain();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>User Defined Command Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Defined Command Statement</em>'.
   * @generated
   */
  UserDefinedCommandStatement createUserDefinedCommandStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Iterate Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iterate Statement</em>'.
   * @generated
   */
  IterateStatement createIterateStatement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>Documentation Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Documentation Comment</em>'.
   * @generated
   */
  DocumentationComment createDocumentationComment();

  /**
   * Returns a new object of class '<em>Command Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command Statement</em>'.
   * @generated
   */
  CommandStatement createCommandStatement();

  /**
   * Returns a new object of class '<em>Condition Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Expr</em>'.
   * @generated
   */
  ConditionExpr createConditionExpr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KarelPackage getKarelPackage();

} //KarelFactory
