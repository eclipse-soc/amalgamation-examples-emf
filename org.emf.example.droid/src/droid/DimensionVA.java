/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension VA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.DimensionVA#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getDimensionVA()
 * @model
 * @generated
 */
public interface DimensionVA extends ValueAccess, LayoutDimensionVA {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see droid.DroidPackage#getDimensionVA_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link droid.DimensionVA#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DimensionVA
