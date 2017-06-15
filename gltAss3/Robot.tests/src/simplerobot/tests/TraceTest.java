/**
 */
package simplerobot.tests;

import junit.textui.TestRunner;

import simplerobot.SimplerobotFactory;
import simplerobot.Trace;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceTest extends CommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TraceTest.class);
	}

	/**
	 * Constructs a new Trace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Trace getFixture() {
		return (Trace)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplerobotFactory.eINSTANCE.createTrace());
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

} //TraceTest
