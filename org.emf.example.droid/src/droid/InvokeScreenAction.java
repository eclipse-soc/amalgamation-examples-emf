/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke Screen Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link droid.InvokeScreenAction#getScreen <em>Screen</em>}</li>
 * </ul>
 * </p>
 *
 * @see droid.DroidPackage#getInvokeScreenAction()
 * @model
 * @generated
 */
public interface InvokeScreenAction extends Action {
	/**
	 * Returns the value of the '<em><b>Screen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen</em>' reference.
	 * @see #setScreen(Screen)
	 * @see droid.DroidPackage#getInvokeScreenAction_Screen()
	 * @model
	 * @generated
	 */
	Screen getScreen();

	/**
	 * Sets the value of the '{@link droid.InvokeScreenAction#getScreen <em>Screen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen</em>' reference.
	 * @see #getScreen()
	 * @generated
	 */
	void setScreen(Screen value);

} // InvokeScreenAction
