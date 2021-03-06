/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drawable RA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.DrawableRA#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getDrawableRA()
 * @model
 * @generated
 */
public interface DrawableRA extends DrawableVA, ResourceAccess {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(DrawableResource)
	 * @see droid.DroidPackage#getDrawableRA_Resource()
	 * @model
	 * @generated
	 */
	DrawableResource getResource();

	/**
	 * Sets the value of the '{@link droid.DrawableRA#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(DrawableResource value);

} // DrawableRA
