/**
 */
package simplerobot.tests;

import junit.textui.TestRunner;

import simplerobot.DropMark;
import simplerobot.SimplerobotFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drop Mark</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DropMarkTest extends CommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DropMarkTest.class);
	}

	/**
	 * Constructs a new Drop Mark test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropMarkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Drop Mark test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DropMark getFixture() {
		return (DropMark)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplerobotFactory.eINSTANCE.createDropMark());
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

} //DropMarkTest
