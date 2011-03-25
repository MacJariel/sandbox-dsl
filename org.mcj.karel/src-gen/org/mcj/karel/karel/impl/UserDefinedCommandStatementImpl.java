/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcj.karel.karel.KarelPackage;
import org.mcj.karel.karel.UserDefinedCommand;
import org.mcj.karel.karel.UserDefinedCommandStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined Command Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.impl.UserDefinedCommandStatementImpl#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDefinedCommandStatementImpl extends StatementImpl implements UserDefinedCommandStatement
{
  /**
   * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommand()
   * @generated
   * @ordered
   */
  protected UserDefinedCommand command;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserDefinedCommandStatementImpl()
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
    return KarelPackage.Literals.USER_DEFINED_COMMAND_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserDefinedCommand getCommand()
  {
    if (command != null && command.eIsProxy())
    {
      InternalEObject oldCommand = (InternalEObject)command;
      command = (UserDefinedCommand)eResolveProxy(oldCommand);
      if (command != oldCommand)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KarelPackage.USER_DEFINED_COMMAND_STATEMENT__COMMAND, oldCommand, command));
      }
    }
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserDefinedCommand basicGetCommand()
  {
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommand(UserDefinedCommand newCommand)
  {
    UserDefinedCommand oldCommand = command;
    command = newCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KarelPackage.USER_DEFINED_COMMAND_STATEMENT__COMMAND, oldCommand, command));
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
      case KarelPackage.USER_DEFINED_COMMAND_STATEMENT__COMMAND:
        if (resolve) return getCommand();
        return basicGetCommand();
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
      case KarelPackage.USER_DEFINED_COMMAND_STATEMENT__COMMAND:
        setCommand((UserDefinedCommand)newValue);
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
      case KarelPackage.USER_DEFINED_COMMAND_STATEMENT__COMMAND:
        setCommand((UserDefinedCommand)null);
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
      case KarelPackage.USER_DEFINED_COMMAND_STATEMENT__COMMAND:
        return command != null;
    }
    return super.eIsSet(featureID);
  }

} //UserDefinedCommandStatementImpl
