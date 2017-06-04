/**
 */
package simplerobot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.DropMark#getRow <em>Row</em>}</li>
 *   <li>{@link simplerobot.DropMark#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getDropMark()
 * @model
 * @generated
 */
public interface DropMark extends Command {
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
	 * @see simplerobot.SimplerobotPackage#getDropMark_Row()
	 * @model required="true"
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link simplerobot.DropMark#getRow <em>Row</em>}' attribute.
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
	 * @see simplerobot.SimplerobotPackage#getDropMark_Col()
	 * @model required="true"
	 * @generated
	 */
	int getCol();

	/**
	 * Sets the value of the '{@link simplerobot.DropMark#getCol <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' attribute.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(int value);

} // DropMark
