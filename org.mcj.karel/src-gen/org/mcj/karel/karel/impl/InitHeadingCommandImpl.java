/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcj.karel.karel.HeadingKind;
import org.mcj.karel.karel.InitHeadingCommand;
import org.mcj.karel.karel.KarelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Heading Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.impl.InitHeadingCommandImpl#getHeading <em>Heading</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitHeadingCommandImpl extends InitCommandImpl implements InitHeadingCommand
{
  /**
   * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeading()
   * @generated
   * @ordered
   */
  protected static final HeadingKind HEADING_EDEFAULT = HeadingKind.NORTH;

  /**
   * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeading()
   * @generated
   * @ordered
   */
  protected HeadingKind heading = HEADING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitHeadingCommandImpl()
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
    return KarelPackage.Literals.INIT_HEADING_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeadingKind getHeading()
  {
    return heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeading(HeadingKind newHeading)
  {
    HeadingKind oldHeading = heading;
    heading = newHeading == null ? HEADING_EDEFAULT : newHeading;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KarelPackage.INIT_HEADING_COMMAND__HEADING, oldHeading, heading));
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
      case KarelPackage.INIT_HEADING_COMMAND__HEADING:
        return getHeading();
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
      case KarelPackage.INIT_HEADING_COMMAND__HEADING:
        setHeading((HeadingKind)newValue);
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
      case KarelPackage.INIT_HEADING_COMMAND__HEADING:
        setHeading(HEADING_EDEFAULT);
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
      case KarelPackage.INIT_HEADING_COMMAND__HEADING:
        return heading != HEADING_EDEFAULT;
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
    result.append(" (heading: ");
    result.append(heading);
    result.append(')');
    return result.toString();
  }

} //InitHeadingCommandImpl
