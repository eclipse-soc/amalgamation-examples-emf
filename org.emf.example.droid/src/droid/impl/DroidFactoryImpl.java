/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.impl;

import droid.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroidFactoryImpl extends EFactoryImpl implements DroidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DroidFactory init() {
		try {
			DroidFactory theDroidFactory = (DroidFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/droid/Droid"); 
			if (theDroidFactory != null) {
				return theDroidFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DroidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroidFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DroidPackage.APPLICATION: return createApplication();
			case DroidPackage.APPLICATION_USES_SDK: return createApplicationUsesSDK();
			case DroidPackage.SCREEN: return createScreen();
			case DroidPackage.ACTION: return createAction();
			case DroidPackage.GO_TO_URL_ACTION: return createGoToURLAction();
			case DroidPackage.SHOW_LAYOUT_ACTION: return createShowLayoutAction();
			case DroidPackage.INVOKE_SCREEN_ACTION: return createInvokeScreenAction();
			case DroidPackage.LAYOUT: return createLayout();
			case DroidPackage.VIEW_COLLECTION: return createViewCollection();
			case DroidPackage.VIEW: return createView();
			case DroidPackage.WIDGET: return createWidget();
			case DroidPackage.TEXT_VIEW: return createTextView();
			case DroidPackage.BUTTON: return createButton();
			case DroidPackage.IMAGE_VIEW: return createImageView();
			case DroidPackage.SPINNER: return createSpinner();
			case DroidPackage.EDIT_TEXT: return createEditText();
			case DroidPackage.RESOURCE: return createResource();
			case DroidPackage.STRING_RESOURCE: return createStringResource();
			case DroidPackage.INTEGER_RESOURCE: return createIntegerResource();
			case DroidPackage.BOOLEAN_RESOURCE: return createBooleanResource();
			case DroidPackage.COLOR_RESOURCE: return createColorResource();
			case DroidPackage.DIMENSION_RESOURCE: return createDimensionResource();
			case DroidPackage.ARRAY_RESOURCE: return createArrayResource();
			case DroidPackage.INTEGER_ARRAY_RESOURCE: return createIntegerArrayResource();
			case DroidPackage.STRING_ARRAY_RESOURCE: return createStringArrayResource();
			case DroidPackage.DRAWABLE_RESOURCE: return createDrawableResource();
			case DroidPackage.BITMAP_DRAWABLE_RESOURCE: return createBitmapDrawableResource();
			case DroidPackage.TRANSITION_DRAWABLE_RESOURCE: return createTransitionDrawableResource();
			case DroidPackage.VALUE_ACCESS: return createValueAccess();
			case DroidPackage.ANY_DRAWABLE_VA: return createAnyDrawableVA();
			case DroidPackage.STRING_VA: return createStringVA();
			case DroidPackage.INTEGER_VA: return createIntegerVA();
			case DroidPackage.BOOLEAN_VA: return createBooleanVA();
			case DroidPackage.COLOR_VA: return createColorVA();
			case DroidPackage.DIMENSION_VA: return createDimensionVA();
			case DroidPackage.LAYOUT_DIMENSION_VA: return createLayoutDimensionVA();
			case DroidPackage.DRAWABLE_VA: return createDrawableVA();
			case DroidPackage.RESOURCE_ACCESS: return createResourceAccess();
			case DroidPackage.STRING_RA: return createStringRA();
			case DroidPackage.INTEGER_RA: return createIntegerRA();
			case DroidPackage.BOOLEAN_RA: return createBooleanRA();
			case DroidPackage.COLOR_RA: return createColorRA();
			case DroidPackage.DIMENSION_RA: return createDimensionRA();
			case DroidPackage.ARRAY_RA: return createArrayRA();
			case DroidPackage.DRAWABLE_RA: return createDrawableRA();
			case DroidPackage.LAYOUT_PROPERTIES: return createLayoutProperties();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DroidPackage.LAYOUT_DIMENSION_KIND:
				return createLayoutDimensionKindFromString(eDataType, initialValue);
			case DroidPackage.LAYOUT_VISIBILITY_KIND:
				return createLayoutVisibilityKindFromString(eDataType, initialValue);
			case DroidPackage.LAYOUT_GRAVITY_KIND:
				return createLayoutGravityKindFromString(eDataType, initialValue);
			case DroidPackage.LAYOUT_ORIENTATION_KIND:
				return createLayoutOrientationKindFromString(eDataType, initialValue);
			case DroidPackage.AUTO_LINK_KIND:
				return createAutoLinkKindFromString(eDataType, initialValue);
			case DroidPackage.CAPITALIZE_KIND:
				return createCapitalizeKindFromString(eDataType, initialValue);
			case DroidPackage.TYPEFACE_KIND:
				return createTypefaceKindFromString(eDataType, initialValue);
			case DroidPackage.TEXT_STYLE_KIND:
				return createTextStyleKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DroidPackage.LAYOUT_DIMENSION_KIND:
				return convertLayoutDimensionKindToString(eDataType, instanceValue);
			case DroidPackage.LAYOUT_VISIBILITY_KIND:
				return convertLayoutVisibilityKindToString(eDataType, instanceValue);
			case DroidPackage.LAYOUT_GRAVITY_KIND:
				return convertLayoutGravityKindToString(eDataType, instanceValue);
			case DroidPackage.LAYOUT_ORIENTATION_KIND:
				return convertLayoutOrientationKindToString(eDataType, instanceValue);
			case DroidPackage.AUTO_LINK_KIND:
				return convertAutoLinkKindToString(eDataType, instanceValue);
			case DroidPackage.CAPITALIZE_KIND:
				return convertCapitalizeKindToString(eDataType, instanceValue);
			case DroidPackage.TYPEFACE_KIND:
				return convertTypefaceKindToString(eDataType, instanceValue);
			case DroidPackage.TEXT_STYLE_KIND:
				return convertTextStyleKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUsesSDK createApplicationUsesSDK() {
		ApplicationUsesSDKImpl applicationUsesSDK = new ApplicationUsesSDKImpl();
		return applicationUsesSDK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screen createScreen() {
		ScreenImpl screen = new ScreenImpl();
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoToURLAction createGoToURLAction() {
		GoToURLActionImpl goToURLAction = new GoToURLActionImpl();
		return goToURLAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowLayoutAction createShowLayoutAction() {
		ShowLayoutActionImpl showLayoutAction = new ShowLayoutActionImpl();
		return showLayoutAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeScreenAction createInvokeScreenAction() {
		InvokeScreenActionImpl invokeScreenAction = new InvokeScreenActionImpl();
		return invokeScreenAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewCollection createViewCollection() {
		ViewCollectionImpl viewCollection = new ViewCollectionImpl();
		return viewCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextView createTextView() {
		TextViewImpl textView = new TextViewImpl();
		return textView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageView createImageView() {
		ImageViewImpl imageView = new ImageViewImpl();
		return imageView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spinner createSpinner() {
		SpinnerImpl spinner = new SpinnerImpl();
		return spinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditText createEditText() {
		EditTextImpl editText = new EditTextImpl();
		return editText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringResource createStringResource() {
		StringResourceImpl stringResource = new StringResourceImpl();
		return stringResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerResource createIntegerResource() {
		IntegerResourceImpl integerResource = new IntegerResourceImpl();
		return integerResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanResource createBooleanResource() {
		BooleanResourceImpl booleanResource = new BooleanResourceImpl();
		return booleanResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorResource createColorResource() {
		ColorResourceImpl colorResource = new ColorResourceImpl();
		return colorResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionResource createDimensionResource() {
		DimensionResourceImpl dimensionResource = new DimensionResourceImpl();
		return dimensionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayResource createArrayResource() {
		ArrayResourceImpl arrayResource = new ArrayResourceImpl();
		return arrayResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerArrayResource createIntegerArrayResource() {
		IntegerArrayResourceImpl integerArrayResource = new IntegerArrayResourceImpl();
		return integerArrayResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringArrayResource createStringArrayResource() {
		StringArrayResourceImpl stringArrayResource = new StringArrayResourceImpl();
		return stringArrayResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableResource createDrawableResource() {
		DrawableResourceImpl drawableResource = new DrawableResourceImpl();
		return drawableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitmapDrawableResource createBitmapDrawableResource() {
		BitmapDrawableResourceImpl bitmapDrawableResource = new BitmapDrawableResourceImpl();
		return bitmapDrawableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionDrawableResource createTransitionDrawableResource() {
		TransitionDrawableResourceImpl transitionDrawableResource = new TransitionDrawableResourceImpl();
		return transitionDrawableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAccess createValueAccess() {
		ValueAccessImpl valueAccess = new ValueAccessImpl();
		return valueAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyDrawableVA createAnyDrawableVA() {
		AnyDrawableVAImpl anyDrawableVA = new AnyDrawableVAImpl();
		return anyDrawableVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVA createStringVA() {
		StringVAImpl stringVA = new StringVAImpl();
		return stringVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVA createIntegerVA() {
		IntegerVAImpl integerVA = new IntegerVAImpl();
		return integerVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVA createBooleanVA() {
		BooleanVAImpl booleanVA = new BooleanVAImpl();
		return booleanVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorVA createColorVA() {
		ColorVAImpl colorVA = new ColorVAImpl();
		return colorVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionVA createDimensionVA() {
		DimensionVAImpl dimensionVA = new DimensionVAImpl();
		return dimensionVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDimensionVA createLayoutDimensionVA() {
		LayoutDimensionVAImpl layoutDimensionVA = new LayoutDimensionVAImpl();
		return layoutDimensionVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableVA createDrawableVA() {
		DrawableVAImpl drawableVA = new DrawableVAImpl();
		return drawableVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAccess createResourceAccess() {
		ResourceAccessImpl resourceAccess = new ResourceAccessImpl();
		return resourceAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringRA createStringRA() {
		StringRAImpl stringRA = new StringRAImpl();
		return stringRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerRA createIntegerRA() {
		IntegerRAImpl integerRA = new IntegerRAImpl();
		return integerRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanRA createBooleanRA() {
		BooleanRAImpl booleanRA = new BooleanRAImpl();
		return booleanRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorRA createColorRA() {
		ColorRAImpl colorRA = new ColorRAImpl();
		return colorRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionRA createDimensionRA() {
		DimensionRAImpl dimensionRA = new DimensionRAImpl();
		return dimensionRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayRA createArrayRA() {
		ArrayRAImpl arrayRA = new ArrayRAImpl();
		return arrayRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawableRA createDrawableRA() {
		DrawableRAImpl drawableRA = new DrawableRAImpl();
		return drawableRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutProperties createLayoutProperties() {
		LayoutPropertiesImpl layoutProperties = new LayoutPropertiesImpl();
		return layoutProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDimensionKind createLayoutDimensionKindFromString(EDataType eDataType, String initialValue) {
		LayoutDimensionKind result = LayoutDimensionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutDimensionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutVisibilityKind createLayoutVisibilityKindFromString(EDataType eDataType, String initialValue) {
		LayoutVisibilityKind result = LayoutVisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutGravityKind createLayoutGravityKindFromString(EDataType eDataType, String initialValue) {
		LayoutGravityKind result = LayoutGravityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutGravityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutOrientationKind createLayoutOrientationKindFromString(EDataType eDataType, String initialValue) {
		LayoutOrientationKind result = LayoutOrientationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutOrientationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoLinkKind createAutoLinkKindFromString(EDataType eDataType, String initialValue) {
		AutoLinkKind result = AutoLinkKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutoLinkKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapitalizeKind createCapitalizeKindFromString(EDataType eDataType, String initialValue) {
		CapitalizeKind result = CapitalizeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapitalizeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypefaceKind createTypefaceKindFromString(EDataType eDataType, String initialValue) {
		TypefaceKind result = TypefaceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypefaceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyleKind createTextStyleKindFromString(EDataType eDataType, String initialValue) {
		TextStyleKind result = TextStyleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextStyleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroidPackage getDroidPackage() {
		return (DroidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DroidPackage getPackage() {
		return DroidPackage.eINSTANCE;
	}

} //DroidFactoryImpl
