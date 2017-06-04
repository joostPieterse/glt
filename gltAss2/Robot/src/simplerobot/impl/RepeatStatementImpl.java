/**
 */
package simplerobot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplerobot.RepeatStatement;
import simplerobot.SimplerobotPackage;
import simplerobot.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.impl.RepeatStatementImpl#getTimes <em>Times</em>}</li>
 *   <li>{@link simplerobot.impl.RepeatStatementImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatStatementImpl extends StatementImpl implements RepeatStatement {
	/**
	 * The default value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected int times = TIMES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplerobotPackage.Literals.REPEAT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimes() {
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimes(int newTimes) {
		int oldTimes = times;
		times = newTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplerobotPackage.REPEAT_STATEMENT__TIMES, oldTimes, times));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Statement>(Statement.class, this, SimplerobotPackage.REPEAT_STATEMENT__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplerobotPackage.REPEAT_STATEMENT__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case SimplerobotPackage.REPEAT_STATEMENT__TIMES:
				return getTimes();
			case SimplerobotPackage.REPEAT_STATEMENT__BODY:
				return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplerobotPackage.REPEAT_STATEMENT__TIMES:
				setTimes((Integer)newValue);
				return;
			case SimplerobotPackage.REPEAT_STATEMENT__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Statement>)newValue);
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
			case SimplerobotPackage.REPEAT_STATEMENT__TIMES:
				setTimes(TIMES_EDEFAULT);
				return;
			case SimplerobotPackage.REPEAT_STATEMENT__BODY:
				getBody().clear();
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
			case SimplerobotPackage.REPEAT_STATEMENT__TIMES:
				return times != TIMES_EDEFAULT;
			case SimplerobotPackage.REPEAT_STATEMENT__BODY:
				return body != null && !body.isEmpty();
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
		result.append(" (times: ");
		result.append(times);
		result.append(')');
		return result.toString();
	}

} //RepeatStatementImpl
