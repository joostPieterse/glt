/**
 */
package simplerobot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.IfElseStatement#getCond <em>Cond</em>}</li>
 *   <li>{@link simplerobot.IfElseStatement#getIfbody <em>Ifbody</em>}</li>
 *   <li>{@link simplerobot.IfElseStatement#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getIfElseStatement()
 * @model
 * @generated
 */
public interface IfElseStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Expression)
	 * @see simplerobot.SimplerobotPackage#getIfElseStatement_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCond();

	/**
	 * Sets the value of the '{@link simplerobot.IfElseStatement#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Expression value);

	/**
	 * Returns the value of the '<em><b>Ifbody</b></em>' containment reference list.
	 * The list contents are of type {@link simplerobot.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifbody</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifbody</em>' containment reference list.
	 * @see simplerobot.SimplerobotPackage#getIfElseStatement_Ifbody()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getIfbody();

	/**
	 * Returns the value of the '<em><b>Elsebody</b></em>' containment reference list.
	 * The list contents are of type {@link simplerobot.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsebody</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsebody</em>' containment reference list.
	 * @see simplerobot.SimplerobotPackage#getIfElseStatement_Elsebody()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElsebody();

} // IfElseStatement
