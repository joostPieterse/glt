/**
 */
package simplerobot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.Trace#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends Command {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(simplerobot.String)
	 * @see simplerobot.SimplerobotPackage#getTrace_Text()
	 * @model containment="true"
	 * @generated
	 */
	simplerobot.String getText();

	/**
	 * Sets the value of the '{@link simplerobot.Trace#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(simplerobot.String value);

} // Trace
