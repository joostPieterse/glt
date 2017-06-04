/**
 */
package simplerobot.tests;

import junit.textui.TestRunner;

import simplerobot.BuildWall;
import simplerobot.SimplerobotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Build Wall</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildWallTest extends CommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BuildWallTest.class);
	}

	/**
	 * Constructs a new Build Wall test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildWallTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Build Wall test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BuildWall getFixture() {
		return (BuildWall)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplerobotFactory.eINSTANCE.createBuildWall());
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

} //BuildWallTest
