/**
 */
package simplerobot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.String#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getString()
 * @model
 * @generated
 */
public interface String extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(java.lang.String)
	 * @see simplerobot.SimplerobotPackage#getString_Text()
	 * @model required="true"
	 * @generated
	 */
	java.lang.String getText();

	/**
	 * Sets the value of the '{@link simplerobot.String#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(java.lang.String value);

} // String
