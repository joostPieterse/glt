/**
 */
package simplerobot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.Singleton#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getSingleton()
 * @model
 * @generated
 */
public interface Singleton extends Command {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link simplerobot.SingletonTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see simplerobot.SingletonTypes
	 * @see #setType(SingletonTypes)
	 * @see simplerobot.SimplerobotPackage#getSingleton_Type()
	 * @model required="true"
	 * @generated
	 */
	SingletonTypes getType();

	/**
	 * Sets the value of the '{@link simplerobot.Singleton#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see simplerobot.SingletonTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(SingletonTypes value);

} // Singleton
