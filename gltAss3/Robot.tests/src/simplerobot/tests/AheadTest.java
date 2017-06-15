/**
 */
package simplerobot.tests;

import junit.textui.TestRunner;

import simplerobot.Ahead;
import simplerobot.SimplerobotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ahead</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AheadTest extends AtomicTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AheadTest.class);
	}

	/**
	 * Constructs a new Ahead test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AheadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ahead test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ahead getFixture() {
		return (Ahead)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplerobotFactory.eINSTANCE.createAhead());
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

} //AheadTest
