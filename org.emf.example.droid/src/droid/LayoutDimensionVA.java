/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Dimension VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.LayoutDimensionVA#getConst_value <em>Const value</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getLayoutDimensionVA()
 * @model
 * @generated
 */
public interface LayoutDimensionVA extends ValueAccess {
	/**
	 * Returns the value of the '<em><b>Const value</b></em>' attribute.
	 * The literals are from the enumeration {@link droid.LayoutDimensionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const value</em>' attribute.
	 * @see droid.LayoutDimensionKind
	 * @see #setConst_value(LayoutDimensionKind)
	 * @see droid.DroidPackage#getLayoutDimensionVA_Const_value()
	 * @model
	 * @generated
	 */
	LayoutDimensionKind getConst_value();

	/**
	 * Sets the value of the '{@link droid.LayoutDimensionVA#getConst_value <em>Const value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const value</em>' attribute.
	 * @see droid.LayoutDimensionKind
	 * @see #getConst_value()
	 * @generated
	 */
	void setConst_value(LayoutDimensionKind value);

} // LayoutDimensionVA
