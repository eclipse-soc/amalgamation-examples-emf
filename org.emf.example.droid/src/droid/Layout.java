/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.Layout#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link droid.Layout#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link droid.Layout#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link droid.Layout#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link droid.Layout#getNextFocusDown <em>Next Focus Down</em>}</li>
 *   <li>{@link droid.Layout#getNextFocusLeft <em>Next Focus Left</em>}</li>
 *   <li>{@link droid.Layout#getNextFocusRight <em>Next Focus Right</em>}</li>
 *   <li>{@link droid.Layout#getNextFocusUp <em>Next Focus Up</em>}</li>
 *   <li>{@link droid.Layout#getPadding <em>Padding</em>}</li>
 *   <li>{@link droid.Layout#getPaddingBottom <em>Padding Bottom</em>}</li>
 *   <li>{@link droid.Layout#getPaddingLeft <em>Padding Left</em>}</li>
 *   <li>{@link droid.Layout#getPaddingRight <em>Padding Right</em>}</li>
 *   <li>{@link droid.Layout#getPaddingTop <em>Padding Top</em>}</li>
 *   <li>{@link droid.Layout#getRotation <em>Rotation</em>}</li>
 *   <li>{@link droid.Layout#getRotationX <em>Rotation X</em>}</li>
 *   <li>{@link droid.Layout#getRotationY <em>Rotation Y</em>}</li>
 *   <li>{@link droid.Layout#getSaveEnabled <em>Save Enabled</em>}</li>
 *   <li>{@link droid.Layout#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link droid.Layout#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link droid.Layout#getScrollX <em>Scroll X</em>}</li>
 *   <li>{@link droid.Layout#getScrollY <em>Scroll Y</em>}</li>
 *   <li>{@link droid.Layout#getScrollbars <em>Scrollbars</em>}</li>
 *   <li>{@link droid.Layout#getTransformPivotX <em>Transform Pivot X</em>}</li>
 *   <li>{@link droid.Layout#getTransformPivotY <em>Transform Pivot Y</em>}</li>
 *   <li>{@link droid.Layout#getTranslationX <em>Translation X</em>}</li>
 *   <li>{@link droid.Layout#getTranslationY <em>Translation Y</em>}</li>
 *   <li>{@link droid.Layout#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link droid.Layout#getGravity <em>Gravity</em>}</li>
 *   <li>{@link droid.Layout#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link droid.Layout#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends View {
	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see droid.DroidPackage#getLayout_IsRelative()
	 * @model
	 * @generated
	 */
	boolean isIsRelative();

	/**
	 * Sets the value of the '{@link droid.Layout#isIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isIsRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(String)
	 * @see droid.DroidPackage#getLayout_Alpha()
	 * @model
	 * @generated
	 */
	String getAlpha();

	/**
	 * Sets the value of the '{@link droid.Layout#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(String value);

	/**
	 * Returns the value of the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Height</em>' containment reference.
	 * @see #setMinHeight(DimensionVA)
	 * @see droid.DroidPackage#getLayout_MinHeight()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getMinHeight();

	/**
	 * Sets the value of the '{@link droid.Layout#getMinHeight <em>Min Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Height</em>' containment reference.
	 * @see #getMinHeight()
	 * @generated
	 */
	void setMinHeight(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Width</em>' containment reference.
	 * @see #setMinWidth(DimensionVA)
	 * @see droid.DroidPackage#getLayout_MinWidth()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getMinWidth();

	/**
	 * Sets the value of the '{@link droid.Layout#getMinWidth <em>Min Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Width</em>' containment reference.
	 * @see #getMinWidth()
	 * @generated
	 */
	void setMinWidth(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Focus Down</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Focus Down</em>' reference.
	 * @see #setNextFocusDown(View)
	 * @see droid.DroidPackage#getLayout_NextFocusDown()
	 * @model
	 * @generated
	 */
	View getNextFocusDown();

	/**
	 * Sets the value of the '{@link droid.Layout#getNextFocusDown <em>Next Focus Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Focus Down</em>' reference.
	 * @see #getNextFocusDown()
	 * @generated
	 */
	void setNextFocusDown(View value);

	/**
	 * Returns the value of the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Focus Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Focus Left</em>' reference.
	 * @see #setNextFocusLeft(View)
	 * @see droid.DroidPackage#getLayout_NextFocusLeft()
	 * @model
	 * @generated
	 */
	View getNextFocusLeft();

	/**
	 * Sets the value of the '{@link droid.Layout#getNextFocusLeft <em>Next Focus Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Focus Left</em>' reference.
	 * @see #getNextFocusLeft()
	 * @generated
	 */
	void setNextFocusLeft(View value);

	/**
	 * Returns the value of the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Focus Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Focus Right</em>' reference.
	 * @see #setNextFocusRight(View)
	 * @see droid.DroidPackage#getLayout_NextFocusRight()
	 * @model
	 * @generated
	 */
	View getNextFocusRight();

	/**
	 * Sets the value of the '{@link droid.Layout#getNextFocusRight <em>Next Focus Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Focus Right</em>' reference.
	 * @see #getNextFocusRight()
	 * @generated
	 */
	void setNextFocusRight(View value);

	/**
	 * Returns the value of the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Focus Up</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Focus Up</em>' reference.
	 * @see #setNextFocusUp(View)
	 * @see droid.DroidPackage#getLayout_NextFocusUp()
	 * @model
	 * @generated
	 */
	View getNextFocusUp();

	/**
	 * Sets the value of the '{@link droid.Layout#getNextFocusUp <em>Next Focus Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Focus Up</em>' reference.
	 * @see #getNextFocusUp()
	 * @generated
	 */
	void setNextFocusUp(View value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' containment reference.
	 * @see #setPadding(DimensionVA)
	 * @see droid.DroidPackage#getLayout_Padding()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPadding();

	/**
	 * Sets the value of the '{@link droid.Layout#getPadding <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' containment reference.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Bottom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Bottom</em>' containment reference.
	 * @see #setPaddingBottom(DimensionVA)
	 * @see droid.DroidPackage#getLayout_PaddingBottom()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPaddingBottom();

	/**
	 * Sets the value of the '{@link droid.Layout#getPaddingBottom <em>Padding Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Bottom</em>' containment reference.
	 * @see #getPaddingBottom()
	 * @generated
	 */
	void setPaddingBottom(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Left</em>' containment reference.
	 * @see #setPaddingLeft(DimensionVA)
	 * @see droid.DroidPackage#getLayout_PaddingLeft()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPaddingLeft();

	/**
	 * Sets the value of the '{@link droid.Layout#getPaddingLeft <em>Padding Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Left</em>' containment reference.
	 * @see #getPaddingLeft()
	 * @generated
	 */
	void setPaddingLeft(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Right</em>' containment reference.
	 * @see #setPaddingRight(DimensionVA)
	 * @see droid.DroidPackage#getLayout_PaddingRight()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPaddingRight();

	/**
	 * Sets the value of the '{@link droid.Layout#getPaddingRight <em>Padding Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Right</em>' containment reference.
	 * @see #getPaddingRight()
	 * @generated
	 */
	void setPaddingRight(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Top</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Top</em>' containment reference.
	 * @see #setPaddingTop(DimensionVA)
	 * @see droid.DroidPackage#getLayout_PaddingTop()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getPaddingTop();

	/**
	 * Sets the value of the '{@link droid.Layout#getPaddingTop <em>Padding Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Top</em>' containment reference.
	 * @see #getPaddingTop()
	 * @generated
	 */
	void setPaddingTop(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(DimensionVA)
	 * @see droid.DroidPackage#getLayout_Rotation()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getRotation();

	/**
	 * Sets the value of the '{@link droid.Layout#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Rotation X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation X</em>' containment reference.
	 * @see #setRotationX(DimensionVA)
	 * @see droid.DroidPackage#getLayout_RotationX()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getRotationX();

	/**
	 * Sets the value of the '{@link droid.Layout#getRotationX <em>Rotation X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation X</em>' containment reference.
	 * @see #getRotationX()
	 * @generated
	 */
	void setRotationX(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Rotation Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Y</em>' containment reference.
	 * @see #setRotationY(DimensionVA)
	 * @see droid.DroidPackage#getLayout_RotationY()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getRotationY();

	/**
	 * Sets the value of the '{@link droid.Layout#getRotationY <em>Rotation Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Y</em>' containment reference.
	 * @see #getRotationY()
	 * @generated
	 */
	void setRotationY(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Save Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Enabled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Enabled</em>' containment reference.
	 * @see #setSaveEnabled(BooleanVA)
	 * @see droid.DroidPackage#getLayout_SaveEnabled()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getSaveEnabled();

	/**
	 * Sets the value of the '{@link droid.Layout#getSaveEnabled <em>Save Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Enabled</em>' containment reference.
	 * @see #getSaveEnabled()
	 * @generated
	 */
	void setSaveEnabled(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Scale X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale X</em>' containment reference.
	 * @see #setScaleX(DimensionVA)
	 * @see droid.DroidPackage#getLayout_ScaleX()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getScaleX();

	/**
	 * Sets the value of the '{@link droid.Layout#getScaleX <em>Scale X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale X</em>' containment reference.
	 * @see #getScaleX()
	 * @generated
	 */
	void setScaleX(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Scale Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Y</em>' containment reference.
	 * @see #setScaleY(DimensionVA)
	 * @see droid.DroidPackage#getLayout_ScaleY()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getScaleY();

	/**
	 * Sets the value of the '{@link droid.Layout#getScaleY <em>Scale Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Y</em>' containment reference.
	 * @see #getScaleY()
	 * @generated
	 */
	void setScaleY(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Scroll X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scroll X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scroll X</em>' containment reference.
	 * @see #setScrollX(DimensionVA)
	 * @see droid.DroidPackage#getLayout_ScrollX()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getScrollX();

	/**
	 * Sets the value of the '{@link droid.Layout#getScrollX <em>Scroll X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scroll X</em>' containment reference.
	 * @see #getScrollX()
	 * @generated
	 */
	void setScrollX(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Scroll Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scroll Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scroll Y</em>' containment reference.
	 * @see #setScrollY(DimensionVA)
	 * @see droid.DroidPackage#getLayout_ScrollY()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getScrollY();

	/**
	 * Sets the value of the '{@link droid.Layout#getScrollY <em>Scroll Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scroll Y</em>' containment reference.
	 * @see #getScrollY()
	 * @generated
	 */
	void setScrollY(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scrollbars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrollbars</em>' containment reference.
	 * @see #setScrollbars(BooleanVA)
	 * @see droid.DroidPackage#getLayout_Scrollbars()
	 * @model containment="true"
	 * @generated
	 */
	BooleanVA getScrollbars();

	/**
	 * Sets the value of the '{@link droid.Layout#getScrollbars <em>Scrollbars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrollbars</em>' containment reference.
	 * @see #getScrollbars()
	 * @generated
	 */
	void setScrollbars(BooleanVA value);

	/**
	 * Returns the value of the '<em><b>Transform Pivot X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Pivot X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Pivot X</em>' containment reference.
	 * @see #setTransformPivotX(DimensionVA)
	 * @see droid.DroidPackage#getLayout_TransformPivotX()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getTransformPivotX();

	/**
	 * Sets the value of the '{@link droid.Layout#getTransformPivotX <em>Transform Pivot X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform Pivot X</em>' containment reference.
	 * @see #getTransformPivotX()
	 * @generated
	 */
	void setTransformPivotX(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Transform Pivot Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform Pivot Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform Pivot Y</em>' containment reference.
	 * @see #setTransformPivotY(DimensionVA)
	 * @see droid.DroidPackage#getLayout_TransformPivotY()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getTransformPivotY();

	/**
	 * Sets the value of the '{@link droid.Layout#getTransformPivotY <em>Transform Pivot Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform Pivot Y</em>' containment reference.
	 * @see #getTransformPivotY()
	 * @generated
	 */
	void setTransformPivotY(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Translation X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation X</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation X</em>' containment reference.
	 * @see #setTranslationX(DimensionVA)
	 * @see droid.DroidPackage#getLayout_TranslationX()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getTranslationX();

	/**
	 * Sets the value of the '{@link droid.Layout#getTranslationX <em>Translation X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation X</em>' containment reference.
	 * @see #getTranslationX()
	 * @generated
	 */
	void setTranslationX(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Translation Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Y</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Y</em>' containment reference.
	 * @see #setTranslationY(DimensionVA)
	 * @see droid.DroidPackage#getLayout_TranslationY()
	 * @model containment="true"
	 * @generated
	 */
	DimensionVA getTranslationY();

	/**
	 * Sets the value of the '{@link droid.Layout#getTranslationY <em>Translation Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Y</em>' containment reference.
	 * @see #getTranslationY()
	 * @generated
	 */
	void setTranslationY(DimensionVA value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.LayoutVisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see droid.LayoutVisibilityKind
	 * @see #setVisibility(LayoutVisibilityKind)
	 * @see droid.DroidPackage#getLayout_Visibility()
	 * @model
	 * @generated
	 */
	LayoutVisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link droid.Layout#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see droid.LayoutVisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(LayoutVisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Gravity</b></em>' attribute list.
	 * The list contents are of type {@link droid.LayoutGravityKind}.
	 * The literals are from the enumeration {@link droid.LayoutGravityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' attribute list.
	 * @see droid.LayoutGravityKind
	 * @see droid.DroidPackage#getLayout_Gravity()
	 * @model unique="false"
	 * @generated
	 */
	EList<LayoutGravityKind> getGravity();

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.LayoutOrientationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see droid.LayoutOrientationKind
	 * @see #setOrientation(LayoutOrientationKind)
	 * @see droid.DroidPackage#getLayout_Orientation()
	 * @model
	 * @generated
	 */
	LayoutOrientationKind getOrientation();

	/**
	 * Sets the value of the '{@link droid.Layout#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see droid.LayoutOrientationKind
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(LayoutOrientationKind value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference.
	 * @see #setViews(ViewCollection)
	 * @see droid.DroidPackage#getLayout_Views()
	 * @model containment="true"
	 * @generated
	 */
	ViewCollection getViews();

	/**
	 * Sets the value of the '{@link droid.Layout#getViews <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Views</em>' containment reference.
	 * @see #getViews()
	 * @generated
	 */
	void setViews(ViewCollection value);

} // Layout
