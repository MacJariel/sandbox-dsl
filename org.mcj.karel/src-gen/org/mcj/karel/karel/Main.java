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
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.Main#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mcj.karel.karel.KarelPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
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
   * @see org.mcj.karel.karel.KarelPackage#getMain_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Main
