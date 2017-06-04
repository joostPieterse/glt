/**
 */
package simplerobot;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.Comment#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see simplerobot.SimplerobotPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Command {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see simplerobot.SimplerobotPackage#getComment_Comment()
	 * @model required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link simplerobot.Comment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Comment
