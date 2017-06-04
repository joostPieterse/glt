/**
 */
package simplerobot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.Not#getE <em>E</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends Expression {
	/**
	 * Returns the value of the '<em><b>E</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' containment reference.
	 * @see #setE(Expression)
	 * @see simplerobot.SimplerobotPackage#getNot_E()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getE();

	/**
	 * Sets the value of the '{@link simplerobot.Not#getE <em>E</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E</em>' containment reference.
	 * @see #getE()
	 * @generated
	 */
	void setE(Expression value);

} // Not
