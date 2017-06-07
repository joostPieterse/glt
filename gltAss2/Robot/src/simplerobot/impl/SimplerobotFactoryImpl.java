/**
 */
package simplerobot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simplerobot.Ahead;
import simplerobot.BuildWall;
import simplerobot.Comment;
import simplerobot.DropMark;
import simplerobot.Expression;
import simplerobot.Full;
import simplerobot.Heading;
import simplerobot.IfElseStatement;
import simplerobot.IfStatement;
import simplerobot.Mark;
import simplerobot.Not;
import simplerobot.Orientation;
import simplerobot.RepeatStatement;
import simplerobot.Robot;
import simplerobot.SimplerobotFactory;
import simplerobot.SimplerobotPackage;
import simplerobot.Singleton;
import simplerobot.SingletonTypes;
import simplerobot.Trace;
import simplerobot.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplerobotFactoryImpl extends EFactoryImpl implements SimplerobotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplerobotFactory init() {
		try {
			SimplerobotFactory theSimplerobotFactory = (SimplerobotFactory)EPackage.Registry.INSTANCE.getEFactory(SimplerobotPackage.eNS_URI);
			if (theSimplerobotFactory != null) {
				return theSimplerobotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplerobotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplerobotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplerobotPackage.ROBOT: return createRobot();
			case SimplerobotPackage.COMMENT: return createComment();
			case SimplerobotPackage.SINGLETON: return createSingleton();
			case SimplerobotPackage.TRACE: return createTrace();
			case SimplerobotPackage.BUILD_WALL: return createBuildWall();
			case SimplerobotPackage.DROP_MARK: return createDropMark();
			case SimplerobotPackage.WHILE_STATEMENT: return createWhileStatement();
			case SimplerobotPackage.REPEAT_STATEMENT: return createRepeatStatement();
			case SimplerobotPackage.IF_ELSE_STATEMENT: return createIfElseStatement();
			case SimplerobotPackage.IF_STATEMENT: return createIfStatement();
			case SimplerobotPackage.EXPRESSION: return createExpression();
			case SimplerobotPackage.FULL: return createFull();
			case SimplerobotPackage.MARK: return createMark();
			case SimplerobotPackage.AHEAD: return createAhead();
			case SimplerobotPackage.HEADING: return createHeading();
			case SimplerobotPackage.NOT: return createNot();
			case SimplerobotPackage.STRING: return createString();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimplerobotPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case SimplerobotPackage.SINGLETON_TYPES:
				return createSingletonTypesFromString(eDataType, initialValue);
			case SimplerobotPackage.TEXT:
				return createTextFromString(eDataType, initialValue);
			case SimplerobotPackage.NAME:
				return createNameFromString(eDataType, initialValue);
			case SimplerobotPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimplerobotPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case SimplerobotPackage.SINGLETON_TYPES:
				return convertSingletonTypesToString(eDataType, instanceValue);
			case SimplerobotPackage.TEXT:
				return convertTextToString(eDataType, instanceValue);
			case SimplerobotPackage.NAME:
				return convertNameToString(eDataType, instanceValue);
			case SimplerobotPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Singleton createSingleton() {
		SingletonImpl singleton = new SingletonImpl();
		return singleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildWall createBuildWall() {
		BuildWallImpl buildWall = new BuildWallImpl();
		return buildWall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropMark createDropMark() {
		DropMarkImpl dropMark = new DropMarkImpl();
		return dropMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatStatement createRepeatStatement() {
		RepeatStatementImpl repeatStatement = new RepeatStatementImpl();
		return repeatStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElseStatement createIfElseStatement() {
		IfElseStatementImpl ifElseStatement = new IfElseStatementImpl();
		return ifElseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Full createFull() {
		FullImpl full = new FullImpl();
		return full;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark createMark() {
		MarkImpl mark = new MarkImpl();
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ahead createAhead() {
		AheadImpl ahead = new AheadImpl();
		return ahead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heading createHeading() {
		HeadingImpl heading = new HeadingImpl();
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simplerobot.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonTypes createSingletonTypesFromString(EDataType eDataType, String initialValue) {
		SingletonTypes result = SingletonTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSingletonTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTextFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNameFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIntegerFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplerobotPackage getSimplerobotPackage() {
		return (SimplerobotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplerobotPackage getPackage() {
		return SimplerobotPackage.eINSTANCE;
	}

} //SimplerobotFactoryImpl
