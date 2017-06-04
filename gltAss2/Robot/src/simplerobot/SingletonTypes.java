/**
 */
package simplerobot;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Singleton Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see simplerobot.SimplerobotPackage#getSingletonTypes()
 * @model
 * @generated
 */
public enum SingletonTypes implements Enumerator {
	/**
	 * The '<em><b>Step</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEP_VALUE
	 * @generated
	 * @ordered
	 */
	STEP(0, "step", "step"),

	/**
	 * The '<em><b>Turn Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURN_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TURN_LEFT(1, "turnLeft", "turnLeft"),

	/**
	 * The '<em><b>Drop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROP_VALUE
	 * @generated
	 * @ordered
	 */
	DROP(2, "drop", "drop"),

	/**
	 * The '<em><b>Pick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PICK_VALUE
	 * @generated
	 * @ordered
	 */
	PICK(3, "pick", "pick");

	/**
	 * The '<em><b>Step</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Step</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEP
	 * @model name="step"
	 * @generated
	 * @ordered
	 */
	public static final int STEP_VALUE = 0;

	/**
	 * The '<em><b>Turn Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Turn Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TURN_LEFT
	 * @model name="turnLeft"
	 * @generated
	 * @ordered
	 */
	public static final int TURN_LEFT_VALUE = 1;

	/**
	 * The '<em><b>Drop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROP
	 * @model name="drop"
	 * @generated
	 * @ordered
	 */
	public static final int DROP_VALUE = 2;

	/**
	 * The '<em><b>Pick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pick</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PICK
	 * @model name="pick"
	 * @generated
	 * @ordered
	 */
	public static final int PICK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Singleton Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SingletonTypes[] VALUES_ARRAY =
		new SingletonTypes[] {
			STEP,
			TURN_LEFT,
			DROP,
			PICK,
		};

	/**
	 * A public read-only list of all the '<em><b>Singleton Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SingletonTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Singleton Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingletonTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SingletonTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Singleton Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingletonTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SingletonTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Singleton Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SingletonTypes get(int value) {
		switch (value) {
			case STEP_VALUE: return STEP;
			case TURN_LEFT_VALUE: return TURN_LEFT;
			case DROP_VALUE: return DROP;
			case PICK_VALUE: return PICK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SingletonTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SingletonTypes
