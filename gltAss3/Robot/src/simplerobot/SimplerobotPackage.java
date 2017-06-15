/**
 */
package simplerobot;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see simplerobot.SimplerobotFactory
 * @model kind="package"
 * @generated
 */
public interface SimplerobotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplerobot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "simplerobot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplerobot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplerobotPackage eINSTANCE = simplerobot.impl.SimplerobotPackageImpl.init();

	/**
	 * The meta object id for the '{@link simplerobot.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.RobotImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link simplerobot.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.StatementImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplerobot.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.CommandImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplerobot.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.CommentImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 3;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplerobot.impl.SingletonImpl <em>Singleton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.SingletonImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getSingleton()
	 * @generated
	 */
	int SINGLETON = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simplerobot.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.TraceImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TEXT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simplerobot.impl.BuildWallImpl <em>Build Wall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.BuildWallImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getBuildWall()
	 * @generated
	 */
	int BUILD_WALL = 6;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL__ROW = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL__COL = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Build Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_WALL_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simplerobot.impl.DropMarkImpl <em>Drop Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.DropMarkImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getDropMark()
	 * @generated
	 */
	int DROP_MARK = 7;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK__ROW = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK__COL = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Drop Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_MARK_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simplerobot.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.WhileStatementImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__COND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simplerobot.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.RepeatStatementImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getRepeatStatement()
	 * @generated
	 */
	int REPEAT_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__TIMES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeat Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simplerobot.impl.IfElseStatementImpl <em>If Else Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.IfElseStatementImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getIfElseStatement()
	 * @generated
	 */
	int IF_ELSE_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_STATEMENT__COND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ifbody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_STATEMENT__IFBODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elsebody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_STATEMENT__ELSEBODY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Else Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_ELSE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link simplerobot.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.IfStatementImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__COND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simplerobot.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.ExpressionImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__B = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link simplerobot.impl.AtomicImpl <em>Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.AtomicImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getAtomic()
	 * @generated
	 */
	int ATOMIC = 13;

	/**
	 * The number of structural features of the '<em>Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplerobot.impl.FullImpl <em>Full</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.FullImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getFull()
	 * @generated
	 */
	int FULL = 14;

	/**
	 * The number of structural features of the '<em>Full</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplerobot.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.MarkImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 15;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplerobot.impl.AheadImpl <em>Ahead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.AheadImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getAhead()
	 * @generated
	 */
	int AHEAD = 16;

	/**
	 * The number of structural features of the '<em>Ahead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AHEAD_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplerobot.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.HeadingImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 17;

	/**
	 * The feature id for the '<em><b>Wind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__WIND = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simplerobot.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.NotImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 18;

	/**
	 * The feature id for the '<em><b>E</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__E = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simplerobot.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.impl.StringImpl
	 * @see simplerobot.impl.SimplerobotPackageImpl#getString()
	 * @generated
	 */
	int STRING = 19;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__TEXT = 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link simplerobot.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.Orientation
	 * @see simplerobot.impl.SimplerobotPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 20;

	/**
	 * The meta object id for the '{@link simplerobot.SingletonTypes <em>Singleton Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.SingletonTypes
	 * @see simplerobot.impl.SimplerobotPackageImpl#getSingletonTypes()
	 * @generated
	 */
	int SINGLETON_TYPES = 21;

	/**
	 * The meta object id for the '{@link simplerobot.ExpressionOperator <em>Expression Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplerobot.ExpressionOperator
	 * @see simplerobot.impl.SimplerobotPackageImpl#getExpressionOperator()
	 * @generated
	 */
	int EXPRESSION_OPERATOR = 22;

	/**
	 * The meta object id for the '<em>Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see simplerobot.impl.SimplerobotPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 23;

	/**
	 * The meta object id for the '<em>Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see simplerobot.impl.SimplerobotPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 24;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see simplerobot.impl.SimplerobotPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 25;


	/**
	 * Returns the meta object for class '{@link simplerobot.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see simplerobot.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link simplerobot.Robot#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see simplerobot.Robot#getStatements()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Statements();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.Robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simplerobot.Robot#getName()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Name();

	/**
	 * Returns the meta object for class '{@link simplerobot.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see simplerobot.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link simplerobot.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see simplerobot.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link simplerobot.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see simplerobot.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link simplerobot.Singleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton</em>'.
	 * @see simplerobot.Singleton
	 * @generated
	 */
	EClass getSingleton();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.Singleton#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see simplerobot.Singleton#getType()
	 * @see #getSingleton()
	 * @generated
	 */
	EAttribute getSingleton_Type();

	/**
	 * Returns the meta object for class '{@link simplerobot.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see simplerobot.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.Trace#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see simplerobot.Trace#getText()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Text();

	/**
	 * Returns the meta object for class '{@link simplerobot.BuildWall <em>Build Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Wall</em>'.
	 * @see simplerobot.BuildWall
	 * @generated
	 */
	EClass getBuildWall();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.BuildWall#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see simplerobot.BuildWall#getRow()
	 * @see #getBuildWall()
	 * @generated
	 */
	EAttribute getBuildWall_Row();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.BuildWall#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col</em>'.
	 * @see simplerobot.BuildWall#getCol()
	 * @see #getBuildWall()
	 * @generated
	 */
	EAttribute getBuildWall_Col();

	/**
	 * Returns the meta object for class '{@link simplerobot.DropMark <em>Drop Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Mark</em>'.
	 * @see simplerobot.DropMark
	 * @generated
	 */
	EClass getDropMark();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.DropMark#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see simplerobot.DropMark#getRow()
	 * @see #getDropMark()
	 * @generated
	 */
	EAttribute getDropMark_Row();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.DropMark#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col</em>'.
	 * @see simplerobot.DropMark#getCol()
	 * @see #getDropMark()
	 * @generated
	 */
	EAttribute getDropMark_Col();

	/**
	 * Returns the meta object for class '{@link simplerobot.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see simplerobot.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link simplerobot.WhileStatement#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see simplerobot.WhileStatement#getCond()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Cond();

	/**
	 * Returns the meta object for the containment reference list '{@link simplerobot.WhileStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see simplerobot.WhileStatement#getBody()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Body();

	/**
	 * Returns the meta object for class '{@link simplerobot.RepeatStatement <em>Repeat Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Statement</em>'.
	 * @see simplerobot.RepeatStatement
	 * @generated
	 */
	EClass getRepeatStatement();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.RepeatStatement#getTimes <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Times</em>'.
	 * @see simplerobot.RepeatStatement#getTimes()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EAttribute getRepeatStatement_Times();

	/**
	 * Returns the meta object for the containment reference list '{@link simplerobot.RepeatStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see simplerobot.RepeatStatement#getBody()
	 * @see #getRepeatStatement()
	 * @generated
	 */
	EReference getRepeatStatement_Body();

	/**
	 * Returns the meta object for class '{@link simplerobot.IfElseStatement <em>If Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Else Statement</em>'.
	 * @see simplerobot.IfElseStatement
	 * @generated
	 */
	EClass getIfElseStatement();

	/**
	 * Returns the meta object for the containment reference '{@link simplerobot.IfElseStatement#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see simplerobot.IfElseStatement#getCond()
	 * @see #getIfElseStatement()
	 * @generated
	 */
	EReference getIfElseStatement_Cond();

	/**
	 * Returns the meta object for the containment reference list '{@link simplerobot.IfElseStatement#getIfbody <em>Ifbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ifbody</em>'.
	 * @see simplerobot.IfElseStatement#getIfbody()
	 * @see #getIfElseStatement()
	 * @generated
	 */
	EReference getIfElseStatement_Ifbody();

	/**
	 * Returns the meta object for the containment reference list '{@link simplerobot.IfElseStatement#getElsebody <em>Elsebody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elsebody</em>'.
	 * @see simplerobot.IfElseStatement#getElsebody()
	 * @see #getIfElseStatement()
	 * @generated
	 */
	EReference getIfElseStatement_Elsebody();

	/**
	 * Returns the meta object for class '{@link simplerobot.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see simplerobot.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link simplerobot.IfStatement#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see simplerobot.IfStatement#getCond()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Cond();

	/**
	 * Returns the meta object for the containment reference list '{@link simplerobot.IfStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see simplerobot.IfStatement#getBody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Body();

	/**
	 * Returns the meta object for class '{@link simplerobot.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see simplerobot.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link simplerobot.Expression#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see simplerobot.Expression#getA()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_A();

	/**
	 * Returns the meta object for the containment reference '{@link simplerobot.Expression#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see simplerobot.Expression#getB()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_B();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.Expression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see simplerobot.Expression#getOperator()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Operator();

	/**
	 * Returns the meta object for class '{@link simplerobot.Atomic <em>Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic</em>'.
	 * @see simplerobot.Atomic
	 * @generated
	 */
	EClass getAtomic();

	/**
	 * Returns the meta object for class '{@link simplerobot.Full <em>Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full</em>'.
	 * @see simplerobot.Full
	 * @generated
	 */
	EClass getFull();

	/**
	 * Returns the meta object for class '{@link simplerobot.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see simplerobot.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for class '{@link simplerobot.Ahead <em>Ahead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ahead</em>'.
	 * @see simplerobot.Ahead
	 * @generated
	 */
	EClass getAhead();

	/**
	 * Returns the meta object for class '{@link simplerobot.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see simplerobot.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.Heading#getWind <em>Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind</em>'.
	 * @see simplerobot.Heading#getWind()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Wind();

	/**
	 * Returns the meta object for class '{@link simplerobot.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see simplerobot.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link simplerobot.Not#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>E</em>'.
	 * @see simplerobot.Not#getE()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_E();

	/**
	 * Returns the meta object for class '{@link simplerobot.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see simplerobot.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link simplerobot.String#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see simplerobot.String#getText()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Text();

	/**
	 * Returns the meta object for enum '{@link simplerobot.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see simplerobot.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link simplerobot.SingletonTypes <em>Singleton Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Singleton Types</em>'.
	 * @see simplerobot.SingletonTypes
	 * @generated
	 */
	EEnum getSingletonTypes();

	/**
	 * Returns the meta object for enum '{@link simplerobot.ExpressionOperator <em>Expression Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Operator</em>'.
	 * @see simplerobot.ExpressionOperator
	 * @generated
	 */
	EEnum getExpressionOperator();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getText();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getName_();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplerobotFactory getSimplerobotFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link simplerobot.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.RobotImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__STATEMENTS = eINSTANCE.getRobot_Statements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.StatementImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.CommandImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.CommentImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.SingletonImpl <em>Singleton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.SingletonImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getSingleton()
		 * @generated
		 */
		EClass SINGLETON = eINSTANCE.getSingleton();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLETON__TYPE = eINSTANCE.getSingleton_Type();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.TraceImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__TEXT = eINSTANCE.getTrace_Text();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.BuildWallImpl <em>Build Wall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.BuildWallImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getBuildWall()
		 * @generated
		 */
		EClass BUILD_WALL = eINSTANCE.getBuildWall();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_WALL__ROW = eINSTANCE.getBuildWall_Row();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_WALL__COL = eINSTANCE.getBuildWall_Col();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.DropMarkImpl <em>Drop Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.DropMarkImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getDropMark()
		 * @generated
		 */
		EClass DROP_MARK = eINSTANCE.getDropMark();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_MARK__ROW = eINSTANCE.getDropMark_Row();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_MARK__COL = eINSTANCE.getDropMark_Col();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.WhileStatementImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__COND = eINSTANCE.getWhileStatement_Cond();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__BODY = eINSTANCE.getWhileStatement_Body();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.RepeatStatementImpl <em>Repeat Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.RepeatStatementImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getRepeatStatement()
		 * @generated
		 */
		EClass REPEAT_STATEMENT = eINSTANCE.getRepeatStatement();

		/**
		 * The meta object literal for the '<em><b>Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_STATEMENT__TIMES = eINSTANCE.getRepeatStatement_Times();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_STATEMENT__BODY = eINSTANCE.getRepeatStatement_Body();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.IfElseStatementImpl <em>If Else Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.IfElseStatementImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getIfElseStatement()
		 * @generated
		 */
		EClass IF_ELSE_STATEMENT = eINSTANCE.getIfElseStatement();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_ELSE_STATEMENT__COND = eINSTANCE.getIfElseStatement_Cond();

		/**
		 * The meta object literal for the '<em><b>Ifbody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_ELSE_STATEMENT__IFBODY = eINSTANCE.getIfElseStatement_Ifbody();

		/**
		 * The meta object literal for the '<em><b>Elsebody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_ELSE_STATEMENT__ELSEBODY = eINSTANCE.getIfElseStatement_Elsebody();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.IfStatementImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__COND = eINSTANCE.getIfStatement_Cond();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__BODY = eINSTANCE.getIfStatement_Body();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.ExpressionImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__A = eINSTANCE.getExpression_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__B = eINSTANCE.getExpression_B();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.AtomicImpl <em>Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.AtomicImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getAtomic()
		 * @generated
		 */
		EClass ATOMIC = eINSTANCE.getAtomic();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.FullImpl <em>Full</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.FullImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getFull()
		 * @generated
		 */
		EClass FULL = eINSTANCE.getFull();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.MarkImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.AheadImpl <em>Ahead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.AheadImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getAhead()
		 * @generated
		 */
		EClass AHEAD = eINSTANCE.getAhead();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.HeadingImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Wind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__WIND = eINSTANCE.getHeading_Wind();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.NotImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__E = eINSTANCE.getNot_E();

		/**
		 * The meta object literal for the '{@link simplerobot.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.impl.StringImpl
		 * @see simplerobot.impl.SimplerobotPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__TEXT = eINSTANCE.getString_Text();

		/**
		 * The meta object literal for the '{@link simplerobot.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.Orientation
		 * @see simplerobot.impl.SimplerobotPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link simplerobot.SingletonTypes <em>Singleton Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.SingletonTypes
		 * @see simplerobot.impl.SimplerobotPackageImpl#getSingletonTypes()
		 * @generated
		 */
		EEnum SINGLETON_TYPES = eINSTANCE.getSingletonTypes();

		/**
		 * The meta object literal for the '{@link simplerobot.ExpressionOperator <em>Expression Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplerobot.ExpressionOperator
		 * @see simplerobot.impl.SimplerobotPackageImpl#getExpressionOperator()
		 * @generated
		 */
		EEnum EXPRESSION_OPERATOR = eINSTANCE.getExpressionOperator();

		/**
		 * The meta object literal for the '<em>Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see simplerobot.impl.SimplerobotPackageImpl#getText()
		 * @generated
		 */
		EDataType TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em>Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see simplerobot.impl.SimplerobotPackageImpl#getName_()
		 * @generated
		 */
		EDataType NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see simplerobot.impl.SimplerobotPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

	}

} //SimplerobotPackage
