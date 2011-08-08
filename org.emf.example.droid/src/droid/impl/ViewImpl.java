/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.impl;

import droid.Action;
import droid.AnyDrawableVA;
import droid.DroidPackage;
import droid.LayoutProperties;
import droid.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link droid.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link droid.impl.ViewImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link droid.impl.ViewImpl#getOnClick <em>On Click</em>}</li>
 *   <li>{@link droid.impl.ViewImpl#getLayoutProperties <em>Layout Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends EObjectImpl implements View {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected AnyDrawableVA background;

	/**
	 * The cached value of the '{@link #getOnClick() <em>On Click</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnClick()
	 * @generated
	 * @ordered
	 */
	protected Action onClick;

	/**
	 * The cached value of the '{@link #getLayoutProperties() <em>Layout Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutProperties()
	 * @generated
	 * @ordered
	 */
	protected LayoutProperties layoutProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyDrawableVA getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackground(AnyDrawableVA newBackground, NotificationChain msgs) {
		AnyDrawableVA oldBackground = background;
		background = newBackground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.VIEW__BACKGROUND, oldBackground, newBackground);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(AnyDrawableVA newBackground) {
		if (newBackground != background) {
			NotificationChain msgs = null;
			if (background != null)
				msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.VIEW__BACKGROUND, null, msgs);
			if (newBackground != null)
				msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.VIEW__BACKGROUND, null, msgs);
			msgs = basicSetBackground(newBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.VIEW__BACKGROUND, newBackground, newBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getOnClick() {
		return onClick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnClick(Action newOnClick, NotificationChain msgs) {
		Action oldOnClick = onClick;
		onClick = newOnClick;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.VIEW__ON_CLICK, oldOnClick, newOnClick);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnClick(Action newOnClick) {
		if (newOnClick != onClick) {
			NotificationChain msgs = null;
			if (onClick != null)
				msgs = ((InternalEObject)onClick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.VIEW__ON_CLICK, null, msgs);
			if (newOnClick != null)
				msgs = ((InternalEObject)newOnClick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.VIEW__ON_CLICK, null, msgs);
			msgs = basicSetOnClick(newOnClick, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.VIEW__ON_CLICK, newOnClick, newOnClick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutProperties getLayoutProperties() {
		return layoutProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutProperties(LayoutProperties newLayoutProperties, NotificationChain msgs) {
		LayoutProperties oldLayoutProperties = layoutProperties;
		layoutProperties = newLayoutProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.VIEW__LAYOUT_PROPERTIES, oldLayoutProperties, newLayoutProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutProperties(LayoutProperties newLayoutProperties) {
		if (newLayoutProperties != layoutProperties) {
			NotificationChain msgs = null;
			if (layoutProperties != null)
				msgs = ((InternalEObject)layoutProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.VIEW__LAYOUT_PROPERTIES, null, msgs);
			if (newLayoutProperties != null)
				msgs = ((InternalEObject)newLayoutProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.VIEW__LAYOUT_PROPERTIES, null, msgs);
			msgs = basicSetLayoutProperties(newLayoutProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.VIEW__LAYOUT_PROPERTIES, newLayoutProperties, newLayoutProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.VIEW__BACKGROUND:
				return basicSetBackground(null, msgs);
			case DroidPackage.VIEW__ON_CLICK:
				return basicSetOnClick(null, msgs);
			case DroidPackage.VIEW__LAYOUT_PROPERTIES:
				return basicSetLayoutProperties(null, msgs);
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
			case DroidPackage.VIEW__NAME:
				return getName();
			case DroidPackage.VIEW__BACKGROUND:
				return getBackground();
			case DroidPackage.VIEW__ON_CLICK:
				return getOnClick();
			case DroidPackage.VIEW__LAYOUT_PROPERTIES:
				return getLayoutProperties();
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
			case DroidPackage.VIEW__NAME:
				setName((String)newValue);
				return;
			case DroidPackage.VIEW__BACKGROUND:
				setBackground((AnyDrawableVA)newValue);
				return;
			case DroidPackage.VIEW__ON_CLICK:
				setOnClick((Action)newValue);
				return;
			case DroidPackage.VIEW__LAYOUT_PROPERTIES:
				setLayoutProperties((LayoutProperties)newValue);
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
			case DroidPackage.VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DroidPackage.VIEW__BACKGROUND:
				setBackground((AnyDrawableVA)null);
				return;
			case DroidPackage.VIEW__ON_CLICK:
				setOnClick((Action)null);
				return;
			case DroidPackage.VIEW__LAYOUT_PROPERTIES:
				setLayoutProperties((LayoutProperties)null);
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
			case DroidPackage.VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DroidPackage.VIEW__BACKGROUND:
				return background != null;
			case DroidPackage.VIEW__ON_CLICK:
				return onClick != null;
			case DroidPackage.VIEW__LAYOUT_PROPERTIES:
				return layoutProperties != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
