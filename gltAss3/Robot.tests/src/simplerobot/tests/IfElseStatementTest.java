/**
 */
package simplerobot.tests;

import junit.textui.TestRunner;

import simplerobot.IfElseStatement;
import simplerobot.SimplerobotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Else Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfElseStatementTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfElseStatementTest.class);
	}

	/**
	 * Constructs a new If Else Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElseStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this If Else Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfElseStatement getFixture() {
		return (IfElseStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplerobotFactory.eINSTANCE.createIfElseStatement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IfElseStatementTest
