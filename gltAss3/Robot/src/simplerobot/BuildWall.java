/**
 */
package simplerobot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Wall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.BuildWall#getRow <em>Row</em>}</li>
 *   <li>{@link simplerobot.BuildWall#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getBuildWall()
 * @model
 * @generated
 */
public interface BuildWall extends Command {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see simplerobot.SimplerobotPackage#getBuildWall_Row()
	 * @model required="true"
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link simplerobot.BuildWall#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' attribute.
	 * @see #setCol(int)
	 * @see simplerobot.SimplerobotPackage#getBuildWall_Col()
	 * @model required="true"
	 * @generated
	 */
	int getCol();

	/**
	 * Sets the value of the '{@link simplerobot.BuildWall#getCol <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' attribute.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(int value);

} // BuildWall
