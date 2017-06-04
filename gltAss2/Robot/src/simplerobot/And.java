/**
 */
package simplerobot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.And#getA <em>A</em>}</li>
 *   <li>{@link simplerobot.And#getB <em>B</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends Expression {
	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference.
	 * @see #setA(Expression)
	 * @see simplerobot.SimplerobotPackage#getAnd_A()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getA();

	/**
	 * Sets the value of the '{@link simplerobot.And#getA <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' containment reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(Expression value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference.
	 * @see #setB(Expression)
	 * @see simplerobot.SimplerobotPackage#getAnd_B()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getB();

	/**
	 * Sets the value of the '{@link simplerobot.And#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Expression value);

} // And
