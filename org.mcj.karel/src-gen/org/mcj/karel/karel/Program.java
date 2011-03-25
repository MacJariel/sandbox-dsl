/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.Program#getInitSection <em>Init Section</em>}</li>
 *   <li>{@link org.mcj.karel.karel.Program#getUserDefinedCommands <em>User Defined Commands</em>}</li>
 *   <li>{@link org.mcj.karel.karel.Program#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mcj.karel.karel.KarelPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Init Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Section</em>' containment reference.
   * @see #setInitSection(InitSection)
   * @see org.mcj.karel.karel.KarelPackage#getProgram_InitSection()
   * @model containment="true"
   * @generated
   */
  InitSection getInitSection();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.Program#getInitSection <em>Init Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Section</em>' containment reference.
   * @see #getInitSection()
   * @generated
   */
  void setInitSection(InitSection value);

  /**
   * Returns the value of the '<em><b>User Defined Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.mcj.karel.karel.UserDefinedCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Defined Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Defined Commands</em>' containment reference list.
   * @see org.mcj.karel.karel.KarelPackage#getProgram_UserDefinedCommands()
   * @model containment="true"
   * @generated
   */
  EList<UserDefinedCommand> getUserDefinedCommands();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Main)
   * @see org.mcj.karel.karel.KarelPackage#getProgram_Main()
   * @model containment="true"
   * @generated
   */
  Main getMain();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.Program#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Main value);

} // Program
