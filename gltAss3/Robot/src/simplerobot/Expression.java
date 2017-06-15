/**
 */
package simplerobot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.Expression#getA <em>A</em>}</li>
 *   <li>{@link simplerobot.Expression#getB <em>B</em>}</li>
 *   <li>{@link simplerobot.Expression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference.
	 * @see #setA(Atomic)
	 * @see simplerobot.SimplerobotPackage#getExpression_A()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Atomic getA();

	/**
	 * Sets the value of the '{@link simplerobot.Expression#getA <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' containment reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(Atomic value);

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
	 * @see simplerobot.SimplerobotPackage#getExpression_B()
	 * @model containment="true"
	 * @generated
	 */
	Expression getB();

	/**
	 * Sets the value of the '{@link simplerobot.Expression#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link simplerobot.ExpressionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see simplerobot.ExpressionOperator
	 * @see #setOperator(ExpressionOperator)
	 * @see simplerobot.SimplerobotPackage#getExpression_Operator()
	 * @model
	 * @generated
	 */
	ExpressionOperator getOperator();

	/**
	 * Sets the value of the '{@link simplerobot.Expression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see simplerobot.ExpressionOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ExpressionOperator value);

} // Expression
