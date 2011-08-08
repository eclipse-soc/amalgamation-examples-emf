/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.impl;

import droid.DroidPackage;
import droid.LayoutDimensionKind;
import droid.LayoutDimensionVA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Dimension VA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link droid.impl.LayoutDimensionVAImpl#getConst_value <em>Const value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutDimensionVAImpl extends ValueAccessImpl implements LayoutDimensionVA {
	/**
	 * The default value of the '{@link #getConst_value() <em>Const value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst_value()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutDimensionKind CONST_VALUE_EDEFAULT = LayoutDimensionKind.FILL_PARENT;

	/**
	 * The cached value of the '{@link #getConst_value() <em>Const value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst_value()
	 * @generated
	 * @ordered
	 */
	protected LayoutDimensionKind const_value = CONST_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutDimensionVAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.Literals.LAYOUT_DIMENSION_VA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDimensionKind getConst_value() {
		return const_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConst_value(LayoutDimensionKind newConst_value) {
		LayoutDimensionKind oldConst_value = const_value;
		const_value = newConst_value == null ? CONST_VALUE_EDEFAULT : newConst_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT_DIMENSION_VA__CONST_VALUE, oldConst_value, const_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DroidPackage.LAYOUT_DIMENSION_VA__CONST_VALUE:
				return getConst_value();
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
			case DroidPackage.LAYOUT_DIMENSION_VA__CONST_VALUE:
				setConst_value((LayoutDimensionKind)newValue);
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
			case DroidPackage.LAYOUT_DIMENSION_VA__CONST_VALUE:
				setConst_value(CONST_VALUE_EDEFAULT);
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
			case DroidPackage.LAYOUT_DIMENSION_VA__CONST_VALUE:
				return const_value != CONST_VALUE_EDEFAULT;
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
		result.append(" (const_value: ");
		result.append(const_value);
		result.append(')');
		return result.toString();
	}

} //LayoutDimensionVAImpl
