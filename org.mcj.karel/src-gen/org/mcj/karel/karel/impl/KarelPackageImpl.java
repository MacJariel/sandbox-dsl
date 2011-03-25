/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mcj.karel.karel.CommandKind;
import org.mcj.karel.karel.CommandStatement;
import org.mcj.karel.karel.ConditionExpr;
import org.mcj.karel.karel.ConditionKind;
import org.mcj.karel.karel.DocumentationComment;
import org.mcj.karel.karel.HeadingKind;
import org.mcj.karel.karel.IfStatement;
import org.mcj.karel.karel.InitBoardSizeCommand;
import org.mcj.karel.karel.InitCommand;
import org.mcj.karel.karel.InitHeadingCommand;
import org.mcj.karel.karel.InitPositionCommand;
import org.mcj.karel.karel.InitSection;
import org.mcj.karel.karel.IterateStatement;
import org.mcj.karel.karel.KarelFactory;
import org.mcj.karel.karel.KarelPackage;
import org.mcj.karel.karel.Main;
import org.mcj.karel.karel.Program;
import org.mcj.karel.karel.Statement;
import org.mcj.karel.karel.UserDefinedCommand;
import org.mcj.karel.karel.UserDefinedCommandStatement;
import org.mcj.karel.karel.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KarelPackageImpl extends EPackageImpl implements KarelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initPositionCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initHeadingCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initBoardSizeCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userDefinedCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userDefinedCommandStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iterateStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentationCommentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum headingKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum commandKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum conditionKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.mcj.karel.karel.KarelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KarelPackageImpl()
  {
    super(eNS_URI, KarelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link KarelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KarelPackage init()
  {
    if (isInited) return (KarelPackage)EPackage.Registry.INSTANCE.getEPackage(KarelPackage.eNS_URI);

    // Obtain or create and register package
    KarelPackageImpl theKarelPackage = (KarelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KarelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KarelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKarelPackage.createPackageContents();

    // Initialize created meta-data
    theKarelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKarelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KarelPackage.eNS_URI, theKarelPackage);
    return theKarelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_InitSection()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_UserDefinedCommands()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Main()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitSection()
  {
    return initSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitSection_InitCommands()
  {
    return (EReference)initSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitCommand()
  {
    return initCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitPositionCommand()
  {
    return initPositionCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitPositionCommand_X()
  {
    return (EAttribute)initPositionCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitPositionCommand_Y()
  {
    return (EAttribute)initPositionCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitHeadingCommand()
  {
    return initHeadingCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitHeadingCommand_Heading()
  {
    return (EAttribute)initHeadingCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitBoardSizeCommand()
  {
    return initBoardSizeCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitBoardSizeCommand_Width()
  {
    return (EAttribute)initBoardSizeCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInitBoardSizeCommand_Height()
  {
    return (EAttribute)initBoardSizeCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserDefinedCommand()
  {
    return userDefinedCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserDefinedCommand_Doc()
  {
    return (EReference)userDefinedCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUserDefinedCommand_Name()
  {
    return (EAttribute)userDefinedCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserDefinedCommand_Statements()
  {
    return (EReference)userDefinedCommandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMain()
  {
    return mainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMain_Statements()
  {
    return (EReference)mainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserDefinedCommandStatement()
  {
    return userDefinedCommandStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserDefinedCommandStatement_Command()
  {
    return (EReference)userDefinedCommandStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Condition()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Statements()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElseStatements()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterateStatement()
  {
    return iterateStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIterateStatement_Times()
  {
    return (EAttribute)iterateStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterateStatement_Statements()
  {
    return (EReference)iterateStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileStatement()
  {
    return whileStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileStatement_Condition()
  {
    return (EReference)whileStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileStatement_Statements()
  {
    return (EReference)whileStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentationComment()
  {
    return documentationCommentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentationComment_Text()
  {
    return (EAttribute)documentationCommentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommandStatement()
  {
    return commandStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommandStatement_Kind()
  {
    return (EAttribute)commandStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionExpr()
  {
    return conditionExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionExpr_Negation()
  {
    return (EAttribute)conditionExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionExpr_Expr()
  {
    return (EAttribute)conditionExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHeadingKind()
  {
    return headingKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCommandKind()
  {
    return commandKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConditionKind()
  {
    return conditionKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KarelFactory getKarelFactory()
  {
    return (KarelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__INIT_SECTION);
    createEReference(programEClass, PROGRAM__USER_DEFINED_COMMANDS);
    createEReference(programEClass, PROGRAM__MAIN);

    initSectionEClass = createEClass(INIT_SECTION);
    createEReference(initSectionEClass, INIT_SECTION__INIT_COMMANDS);

    initCommandEClass = createEClass(INIT_COMMAND);

    initPositionCommandEClass = createEClass(INIT_POSITION_COMMAND);
    createEAttribute(initPositionCommandEClass, INIT_POSITION_COMMAND__X);
    createEAttribute(initPositionCommandEClass, INIT_POSITION_COMMAND__Y);

    initHeadingCommandEClass = createEClass(INIT_HEADING_COMMAND);
    createEAttribute(initHeadingCommandEClass, INIT_HEADING_COMMAND__HEADING);

    initBoardSizeCommandEClass = createEClass(INIT_BOARD_SIZE_COMMAND);
    createEAttribute(initBoardSizeCommandEClass, INIT_BOARD_SIZE_COMMAND__WIDTH);
    createEAttribute(initBoardSizeCommandEClass, INIT_BOARD_SIZE_COMMAND__HEIGHT);

    userDefinedCommandEClass = createEClass(USER_DEFINED_COMMAND);
    createEReference(userDefinedCommandEClass, USER_DEFINED_COMMAND__DOC);
    createEAttribute(userDefinedCommandEClass, USER_DEFINED_COMMAND__NAME);
    createEReference(userDefinedCommandEClass, USER_DEFINED_COMMAND__STATEMENTS);

    mainEClass = createEClass(MAIN);
    createEReference(mainEClass, MAIN__STATEMENTS);

    statementEClass = createEClass(STATEMENT);

    userDefinedCommandStatementEClass = createEClass(USER_DEFINED_COMMAND_STATEMENT);
    createEReference(userDefinedCommandStatementEClass, USER_DEFINED_COMMAND_STATEMENT__COMMAND);

    ifStatementEClass = createEClass(IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__CONDITION);
    createEReference(ifStatementEClass, IF_STATEMENT__STATEMENTS);
    createEReference(ifStatementEClass, IF_STATEMENT__ELSE_STATEMENTS);

    iterateStatementEClass = createEClass(ITERATE_STATEMENT);
    createEAttribute(iterateStatementEClass, ITERATE_STATEMENT__TIMES);
    createEReference(iterateStatementEClass, ITERATE_STATEMENT__STATEMENTS);

    whileStatementEClass = createEClass(WHILE_STATEMENT);
    createEReference(whileStatementEClass, WHILE_STATEMENT__CONDITION);
    createEReference(whileStatementEClass, WHILE_STATEMENT__STATEMENTS);

    documentationCommentEClass = createEClass(DOCUMENTATION_COMMENT);
    createEAttribute(documentationCommentEClass, DOCUMENTATION_COMMENT__TEXT);

    commandStatementEClass = createEClass(COMMAND_STATEMENT);
    createEAttribute(commandStatementEClass, COMMAND_STATEMENT__KIND);

    conditionExprEClass = createEClass(CONDITION_EXPR);
    createEAttribute(conditionExprEClass, CONDITION_EXPR__NEGATION);
    createEAttribute(conditionExprEClass, CONDITION_EXPR__EXPR);

    // Create enums
    headingKindEEnum = createEEnum(HEADING_KIND);
    commandKindEEnum = createEEnum(COMMAND_KIND);
    conditionKindEEnum = createEEnum(CONDITION_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    initPositionCommandEClass.getESuperTypes().add(this.getInitCommand());
    initHeadingCommandEClass.getESuperTypes().add(this.getInitCommand());
    initBoardSizeCommandEClass.getESuperTypes().add(this.getInitCommand());
    userDefinedCommandStatementEClass.getESuperTypes().add(this.getStatement());
    ifStatementEClass.getESuperTypes().add(this.getStatement());
    iterateStatementEClass.getESuperTypes().add(this.getStatement());
    whileStatementEClass.getESuperTypes().add(this.getStatement());
    commandStatementEClass.getESuperTypes().add(this.getStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_InitSection(), this.getInitSection(), null, "initSection", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_UserDefinedCommands(), this.getUserDefinedCommand(), null, "userDefinedCommands", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Main(), this.getMain(), null, "main", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initSectionEClass, InitSection.class, "InitSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitSection_InitCommands(), this.getInitCommand(), null, "initCommands", null, 0, -1, InitSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initCommandEClass, InitCommand.class, "InitCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(initPositionCommandEClass, InitPositionCommand.class, "InitPositionCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitPositionCommand_X(), ecorePackage.getEInt(), "x", null, 0, 1, InitPositionCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInitPositionCommand_Y(), ecorePackage.getEInt(), "y", null, 0, 1, InitPositionCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initHeadingCommandEClass, InitHeadingCommand.class, "InitHeadingCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitHeadingCommand_Heading(), this.getHeadingKind(), "heading", null, 0, 1, InitHeadingCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initBoardSizeCommandEClass, InitBoardSizeCommand.class, "InitBoardSizeCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitBoardSizeCommand_Width(), ecorePackage.getEInt(), "width", null, 0, 1, InitBoardSizeCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInitBoardSizeCommand_Height(), ecorePackage.getEInt(), "height", null, 0, 1, InitBoardSizeCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userDefinedCommandEClass, UserDefinedCommand.class, "UserDefinedCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserDefinedCommand_Doc(), this.getDocumentationComment(), null, "doc", null, 0, 1, UserDefinedCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUserDefinedCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserDefinedCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserDefinedCommand_Statements(), this.getStatement(), null, "statements", null, 0, -1, UserDefinedCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMain_Statements(), this.getStatement(), null, "statements", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(userDefinedCommandStatementEClass, UserDefinedCommandStatement.class, "UserDefinedCommandStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserDefinedCommandStatement_Command(), this.getUserDefinedCommand(), null, "command", null, 0, 1, UserDefinedCommandStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatement_Condition(), this.getConditionExpr(), null, "condition", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ElseStatements(), this.getStatement(), null, "elseStatements", null, 0, -1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iterateStatementEClass, IterateStatement.class, "IterateStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIterateStatement_Times(), ecorePackage.getEInt(), "times", null, 0, 1, IterateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIterateStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, IterateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileStatement_Condition(), this.getConditionExpr(), null, "condition", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentationCommentEClass, DocumentationComment.class, "DocumentationComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentationComment_Text(), ecorePackage.getEString(), "text", null, 0, 1, DocumentationComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandStatementEClass, CommandStatement.class, "CommandStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommandStatement_Kind(), this.getCommandKind(), "kind", null, 0, 1, CommandStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionExprEClass, ConditionExpr.class, "ConditionExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionExpr_Negation(), ecorePackage.getEBoolean(), "negation", null, 0, 1, ConditionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionExpr_Expr(), this.getConditionKind(), "expr", null, 0, 1, ConditionExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(headingKindEEnum, HeadingKind.class, "HeadingKind");
    addEEnumLiteral(headingKindEEnum, HeadingKind.NORTH);
    addEEnumLiteral(headingKindEEnum, HeadingKind.SOUTH);
    addEEnumLiteral(headingKindEEnum, HeadingKind.WEST);
    addEEnumLiteral(headingKindEEnum, HeadingKind.EAST);

    initEEnum(commandKindEEnum, CommandKind.class, "CommandKind");
    addEEnumLiteral(commandKindEEnum, CommandKind.MOVE);
    addEEnumLiteral(commandKindEEnum, CommandKind.TURNLEFT);
    addEEnumLiteral(commandKindEEnum, CommandKind.TURNON);
    addEEnumLiteral(commandKindEEnum, CommandKind.TURNOFF);
    addEEnumLiteral(commandKindEEnum, CommandKind.PUT);
    addEEnumLiteral(commandKindEEnum, CommandKind.GET);

    initEEnum(conditionKindEEnum, ConditionKind.class, "ConditionKind");
    addEEnumLiteral(conditionKindEEnum, ConditionKind.WALL_AHEAD);
    addEEnumLiteral(conditionKindEEnum, ConditionKind.MARKED_PLACE);

    // Create resource
    createResource(eNS_URI);
  }

} //KarelPackageImpl
