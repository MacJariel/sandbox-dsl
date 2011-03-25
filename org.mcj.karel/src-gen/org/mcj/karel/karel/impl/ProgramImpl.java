/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcj.karel.karel.InitSection;
import org.mcj.karel.karel.KarelPackage;
import org.mcj.karel.karel.Main;
import org.mcj.karel.karel.Program;
import org.mcj.karel.karel.UserDefinedCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mcj.karel.karel.impl.ProgramImpl#getInitSection <em>Init Section</em>}</li>
 *   <li>{@link org.mcj.karel.karel.impl.ProgramImpl#getUserDefinedCommands <em>User Defined Commands</em>}</li>
 *   <li>{@link org.mcj.karel.karel.impl.ProgramImpl#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getInitSection() <em>Init Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitSection()
   * @generated
   * @ordered
   */
  protected InitSection initSection;

  /**
   * The cached value of the '{@link #getUserDefinedCommands() <em>User Defined Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserDefinedCommands()
   * @generated
   * @ordered
   */
  protected EList<UserDefinedCommand> userDefinedCommands;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected Main main;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return KarelPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitSection getInitSection()
  {
    return initSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitSection(InitSection newInitSection, NotificationChain msgs)
  {
    InitSection oldInitSection = initSection;
    initSection = newInitSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KarelPackage.PROGRAM__INIT_SECTION, oldInitSection, newInitSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitSection(InitSection newInitSection)
  {
    if (newInitSection != initSection)
    {
      NotificationChain msgs = null;
      if (initSection != null)
        msgs = ((InternalEObject)initSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KarelPackage.PROGRAM__INIT_SECTION, null, msgs);
      if (newInitSection != null)
        msgs = ((InternalEObject)newInitSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KarelPackage.PROGRAM__INIT_SECTION, null, msgs);
      msgs = basicSetInitSection(newInitSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KarelPackage.PROGRAM__INIT_SECTION, newInitSection, newInitSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UserDefinedCommand> getUserDefinedCommands()
  {
    if (userDefinedCommands == null)
    {
      userDefinedCommands = new EObjectContainmentEList<UserDefinedCommand>(UserDefinedCommand.class, this, KarelPackage.PROGRAM__USER_DEFINED_COMMANDS);
    }
    return userDefinedCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main getMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMain(Main newMain, NotificationChain msgs)
  {
    Main oldMain = main;
    main = newMain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KarelPackage.PROGRAM__MAIN, oldMain, newMain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMain(Main newMain)
  {
    if (newMain != main)
    {
      NotificationChain msgs = null;
      if (main != null)
        msgs = ((InternalEObject)main).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KarelPackage.PROGRAM__MAIN, null, msgs);
      if (newMain != null)
        msgs = ((InternalEObject)newMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KarelPackage.PROGRAM__MAIN, null, msgs);
      msgs = basicSetMain(newMain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KarelPackage.PROGRAM__MAIN, newMain, newMain));
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
      case KarelPackage.PROGRAM__INIT_SECTION:
        return basicSetInitSection(null, msgs);
      case KarelPackage.PROGRAM__USER_DEFINED_COMMANDS:
        return ((InternalEList<?>)getUserDefinedCommands()).basicRemove(otherEnd, msgs);
      case KarelPackage.PROGRAM__MAIN:
        return basicSetMain(null, msgs);
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
      case KarelPackage.PROGRAM__INIT_SECTION:
        return getInitSection();
      case KarelPackage.PROGRAM__USER_DEFINED_COMMANDS:
        return getUserDefinedCommands();
      case KarelPackage.PROGRAM__MAIN:
        return getMain();
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
      case KarelPackage.PROGRAM__INIT_SECTION:
        setInitSection((InitSection)newValue);
        return;
      case KarelPackage.PROGRAM__USER_DEFINED_COMMANDS:
        getUserDefinedCommands().clear();
        getUserDefinedCommands().addAll((Collection<? extends UserDefinedCommand>)newValue);
        return;
      case KarelPackage.PROGRAM__MAIN:
        setMain((Main)newValue);
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
      case KarelPackage.PROGRAM__INIT_SECTION:
        setInitSection((InitSection)null);
        return;
      case KarelPackage.PROGRAM__USER_DEFINED_COMMANDS:
        getUserDefinedCommands().clear();
        return;
      case KarelPackage.PROGRAM__MAIN:
        setMain((Main)null);
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
      case KarelPackage.PROGRAM__INIT_SECTION:
        return initSection != null;
      case KarelPackage.PROGRAM__USER_DEFINED_COMMANDS:
        return userDefinedCommands != null && !userDefinedCommands.isEmpty();
      case KarelPackage.PROGRAM__MAIN:
        return main != null;
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
