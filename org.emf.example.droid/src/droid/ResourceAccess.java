/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.ResourceAccess#getPackage <em>Package</em>}</li>
 *   <li>{@link droid.ResourceAccess#getExternalResource <em>External Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getResourceAccess()
 * @model
 * @generated
 */
public interface ResourceAccess extends ValueAccess {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see droid.DroidPackage#getResourceAccess_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link droid.ResourceAccess#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Resource</em>' attribute.
	 * @see #setExternalResource(String)
	 * @see droid.DroidPackage#getResourceAccess_ExternalResource()
	 * @model
	 * @generated
	 */
	String getExternalResource();

	/**
	 * Sets the value of the '{@link droid.ResourceAccess#getExternalResource <em>External Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Resource</em>' attribute.
	 * @see #getExternalResource()
	 * @generated
	 */
	void setExternalResource(String value);

} // ResourceAccess
