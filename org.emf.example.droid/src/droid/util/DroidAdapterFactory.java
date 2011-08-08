/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.util;

import droid.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see droid.DroidPackage
 * @generated
 */
public class DroidAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DroidPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroidAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DroidPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroidSwitch<Adapter> modelSwitch =
		new DroidSwitch<Adapter>() {
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseApplicationUsesSDK(ApplicationUsesSDK object) {
				return createApplicationUsesSDKAdapter();
			}
			@Override
			public Adapter caseScreen(Screen object) {
				return createScreenAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseGoToURLAction(GoToURLAction object) {
				return createGoToURLActionAdapter();
			}
			@Override
			public Adapter caseShowLayoutAction(ShowLayoutAction object) {
				return createShowLayoutActionAdapter();
			}
			@Override
			public Adapter caseInvokeScreenAction(InvokeScreenAction object) {
				return createInvokeScreenActionAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseViewCollection(ViewCollection object) {
				return createViewCollectionAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseTextView(TextView object) {
				return createTextViewAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseImageView(ImageView object) {
				return createImageViewAdapter();
			}
			@Override
			public Adapter caseSpinner(Spinner object) {
				return createSpinnerAdapter();
			}
			@Override
			public Adapter caseEditText(EditText object) {
				return createEditTextAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseStringResource(StringResource object) {
				return createStringResourceAdapter();
			}
			@Override
			public Adapter caseIntegerResource(IntegerResource object) {
				return createIntegerResourceAdapter();
			}
			@Override
			public Adapter caseBooleanResource(BooleanResource object) {
				return createBooleanResourceAdapter();
			}
			@Override
			public Adapter caseColorResource(ColorResource object) {
				return createColorResourceAdapter();
			}
			@Override
			public Adapter caseDimensionResource(DimensionResource object) {
				return createDimensionResourceAdapter();
			}
			@Override
			public Adapter caseArrayResource(ArrayResource object) {
				return createArrayResourceAdapter();
			}
			@Override
			public Adapter caseIntegerArrayResource(IntegerArrayResource object) {
				return createIntegerArrayResourceAdapter();
			}
			@Override
			public Adapter caseStringArrayResource(StringArrayResource object) {
				return createStringArrayResourceAdapter();
			}
			@Override
			public Adapter caseDrawableResource(DrawableResource object) {
				return createDrawableResourceAdapter();
			}
			@Override
			public Adapter caseBitmapDrawableResource(BitmapDrawableResource object) {
				return createBitmapDrawableResourceAdapter();
			}
			@Override
			public Adapter caseTransitionDrawableResource(TransitionDrawableResource object) {
				return createTransitionDrawableResourceAdapter();
			}
			@Override
			public Adapter caseValueAccess(ValueAccess object) {
				return createValueAccessAdapter();
			}
			@Override
			public Adapter caseAnyDrawableVA(AnyDrawableVA object) {
				return createAnyDrawableVAAdapter();
			}
			@Override
			public Adapter caseStringVA(StringVA object) {
				return createStringVAAdapter();
			}
			@Override
			public Adapter caseIntegerVA(IntegerVA object) {
				return createIntegerVAAdapter();
			}
			@Override
			public Adapter caseBooleanVA(BooleanVA object) {
				return createBooleanVAAdapter();
			}
			@Override
			public Adapter caseColorVA(ColorVA object) {
				return createColorVAAdapter();
			}
			@Override
			public Adapter caseDimensionVA(DimensionVA object) {
				return createDimensionVAAdapter();
			}
			@Override
			public Adapter caseLayoutDimensionVA(LayoutDimensionVA object) {
				return createLayoutDimensionVAAdapter();
			}
			@Override
			public Adapter caseDrawableVA(DrawableVA object) {
				return createDrawableVAAdapter();
			}
			@Override
			public Adapter caseResourceAccess(ResourceAccess object) {
				return createResourceAccessAdapter();
			}
			@Override
			public Adapter caseStringRA(StringRA object) {
				return createStringRAAdapter();
			}
			@Override
			public Adapter caseIntegerRA(IntegerRA object) {
				return createIntegerRAAdapter();
			}
			@Override
			public Adapter caseBooleanRA(BooleanRA object) {
				return createBooleanRAAdapter();
			}
			@Override
			public Adapter caseColorRA(ColorRA object) {
				return createColorRAAdapter();
			}
			@Override
			public Adapter caseDimensionRA(DimensionRA object) {
				return createDimensionRAAdapter();
			}
			@Override
			public Adapter caseArrayRA(ArrayRA object) {
				return createArrayRAAdapter();
			}
			@Override
			public Adapter caseDrawableRA(DrawableRA object) {
				return createDrawableRAAdapter();
			}
			@Override
			public Adapter caseLayoutProperties(LayoutProperties object) {
				return createLayoutPropertiesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link droid.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ApplicationUsesSDK <em>Application Uses SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ApplicationUsesSDK
	 * @generated
	 */
	public Adapter createApplicationUsesSDKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.Screen
	 * @generated
	 */
	public Adapter createScreenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.GoToURLAction <em>Go To URL Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.GoToURLAction
	 * @generated
	 */
	public Adapter createGoToURLActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ShowLayoutAction <em>Show Layout Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ShowLayoutAction
	 * @generated
	 */
	public Adapter createShowLayoutActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.InvokeScreenAction <em>Invoke Screen Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.InvokeScreenAction
	 * @generated
	 */
	public Adapter createInvokeScreenActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ViewCollection <em>View Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ViewCollection
	 * @generated
	 */
	public Adapter createViewCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.TextView
	 * @generated
	 */
	public Adapter createTextViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ImageView <em>Image View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ImageView
	 * @generated
	 */
	public Adapter createImageViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.Spinner
	 * @generated
	 */
	public Adapter createSpinnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.EditText
	 * @generated
	 */
	public Adapter createEditTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.StringResource <em>String Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.StringResource
	 * @generated
	 */
	public Adapter createStringResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.IntegerResource <em>Integer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.IntegerResource
	 * @generated
	 */
	public Adapter createIntegerResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.BooleanResource <em>Boolean Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.BooleanResource
	 * @generated
	 */
	public Adapter createBooleanResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ColorResource <em>Color Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ColorResource
	 * @generated
	 */
	public Adapter createColorResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.DimensionResource <em>Dimension Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.DimensionResource
	 * @generated
	 */
	public Adapter createDimensionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ArrayResource <em>Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ArrayResource
	 * @generated
	 */
	public Adapter createArrayResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.IntegerArrayResource <em>Integer Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.IntegerArrayResource
	 * @generated
	 */
	public Adapter createIntegerArrayResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.StringArrayResource <em>String Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.StringArrayResource
	 * @generated
	 */
	public Adapter createStringArrayResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.DrawableResource <em>Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.DrawableResource
	 * @generated
	 */
	public Adapter createDrawableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.BitmapDrawableResource
	 * @generated
	 */
	public Adapter createBitmapDrawableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.TransitionDrawableResource
	 * @generated
	 */
	public Adapter createTransitionDrawableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ValueAccess <em>Value Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ValueAccess
	 * @generated
	 */
	public Adapter createValueAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.AnyDrawableVA <em>Any Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.AnyDrawableVA
	 * @generated
	 */
	public Adapter createAnyDrawableVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.StringVA <em>String VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.StringVA
	 * @generated
	 */
	public Adapter createStringVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.IntegerVA <em>Integer VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.IntegerVA
	 * @generated
	 */
	public Adapter createIntegerVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.BooleanVA <em>Boolean VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.BooleanVA
	 * @generated
	 */
	public Adapter createBooleanVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ColorVA <em>Color VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ColorVA
	 * @generated
	 */
	public Adapter createColorVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.DimensionVA <em>Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.DimensionVA
	 * @generated
	 */
	public Adapter createDimensionVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.LayoutDimensionVA <em>Layout Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.LayoutDimensionVA
	 * @generated
	 */
	public Adapter createLayoutDimensionVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.DrawableVA <em>Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.DrawableVA
	 * @generated
	 */
	public Adapter createDrawableVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ResourceAccess <em>Resource Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ResourceAccess
	 * @generated
	 */
	public Adapter createResourceAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.StringRA <em>String RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.StringRA
	 * @generated
	 */
	public Adapter createStringRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.IntegerRA <em>Integer RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.IntegerRA
	 * @generated
	 */
	public Adapter createIntegerRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.BooleanRA <em>Boolean RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.BooleanRA
	 * @generated
	 */
	public Adapter createBooleanRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ColorRA <em>Color RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ColorRA
	 * @generated
	 */
	public Adapter createColorRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.DimensionRA <em>Dimension RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.DimensionRA
	 * @generated
	 */
	public Adapter createDimensionRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.ArrayRA <em>Array RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.ArrayRA
	 * @generated
	 */
	public Adapter createArrayRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.DrawableRA <em>Drawable RA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.DrawableRA
	 * @generated
	 */
	public Adapter createDrawableRAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link droid.LayoutProperties <em>Layout Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see droid.LayoutProperties
	 * @generated
	 */
	public Adapter createLayoutPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DroidAdapterFactory
