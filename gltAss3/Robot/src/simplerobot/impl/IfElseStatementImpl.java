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

import simplerobot.Expression;
import simplerobot.IfElseStatement;
import simplerobot.SimplerobotPackage;
import simplerobot.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplerobot.impl.IfElseStatementImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link simplerobot.impl.IfElseStatementImpl#getIfbody <em>Ifbody</em>}</li>
 *   <li>{@link simplerobot.impl.IfElseStatementImpl#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfElseStatementImpl extends StatementImpl implements IfElseStatement {
	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected Expression cond;

	/**
	 * The cached value of the '{@link #getIfbody() <em>Ifbody</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfbody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> ifbody;

	/**
	 * The cached value of the '{@link #getElsebody() <em>Elsebody</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsebody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> elsebody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfElseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplerobotPackage.Literals.IF_ELSE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond(Expression newCond, NotificationChain msgs) {
		Expression oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplerobotPackage.IF_ELSE_STATEMENT__COND, oldCond, newCond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(Expression newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplerobotPackage.IF_ELSE_STATEMENT__COND, null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplerobotPackage.IF_ELSE_STATEMENT__COND, null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplerobotPackage.IF_ELSE_STATEMENT__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getIfbody() {
		if (ifbody == null) {
			ifbody = new EObjectContainmentEList<Statement>(Statement.class, this, SimplerobotPackage.IF_ELSE_STATEMENT__IFBODY);
		}
		return ifbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElsebody() {
		if (elsebody == null) {
			elsebody = new EObjectContainmentEList<Statement>(Statement.class, this, SimplerobotPackage.IF_ELSE_STATEMENT__ELSEBODY);
		}
		return elsebody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplerobotPackage.IF_ELSE_STATEMENT__COND:
				return basicSetCond(null, msgs);
			case SimplerobotPackage.IF_ELSE_STATEMENT__IFBODY:
				return ((InternalEList<?>)getIfbody()).basicRemove(otherEnd, msgs);
			case SimplerobotPackage.IF_ELSE_STATEMENT__ELSEBODY:
				return ((InternalEList<?>)getElsebody()).basicRemove(otherEnd, msgs);
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
			case SimplerobotPackage.IF_ELSE_STATEMENT__COND:
				return getCond();
			case SimplerobotPackage.IF_ELSE_STATEMENT__IFBODY:
				return getIfbody();
			case SimplerobotPackage.IF_ELSE_STATEMENT__ELSEBODY:
				return getElsebody();
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
			case SimplerobotPackage.IF_ELSE_STATEMENT__COND:
				setCond((Expression)newValue);
				return;
			case SimplerobotPackage.IF_ELSE_STATEMENT__IFBODY:
				getIfbody().clear();
				getIfbody().addAll((Collection<? extends Statement>)newValue);
				return;
			case SimplerobotPackage.IF_ELSE_STATEMENT__ELSEBODY:
				getElsebody().clear();
				getElsebody().addAll((Collection<? extends Statement>)newValue);
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
			case SimplerobotPackage.IF_ELSE_STATEMENT__COND:
				setCond((Expression)null);
				return;
			case SimplerobotPackage.IF_ELSE_STATEMENT__IFBODY:
				getIfbody().clear();
				return;
			case SimplerobotPackage.IF_ELSE_STATEMENT__ELSEBODY:
				getElsebody().clear();
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
			case SimplerobotPackage.IF_ELSE_STATEMENT__COND:
				return cond != null;
			case SimplerobotPackage.IF_ELSE_STATEMENT__IFBODY:
				return ifbody != null && !ifbody.isEmpty();
			case SimplerobotPackage.IF_ELSE_STATEMENT__ELSEBODY:
				return elsebody != null && !elsebody.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfElseStatementImpl
