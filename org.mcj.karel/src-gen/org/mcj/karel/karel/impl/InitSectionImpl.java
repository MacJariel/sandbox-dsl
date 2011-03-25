/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcj.karel.karel.InitCommand;
import org.mcj.karel.karel.InitSection;
import org.mcj.karel.karel.KarelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.impl.InitSectionImpl#getInitCommands <em>Init Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitSectionImpl extends MinimalEObjectImpl.Container implements InitSection
{
  /**
   * The cached value of the '{@link #getInitCommands() <em>Init Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitCommands()
   * @generated
   * @ordered
   */
  protected EList<InitCommand> initCommands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitSectionImpl()
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
    return KarelPackage.Literals.INIT_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InitCommand> getInitCommands()
  {
    if (initCommands == null)
    {
      initCommands = new EObjectContainmentEList<InitCommand>(InitCommand.class, this, KarelPackage.INIT_SECTION__INIT_COMMANDS);
    }
    return initCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KarelPackage.INIT_SECTION__INIT_COMMANDS:
        return ((InternalEList<?>)getInitCommands()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case KarelPackage.INIT_SECTION__INIT_COMMANDS:
        return getInitCommands();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KarelPackage.INIT_SECTION__INIT_COMMANDS:
        getInitCommands().clear();
        getInitCommands().addAll((Collection<? extends InitCommand>)newValue);
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
      case KarelPackage.INIT_SECTION__INIT_COMMANDS:
        getInitCommands().clear();
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
      case KarelPackage.INIT_SECTION__INIT_COMMANDS:
        return initCommands != null && !initCommands.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InitSectionImpl
