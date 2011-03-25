/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.DocumentationComment#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mcj.karel.karel.KarelPackage#getDocumentationComment()
 * @model
 * @generated
 */
public interface DocumentationComment extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.mcj.karel.karel.KarelPackage#getDocumentationComment_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.DocumentationComment#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // DocumentationComment
