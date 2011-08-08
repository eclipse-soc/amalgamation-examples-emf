/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see droid.DroidPackage
 * @generated
 */
public interface DroidFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DroidFactory eINSTANCE = droid.impl.DroidFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Application Uses SDK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Uses SDK</em>'.
	 * @generated
	 */
	ApplicationUsesSDK createApplicationUsesSDK();

	/**
	 * Returns a new object of class '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen</em>'.
	 * @generated
	 */
	Screen createScreen();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Go To URL Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To URL Action</em>'.
	 * @generated
	 */
	GoToURLAction createGoToURLAction();

	/**
	 * Returns a new object of class '<em>Show Layout Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Show Layout Action</em>'.
	 * @generated
	 */
	ShowLayoutAction createShowLayoutAction();

	/**
	 * Returns a new object of class '<em>Invoke Screen Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoke Screen Action</em>'.
	 * @generated
	 */
	InvokeScreenAction createInvokeScreenAction();

	/**
	 * Returns a new object of class '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout</em>'.
	 * @generated
	 */
	Layout createLayout();

	/**
	 * Returns a new object of class '<em>View Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Collection</em>'.
	 * @generated
	 */
	ViewCollection createViewCollection();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget</em>'.
	 * @generated
	 */
	Widget createWidget();

	/**
	 * Returns a new object of class '<em>Text View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text View</em>'.
	 * @generated
	 */
	TextView createTextView();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Image View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image View</em>'.
	 * @generated
	 */
	ImageView createImageView();

	/**
	 * Returns a new object of class '<em>Spinner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spinner</em>'.
	 * @generated
	 */
	Spinner createSpinner();

	/**
	 * Returns a new object of class '<em>Edit Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edit Text</em>'.
	 * @generated
	 */
	EditText createEditText();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>String Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Resource</em>'.
	 * @generated
	 */
	StringResource createStringResource();

	/**
	 * Returns a new object of class '<em>Integer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Resource</em>'.
	 * @generated
	 */
	IntegerResource createIntegerResource();

	/**
	 * Returns a new object of class '<em>Boolean Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Resource</em>'.
	 * @generated
	 */
	BooleanResource createBooleanResource();

	/**
	 * Returns a new object of class '<em>Color Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color Resource</em>'.
	 * @generated
	 */
	ColorResource createColorResource();

	/**
	 * Returns a new object of class '<em>Dimension Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Resource</em>'.
	 * @generated
	 */
	DimensionResource createDimensionResource();

	/**
	 * Returns a new object of class '<em>Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Resource</em>'.
	 * @generated
	 */
	ArrayResource createArrayResource();

	/**
	 * Returns a new object of class '<em>Integer Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Array Resource</em>'.
	 * @generated
	 */
	IntegerArrayResource createIntegerArrayResource();

	/**
	 * Returns a new object of class '<em>String Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Array Resource</em>'.
	 * @generated
	 */
	StringArrayResource createStringArrayResource();

	/**
	 * Returns a new object of class '<em>Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drawable Resource</em>'.
	 * @generated
	 */
	DrawableResource createDrawableResource();

	/**
	 * Returns a new object of class '<em>Bitmap Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bitmap Drawable Resource</em>'.
	 * @generated
	 */
	BitmapDrawableResource createBitmapDrawableResource();

	/**
	 * Returns a new object of class '<em>Transition Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Drawable Resource</em>'.
	 * @generated
	 */
	TransitionDrawableResource createTransitionDrawableResource();

	/**
	 * Returns a new object of class '<em>Value Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Access</em>'.
	 * @generated
	 */
	ValueAccess createValueAccess();

	/**
	 * Returns a new object of class '<em>Any Drawable VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Drawable VA</em>'.
	 * @generated
	 */
	AnyDrawableVA createAnyDrawableVA();

	/**
	 * Returns a new object of class '<em>String VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String VA</em>'.
	 * @generated
	 */
	StringVA createStringVA();

	/**
	 * Returns a new object of class '<em>Integer VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer VA</em>'.
	 * @generated
	 */
	IntegerVA createIntegerVA();

	/**
	 * Returns a new object of class '<em>Boolean VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean VA</em>'.
	 * @generated
	 */
	BooleanVA createBooleanVA();

	/**
	 * Returns a new object of class '<em>Color VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color VA</em>'.
	 * @generated
	 */
	ColorVA createColorVA();

	/**
	 * Returns a new object of class '<em>Dimension VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension VA</em>'.
	 * @generated
	 */
	DimensionVA createDimensionVA();

	/**
	 * Returns a new object of class '<em>Layout Dimension VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout Dimension VA</em>'.
	 * @generated
	 */
	LayoutDimensionVA createLayoutDimensionVA();

	/**
	 * Returns a new object of class '<em>Drawable VA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drawable VA</em>'.
	 * @generated
	 */
	DrawableVA createDrawableVA();

	/**
	 * Returns a new object of class '<em>Resource Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Access</em>'.
	 * @generated
	 */
	ResourceAccess createResourceAccess();

	/**
	 * Returns a new object of class '<em>String RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String RA</em>'.
	 * @generated
	 */
	StringRA createStringRA();

	/**
	 * Returns a new object of class '<em>Integer RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer RA</em>'.
	 * @generated
	 */
	IntegerRA createIntegerRA();

	/**
	 * Returns a new object of class '<em>Boolean RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean RA</em>'.
	 * @generated
	 */
	BooleanRA createBooleanRA();

	/**
	 * Returns a new object of class '<em>Color RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Color RA</em>'.
	 * @generated
	 */
	ColorRA createColorRA();

	/**
	 * Returns a new object of class '<em>Dimension RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension RA</em>'.
	 * @generated
	 */
	DimensionRA createDimensionRA();

	/**
	 * Returns a new object of class '<em>Array RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array RA</em>'.
	 * @generated
	 */
	ArrayRA createArrayRA();

	/**
	 * Returns a new object of class '<em>Drawable RA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drawable RA</em>'.
	 * @generated
	 */
	DrawableRA createDrawableRA();

	/**
	 * Returns a new object of class '<em>Layout Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout Properties</em>'.
	 * @generated
	 */
	LayoutProperties createLayoutProperties();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DroidPackage getDroidPackage();

} //DroidFactory
