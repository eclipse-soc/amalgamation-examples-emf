/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array RA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.ArrayRA#getPackage <em>Package</em>}</li>
 *   <li>{@link droid.ArrayRA#getResource <em>Resource</em>}</li>
 *   <li>{@link droid.ArrayRA#getExternalResource <em>External Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getArrayRA()
 * @model
 * @generated
 */
public interface ArrayRA extends EObject {
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
	 * @see droid.DroidPackage#getArrayRA_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link droid.ArrayRA#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(ArrayResource)
	 * @see droid.DroidPackage#getArrayRA_Resource()
	 * @model
	 * @generated
	 */
	ArrayResource getResource();

	/**
	 * Sets the value of the '{@link droid.ArrayRA#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ArrayResource value);

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
	 * @see droid.DroidPackage#getArrayRA_ExternalResource()
	 * @model
	 * @generated
	 */
	String getExternalResource();

	/**
	 * Sets the value of the '{@link droid.ArrayRA#getExternalResource <em>External Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Resource</em>' attribute.
	 * @see #getExternalResource()
	 * @generated
	 */
	void setExternalResource(String value);

} // ArrayRA
