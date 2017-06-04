/**
 */
package simplerobot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplerobot.BuildWall;
import simplerobot.SimplerobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Wall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.impl.BuildWallImpl#getRow <em>Row</em>}</li>
 *   <li>{@link simplerobot.impl.BuildWallImpl#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildWallImpl extends CommandImpl implements BuildWall {
	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getCol() <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected int col = COL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildWallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplerobotPackage.Literals.BUILD_WALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplerobotPackage.BUILD_WALL__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCol() {
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol(int newCol) {
		int oldCol = col;
		col = newCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplerobotPackage.BUILD_WALL__COL, oldCol, col));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplerobotPackage.BUILD_WALL__ROW:
				return getRow();
			case SimplerobotPackage.BUILD_WALL__COL:
				return getCol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplerobotPackage.BUILD_WALL__ROW:
				setRow((Integer)newValue);
				return;
			case SimplerobotPackage.BUILD_WALL__COL:
				setCol((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplerobotPackage.BUILD_WALL__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case SimplerobotPackage.BUILD_WALL__COL:
				setCol(COL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplerobotPackage.BUILD_WALL__ROW:
				return row != ROW_EDEFAULT;
			case SimplerobotPackage.BUILD_WALL__COL:
				return col != COL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (row: ");
		result.append(row);
		result.append(", col: ");
		result.append(col);
		result.append(')');
		return result.toString();
	}

} //BuildWallImpl
