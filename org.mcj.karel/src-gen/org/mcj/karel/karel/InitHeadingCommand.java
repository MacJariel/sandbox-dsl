/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Heading Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.InitHeadingCommand#getHeading <em>Heading</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mcj.karel.karel.KarelPackage#getInitHeadingCommand()
 * @model
 * @generated
 */
public interface InitHeadingCommand extends InitCommand
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' attribute.
   * The literals are from the enumeration {@link org.mcj.karel.karel.HeadingKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heading</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' attribute.
   * @see org.mcj.karel.karel.HeadingKind
   * @see #setHeading(HeadingKind)
   * @see org.mcj.karel.karel.KarelPackage#getInitHeadingCommand_Heading()
   * @model
   * @generated
   */
  HeadingKind getHeading();

  /**
   * Sets the value of the '{@link org.mcj.karel.karel.InitHeadingCommand#getHeading <em>Heading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' attribute.
   * @see org.mcj.karel.karel.HeadingKind
   * @see #getHeading()
   * @generated
   */
  void setHeading(HeadingKind value);

} // InitHeadingCommand
