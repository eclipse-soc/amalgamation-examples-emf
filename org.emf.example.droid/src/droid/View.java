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
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.View#getName <em>Name</em>}</li>
 *   <li>{@link droid.View#getBackground <em>Background</em>}</li>
 *   <li>{@link droid.View#getOnClick <em>On Click</em>}</li>
 *   <li>{@link droid.View#getLayoutProperties <em>Layout Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see droid.DroidPackage#getView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link droid.View#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(AnyDrawableVA)
	 * @see droid.DroidPackage#getView_Background()
	 * @model containment="true"
	 * @generated
	 */
	AnyDrawableVA getBackground();

	/**
	 * Sets the value of the '{@link droid.View#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(AnyDrawableVA value);

	/**
	 * Returns the value of the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Click</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Click</em>' containment reference.
	 * @see #setOnClick(Action)
	 * @see droid.DroidPackage#getView_OnClick()
	 * @model containment="true"
	 * @generated
	 */
	Action getOnClick();

	/**
	 * Sets the value of the '{@link droid.View#getOnClick <em>On Click</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Click</em>' containment reference.
	 * @see #getOnClick()
	 * @generated
	 */
	void setOnClick(Action value);

	/**
	 * Returns the value of the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Properties</em>' containment reference.
	 * @see #setLayoutProperties(LayoutProperties)
	 * @see droid.DroidPackage#getView_LayoutProperties()
	 * @model containment="true"
	 * @generated
	 */
	LayoutProperties getLayoutProperties();

	/**
	 * Sets the value of the '{@link droid.View#getLayoutProperties <em>Layout Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Properties</em>' containment reference.
	 * @see #getLayoutProperties()
	 * @generated
	 */
	void setLayoutProperties(LayoutProperties value);

} // View
