/**
 */
package simplerobot.tests;

import junit.textui.TestRunner;

import simplerobot.Full;
import simplerobot.SimplerobotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Full</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FullTest extends AtomicTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FullTest.class);
	}

	/**
	 * Constructs a new Full test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Full test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Full getFixture() {
		return (Full)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplerobotFactory.eINSTANCE.createFull());
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

} //FullTest
