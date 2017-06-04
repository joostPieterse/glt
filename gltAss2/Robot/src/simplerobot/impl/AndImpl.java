/**
 */
package simplerobot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplerobot.And;
import simplerobot.Expression;
import simplerobot.SimplerobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.impl.AndImpl#getA <em>A</em>}</li>
 *   <li>{@link simplerobot.impl.AndImpl#getB <em>B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndImpl extends ExpressionImpl implements And {
	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected Expression a;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected Expression b;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplerobotPackage.Literals.AND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA(Expression newA, NotificationChain msgs) {
		Expression oldA = a;
		a = newA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplerobotPackage.AND__A, oldA, newA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(Expression newA) {
		if (newA != a) {
			NotificationChain msgs = null;
			if (a != null)
				msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplerobotPackage.AND__A, null, msgs);
			if (newA != null)
				msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplerobotPackage.AND__A, null, msgs);
			msgs = basicSetA(newA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplerobotPackage.AND__A, newA, newA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetB(Expression newB, NotificationChain msgs) {
		Expression oldB = b;
		b = newB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplerobotPackage.AND__B, oldB, newB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(Expression newB) {
		if (newB != b) {
			NotificationChain msgs = null;
			if (b != null)
				msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplerobotPackage.AND__B, null, msgs);
			if (newB != null)
				msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplerobotPackage.AND__B, null, msgs);
			msgs = basicSetB(newB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplerobotPackage.AND__B, newB, newB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplerobotPackage.AND__A:
				return basicSetA(null, msgs);
			case SimplerobotPackage.AND__B:
				return basicSetB(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplerobotPackage.AND__A:
				return getA();
			case SimplerobotPackage.AND__B:
				return getB();
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
			case SimplerobotPackage.AND__A:
				setA((Expression)newValue);
				return;
			case SimplerobotPackage.AND__B:
				setB((Expression)newValue);
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
			case SimplerobotPackage.AND__A:
				setA((Expression)null);
				return;
			case SimplerobotPackage.AND__B:
				setB((Expression)null);
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
			case SimplerobotPackage.AND__A:
				return a != null;
			case SimplerobotPackage.AND__B:
				return b != null;
		}
		return super.eIsSet(featureID);
	}

} //AndImpl
