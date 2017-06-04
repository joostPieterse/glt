/**
 */
package simplerobot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.Heading#getWind <em>Wind</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getHeading()
 * @model
 * @generated
 */
public interface Heading extends Expression {
	/**
	 * Returns the value of the '<em><b>Wind</b></em>' attribute.
	 * The literals are from the enumeration {@link simplerobot.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind</em>' attribute.
	 * @see simplerobot.Orientation
	 * @see #setWind(Orientation)
	 * @see simplerobot.SimplerobotPackage#getHeading_Wind()
	 * @model required="true"
	 * @generated
	 */
	Orientation getWind();

	/**
	 * Sets the value of the '{@link simplerobot.Heading#getWind <em>Wind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind</em>' attribute.
	 * @see simplerobot.Orientation
	 * @see #getWind()
	 * @generated
	 */
	void setWind(Orientation value);

} // Heading
