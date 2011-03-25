/**
 * <copyright>
 * </copyright>
 *
 */
package org.mcj.karel.karel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mcj.karel.karel.KarelFactory
 * @model kind="package"
 * @generated
 */
public interface KarelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "karel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mcj.org/karel/Karel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "karel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KarelPackage eINSTANCE = org.mcj.karel.karel.impl.KarelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.ProgramImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Init Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INIT_SECTION = 0;

  /**
   * The feature id for the '<em><b>User Defined Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__USER_DEFINED_COMMANDS = 1;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MAIN = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.InitSectionImpl <em>Init Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.InitSectionImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitSection()
   * @generated
   */
  int INIT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Init Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_SECTION__INIT_COMMANDS = 0;

  /**
   * The number of structural features of the '<em>Init Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.InitCommandImpl <em>Init Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.InitCommandImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitCommand()
   * @generated
   */
  int INIT_COMMAND = 2;

  /**
   * The number of structural features of the '<em>Init Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.InitPositionCommandImpl <em>Init Position Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.InitPositionCommandImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitPositionCommand()
   * @generated
   */
  int INIT_POSITION_COMMAND = 3;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_POSITION_COMMAND__X = INIT_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_POSITION_COMMAND__Y = INIT_COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Init Position Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_POSITION_COMMAND_FEATURE_COUNT = INIT_COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.InitHeadingCommandImpl <em>Init Heading Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.InitHeadingCommandImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitHeadingCommand()
   * @generated
   */
  int INIT_HEADING_COMMAND = 4;

  /**
   * The feature id for the '<em><b>Heading</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_HEADING_COMMAND__HEADING = INIT_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Init Heading Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_HEADING_COMMAND_FEATURE_COUNT = INIT_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.InitBoardSizeCommandImpl <em>Init Board Size Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.InitBoardSizeCommandImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitBoardSizeCommand()
   * @generated
   */
  int INIT_BOARD_SIZE_COMMAND = 5;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_BOARD_SIZE_COMMAND__WIDTH = INIT_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_BOARD_SIZE_COMMAND__HEIGHT = INIT_COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Init Board Size Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_BOARD_SIZE_COMMAND_FEATURE_COUNT = INIT_COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.UserDefinedCommandImpl <em>User Defined Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.UserDefinedCommandImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getUserDefinedCommand()
   * @generated
   */
  int USER_DEFINED_COMMAND = 6;

  /**
   * The feature id for the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_COMMAND__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_COMMAND__NAME = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_COMMAND__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>User Defined Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_COMMAND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.MainImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getMain()
   * @generated
   */
  int MAIN = 7;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.StatementImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 8;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.UserDefinedCommandStatementImpl <em>User Defined Command Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.UserDefinedCommandStatementImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getUserDefinedCommandStatement()
   * @generated
   */
  int USER_DEFINED_COMMAND_STATEMENT = 9;

  /**
   * The feature id for the '<em><b>Command</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_COMMAND_STATEMENT__COMMAND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Defined Command Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_COMMAND_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.IfStatementImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_STATEMENTS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.IterateStatementImpl <em>Iterate Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.IterateStatementImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getIterateStatement()
   * @generated
   */
  int ITERATE_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Times</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATE_STATEMENT__TIMES = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATE_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Iterate Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.WhileStatementImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.DocumentationCommentImpl <em>Documentation Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.DocumentationCommentImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getDocumentationComment()
   * @generated
   */
  int DOCUMENTATION_COMMENT = 13;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION_COMMENT__TEXT = 0;

  /**
   * The number of structural features of the '<em>Documentation Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTATION_COMMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.CommandStatementImpl <em>Command Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.CommandStatementImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getCommandStatement()
   * @generated
   */
  int COMMAND_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_STATEMENT__KIND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Command Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.impl.ConditionExprImpl <em>Condition Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.impl.ConditionExprImpl
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getConditionExpr()
   * @generated
   */
  int CONDITION_EXPR = 15;

  /**
   * The feature id for the '<em><b>Negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__NEGATION = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR__EXPR = 1;

  /**
   * The number of structural features of the '<em>Condition Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.HeadingKind <em>Heading Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.HeadingKind
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getHeadingKind()
   * @generated
   */
  int HEADING_KIND = 16;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.CommandKind <em>Command Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.CommandKind
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getCommandKind()
   * @generated
   */
  int COMMAND_KIND = 17;

  /**
   * The meta object id for the '{@link org.mcj.karel.karel.ConditionKind <em>Condition Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mcj.karel.karel.ConditionKind
   * @see org.mcj.karel.karel.impl.KarelPackageImpl#getConditionKind()
   * @generated
   */
  int CONDITION_KIND = 18;


  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.mcj.karel.karel.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference '{@link org.mcj.karel.karel.Program#getInitSection <em>Init Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init Section</em>'.
   * @see org.mcj.karel.karel.Program#getInitSection()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_InitSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.mcj.karel.karel.Program#getUserDefinedCommands <em>User Defined Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>User Defined Commands</em>'.
   * @see org.mcj.karel.karel.Program#getUserDefinedCommands()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_UserDefinedCommands();

  /**
   * Returns the meta object for the containment reference '{@link org.mcj.karel.karel.Program#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see org.mcj.karel.karel.Program#getMain()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Main();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.InitSection <em>Init Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Section</em>'.
   * @see org.mcj.karel.karel.InitSection
   * @generated
   */
  EClass getInitSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.mcj.karel.karel.InitSection#getInitCommands <em>Init Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Init Commands</em>'.
   * @see org.mcj.karel.karel.InitSection#getInitCommands()
   * @see #getInitSection()
   * @generated
   */
  EReference getInitSection_InitCommands();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.InitCommand <em>Init Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Command</em>'.
   * @see org.mcj.karel.karel.InitCommand
   * @generated
   */
  EClass getInitCommand();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.InitPositionCommand <em>Init Position Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Position Command</em>'.
   * @see org.mcj.karel.karel.InitPositionCommand
   * @generated
   */
  EClass getInitPositionCommand();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.InitPositionCommand#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.mcj.karel.karel.InitPositionCommand#getX()
   * @see #getInitPositionCommand()
   * @generated
   */
  EAttribute getInitPositionCommand_X();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.InitPositionCommand#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.mcj.karel.karel.InitPositionCommand#getY()
   * @see #getInitPositionCommand()
   * @generated
   */
  EAttribute getInitPositionCommand_Y();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.InitHeadingCommand <em>Init Heading Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Heading Command</em>'.
   * @see org.mcj.karel.karel.InitHeadingCommand
   * @generated
   */
  EClass getInitHeadingCommand();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.InitHeadingCommand#getHeading <em>Heading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Heading</em>'.
   * @see org.mcj.karel.karel.InitHeadingCommand#getHeading()
   * @see #getInitHeadingCommand()
   * @generated
   */
  EAttribute getInitHeadingCommand_Heading();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.InitBoardSizeCommand <em>Init Board Size Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Board Size Command</em>'.
   * @see org.mcj.karel.karel.InitBoardSizeCommand
   * @generated
   */
  EClass getInitBoardSizeCommand();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.InitBoardSizeCommand#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.mcj.karel.karel.InitBoardSizeCommand#getWidth()
   * @see #getInitBoardSizeCommand()
   * @generated
   */
  EAttribute getInitBoardSizeCommand_Width();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.InitBoardSizeCommand#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.mcj.karel.karel.InitBoardSizeCommand#getHeight()
   * @see #getInitBoardSizeCommand()
   * @generated
   */
  EAttribute getInitBoardSizeCommand_Height();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.UserDefinedCommand <em>User Defined Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Defined Command</em>'.
   * @see org.mcj.karel.karel.UserDefinedCommand
   * @generated
   */
  EClass getUserDefinedCommand();

  /**
   * Returns the meta object for the containment reference '{@link org.mcj.karel.karel.UserDefinedCommand#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc</em>'.
   * @see org.mcj.karel.karel.UserDefinedCommand#getDoc()
   * @see #getUserDefinedCommand()
   * @generated
   */
  EReference getUserDefinedCommand_Doc();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.UserDefinedCommand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.mcj.karel.karel.UserDefinedCommand#getName()
   * @see #getUserDefinedCommand()
   * @generated
   */
  EAttribute getUserDefinedCommand_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.mcj.karel.karel.UserDefinedCommand#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.mcj.karel.karel.UserDefinedCommand#getStatements()
   * @see #getUserDefinedCommand()
   * @generated
   */
  EReference getUserDefinedCommand_Statements();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see org.mcj.karel.karel.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for the containment reference list '{@link org.mcj.karel.karel.Main#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.mcj.karel.karel.Main#getStatements()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Statements();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.mcj.karel.karel.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.UserDefinedCommandStatement <em>User Defined Command Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Defined Command Statement</em>'.
   * @see org.mcj.karel.karel.UserDefinedCommandStatement
   * @generated
   */
  EClass getUserDefinedCommandStatement();

  /**
   * Returns the meta object for the reference '{@link org.mcj.karel.karel.UserDefinedCommandStatement#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Command</em>'.
   * @see org.mcj.karel.karel.UserDefinedCommandStatement#getCommand()
   * @see #getUserDefinedCommandStatement()
   * @generated
   */
  EReference getUserDefinedCommandStatement_Command();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.mcj.karel.karel.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.mcj.karel.karel.IfStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.mcj.karel.karel.IfStatement#getCondition()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.mcj.karel.karel.IfStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.mcj.karel.karel.IfStatement#getStatements()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Statements();

  /**
   * Returns the meta object for the containment reference list '{@link org.mcj.karel.karel.IfStatement#getElseStatements <em>Else Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Statements</em>'.
   * @see org.mcj.karel.karel.IfStatement#getElseStatements()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElseStatements();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.IterateStatement <em>Iterate Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iterate Statement</em>'.
   * @see org.mcj.karel.karel.IterateStatement
   * @generated
   */
  EClass getIterateStatement();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.IterateStatement#getTimes <em>Times</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Times</em>'.
   * @see org.mcj.karel.karel.IterateStatement#getTimes()
   * @see #getIterateStatement()
   * @generated
   */
  EAttribute getIterateStatement_Times();

  /**
   * Returns the meta object for the containment reference list '{@link org.mcj.karel.karel.IterateStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.mcj.karel.karel.IterateStatement#getStatements()
   * @see #getIterateStatement()
   * @generated
   */
  EReference getIterateStatement_Statements();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.mcj.karel.karel.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.mcj.karel.karel.WhileStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.mcj.karel.karel.WhileStatement#getCondition()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.mcj.karel.karel.WhileStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.mcj.karel.karel.WhileStatement#getStatements()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Statements();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.DocumentationComment <em>Documentation Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documentation Comment</em>'.
   * @see org.mcj.karel.karel.DocumentationComment
   * @generated
   */
  EClass getDocumentationComment();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.DocumentationComment#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.mcj.karel.karel.DocumentationComment#getText()
   * @see #getDocumentationComment()
   * @generated
   */
  EAttribute getDocumentationComment_Text();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.CommandStatement <em>Command Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Statement</em>'.
   * @see org.mcj.karel.karel.CommandStatement
   * @generated
   */
  EClass getCommandStatement();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.CommandStatement#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.mcj.karel.karel.CommandStatement#getKind()
   * @see #getCommandStatement()
   * @generated
   */
  EAttribute getCommandStatement_Kind();

  /**
   * Returns the meta object for class '{@link org.mcj.karel.karel.ConditionExpr <em>Condition Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Expr</em>'.
   * @see org.mcj.karel.karel.ConditionExpr
   * @generated
   */
  EClass getConditionExpr();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.ConditionExpr#isNegation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negation</em>'.
   * @see org.mcj.karel.karel.ConditionExpr#isNegation()
   * @see #getConditionExpr()
   * @generated
   */
  EAttribute getConditionExpr_Negation();

  /**
   * Returns the meta object for the attribute '{@link org.mcj.karel.karel.ConditionExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr</em>'.
   * @see org.mcj.karel.karel.ConditionExpr#getExpr()
   * @see #getConditionExpr()
   * @generated
   */
  EAttribute getConditionExpr_Expr();

  /**
   * Returns the meta object for enum '{@link org.mcj.karel.karel.HeadingKind <em>Heading Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Heading Kind</em>'.
   * @see org.mcj.karel.karel.HeadingKind
   * @generated
   */
  EEnum getHeadingKind();

  /**
   * Returns the meta object for enum '{@link org.mcj.karel.karel.CommandKind <em>Command Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Command Kind</em>'.
   * @see org.mcj.karel.karel.CommandKind
   * @generated
   */
  EEnum getCommandKind();

  /**
   * Returns the meta object for enum '{@link org.mcj.karel.karel.ConditionKind <em>Condition Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Condition Kind</em>'.
   * @see org.mcj.karel.karel.ConditionKind
   * @generated
   */
  EEnum getConditionKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KarelFactory getKarelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.ProgramImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Init Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INIT_SECTION = eINSTANCE.getProgram_InitSection();

    /**
     * The meta object literal for the '<em><b>User Defined Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__USER_DEFINED_COMMANDS = eINSTANCE.getProgram_UserDefinedCommands();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__MAIN = eINSTANCE.getProgram_Main();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.InitSectionImpl <em>Init Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.InitSectionImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitSection()
     * @generated
     */
    EClass INIT_SECTION = eINSTANCE.getInitSection();

    /**
     * The meta object literal for the '<em><b>Init Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_SECTION__INIT_COMMANDS = eINSTANCE.getInitSection_InitCommands();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.InitCommandImpl <em>Init Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.InitCommandImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitCommand()
     * @generated
     */
    EClass INIT_COMMAND = eINSTANCE.getInitCommand();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.InitPositionCommandImpl <em>Init Position Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.InitPositionCommandImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitPositionCommand()
     * @generated
     */
    EClass INIT_POSITION_COMMAND = eINSTANCE.getInitPositionCommand();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_POSITION_COMMAND__X = eINSTANCE.getInitPositionCommand_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_POSITION_COMMAND__Y = eINSTANCE.getInitPositionCommand_Y();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.InitHeadingCommandImpl <em>Init Heading Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.InitHeadingCommandImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitHeadingCommand()
     * @generated
     */
    EClass INIT_HEADING_COMMAND = eINSTANCE.getInitHeadingCommand();

    /**
     * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_HEADING_COMMAND__HEADING = eINSTANCE.getInitHeadingCommand_Heading();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.InitBoardSizeCommandImpl <em>Init Board Size Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.InitBoardSizeCommandImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getInitBoardSizeCommand()
     * @generated
     */
    EClass INIT_BOARD_SIZE_COMMAND = eINSTANCE.getInitBoardSizeCommand();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_BOARD_SIZE_COMMAND__WIDTH = eINSTANCE.getInitBoardSizeCommand_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INIT_BOARD_SIZE_COMMAND__HEIGHT = eINSTANCE.getInitBoardSizeCommand_Height();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.UserDefinedCommandImpl <em>User Defined Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.UserDefinedCommandImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getUserDefinedCommand()
     * @generated
     */
    EClass USER_DEFINED_COMMAND = eINSTANCE.getUserDefinedCommand();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_DEFINED_COMMAND__DOC = eINSTANCE.getUserDefinedCommand_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_DEFINED_COMMAND__NAME = eINSTANCE.getUserDefinedCommand_Name();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_DEFINED_COMMAND__STATEMENTS = eINSTANCE.getUserDefinedCommand_Statements();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.MainImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__STATEMENTS = eINSTANCE.getMain_Statements();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.StatementImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.UserDefinedCommandStatementImpl <em>User Defined Command Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.UserDefinedCommandStatementImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getUserDefinedCommandStatement()
     * @generated
     */
    EClass USER_DEFINED_COMMAND_STATEMENT = eINSTANCE.getUserDefinedCommandStatement();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_DEFINED_COMMAND_STATEMENT__COMMAND = eINSTANCE.getUserDefinedCommandStatement_Command();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.IfStatementImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__STATEMENTS = eINSTANCE.getIfStatement_Statements();

    /**
     * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_STATEMENTS = eINSTANCE.getIfStatement_ElseStatements();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.IterateStatementImpl <em>Iterate Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.IterateStatementImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getIterateStatement()
     * @generated
     */
    EClass ITERATE_STATEMENT = eINSTANCE.getIterateStatement();

    /**
     * The meta object literal for the '<em><b>Times</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITERATE_STATEMENT__TIMES = eINSTANCE.getIterateStatement_Times();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATE_STATEMENT__STATEMENTS = eINSTANCE.getIterateStatement_Statements();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.WhileStatementImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__STATEMENTS = eINSTANCE.getWhileStatement_Statements();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.DocumentationCommentImpl <em>Documentation Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.DocumentationCommentImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getDocumentationComment()
     * @generated
     */
    EClass DOCUMENTATION_COMMENT = eINSTANCE.getDocumentationComment();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTATION_COMMENT__TEXT = eINSTANCE.getDocumentationComment_Text();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.CommandStatementImpl <em>Command Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.CommandStatementImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getCommandStatement()
     * @generated
     */
    EClass COMMAND_STATEMENT = eINSTANCE.getCommandStatement();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_STATEMENT__KIND = eINSTANCE.getCommandStatement_Kind();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.impl.ConditionExprImpl <em>Condition Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.impl.ConditionExprImpl
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getConditionExpr()
     * @generated
     */
    EClass CONDITION_EXPR = eINSTANCE.getConditionExpr();

    /**
     * The meta object literal for the '<em><b>Negation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_EXPR__NEGATION = eINSTANCE.getConditionExpr_Negation();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_EXPR__EXPR = eINSTANCE.getConditionExpr_Expr();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.HeadingKind <em>Heading Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.HeadingKind
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getHeadingKind()
     * @generated
     */
    EEnum HEADING_KIND = eINSTANCE.getHeadingKind();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.CommandKind <em>Command Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.CommandKind
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getCommandKind()
     * @generated
     */
    EEnum COMMAND_KIND = eINSTANCE.getCommandKind();

    /**
     * The meta object literal for the '{@link org.mcj.karel.karel.ConditionKind <em>Condition Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mcj.karel.karel.ConditionKind
     * @see org.mcj.karel.karel.impl.KarelPackageImpl#getConditionKind()
     * @generated
     */
    EEnum CONDITION_KIND = eINSTANCE.getConditionKind();

  }

} //KarelPackage
