/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.util;

import droid.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see droid.DroidPackage
 * @generated
 */
public class DroidSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DroidPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroidSwitch() {
		if (modelPackage == null) {
			modelPackage = DroidPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DroidPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.APPLICATION_USES_SDK: {
				ApplicationUsesSDK applicationUsesSDK = (ApplicationUsesSDK)theEObject;
				T result = caseApplicationUsesSDK(applicationUsesSDK);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.SCREEN: {
				Screen screen = (Screen)theEObject;
				T result = caseScreen(screen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.GO_TO_URL_ACTION: {
				GoToURLAction goToURLAction = (GoToURLAction)theEObject;
				T result = caseGoToURLAction(goToURLAction);
				if (result == null) result = caseAction(goToURLAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.SHOW_LAYOUT_ACTION: {
				ShowLayoutAction showLayoutAction = (ShowLayoutAction)theEObject;
				T result = caseShowLayoutAction(showLayoutAction);
				if (result == null) result = caseAction(showLayoutAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.INVOKE_SCREEN_ACTION: {
				InvokeScreenAction invokeScreenAction = (InvokeScreenAction)theEObject;
				T result = caseInvokeScreenAction(invokeScreenAction);
				if (result == null) result = caseAction(invokeScreenAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = caseView(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.VIEW_COLLECTION: {
				ViewCollection viewCollection = (ViewCollection)theEObject;
				T result = caseViewCollection(viewCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = caseView(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.TEXT_VIEW: {
				TextView textView = (TextView)theEObject;
				T result = caseTextView(textView);
				if (result == null) result = caseWidget(textView);
				if (result == null) result = caseView(textView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseWidget(button);
				if (result == null) result = caseView(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.IMAGE_VIEW: {
				ImageView imageView = (ImageView)theEObject;
				T result = caseImageView(imageView);
				if (result == null) result = caseWidget(imageView);
				if (result == null) result = caseView(imageView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.SPINNER: {
				Spinner spinner = (Spinner)theEObject;
				T result = caseSpinner(spinner);
				if (result == null) result = caseWidget(spinner);
				if (result == null) result = caseView(spinner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.EDIT_TEXT: {
				EditText editText = (EditText)theEObject;
				T result = caseEditText(editText);
				if (result == null) result = caseWidget(editText);
				if (result == null) result = caseView(editText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.STRING_RESOURCE: {
				StringResource stringResource = (StringResource)theEObject;
				T result = caseStringResource(stringResource);
				if (result == null) result = caseResource(stringResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.INTEGER_RESOURCE: {
				IntegerResource integerResource = (IntegerResource)theEObject;
				T result = caseIntegerResource(integerResource);
				if (result == null) result = caseResource(integerResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.BOOLEAN_RESOURCE: {
				BooleanResource booleanResource = (BooleanResource)theEObject;
				T result = caseBooleanResource(booleanResource);
				if (result == null) result = caseResource(booleanResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.COLOR_RESOURCE: {
				ColorResource colorResource = (ColorResource)theEObject;
				T result = caseColorResource(colorResource);
				if (result == null) result = caseResource(colorResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.DIMENSION_RESOURCE: {
				DimensionResource dimensionResource = (DimensionResource)theEObject;
				T result = caseDimensionResource(dimensionResource);
				if (result == null) result = caseResource(dimensionResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.ARRAY_RESOURCE: {
				ArrayResource arrayResource = (ArrayResource)theEObject;
				T result = caseArrayResource(arrayResource);
				if (result == null) result = caseResource(arrayResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.INTEGER_ARRAY_RESOURCE: {
				IntegerArrayResource integerArrayResource = (IntegerArrayResource)theEObject;
				T result = caseIntegerArrayResource(integerArrayResource);
				if (result == null) result = caseArrayResource(integerArrayResource);
				if (result == null) result = caseResource(integerArrayResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.STRING_ARRAY_RESOURCE: {
				StringArrayResource stringArrayResource = (StringArrayResource)theEObject;
				T result = caseStringArrayResource(stringArrayResource);
				if (result == null) result = caseArrayResource(stringArrayResource);
				if (result == null) result = caseResource(stringArrayResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.DRAWABLE_RESOURCE: {
				DrawableResource drawableResource = (DrawableResource)theEObject;
				T result = caseDrawableResource(drawableResource);
				if (result == null) result = caseResource(drawableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.BITMAP_DRAWABLE_RESOURCE: {
				BitmapDrawableResource bitmapDrawableResource = (BitmapDrawableResource)theEObject;
				T result = caseBitmapDrawableResource(bitmapDrawableResource);
				if (result == null) result = caseDrawableResource(bitmapDrawableResource);
				if (result == null) result = caseResource(bitmapDrawableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.TRANSITION_DRAWABLE_RESOURCE: {
				TransitionDrawableResource transitionDrawableResource = (TransitionDrawableResource)theEObject;
				T result = caseTransitionDrawableResource(transitionDrawableResource);
				if (result == null) result = caseDrawableResource(transitionDrawableResource);
				if (result == null) result = caseResource(transitionDrawableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.VALUE_ACCESS: {
				ValueAccess valueAccess = (ValueAccess)theEObject;
				T result = caseValueAccess(valueAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.ANY_DRAWABLE_VA: {
				AnyDrawableVA anyDrawableVA = (AnyDrawableVA)theEObject;
				T result = caseAnyDrawableVA(anyDrawableVA);
				if (result == null) result = caseValueAccess(anyDrawableVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.STRING_VA: {
				StringVA stringVA = (StringVA)theEObject;
				T result = caseStringVA(stringVA);
				if (result == null) result = caseValueAccess(stringVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.INTEGER_VA: {
				IntegerVA integerVA = (IntegerVA)theEObject;
				T result = caseIntegerVA(integerVA);
				if (result == null) result = caseValueAccess(integerVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.BOOLEAN_VA: {
				BooleanVA booleanVA = (BooleanVA)theEObject;
				T result = caseBooleanVA(booleanVA);
				if (result == null) result = caseValueAccess(booleanVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.COLOR_VA: {
				ColorVA colorVA = (ColorVA)theEObject;
				T result = caseColorVA(colorVA);
				if (result == null) result = caseAnyDrawableVA(colorVA);
				if (result == null) result = caseValueAccess(colorVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.DIMENSION_VA: {
				DimensionVA dimensionVA = (DimensionVA)theEObject;
				T result = caseDimensionVA(dimensionVA);
				if (result == null) result = caseLayoutDimensionVA(dimensionVA);
				if (result == null) result = caseValueAccess(dimensionVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.LAYOUT_DIMENSION_VA: {
				LayoutDimensionVA layoutDimensionVA = (LayoutDimensionVA)theEObject;
				T result = caseLayoutDimensionVA(layoutDimensionVA);
				if (result == null) result = caseValueAccess(layoutDimensionVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.DRAWABLE_VA: {
				DrawableVA drawableVA = (DrawableVA)theEObject;
				T result = caseDrawableVA(drawableVA);
				if (result == null) result = caseAnyDrawableVA(drawableVA);
				if (result == null) result = caseValueAccess(drawableVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.RESOURCE_ACCESS: {
				ResourceAccess resourceAccess = (ResourceAccess)theEObject;
				T result = caseResourceAccess(resourceAccess);
				if (result == null) result = caseValueAccess(resourceAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.STRING_RA: {
				StringRA stringRA = (StringRA)theEObject;
				T result = caseStringRA(stringRA);
				if (result == null) result = caseStringVA(stringRA);
				if (result == null) result = caseResourceAccess(stringRA);
				if (result == null) result = caseValueAccess(stringRA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.INTEGER_RA: {
				IntegerRA integerRA = (IntegerRA)theEObject;
				T result = caseIntegerRA(integerRA);
				if (result == null) result = caseIntegerVA(integerRA);
				if (result == null) result = caseResourceAccess(integerRA);
				if (result == null) result = caseValueAccess(integerRA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.BOOLEAN_RA: {
				BooleanRA booleanRA = (BooleanRA)theEObject;
				T result = caseBooleanRA(booleanRA);
				if (result == null) result = caseBooleanVA(booleanRA);
				if (result == null) result = caseResourceAccess(booleanRA);
				if (result == null) result = caseValueAccess(booleanRA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.COLOR_RA: {
				ColorRA colorRA = (ColorRA)theEObject;
				T result = caseColorRA(colorRA);
				if (result == null) result = caseColorVA(colorRA);
				if (result == null) result = caseResourceAccess(colorRA);
				if (result == null) result = caseAnyDrawableVA(colorRA);
				if (result == null) result = caseValueAccess(colorRA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.DIMENSION_RA: {
				DimensionRA dimensionRA = (DimensionRA)theEObject;
				T result = caseDimensionRA(dimensionRA);
				if (result == null) result = caseDimensionVA(dimensionRA);
				if (result == null) result = caseResourceAccess(dimensionRA);
				if (result == null) result = caseLayoutDimensionVA(dimensionRA);
				if (result == null) result = caseValueAccess(dimensionRA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.ARRAY_RA: {
				ArrayRA arrayRA = (ArrayRA)theEObject;
				T result = caseArrayRA(arrayRA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.DRAWABLE_RA: {
				DrawableRA drawableRA = (DrawableRA)theEObject;
				T result = caseDrawableRA(drawableRA);
				if (result == null) result = caseDrawableVA(drawableRA);
				if (result == null) result = caseResourceAccess(drawableRA);
				if (result == null) result = caseAnyDrawableVA(drawableRA);
				if (result == null) result = caseValueAccess(drawableRA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DroidPackage.LAYOUT_PROPERTIES: {
				LayoutProperties layoutProperties = (LayoutProperties)theEObject;
				T result = caseLayoutProperties(layoutProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Uses SDK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Uses SDK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationUsesSDK(ApplicationUsesSDK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreen(Screen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go To URL Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go To URL Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoToURLAction(GoToURLAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show Layout Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show Layout Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowLayoutAction(ShowLayoutAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Screen Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Screen Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeScreenAction(InvokeScreenAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewCollection(ViewCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextView(TextView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageView(ImageView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpinner(Spinner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditText(EditText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringResource(StringResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerResource(IntegerResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanResource(BooleanResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorResource(ColorResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionResource(DimensionResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayResource(ArrayResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Array Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerArrayResource(IntegerArrayResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Array Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Array Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringArrayResource(StringArrayResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawableResource(DrawableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bitmap Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bitmap Drawable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitmapDrawableResource(BitmapDrawableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Drawable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Drawable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionDrawableResource(TransitionDrawableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueAccess(ValueAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Drawable VA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Drawable VA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyDrawableVA(AnyDrawableVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String VA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String VA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVA(StringVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer VA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer VA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVA(IntegerVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean VA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean VA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVA(BooleanVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color VA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color VA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorVA(ColorVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension VA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension VA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionVA(DimensionVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Dimension VA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Dimension VA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutDimensionVA(LayoutDimensionVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawable VA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawable VA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawableVA(DrawableVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAccess(ResourceAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String RA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String RA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringRA(StringRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer RA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer RA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerRA(IntegerRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean RA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean RA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanRA(BooleanRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color RA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color RA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorRA(ColorRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension RA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension RA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionRA(DimensionRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array RA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array RA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayRA(ArrayRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawable RA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawable RA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawableRA(DrawableRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutProperties(LayoutProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DroidSwitch
