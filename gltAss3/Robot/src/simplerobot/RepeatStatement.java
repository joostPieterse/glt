/**
 */
package simplerobot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.RepeatStatement#getTimes <em>Times</em>}</li>
 *   <li>{@link simplerobot.RepeatStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getRepeatStatement()
 * @model
 * @generated
 */
public interface RepeatStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' attribute.
	 * @see #setTimes(int)
	 * @see simplerobot.SimplerobotPackage#getRepeatStatement_Times()
	 * @model required="true"
	 * @generated
	 */
	int getTimes();

	/**
	 * Sets the value of the '{@link simplerobot.RepeatStatement#getTimes <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times</em>' attribute.
	 * @see #getTimes()
	 * @generated
	 */
	void setTimes(int value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link simplerobot.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see simplerobot.SimplerobotPackage#getRepeatStatement_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getBody();

} // RepeatStatement
