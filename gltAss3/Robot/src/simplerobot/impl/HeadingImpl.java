/**
 */
package simplerobot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplerobot.Heading;
import simplerobot.Orientation;
import simplerobot.SimplerobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.impl.HeadingImpl#getWind <em>Wind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadingImpl extends AtomicImpl implements Heading {
	/**
	 * The default value of the '{@link #getWind() <em>Wind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation WIND_EDEFAULT = Orientation.SOUTH;

	/**
	 * The cached value of the '{@link #getWind() <em>Wind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWind()
	 * @generated
	 * @ordered
	 */
	protected Orientation wind = WIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplerobotPackage.Literals.HEADING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getWind() {
		return wind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWind(Orientation newWind) {
		Orientation oldWind = wind;
		wind = newWind == null ? WIND_EDEFAULT : newWind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplerobotPackage.HEADING__WIND, oldWind, wind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplerobotPackage.HEADING__WIND:
				return getWind();
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
			case SimplerobotPackage.HEADING__WIND:
				setWind((Orientation)newValue);
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
			case SimplerobotPackage.HEADING__WIND:
				setWind(WIND_EDEFAULT);
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
			case SimplerobotPackage.HEADING__WIND:
				return wind != WIND_EDEFAULT;
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
		result.append(" (wind: ");
		result.append(wind);
		result.append(')');
		return result.toString();
	}

} //HeadingImpl
