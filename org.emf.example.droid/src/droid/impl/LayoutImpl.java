/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.impl;

import droid.BooleanVA;
import droid.DimensionVA;
import droid.DroidPackage;
import droid.Layout;
import droid.LayoutGravityKind;
import droid.LayoutOrientationKind;
import droid.LayoutVisibilityKind;
import droid.View;
import droid.ViewCollection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link droid.impl.LayoutImpl#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getNextFocusDown <em>Next Focus Down</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getNextFocusLeft <em>Next Focus Left</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getNextFocusRight <em>Next Focus Right</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getNextFocusUp <em>Next Focus Up</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getPaddingBottom <em>Padding Bottom</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getPaddingLeft <em>Padding Left</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getPaddingRight <em>Padding Right</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getPaddingTop <em>Padding Top</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getRotationX <em>Rotation X</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getRotationY <em>Rotation Y</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getSaveEnabled <em>Save Enabled</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getScrollX <em>Scroll X</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getScrollY <em>Scroll Y</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getScrollbars <em>Scrollbars</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getTransformPivotX <em>Transform Pivot X</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getTransformPivotY <em>Transform Pivot Y</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getTranslationX <em>Translation X</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getTranslationY <em>Translation Y</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getGravity <em>Gravity</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link droid.impl.LayoutImpl#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends ViewImpl implements Layout {
	/**
	 * The default value of the '{@link #isIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRelative()
	 * @generated
	 * @ordered
	 */
	protected boolean isRelative = IS_RELATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final String ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected String alpha = ALPHA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMinHeight() <em>Min Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA minHeight;

	/**
	 * The cached value of the '{@link #getMinWidth() <em>Min Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA minWidth;

	/**
	 * The cached value of the '{@link #getNextFocusDown() <em>Next Focus Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFocusDown()
	 * @generated
	 * @ordered
	 */
	protected View nextFocusDown;

	/**
	 * The cached value of the '{@link #getNextFocusLeft() <em>Next Focus Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFocusLeft()
	 * @generated
	 * @ordered
	 */
	protected View nextFocusLeft;

	/**
	 * The cached value of the '{@link #getNextFocusRight() <em>Next Focus Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFocusRight()
	 * @generated
	 * @ordered
	 */
	protected View nextFocusRight;

	/**
	 * The cached value of the '{@link #getNextFocusUp() <em>Next Focus Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFocusUp()
	 * @generated
	 * @ordered
	 */
	protected View nextFocusUp;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA padding;

	/**
	 * The cached value of the '{@link #getPaddingBottom() <em>Padding Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingBottom()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA paddingBottom;

	/**
	 * The cached value of the '{@link #getPaddingLeft() <em>Padding Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingLeft()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA paddingLeft;

	/**
	 * The cached value of the '{@link #getPaddingRight() <em>Padding Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingRight()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA paddingRight;

	/**
	 * The cached value of the '{@link #getPaddingTop() <em>Padding Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingTop()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA paddingTop;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA rotation;

	/**
	 * The cached value of the '{@link #getRotationX() <em>Rotation X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationX()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA rotationX;

	/**
	 * The cached value of the '{@link #getRotationY() <em>Rotation Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationY()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA rotationY;

	/**
	 * The cached value of the '{@link #getSaveEnabled() <em>Save Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveEnabled()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA saveEnabled;

	/**
	 * The cached value of the '{@link #getScaleX() <em>Scale X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA scaleX;

	/**
	 * The cached value of the '{@link #getScaleY() <em>Scale Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA scaleY;

	/**
	 * The cached value of the '{@link #getScrollX() <em>Scroll X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollX()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA scrollX;

	/**
	 * The cached value of the '{@link #getScrollY() <em>Scroll Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollY()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA scrollY;

	/**
	 * The cached value of the '{@link #getScrollbars() <em>Scrollbars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrollbars()
	 * @generated
	 * @ordered
	 */
	protected BooleanVA scrollbars;

	/**
	 * The cached value of the '{@link #getTransformPivotX() <em>Transform Pivot X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformPivotX()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA transformPivotX;

	/**
	 * The cached value of the '{@link #getTransformPivotY() <em>Transform Pivot Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformPivotY()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA transformPivotY;

	/**
	 * The cached value of the '{@link #getTranslationX() <em>Translation X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationX()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA translationX;

	/**
	 * The cached value of the '{@link #getTranslationY() <em>Translation Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationY()
	 * @generated
	 * @ordered
	 */
	protected DimensionVA translationY;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutVisibilityKind VISIBILITY_EDEFAULT = LayoutVisibilityKind.VISIBLE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected LayoutVisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGravity() <em>Gravity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravity()
	 * @generated
	 * @ordered
	 */
	protected EList<LayoutGravityKind> gravity;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutOrientationKind ORIENTATION_EDEFAULT = LayoutOrientationKind.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected LayoutOrientationKind orientation = ORIENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected ViewCollection views;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DroidPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRelative() {
		return isRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelative(boolean newIsRelative) {
		boolean oldIsRelative = isRelative;
		isRelative = newIsRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__IS_RELATIVE, oldIsRelative, isRelative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(String newAlpha) {
		String oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getMinHeight() {
		return minHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinHeight(DimensionVA newMinHeight, NotificationChain msgs) {
		DimensionVA oldMinHeight = minHeight;
		minHeight = newMinHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__MIN_HEIGHT, oldMinHeight, newMinHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHeight(DimensionVA newMinHeight) {
		if (newMinHeight != minHeight) {
			NotificationChain msgs = null;
			if (minHeight != null)
				msgs = ((InternalEObject)minHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__MIN_HEIGHT, null, msgs);
			if (newMinHeight != null)
				msgs = ((InternalEObject)newMinHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__MIN_HEIGHT, null, msgs);
			msgs = basicSetMinHeight(newMinHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__MIN_HEIGHT, newMinHeight, newMinHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getMinWidth() {
		return minWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinWidth(DimensionVA newMinWidth, NotificationChain msgs) {
		DimensionVA oldMinWidth = minWidth;
		minWidth = newMinWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__MIN_WIDTH, oldMinWidth, newMinWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinWidth(DimensionVA newMinWidth) {
		if (newMinWidth != minWidth) {
			NotificationChain msgs = null;
			if (minWidth != null)
				msgs = ((InternalEObject)minWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__MIN_WIDTH, null, msgs);
			if (newMinWidth != null)
				msgs = ((InternalEObject)newMinWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__MIN_WIDTH, null, msgs);
			msgs = basicSetMinWidth(newMinWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__MIN_WIDTH, newMinWidth, newMinWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getNextFocusDown() {
		if (nextFocusDown != null && nextFocusDown.eIsProxy()) {
			InternalEObject oldNextFocusDown = (InternalEObject)nextFocusDown;
			nextFocusDown = (View)eResolveProxy(oldNextFocusDown);
			if (nextFocusDown != oldNextFocusDown) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT__NEXT_FOCUS_DOWN, oldNextFocusDown, nextFocusDown));
			}
		}
		return nextFocusDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetNextFocusDown() {
		return nextFocusDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFocusDown(View newNextFocusDown) {
		View oldNextFocusDown = nextFocusDown;
		nextFocusDown = newNextFocusDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__NEXT_FOCUS_DOWN, oldNextFocusDown, nextFocusDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getNextFocusLeft() {
		if (nextFocusLeft != null && nextFocusLeft.eIsProxy()) {
			InternalEObject oldNextFocusLeft = (InternalEObject)nextFocusLeft;
			nextFocusLeft = (View)eResolveProxy(oldNextFocusLeft);
			if (nextFocusLeft != oldNextFocusLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT__NEXT_FOCUS_LEFT, oldNextFocusLeft, nextFocusLeft));
			}
		}
		return nextFocusLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetNextFocusLeft() {
		return nextFocusLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFocusLeft(View newNextFocusLeft) {
		View oldNextFocusLeft = nextFocusLeft;
		nextFocusLeft = newNextFocusLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__NEXT_FOCUS_LEFT, oldNextFocusLeft, nextFocusLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getNextFocusRight() {
		if (nextFocusRight != null && nextFocusRight.eIsProxy()) {
			InternalEObject oldNextFocusRight = (InternalEObject)nextFocusRight;
			nextFocusRight = (View)eResolveProxy(oldNextFocusRight);
			if (nextFocusRight != oldNextFocusRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT, oldNextFocusRight, nextFocusRight));
			}
		}
		return nextFocusRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetNextFocusRight() {
		return nextFocusRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFocusRight(View newNextFocusRight) {
		View oldNextFocusRight = nextFocusRight;
		nextFocusRight = newNextFocusRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT, oldNextFocusRight, nextFocusRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getNextFocusUp() {
		if (nextFocusUp != null && nextFocusUp.eIsProxy()) {
			InternalEObject oldNextFocusUp = (InternalEObject)nextFocusUp;
			nextFocusUp = (View)eResolveProxy(oldNextFocusUp);
			if (nextFocusUp != oldNextFocusUp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroidPackage.LAYOUT__NEXT_FOCUS_UP, oldNextFocusUp, nextFocusUp));
			}
		}
		return nextFocusUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetNextFocusUp() {
		return nextFocusUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextFocusUp(View newNextFocusUp) {
		View oldNextFocusUp = nextFocusUp;
		nextFocusUp = newNextFocusUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__NEXT_FOCUS_UP, oldNextFocusUp, nextFocusUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPadding(DimensionVA newPadding, NotificationChain msgs) {
		DimensionVA oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING, oldPadding, newPadding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(DimensionVA newPadding) {
		if (newPadding != padding) {
			NotificationChain msgs = null;
			if (padding != null)
				msgs = ((InternalEObject)padding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING, null, msgs);
			if (newPadding != null)
				msgs = ((InternalEObject)newPadding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING, null, msgs);
			msgs = basicSetPadding(newPadding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING, newPadding, newPadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPaddingBottom() {
		return paddingBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaddingBottom(DimensionVA newPaddingBottom, NotificationChain msgs) {
		DimensionVA oldPaddingBottom = paddingBottom;
		paddingBottom = newPaddingBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_BOTTOM, oldPaddingBottom, newPaddingBottom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingBottom(DimensionVA newPaddingBottom) {
		if (newPaddingBottom != paddingBottom) {
			NotificationChain msgs = null;
			if (paddingBottom != null)
				msgs = ((InternalEObject)paddingBottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_BOTTOM, null, msgs);
			if (newPaddingBottom != null)
				msgs = ((InternalEObject)newPaddingBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_BOTTOM, null, msgs);
			msgs = basicSetPaddingBottom(newPaddingBottom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_BOTTOM, newPaddingBottom, newPaddingBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPaddingLeft() {
		return paddingLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaddingLeft(DimensionVA newPaddingLeft, NotificationChain msgs) {
		DimensionVA oldPaddingLeft = paddingLeft;
		paddingLeft = newPaddingLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_LEFT, oldPaddingLeft, newPaddingLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingLeft(DimensionVA newPaddingLeft) {
		if (newPaddingLeft != paddingLeft) {
			NotificationChain msgs = null;
			if (paddingLeft != null)
				msgs = ((InternalEObject)paddingLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_LEFT, null, msgs);
			if (newPaddingLeft != null)
				msgs = ((InternalEObject)newPaddingLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_LEFT, null, msgs);
			msgs = basicSetPaddingLeft(newPaddingLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_LEFT, newPaddingLeft, newPaddingLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPaddingRight() {
		return paddingRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaddingRight(DimensionVA newPaddingRight, NotificationChain msgs) {
		DimensionVA oldPaddingRight = paddingRight;
		paddingRight = newPaddingRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_RIGHT, oldPaddingRight, newPaddingRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingRight(DimensionVA newPaddingRight) {
		if (newPaddingRight != paddingRight) {
			NotificationChain msgs = null;
			if (paddingRight != null)
				msgs = ((InternalEObject)paddingRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_RIGHT, null, msgs);
			if (newPaddingRight != null)
				msgs = ((InternalEObject)newPaddingRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_RIGHT, null, msgs);
			msgs = basicSetPaddingRight(newPaddingRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_RIGHT, newPaddingRight, newPaddingRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getPaddingTop() {
		return paddingTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaddingTop(DimensionVA newPaddingTop, NotificationChain msgs) {
		DimensionVA oldPaddingTop = paddingTop;
		paddingTop = newPaddingTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_TOP, oldPaddingTop, newPaddingTop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingTop(DimensionVA newPaddingTop) {
		if (newPaddingTop != paddingTop) {
			NotificationChain msgs = null;
			if (paddingTop != null)
				msgs = ((InternalEObject)paddingTop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_TOP, null, msgs);
			if (newPaddingTop != null)
				msgs = ((InternalEObject)newPaddingTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__PADDING_TOP, null, msgs);
			msgs = basicSetPaddingTop(newPaddingTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__PADDING_TOP, newPaddingTop, newPaddingTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(DimensionVA newRotation, NotificationChain msgs) {
		DimensionVA oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ROTATION, oldRotation, newRotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(DimensionVA newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ROTATION, newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getRotationX() {
		return rotationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationX(DimensionVA newRotationX, NotificationChain msgs) {
		DimensionVA oldRotationX = rotationX;
		rotationX = newRotationX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ROTATION_X, oldRotationX, newRotationX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationX(DimensionVA newRotationX) {
		if (newRotationX != rotationX) {
			NotificationChain msgs = null;
			if (rotationX != null)
				msgs = ((InternalEObject)rotationX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__ROTATION_X, null, msgs);
			if (newRotationX != null)
				msgs = ((InternalEObject)newRotationX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__ROTATION_X, null, msgs);
			msgs = basicSetRotationX(newRotationX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ROTATION_X, newRotationX, newRotationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getRotationY() {
		return rotationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationY(DimensionVA newRotationY, NotificationChain msgs) {
		DimensionVA oldRotationY = rotationY;
		rotationY = newRotationY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ROTATION_Y, oldRotationY, newRotationY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationY(DimensionVA newRotationY) {
		if (newRotationY != rotationY) {
			NotificationChain msgs = null;
			if (rotationY != null)
				msgs = ((InternalEObject)rotationY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__ROTATION_Y, null, msgs);
			if (newRotationY != null)
				msgs = ((InternalEObject)newRotationY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__ROTATION_Y, null, msgs);
			msgs = basicSetRotationY(newRotationY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ROTATION_Y, newRotationY, newRotationY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getSaveEnabled() {
		return saveEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSaveEnabled(BooleanVA newSaveEnabled, NotificationChain msgs) {
		BooleanVA oldSaveEnabled = saveEnabled;
		saveEnabled = newSaveEnabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SAVE_ENABLED, oldSaveEnabled, newSaveEnabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveEnabled(BooleanVA newSaveEnabled) {
		if (newSaveEnabled != saveEnabled) {
			NotificationChain msgs = null;
			if (saveEnabled != null)
				msgs = ((InternalEObject)saveEnabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SAVE_ENABLED, null, msgs);
			if (newSaveEnabled != null)
				msgs = ((InternalEObject)newSaveEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SAVE_ENABLED, null, msgs);
			msgs = basicSetSaveEnabled(newSaveEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SAVE_ENABLED, newSaveEnabled, newSaveEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getScaleX() {
		return scaleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaleX(DimensionVA newScaleX, NotificationChain msgs) {
		DimensionVA oldScaleX = scaleX;
		scaleX = newScaleX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCALE_X, oldScaleX, newScaleX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleX(DimensionVA newScaleX) {
		if (newScaleX != scaleX) {
			NotificationChain msgs = null;
			if (scaleX != null)
				msgs = ((InternalEObject)scaleX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCALE_X, null, msgs);
			if (newScaleX != null)
				msgs = ((InternalEObject)newScaleX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCALE_X, null, msgs);
			msgs = basicSetScaleX(newScaleX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCALE_X, newScaleX, newScaleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getScaleY() {
		return scaleY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaleY(DimensionVA newScaleY, NotificationChain msgs) {
		DimensionVA oldScaleY = scaleY;
		scaleY = newScaleY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCALE_Y, oldScaleY, newScaleY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleY(DimensionVA newScaleY) {
		if (newScaleY != scaleY) {
			NotificationChain msgs = null;
			if (scaleY != null)
				msgs = ((InternalEObject)scaleY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCALE_Y, null, msgs);
			if (newScaleY != null)
				msgs = ((InternalEObject)newScaleY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCALE_Y, null, msgs);
			msgs = basicSetScaleY(newScaleY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCALE_Y, newScaleY, newScaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getScrollX() {
		return scrollX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScrollX(DimensionVA newScrollX, NotificationChain msgs) {
		DimensionVA oldScrollX = scrollX;
		scrollX = newScrollX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCROLL_X, oldScrollX, newScrollX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollX(DimensionVA newScrollX) {
		if (newScrollX != scrollX) {
			NotificationChain msgs = null;
			if (scrollX != null)
				msgs = ((InternalEObject)scrollX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCROLL_X, null, msgs);
			if (newScrollX != null)
				msgs = ((InternalEObject)newScrollX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCROLL_X, null, msgs);
			msgs = basicSetScrollX(newScrollX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCROLL_X, newScrollX, newScrollX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getScrollY() {
		return scrollY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScrollY(DimensionVA newScrollY, NotificationChain msgs) {
		DimensionVA oldScrollY = scrollY;
		scrollY = newScrollY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCROLL_Y, oldScrollY, newScrollY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollY(DimensionVA newScrollY) {
		if (newScrollY != scrollY) {
			NotificationChain msgs = null;
			if (scrollY != null)
				msgs = ((InternalEObject)scrollY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCROLL_Y, null, msgs);
			if (newScrollY != null)
				msgs = ((InternalEObject)newScrollY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCROLL_Y, null, msgs);
			msgs = basicSetScrollY(newScrollY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCROLL_Y, newScrollY, newScrollY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA getScrollbars() {
		return scrollbars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScrollbars(BooleanVA newScrollbars, NotificationChain msgs) {
		BooleanVA oldScrollbars = scrollbars;
		scrollbars = newScrollbars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCROLLBARS, oldScrollbars, newScrollbars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollbars(BooleanVA newScrollbars) {
		if (newScrollbars != scrollbars) {
			NotificationChain msgs = null;
			if (scrollbars != null)
				msgs = ((InternalEObject)scrollbars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCROLLBARS, null, msgs);
			if (newScrollbars != null)
				msgs = ((InternalEObject)newScrollbars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__SCROLLBARS, null, msgs);
			msgs = basicSetScrollbars(newScrollbars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__SCROLLBARS, newScrollbars, newScrollbars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getTransformPivotX() {
		return transformPivotX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformPivotX(DimensionVA newTransformPivotX, NotificationChain msgs) {
		DimensionVA oldTransformPivotX = transformPivotX;
		transformPivotX = newTransformPivotX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__TRANSFORM_PIVOT_X, oldTransformPivotX, newTransformPivotX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformPivotX(DimensionVA newTransformPivotX) {
		if (newTransformPivotX != transformPivotX) {
			NotificationChain msgs = null;
			if (transformPivotX != null)
				msgs = ((InternalEObject)transformPivotX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__TRANSFORM_PIVOT_X, null, msgs);
			if (newTransformPivotX != null)
				msgs = ((InternalEObject)newTransformPivotX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__TRANSFORM_PIVOT_X, null, msgs);
			msgs = basicSetTransformPivotX(newTransformPivotX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__TRANSFORM_PIVOT_X, newTransformPivotX, newTransformPivotX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getTransformPivotY() {
		return transformPivotY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformPivotY(DimensionVA newTransformPivotY, NotificationChain msgs) {
		DimensionVA oldTransformPivotY = transformPivotY;
		transformPivotY = newTransformPivotY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y, oldTransformPivotY, newTransformPivotY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformPivotY(DimensionVA newTransformPivotY) {
		if (newTransformPivotY != transformPivotY) {
			NotificationChain msgs = null;
			if (transformPivotY != null)
				msgs = ((InternalEObject)transformPivotY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y, null, msgs);
			if (newTransformPivotY != null)
				msgs = ((InternalEObject)newTransformPivotY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y, null, msgs);
			msgs = basicSetTransformPivotY(newTransformPivotY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y, newTransformPivotY, newTransformPivotY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getTranslationX() {
		return translationX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslationX(DimensionVA newTranslationX, NotificationChain msgs) {
		DimensionVA oldTranslationX = translationX;
		translationX = newTranslationX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__TRANSLATION_X, oldTranslationX, newTranslationX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslationX(DimensionVA newTranslationX) {
		if (newTranslationX != translationX) {
			NotificationChain msgs = null;
			if (translationX != null)
				msgs = ((InternalEObject)translationX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__TRANSLATION_X, null, msgs);
			if (newTranslationX != null)
				msgs = ((InternalEObject)newTranslationX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__TRANSLATION_X, null, msgs);
			msgs = basicSetTranslationX(newTranslationX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__TRANSLATION_X, newTranslationX, newTranslationX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA getTranslationY() {
		return translationY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslationY(DimensionVA newTranslationY, NotificationChain msgs) {
		DimensionVA oldTranslationY = translationY;
		translationY = newTranslationY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__TRANSLATION_Y, oldTranslationY, newTranslationY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslationY(DimensionVA newTranslationY) {
		if (newTranslationY != translationY) {
			NotificationChain msgs = null;
			if (translationY != null)
				msgs = ((InternalEObject)translationY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__TRANSLATION_Y, null, msgs);
			if (newTranslationY != null)
				msgs = ((InternalEObject)newTranslationY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__TRANSLATION_Y, null, msgs);
			msgs = basicSetTranslationY(newTranslationY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__TRANSLATION_Y, newTranslationY, newTranslationY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutVisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(LayoutVisibilityKind newVisibility) {
		LayoutVisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LayoutGravityKind> getGravity() {
		if (gravity == null) {
			gravity = new EDataTypeEList<LayoutGravityKind>(LayoutGravityKind.class, this, DroidPackage.LAYOUT__GRAVITY);
		}
		return gravity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutOrientationKind getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(LayoutOrientationKind newOrientation) {
		LayoutOrientationKind oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewCollection getViews() {
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViews(ViewCollection newViews, NotificationChain msgs) {
		ViewCollection oldViews = views;
		views = newViews;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__VIEWS, oldViews, newViews);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViews(ViewCollection newViews) {
		if (newViews != views) {
			NotificationChain msgs = null;
			if (views != null)
				msgs = ((InternalEObject)views).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__VIEWS, null, msgs);
			if (newViews != null)
				msgs = ((InternalEObject)newViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroidPackage.LAYOUT__VIEWS, null, msgs);
			msgs = basicSetViews(newViews, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DroidPackage.LAYOUT__VIEWS, newViews, newViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				return basicSetMinHeight(null, msgs);
			case DroidPackage.LAYOUT__MIN_WIDTH:
				return basicSetMinWidth(null, msgs);
			case DroidPackage.LAYOUT__PADDING:
				return basicSetPadding(null, msgs);
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				return basicSetPaddingBottom(null, msgs);
			case DroidPackage.LAYOUT__PADDING_LEFT:
				return basicSetPaddingLeft(null, msgs);
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				return basicSetPaddingRight(null, msgs);
			case DroidPackage.LAYOUT__PADDING_TOP:
				return basicSetPaddingTop(null, msgs);
			case DroidPackage.LAYOUT__ROTATION:
				return basicSetRotation(null, msgs);
			case DroidPackage.LAYOUT__ROTATION_X:
				return basicSetRotationX(null, msgs);
			case DroidPackage.LAYOUT__ROTATION_Y:
				return basicSetRotationY(null, msgs);
			case DroidPackage.LAYOUT__SAVE_ENABLED:
				return basicSetSaveEnabled(null, msgs);
			case DroidPackage.LAYOUT__SCALE_X:
				return basicSetScaleX(null, msgs);
			case DroidPackage.LAYOUT__SCALE_Y:
				return basicSetScaleY(null, msgs);
			case DroidPackage.LAYOUT__SCROLL_X:
				return basicSetScrollX(null, msgs);
			case DroidPackage.LAYOUT__SCROLL_Y:
				return basicSetScrollY(null, msgs);
			case DroidPackage.LAYOUT__SCROLLBARS:
				return basicSetScrollbars(null, msgs);
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_X:
				return basicSetTransformPivotX(null, msgs);
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y:
				return basicSetTransformPivotY(null, msgs);
			case DroidPackage.LAYOUT__TRANSLATION_X:
				return basicSetTranslationX(null, msgs);
			case DroidPackage.LAYOUT__TRANSLATION_Y:
				return basicSetTranslationY(null, msgs);
			case DroidPackage.LAYOUT__VIEWS:
				return basicSetViews(null, msgs);
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
			case DroidPackage.LAYOUT__IS_RELATIVE:
				return isIsRelative();
			case DroidPackage.LAYOUT__ALPHA:
				return getAlpha();
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				return getMinHeight();
			case DroidPackage.LAYOUT__MIN_WIDTH:
				return getMinWidth();
			case DroidPackage.LAYOUT__NEXT_FOCUS_DOWN:
				if (resolve) return getNextFocusDown();
				return basicGetNextFocusDown();
			case DroidPackage.LAYOUT__NEXT_FOCUS_LEFT:
				if (resolve) return getNextFocusLeft();
				return basicGetNextFocusLeft();
			case DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT:
				if (resolve) return getNextFocusRight();
				return basicGetNextFocusRight();
			case DroidPackage.LAYOUT__NEXT_FOCUS_UP:
				if (resolve) return getNextFocusUp();
				return basicGetNextFocusUp();
			case DroidPackage.LAYOUT__PADDING:
				return getPadding();
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				return getPaddingBottom();
			case DroidPackage.LAYOUT__PADDING_LEFT:
				return getPaddingLeft();
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				return getPaddingRight();
			case DroidPackage.LAYOUT__PADDING_TOP:
				return getPaddingTop();
			case DroidPackage.LAYOUT__ROTATION:
				return getRotation();
			case DroidPackage.LAYOUT__ROTATION_X:
				return getRotationX();
			case DroidPackage.LAYOUT__ROTATION_Y:
				return getRotationY();
			case DroidPackage.LAYOUT__SAVE_ENABLED:
				return getSaveEnabled();
			case DroidPackage.LAYOUT__SCALE_X:
				return getScaleX();
			case DroidPackage.LAYOUT__SCALE_Y:
				return getScaleY();
			case DroidPackage.LAYOUT__SCROLL_X:
				return getScrollX();
			case DroidPackage.LAYOUT__SCROLL_Y:
				return getScrollY();
			case DroidPackage.LAYOUT__SCROLLBARS:
				return getScrollbars();
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_X:
				return getTransformPivotX();
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y:
				return getTransformPivotY();
			case DroidPackage.LAYOUT__TRANSLATION_X:
				return getTranslationX();
			case DroidPackage.LAYOUT__TRANSLATION_Y:
				return getTranslationY();
			case DroidPackage.LAYOUT__VISIBILITY:
				return getVisibility();
			case DroidPackage.LAYOUT__GRAVITY:
				return getGravity();
			case DroidPackage.LAYOUT__ORIENTATION:
				return getOrientation();
			case DroidPackage.LAYOUT__VIEWS:
				return getViews();
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
			case DroidPackage.LAYOUT__IS_RELATIVE:
				setIsRelative((Boolean)newValue);
				return;
			case DroidPackage.LAYOUT__ALPHA:
				setAlpha((String)newValue);
				return;
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				setMinHeight((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__MIN_WIDTH:
				setMinWidth((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_DOWN:
				setNextFocusDown((View)newValue);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_LEFT:
				setNextFocusLeft((View)newValue);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT:
				setNextFocusRight((View)newValue);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_UP:
				setNextFocusUp((View)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING:
				setPadding((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				setPaddingBottom((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING_LEFT:
				setPaddingLeft((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				setPaddingRight((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__PADDING_TOP:
				setPaddingTop((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__ROTATION:
				setRotation((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__ROTATION_X:
				setRotationX((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__ROTATION_Y:
				setRotationY((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__SAVE_ENABLED:
				setSaveEnabled((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT__SCALE_X:
				setScaleX((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__SCALE_Y:
				setScaleY((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__SCROLL_X:
				setScrollX((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__SCROLL_Y:
				setScrollY((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__SCROLLBARS:
				setScrollbars((BooleanVA)newValue);
				return;
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_X:
				setTransformPivotX((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y:
				setTransformPivotY((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__TRANSLATION_X:
				setTranslationX((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__TRANSLATION_Y:
				setTranslationY((DimensionVA)newValue);
				return;
			case DroidPackage.LAYOUT__VISIBILITY:
				setVisibility((LayoutVisibilityKind)newValue);
				return;
			case DroidPackage.LAYOUT__GRAVITY:
				getGravity().clear();
				getGravity().addAll((Collection<? extends LayoutGravityKind>)newValue);
				return;
			case DroidPackage.LAYOUT__ORIENTATION:
				setOrientation((LayoutOrientationKind)newValue);
				return;
			case DroidPackage.LAYOUT__VIEWS:
				setViews((ViewCollection)newValue);
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
			case DroidPackage.LAYOUT__IS_RELATIVE:
				setIsRelative(IS_RELATIVE_EDEFAULT);
				return;
			case DroidPackage.LAYOUT__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				setMinHeight((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__MIN_WIDTH:
				setMinWidth((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_DOWN:
				setNextFocusDown((View)null);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_LEFT:
				setNextFocusLeft((View)null);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT:
				setNextFocusRight((View)null);
				return;
			case DroidPackage.LAYOUT__NEXT_FOCUS_UP:
				setNextFocusUp((View)null);
				return;
			case DroidPackage.LAYOUT__PADDING:
				setPadding((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				setPaddingBottom((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__PADDING_LEFT:
				setPaddingLeft((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				setPaddingRight((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__PADDING_TOP:
				setPaddingTop((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__ROTATION:
				setRotation((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__ROTATION_X:
				setRotationX((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__ROTATION_Y:
				setRotationY((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__SAVE_ENABLED:
				setSaveEnabled((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT__SCALE_X:
				setScaleX((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__SCALE_Y:
				setScaleY((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__SCROLL_X:
				setScrollX((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__SCROLL_Y:
				setScrollY((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__SCROLLBARS:
				setScrollbars((BooleanVA)null);
				return;
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_X:
				setTransformPivotX((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y:
				setTransformPivotY((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__TRANSLATION_X:
				setTranslationX((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__TRANSLATION_Y:
				setTranslationY((DimensionVA)null);
				return;
			case DroidPackage.LAYOUT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case DroidPackage.LAYOUT__GRAVITY:
				getGravity().clear();
				return;
			case DroidPackage.LAYOUT__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case DroidPackage.LAYOUT__VIEWS:
				setViews((ViewCollection)null);
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
			case DroidPackage.LAYOUT__IS_RELATIVE:
				return isRelative != IS_RELATIVE_EDEFAULT;
			case DroidPackage.LAYOUT__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case DroidPackage.LAYOUT__MIN_HEIGHT:
				return minHeight != null;
			case DroidPackage.LAYOUT__MIN_WIDTH:
				return minWidth != null;
			case DroidPackage.LAYOUT__NEXT_FOCUS_DOWN:
				return nextFocusDown != null;
			case DroidPackage.LAYOUT__NEXT_FOCUS_LEFT:
				return nextFocusLeft != null;
			case DroidPackage.LAYOUT__NEXT_FOCUS_RIGHT:
				return nextFocusRight != null;
			case DroidPackage.LAYOUT__NEXT_FOCUS_UP:
				return nextFocusUp != null;
			case DroidPackage.LAYOUT__PADDING:
				return padding != null;
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
				return paddingBottom != null;
			case DroidPackage.LAYOUT__PADDING_LEFT:
				return paddingLeft != null;
			case DroidPackage.LAYOUT__PADDING_RIGHT:
				return paddingRight != null;
			case DroidPackage.LAYOUT__PADDING_TOP:
				return paddingTop != null;
			case DroidPackage.LAYOUT__ROTATION:
				return rotation != null;
			case DroidPackage.LAYOUT__ROTATION_X:
				return rotationX != null;
			case DroidPackage.LAYOUT__ROTATION_Y:
				return rotationY != null;
			case DroidPackage.LAYOUT__SAVE_ENABLED:
				return saveEnabled != null;
			case DroidPackage.LAYOUT__SCALE_X:
				return scaleX != null;
			case DroidPackage.LAYOUT__SCALE_Y:
				return scaleY != null;
			case DroidPackage.LAYOUT__SCROLL_X:
				return scrollX != null;
			case DroidPackage.LAYOUT__SCROLL_Y:
				return scrollY != null;
			case DroidPackage.LAYOUT__SCROLLBARS:
				return scrollbars != null;
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_X:
				return transformPivotX != null;
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y:
				return transformPivotY != null;
			case DroidPackage.LAYOUT__TRANSLATION_X:
				return translationX != null;
			case DroidPackage.LAYOUT__TRANSLATION_Y:
				return translationY != null;
			case DroidPackage.LAYOUT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case DroidPackage.LAYOUT__GRAVITY:
				return gravity != null && !gravity.isEmpty();
			case DroidPackage.LAYOUT__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case DroidPackage.LAYOUT__VIEWS:
				return views != null;
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
		result.append(" (isRelative: ");
		result.append(isRelative);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", gravity: ");
		result.append(gravity);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
