/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.impl;

import droid.Action;
import droid.AnyDrawableVA;
import droid.Application;
import droid.ApplicationUsesSDK;
import droid.ArrayRA;
import droid.ArrayResource;
import droid.AutoLinkKind;
import droid.BitmapDrawableResource;
import droid.BooleanRA;
import droid.BooleanResource;
import droid.BooleanVA;
import droid.Button;
import droid.CapitalizeKind;
import droid.ColorRA;
import droid.ColorResource;
import droid.ColorVA;
import droid.DimensionRA;
import droid.DimensionResource;
import droid.DimensionVA;
import droid.DrawableRA;
import droid.DrawableResource;
import droid.DrawableVA;
import droid.DroidFactory;
import droid.DroidPackage;
import droid.EditText;
import droid.GoToURLAction;
import droid.ImageView;
import droid.IntegerArrayResource;
import droid.IntegerRA;
import droid.IntegerResource;
import droid.IntegerVA;
import droid.InvokeScreenAction;
import droid.Layout;
import droid.LayoutDimensionKind;
import droid.LayoutDimensionVA;
import droid.LayoutGravityKind;
import droid.LayoutOrientationKind;
import droid.LayoutProperties;
import droid.LayoutVisibilityKind;
import droid.Resource;
import droid.ResourceAccess;
import droid.Screen;
import droid.ShowLayoutAction;
import droid.Spinner;
import droid.StringArrayResource;
import droid.StringRA;
import droid.StringResource;
import droid.StringVA;
import droid.TextStyleKind;
import droid.TextView;
import droid.TransitionDrawableResource;
import droid.TypefaceKind;
import droid.ValueAccess;
import droid.View;
import droid.ViewCollection;
import droid.Widget;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroidPackageImpl extends EPackageImpl implements DroidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationUsesSDKEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goToURLActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showLayoutActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invokeScreenActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spinnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerArrayResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringArrayResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawableResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitmapDrawableResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionDrawableResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyDrawableVAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorVAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionVAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutDimensionVAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawableVAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawableRAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutDimensionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutVisibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutGravityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layoutOrientationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum autoLinkKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capitalizeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typefaceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textStyleKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see droid.DroidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DroidPackageImpl() {
		super(eNS_URI, DroidFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DroidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DroidPackage init() {
		if (isInited) return (DroidPackage)EPackage.Registry.INSTANCE.getEPackage(DroidPackage.eNS_URI);

		// Obtain or create and register package
		DroidPackageImpl theDroidPackage = (DroidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DroidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DroidPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDroidPackage.createPackageContents();

		// Initialize created meta-data
		theDroidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDroidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DroidPackage.eNS_URI, theDroidPackage);
		return theDroidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_PackageName() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_VersionCode() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_VersionName() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_SdkVersion() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Screens() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Layouts() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Resources() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationUsesSDK() {
		return applicationUsesSDKEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationUsesSDK_MinSdkVersion() {
		return (EAttribute)applicationUsesSDKEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationUsesSDK_MaxSdkVersion() {
		return (EAttribute)applicationUsesSDKEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationUsesSDK_TargetSdkVersion() {
		return (EAttribute)applicationUsesSDKEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreen() {
		return screenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreen_Name() {
		return (EAttribute)screenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreen_Layout() {
		return (EReference)screenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreen_Widgets() {
		return (EReference)screenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoToURLAction() {
		return goToURLActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoToURLAction_Url() {
		return (EAttribute)goToURLActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShowLayoutAction() {
		return showLayoutActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShowLayoutAction_Layout() {
		return (EReference)showLayoutActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvokeScreenAction() {
		return invokeScreenActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvokeScreenAction_Screen() {
		return (EReference)invokeScreenActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_IsRelative() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Alpha() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_MinHeight() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_MinWidth() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_NextFocusDown() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_NextFocusLeft() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_NextFocusRight() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_NextFocusUp() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Padding() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_PaddingBottom() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_PaddingLeft() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_PaddingRight() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_PaddingTop() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Rotation() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_RotationX() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_RotationY() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_SaveEnabled() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_ScaleX() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_ScaleY() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_ScrollX() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_ScrollY() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Scrollbars() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_TransformPivotX() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_TransformPivotY() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_TranslationX() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_TranslationY() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Visibility() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Gravity() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Orientation() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Views() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewCollection() {
		return viewCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewCollection_Views() {
		return (EReference)viewCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Name() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Background() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_OnClick() {
		return (EReference)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_LayoutProperties() {
		return (EReference)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Top() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Left() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Width() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Height() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidget_Clickable() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextView() {
		return textViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_Text() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_FadeScrollBars() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_IsScrollContainer() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextView_AutoLink() {
		return (EAttribute)textViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_AutoText() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextView_Capitalize() {
		return (EAttribute)textViewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_Digits() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_Editable() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextView_Gravity() {
		return (EAttribute)textViewEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_Hint() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_Numeric() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_Password() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_PhoneNumber() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_SingleLine() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_TextColor() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextView_Typeface() {
		return (EAttribute)textViewEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextView_TextSize() {
		return (EReference)textViewEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextView_TextStyle() {
		return (EAttribute)textViewEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_Text() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_Src() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_Hint() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageView() {
		return imageViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageView_Src() {
		return (EReference)imageViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageView_FadeScrollBars() {
		return (EReference)imageViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageView_IsScrollContainer() {
		return (EReference)imageViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpinner() {
		return spinnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpinner_Prompt() {
		return (EReference)spinnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpinner_FadeScrollBars() {
		return (EReference)spinnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpinner_IsScrollContainer() {
		return (EReference)spinnerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditText() {
		return editTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_Text() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_FadeScrollBars() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_IsScrollContainer() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditText_AutoLink() {
		return (EAttribute)editTextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_AutoText() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditText_Capitalize() {
		return (EAttribute)editTextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_Digits() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_Editable() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditText_Gravity() {
		return (EAttribute)editTextEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_Hint() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_Numeric() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_Password() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_PhoneNumber() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_SingleLine() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_TextColor() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditText_Typeface() {
		return (EAttribute)editTextEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditText_TextSize() {
		return (EReference)editTextEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditText_TextStyle() {
		return (EAttribute)editTextEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringResource() {
		return stringResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringResource_Value() {
		return (EAttribute)stringResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerResource() {
		return integerResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerResource_Value() {
		return (EAttribute)integerResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanResource() {
		return booleanResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanResource_Value() {
		return (EAttribute)booleanResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorResource() {
		return colorResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorResource_Value() {
		return (EAttribute)colorResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionResource() {
		return dimensionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionResource_Value() {
		return (EAttribute)dimensionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayResource() {
		return arrayResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerArrayResource() {
		return integerArrayResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerArrayResource_Items() {
		return (EAttribute)integerArrayResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringArrayResource() {
		return stringArrayResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringArrayResource_Items() {
		return (EAttribute)stringArrayResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawableResource() {
		return drawableResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitmapDrawableResource() {
		return bitmapDrawableResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapDrawableResource_Filename() {
		return (EAttribute)bitmapDrawableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionDrawableResource() {
		return transitionDrawableResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionDrawableResource_From() {
		return (EReference)transitionDrawableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionDrawableResource_To() {
		return (EReference)transitionDrawableResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueAccess() {
		return valueAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyDrawableVA() {
		return anyDrawableVAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVA() {
		return stringVAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVA_Value() {
		return (EAttribute)stringVAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVA() {
		return integerVAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVA_Value() {
		return (EAttribute)integerVAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVA() {
		return booleanVAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanVA_Value() {
		return (EAttribute)booleanVAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorVA() {
		return colorVAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorVA_Value() {
		return (EAttribute)colorVAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionVA() {
		return dimensionVAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionVA_Value() {
		return (EAttribute)dimensionVAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutDimensionVA() {
		return layoutDimensionVAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutDimensionVA_Const_value() {
		return (EAttribute)layoutDimensionVAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawableVA() {
		return drawableVAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAccess() {
		return resourceAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccess_Package() {
		return (EAttribute)resourceAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccess_ExternalResource() {
		return (EAttribute)resourceAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringRA() {
		return stringRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringRA_Resource() {
		return (EReference)stringRAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerRA() {
		return integerRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerRA_Resource() {
		return (EReference)integerRAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanRA() {
		return booleanRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanRA_Resource() {
		return (EReference)booleanRAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorRA() {
		return colorRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColorRA_Resource() {
		return (EReference)colorRAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionRA() {
		return dimensionRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionRA_Resource() {
		return (EReference)dimensionRAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayRA() {
		return arrayRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayRA_Package() {
		return (EAttribute)arrayRAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayRA_Resource() {
		return (EReference)arrayRAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayRA_ExternalResource() {
		return (EAttribute)arrayRAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawableRA() {
		return drawableRAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawableRA_Resource() {
		return (EReference)drawableRAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutProperties() {
		return layoutPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_height() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_width() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_weight() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_marginBottom() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_marginLeft() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_marginRight() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_marginTop() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_above() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignBaseline() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignBottom() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignLeft() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignParentBottom() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignParentLeft() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignParentRight() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignParentTop() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignTop() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_alignWithParentIfMissing() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_below() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_centerHorizontal() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_centerInParent() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_centerVertical() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_toLeftOf() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutProperties_Layout_toRightOf() {
		return (EReference)layoutPropertiesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayoutDimensionKind() {
		return layoutDimensionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayoutVisibilityKind() {
		return layoutVisibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayoutGravityKind() {
		return layoutGravityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayoutOrientationKind() {
		return layoutOrientationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAutoLinkKind() {
		return autoLinkKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCapitalizeKind() {
		return capitalizeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypefaceKind() {
		return typefaceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextStyleKind() {
		return textStyleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroidFactory getDroidFactory() {
		return (DroidFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__PACKAGE_NAME);
		createEAttribute(applicationEClass, APPLICATION__VERSION_CODE);
		createEAttribute(applicationEClass, APPLICATION__VERSION_NAME);
		createEReference(applicationEClass, APPLICATION__SDK_VERSION);
		createEReference(applicationEClass, APPLICATION__SCREENS);
		createEReference(applicationEClass, APPLICATION__LAYOUTS);
		createEReference(applicationEClass, APPLICATION__RESOURCES);

		applicationUsesSDKEClass = createEClass(APPLICATION_USES_SDK);
		createEAttribute(applicationUsesSDKEClass, APPLICATION_USES_SDK__MIN_SDK_VERSION);
		createEAttribute(applicationUsesSDKEClass, APPLICATION_USES_SDK__MAX_SDK_VERSION);
		createEAttribute(applicationUsesSDKEClass, APPLICATION_USES_SDK__TARGET_SDK_VERSION);

		screenEClass = createEClass(SCREEN);
		createEAttribute(screenEClass, SCREEN__NAME);
		createEReference(screenEClass, SCREEN__LAYOUT);
		createEReference(screenEClass, SCREEN__WIDGETS);

		actionEClass = createEClass(ACTION);

		goToURLActionEClass = createEClass(GO_TO_URL_ACTION);
		createEAttribute(goToURLActionEClass, GO_TO_URL_ACTION__URL);

		showLayoutActionEClass = createEClass(SHOW_LAYOUT_ACTION);
		createEReference(showLayoutActionEClass, SHOW_LAYOUT_ACTION__LAYOUT);

		invokeScreenActionEClass = createEClass(INVOKE_SCREEN_ACTION);
		createEReference(invokeScreenActionEClass, INVOKE_SCREEN_ACTION__SCREEN);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__IS_RELATIVE);
		createEAttribute(layoutEClass, LAYOUT__ALPHA);
		createEReference(layoutEClass, LAYOUT__MIN_HEIGHT);
		createEReference(layoutEClass, LAYOUT__MIN_WIDTH);
		createEReference(layoutEClass, LAYOUT__NEXT_FOCUS_DOWN);
		createEReference(layoutEClass, LAYOUT__NEXT_FOCUS_LEFT);
		createEReference(layoutEClass, LAYOUT__NEXT_FOCUS_RIGHT);
		createEReference(layoutEClass, LAYOUT__NEXT_FOCUS_UP);
		createEReference(layoutEClass, LAYOUT__PADDING);
		createEReference(layoutEClass, LAYOUT__PADDING_BOTTOM);
		createEReference(layoutEClass, LAYOUT__PADDING_LEFT);
		createEReference(layoutEClass, LAYOUT__PADDING_RIGHT);
		createEReference(layoutEClass, LAYOUT__PADDING_TOP);
		createEReference(layoutEClass, LAYOUT__ROTATION);
		createEReference(layoutEClass, LAYOUT__ROTATION_X);
		createEReference(layoutEClass, LAYOUT__ROTATION_Y);
		createEReference(layoutEClass, LAYOUT__SAVE_ENABLED);
		createEReference(layoutEClass, LAYOUT__SCALE_X);
		createEReference(layoutEClass, LAYOUT__SCALE_Y);
		createEReference(layoutEClass, LAYOUT__SCROLL_X);
		createEReference(layoutEClass, LAYOUT__SCROLL_Y);
		createEReference(layoutEClass, LAYOUT__SCROLLBARS);
		createEReference(layoutEClass, LAYOUT__TRANSFORM_PIVOT_X);
		createEReference(layoutEClass, LAYOUT__TRANSFORM_PIVOT_Y);
		createEReference(layoutEClass, LAYOUT__TRANSLATION_X);
		createEReference(layoutEClass, LAYOUT__TRANSLATION_Y);
		createEAttribute(layoutEClass, LAYOUT__VISIBILITY);
		createEAttribute(layoutEClass, LAYOUT__GRAVITY);
		createEAttribute(layoutEClass, LAYOUT__ORIENTATION);
		createEReference(layoutEClass, LAYOUT__VIEWS);

		viewCollectionEClass = createEClass(VIEW_COLLECTION);
		createEReference(viewCollectionEClass, VIEW_COLLECTION__VIEWS);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__NAME);
		createEReference(viewEClass, VIEW__BACKGROUND);
		createEReference(viewEClass, VIEW__ON_CLICK);
		createEReference(viewEClass, VIEW__LAYOUT_PROPERTIES);

		widgetEClass = createEClass(WIDGET);
		createEReference(widgetEClass, WIDGET__TOP);
		createEReference(widgetEClass, WIDGET__LEFT);
		createEReference(widgetEClass, WIDGET__WIDTH);
		createEReference(widgetEClass, WIDGET__HEIGHT);
		createEReference(widgetEClass, WIDGET__CLICKABLE);

		textViewEClass = createEClass(TEXT_VIEW);
		createEReference(textViewEClass, TEXT_VIEW__TEXT);
		createEReference(textViewEClass, TEXT_VIEW__FADE_SCROLL_BARS);
		createEReference(textViewEClass, TEXT_VIEW__IS_SCROLL_CONTAINER);
		createEAttribute(textViewEClass, TEXT_VIEW__AUTO_LINK);
		createEReference(textViewEClass, TEXT_VIEW__AUTO_TEXT);
		createEAttribute(textViewEClass, TEXT_VIEW__CAPITALIZE);
		createEReference(textViewEClass, TEXT_VIEW__DIGITS);
		createEReference(textViewEClass, TEXT_VIEW__EDITABLE);
		createEAttribute(textViewEClass, TEXT_VIEW__GRAVITY);
		createEReference(textViewEClass, TEXT_VIEW__HINT);
		createEReference(textViewEClass, TEXT_VIEW__NUMERIC);
		createEReference(textViewEClass, TEXT_VIEW__PASSWORD);
		createEReference(textViewEClass, TEXT_VIEW__PHONE_NUMBER);
		createEReference(textViewEClass, TEXT_VIEW__SINGLE_LINE);
		createEReference(textViewEClass, TEXT_VIEW__TEXT_COLOR);
		createEAttribute(textViewEClass, TEXT_VIEW__TYPEFACE);
		createEReference(textViewEClass, TEXT_VIEW__TEXT_SIZE);
		createEAttribute(textViewEClass, TEXT_VIEW__TEXT_STYLE);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__TEXT);
		createEReference(buttonEClass, BUTTON__SRC);
		createEReference(buttonEClass, BUTTON__HINT);

		imageViewEClass = createEClass(IMAGE_VIEW);
		createEReference(imageViewEClass, IMAGE_VIEW__SRC);
		createEReference(imageViewEClass, IMAGE_VIEW__FADE_SCROLL_BARS);
		createEReference(imageViewEClass, IMAGE_VIEW__IS_SCROLL_CONTAINER);

		spinnerEClass = createEClass(SPINNER);
		createEReference(spinnerEClass, SPINNER__PROMPT);
		createEReference(spinnerEClass, SPINNER__FADE_SCROLL_BARS);
		createEReference(spinnerEClass, SPINNER__IS_SCROLL_CONTAINER);

		editTextEClass = createEClass(EDIT_TEXT);
		createEReference(editTextEClass, EDIT_TEXT__TEXT);
		createEReference(editTextEClass, EDIT_TEXT__FADE_SCROLL_BARS);
		createEReference(editTextEClass, EDIT_TEXT__IS_SCROLL_CONTAINER);
		createEAttribute(editTextEClass, EDIT_TEXT__AUTO_LINK);
		createEReference(editTextEClass, EDIT_TEXT__AUTO_TEXT);
		createEAttribute(editTextEClass, EDIT_TEXT__CAPITALIZE);
		createEReference(editTextEClass, EDIT_TEXT__DIGITS);
		createEReference(editTextEClass, EDIT_TEXT__EDITABLE);
		createEAttribute(editTextEClass, EDIT_TEXT__GRAVITY);
		createEReference(editTextEClass, EDIT_TEXT__HINT);
		createEReference(editTextEClass, EDIT_TEXT__NUMERIC);
		createEReference(editTextEClass, EDIT_TEXT__PASSWORD);
		createEReference(editTextEClass, EDIT_TEXT__PHONE_NUMBER);
		createEReference(editTextEClass, EDIT_TEXT__SINGLE_LINE);
		createEReference(editTextEClass, EDIT_TEXT__TEXT_COLOR);
		createEAttribute(editTextEClass, EDIT_TEXT__TYPEFACE);
		createEReference(editTextEClass, EDIT_TEXT__TEXT_SIZE);
		createEAttribute(editTextEClass, EDIT_TEXT__TEXT_STYLE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);

		stringResourceEClass = createEClass(STRING_RESOURCE);
		createEAttribute(stringResourceEClass, STRING_RESOURCE__VALUE);

		integerResourceEClass = createEClass(INTEGER_RESOURCE);
		createEAttribute(integerResourceEClass, INTEGER_RESOURCE__VALUE);

		booleanResourceEClass = createEClass(BOOLEAN_RESOURCE);
		createEAttribute(booleanResourceEClass, BOOLEAN_RESOURCE__VALUE);

		colorResourceEClass = createEClass(COLOR_RESOURCE);
		createEAttribute(colorResourceEClass, COLOR_RESOURCE__VALUE);

		dimensionResourceEClass = createEClass(DIMENSION_RESOURCE);
		createEAttribute(dimensionResourceEClass, DIMENSION_RESOURCE__VALUE);

		arrayResourceEClass = createEClass(ARRAY_RESOURCE);

		integerArrayResourceEClass = createEClass(INTEGER_ARRAY_RESOURCE);
		createEAttribute(integerArrayResourceEClass, INTEGER_ARRAY_RESOURCE__ITEMS);

		stringArrayResourceEClass = createEClass(STRING_ARRAY_RESOURCE);
		createEAttribute(stringArrayResourceEClass, STRING_ARRAY_RESOURCE__ITEMS);

		drawableResourceEClass = createEClass(DRAWABLE_RESOURCE);

		bitmapDrawableResourceEClass = createEClass(BITMAP_DRAWABLE_RESOURCE);
		createEAttribute(bitmapDrawableResourceEClass, BITMAP_DRAWABLE_RESOURCE__FILENAME);

		transitionDrawableResourceEClass = createEClass(TRANSITION_DRAWABLE_RESOURCE);
		createEReference(transitionDrawableResourceEClass, TRANSITION_DRAWABLE_RESOURCE__FROM);
		createEReference(transitionDrawableResourceEClass, TRANSITION_DRAWABLE_RESOURCE__TO);

		valueAccessEClass = createEClass(VALUE_ACCESS);

		anyDrawableVAEClass = createEClass(ANY_DRAWABLE_VA);

		stringVAEClass = createEClass(STRING_VA);
		createEAttribute(stringVAEClass, STRING_VA__VALUE);

		integerVAEClass = createEClass(INTEGER_VA);
		createEAttribute(integerVAEClass, INTEGER_VA__VALUE);

		booleanVAEClass = createEClass(BOOLEAN_VA);
		createEAttribute(booleanVAEClass, BOOLEAN_VA__VALUE);

		colorVAEClass = createEClass(COLOR_VA);
		createEAttribute(colorVAEClass, COLOR_VA__VALUE);

		dimensionVAEClass = createEClass(DIMENSION_VA);
		createEAttribute(dimensionVAEClass, DIMENSION_VA__VALUE);

		layoutDimensionVAEClass = createEClass(LAYOUT_DIMENSION_VA);
		createEAttribute(layoutDimensionVAEClass, LAYOUT_DIMENSION_VA__CONST_VALUE);

		drawableVAEClass = createEClass(DRAWABLE_VA);

		resourceAccessEClass = createEClass(RESOURCE_ACCESS);
		createEAttribute(resourceAccessEClass, RESOURCE_ACCESS__PACKAGE);
		createEAttribute(resourceAccessEClass, RESOURCE_ACCESS__EXTERNAL_RESOURCE);

		stringRAEClass = createEClass(STRING_RA);
		createEReference(stringRAEClass, STRING_RA__RESOURCE);

		integerRAEClass = createEClass(INTEGER_RA);
		createEReference(integerRAEClass, INTEGER_RA__RESOURCE);

		booleanRAEClass = createEClass(BOOLEAN_RA);
		createEReference(booleanRAEClass, BOOLEAN_RA__RESOURCE);

		colorRAEClass = createEClass(COLOR_RA);
		createEReference(colorRAEClass, COLOR_RA__RESOURCE);

		dimensionRAEClass = createEClass(DIMENSION_RA);
		createEReference(dimensionRAEClass, DIMENSION_RA__RESOURCE);

		arrayRAEClass = createEClass(ARRAY_RA);
		createEAttribute(arrayRAEClass, ARRAY_RA__PACKAGE);
		createEReference(arrayRAEClass, ARRAY_RA__RESOURCE);
		createEAttribute(arrayRAEClass, ARRAY_RA__EXTERNAL_RESOURCE);

		drawableRAEClass = createEClass(DRAWABLE_RA);
		createEReference(drawableRAEClass, DRAWABLE_RA__RESOURCE);

		layoutPropertiesEClass = createEClass(LAYOUT_PROPERTIES);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_HEIGHT);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_WIDTH);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_WEIGHT);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_MARGIN_BOTTOM);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_MARGIN_LEFT);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_MARGIN_RIGHT);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_MARGIN_TOP);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ABOVE);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_BASELINE);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_BOTTOM);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_LEFT);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_BOTTOM);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_LEFT);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_RIGHT);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_TOP);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_TOP);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_BELOW);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_CENTER_HORIZONTAL);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_CENTER_IN_PARENT);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_CENTER_VERTICAL);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_TO_LEFT_OF);
		createEReference(layoutPropertiesEClass, LAYOUT_PROPERTIES__LAYOUT_TO_RIGHT_OF);

		// Create enums
		layoutDimensionKindEEnum = createEEnum(LAYOUT_DIMENSION_KIND);
		layoutVisibilityKindEEnum = createEEnum(LAYOUT_VISIBILITY_KIND);
		layoutGravityKindEEnum = createEEnum(LAYOUT_GRAVITY_KIND);
		layoutOrientationKindEEnum = createEEnum(LAYOUT_ORIENTATION_KIND);
		autoLinkKindEEnum = createEEnum(AUTO_LINK_KIND);
		capitalizeKindEEnum = createEEnum(CAPITALIZE_KIND);
		typefaceKindEEnum = createEEnum(TYPEFACE_KIND);
		textStyleKindEEnum = createEEnum(TEXT_STYLE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		goToURLActionEClass.getESuperTypes().add(this.getAction());
		showLayoutActionEClass.getESuperTypes().add(this.getAction());
		invokeScreenActionEClass.getESuperTypes().add(this.getAction());
		layoutEClass.getESuperTypes().add(this.getView());
		widgetEClass.getESuperTypes().add(this.getView());
		textViewEClass.getESuperTypes().add(this.getWidget());
		buttonEClass.getESuperTypes().add(this.getWidget());
		imageViewEClass.getESuperTypes().add(this.getWidget());
		spinnerEClass.getESuperTypes().add(this.getWidget());
		editTextEClass.getESuperTypes().add(this.getWidget());
		stringResourceEClass.getESuperTypes().add(this.getResource());
		integerResourceEClass.getESuperTypes().add(this.getResource());
		booleanResourceEClass.getESuperTypes().add(this.getResource());
		colorResourceEClass.getESuperTypes().add(this.getResource());
		dimensionResourceEClass.getESuperTypes().add(this.getResource());
		arrayResourceEClass.getESuperTypes().add(this.getResource());
		integerArrayResourceEClass.getESuperTypes().add(this.getArrayResource());
		stringArrayResourceEClass.getESuperTypes().add(this.getArrayResource());
		drawableResourceEClass.getESuperTypes().add(this.getResource());
		bitmapDrawableResourceEClass.getESuperTypes().add(this.getDrawableResource());
		transitionDrawableResourceEClass.getESuperTypes().add(this.getDrawableResource());
		anyDrawableVAEClass.getESuperTypes().add(this.getValueAccess());
		stringVAEClass.getESuperTypes().add(this.getValueAccess());
		integerVAEClass.getESuperTypes().add(this.getValueAccess());
		booleanVAEClass.getESuperTypes().add(this.getValueAccess());
		colorVAEClass.getESuperTypes().add(this.getAnyDrawableVA());
		dimensionVAEClass.getESuperTypes().add(this.getValueAccess());
		dimensionVAEClass.getESuperTypes().add(this.getLayoutDimensionVA());
		layoutDimensionVAEClass.getESuperTypes().add(this.getValueAccess());
		drawableVAEClass.getESuperTypes().add(this.getAnyDrawableVA());
		resourceAccessEClass.getESuperTypes().add(this.getValueAccess());
		stringRAEClass.getESuperTypes().add(this.getStringVA());
		stringRAEClass.getESuperTypes().add(this.getResourceAccess());
		integerRAEClass.getESuperTypes().add(this.getIntegerVA());
		integerRAEClass.getESuperTypes().add(this.getResourceAccess());
		booleanRAEClass.getESuperTypes().add(this.getBooleanVA());
		booleanRAEClass.getESuperTypes().add(this.getResourceAccess());
		colorRAEClass.getESuperTypes().add(this.getColorVA());
		colorRAEClass.getESuperTypes().add(this.getResourceAccess());
		dimensionRAEClass.getESuperTypes().add(this.getDimensionVA());
		dimensionRAEClass.getESuperTypes().add(this.getResourceAccess());
		drawableRAEClass.getESuperTypes().add(this.getDrawableVA());
		drawableRAEClass.getESuperTypes().add(this.getResourceAccess());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_VersionCode(), ecorePackage.getEInt(), "versionCode", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_VersionName(), ecorePackage.getEString(), "versionName", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_SdkVersion(), this.getApplicationUsesSDK(), null, "sdkVersion", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Screens(), this.getScreen(), null, "screens", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Layouts(), this.getLayout(), null, "layouts", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Resources(), this.getResource(), null, "resources", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationUsesSDKEClass, ApplicationUsesSDK.class, "ApplicationUsesSDK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationUsesSDK_MinSdkVersion(), ecorePackage.getEInt(), "minSdkVersion", null, 0, 1, ApplicationUsesSDK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationUsesSDK_MaxSdkVersion(), ecorePackage.getEInt(), "maxSdkVersion", null, 0, 1, ApplicationUsesSDK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationUsesSDK_TargetSdkVersion(), ecorePackage.getEInt(), "targetSdkVersion", null, 0, 1, ApplicationUsesSDK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenEClass, Screen.class, "Screen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScreen_Name(), ecorePackage.getEString(), "name", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreen_Layout(), this.getLayout(), null, "layout", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreen_Widgets(), this.getViewCollection(), null, "widgets", null, 0, 1, Screen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goToURLActionEClass, GoToURLAction.class, "GoToURLAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoToURLAction_Url(), ecorePackage.getEString(), "url", null, 0, 1, GoToURLAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showLayoutActionEClass, ShowLayoutAction.class, "ShowLayoutAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShowLayoutAction_Layout(), this.getLayout(), null, "layout", null, 0, 1, ShowLayoutAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeScreenActionEClass, InvokeScreenAction.class, "InvokeScreenAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvokeScreenAction_Screen(), this.getScreen(), null, "screen", null, 0, 1, InvokeScreenAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_IsRelative(), ecorePackage.getEBoolean(), "isRelative", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Alpha(), ecorePackage.getEString(), "alpha", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_MinHeight(), this.getDimensionVA(), null, "minHeight", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_MinWidth(), this.getDimensionVA(), null, "minWidth", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_NextFocusDown(), this.getView(), null, "nextFocusDown", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_NextFocusLeft(), this.getView(), null, "nextFocusLeft", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_NextFocusRight(), this.getView(), null, "nextFocusRight", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_NextFocusUp(), this.getView(), null, "nextFocusUp", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Padding(), this.getDimensionVA(), null, "padding", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_PaddingBottom(), this.getDimensionVA(), null, "paddingBottom", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_PaddingLeft(), this.getDimensionVA(), null, "paddingLeft", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_PaddingRight(), this.getDimensionVA(), null, "paddingRight", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_PaddingTop(), this.getDimensionVA(), null, "paddingTop", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Rotation(), this.getDimensionVA(), null, "rotation", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_RotationX(), this.getDimensionVA(), null, "rotationX", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_RotationY(), this.getDimensionVA(), null, "rotationY", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_SaveEnabled(), this.getBooleanVA(), null, "saveEnabled", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_ScaleX(), this.getDimensionVA(), null, "scaleX", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_ScaleY(), this.getDimensionVA(), null, "scaleY", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_ScrollX(), this.getDimensionVA(), null, "scrollX", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_ScrollY(), this.getDimensionVA(), null, "scrollY", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Scrollbars(), this.getBooleanVA(), null, "scrollbars", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_TransformPivotX(), this.getDimensionVA(), null, "transformPivotX", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_TransformPivotY(), this.getDimensionVA(), null, "transformPivotY", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_TranslationX(), this.getDimensionVA(), null, "translationX", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_TranslationY(), this.getDimensionVA(), null, "translationY", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Visibility(), this.getLayoutVisibilityKind(), "visibility", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Gravity(), this.getLayoutGravityKind(), "gravity", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Orientation(), this.getLayoutOrientationKind(), "orientation", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Views(), this.getViewCollection(), null, "views", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewCollectionEClass, ViewCollection.class, "ViewCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewCollection_Views(), this.getView(), null, "views", null, 0, -1, ViewCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Background(), this.getAnyDrawableVA(), null, "background", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_OnClick(), this.getAction(), null, "onClick", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_LayoutProperties(), this.getLayoutProperties(), null, "layoutProperties", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidget_Top(), this.getDimensionVA(), null, "top", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Left(), this.getDimensionVA(), null, "left", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Width(), this.getDimensionVA(), null, "width", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Height(), this.getDimensionVA(), null, "height", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Clickable(), this.getBooleanVA(), null, "clickable", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textViewEClass, TextView.class, "TextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextView_Text(), this.getStringVA(), null, "text", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_FadeScrollBars(), this.getBooleanVA(), null, "fadeScrollBars", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_IsScrollContainer(), this.getBooleanVA(), null, "isScrollContainer", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextView_AutoLink(), this.getAutoLinkKind(), "autoLink", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_AutoText(), this.getBooleanVA(), null, "autoText", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextView_Capitalize(), this.getCapitalizeKind(), "capitalize", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_Digits(), this.getStringVA(), null, "digits", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_Editable(), this.getBooleanVA(), null, "editable", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextView_Gravity(), this.getLayoutGravityKind(), "gravity", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_Hint(), this.getStringVA(), null, "hint", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_Numeric(), this.getBooleanVA(), null, "numeric", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_Password(), this.getBooleanVA(), null, "password", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_PhoneNumber(), this.getBooleanVA(), null, "phoneNumber", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_SingleLine(), this.getBooleanVA(), null, "singleLine", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_TextColor(), this.getColorVA(), null, "textColor", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextView_Typeface(), this.getTypefaceKind(), "typeface", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextView_TextSize(), this.getDimensionVA(), null, "textSize", null, 0, 1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextView_TextStyle(), this.getTextStyleKind(), "textStyle", null, 0, -1, TextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_Text(), this.getStringVA(), null, "text", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButton_Src(), this.getAnyDrawableVA(), null, "src", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButton_Hint(), this.getStringVA(), null, "hint", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageViewEClass, ImageView.class, "ImageView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageView_Src(), this.getAnyDrawableVA(), null, "src", null, 0, 1, ImageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageView_FadeScrollBars(), this.getBooleanVA(), null, "fadeScrollBars", null, 0, 1, ImageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageView_IsScrollContainer(), this.getBooleanVA(), null, "isScrollContainer", null, 0, 1, ImageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spinnerEClass, Spinner.class, "Spinner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpinner_Prompt(), this.getStringVA(), null, "prompt", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpinner_FadeScrollBars(), this.getBooleanVA(), null, "fadeScrollBars", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpinner_IsScrollContainer(), this.getBooleanVA(), null, "isScrollContainer", null, 0, 1, Spinner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editTextEClass, EditText.class, "EditText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditText_Text(), this.getStringVA(), null, "text", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_FadeScrollBars(), this.getBooleanVA(), null, "fadeScrollBars", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_IsScrollContainer(), this.getBooleanVA(), null, "isScrollContainer", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditText_AutoLink(), this.getAutoLinkKind(), "autoLink", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_AutoText(), this.getBooleanVA(), null, "autoText", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditText_Capitalize(), this.getCapitalizeKind(), "capitalize", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_Digits(), this.getStringVA(), null, "digits", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_Editable(), this.getBooleanVA(), null, "editable", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditText_Gravity(), this.getLayoutGravityKind(), "gravity", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_Hint(), this.getStringVA(), null, "hint", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_Numeric(), this.getBooleanVA(), null, "numeric", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_Password(), this.getBooleanVA(), null, "password", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_PhoneNumber(), this.getBooleanVA(), null, "phoneNumber", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_SingleLine(), this.getBooleanVA(), null, "singleLine", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_TextColor(), this.getColorVA(), null, "textColor", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditText_Typeface(), this.getTypefaceKind(), "typeface", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditText_TextSize(), this.getDimensionVA(), null, "textSize", null, 0, 1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditText_TextStyle(), this.getTextStyleKind(), "textStyle", null, 0, -1, EditText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringResourceEClass, StringResource.class, "StringResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerResourceEClass, IntegerResource.class, "IntegerResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerResource_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanResourceEClass, BooleanResource.class, "BooleanResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorResourceEClass, ColorResource.class, "ColorResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, ColorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionResourceEClass, DimensionResource.class, "DimensionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionResource_Value(), ecorePackage.getEString(), "value", null, 0, 1, DimensionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayResourceEClass, ArrayResource.class, "ArrayResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerArrayResourceEClass, IntegerArrayResource.class, "IntegerArrayResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerArrayResource_Items(), ecorePackage.getEInt(), "items", null, 0, -1, IntegerArrayResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringArrayResourceEClass, StringArrayResource.class, "StringArrayResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringArrayResource_Items(), ecorePackage.getEString(), "items", null, 0, -1, StringArrayResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawableResourceEClass, DrawableResource.class, "DrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bitmapDrawableResourceEClass, BitmapDrawableResource.class, "BitmapDrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitmapDrawableResource_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, BitmapDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionDrawableResourceEClass, TransitionDrawableResource.class, "TransitionDrawableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionDrawableResource_From(), this.getBitmapDrawableResource(), null, "from", null, 0, 1, TransitionDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionDrawableResource_To(), this.getBitmapDrawableResource(), null, "to", null, 0, 1, TransitionDrawableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueAccessEClass, ValueAccess.class, "ValueAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyDrawableVAEClass, AnyDrawableVA.class, "AnyDrawableVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringVAEClass, StringVA.class, "StringVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringVA_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringVA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVAEClass, IntegerVA.class, "IntegerVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVA_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerVA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanVAEClass, BooleanVA.class, "BooleanVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanVA_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanVA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorVAEClass, ColorVA.class, "ColorVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorVA_Value(), ecorePackage.getEString(), "value", null, 0, 1, ColorVA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionVAEClass, DimensionVA.class, "DimensionVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionVA_Value(), ecorePackage.getEString(), "value", null, 0, 1, DimensionVA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutDimensionVAEClass, LayoutDimensionVA.class, "LayoutDimensionVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayoutDimensionVA_Const_value(), this.getLayoutDimensionKind(), "const_value", null, 0, 1, LayoutDimensionVA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawableVAEClass, DrawableVA.class, "DrawableVA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceAccessEClass, ResourceAccess.class, "ResourceAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAccess_Package(), ecorePackage.getEString(), "package", null, 0, 1, ResourceAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAccess_ExternalResource(), ecorePackage.getEString(), "externalResource", null, 0, 1, ResourceAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringRAEClass, StringRA.class, "StringRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringRA_Resource(), this.getStringResource(), null, "resource", null, 0, 1, StringRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerRAEClass, IntegerRA.class, "IntegerRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerRA_Resource(), this.getIntegerResource(), null, "resource", null, 0, 1, IntegerRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanRAEClass, BooleanRA.class, "BooleanRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanRA_Resource(), this.getBooleanResource(), null, "resource", null, 0, 1, BooleanRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorRAEClass, ColorRA.class, "ColorRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColorRA_Resource(), this.getColorResource(), null, "resource", null, 0, 1, ColorRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionRAEClass, DimensionRA.class, "DimensionRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionRA_Resource(), this.getDimensionResource(), null, "resource", null, 0, 1, DimensionRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayRAEClass, ArrayRA.class, "ArrayRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayRA_Package(), ecorePackage.getEString(), "package", null, 0, 1, ArrayRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayRA_Resource(), this.getArrayResource(), null, "resource", null, 0, 1, ArrayRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrayRA_ExternalResource(), ecorePackage.getEString(), "externalResource", null, 0, 1, ArrayRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawableRAEClass, DrawableRA.class, "DrawableRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrawableRA_Resource(), this.getDrawableResource(), null, "resource", null, 0, 1, DrawableRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutPropertiesEClass, LayoutProperties.class, "LayoutProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayoutProperties_Layout_height(), this.getLayoutDimensionVA(), null, "layout_height", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_width(), this.getLayoutDimensionVA(), null, "layout_width", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_weight(), this.getIntegerVA(), null, "layout_weight", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_marginBottom(), this.getDimensionVA(), null, "layout_marginBottom", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_marginLeft(), this.getDimensionVA(), null, "layout_marginLeft", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_marginRight(), this.getDimensionVA(), null, "layout_marginRight", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_marginTop(), this.getDimensionVA(), null, "layout_marginTop", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_above(), this.getView(), null, "layout_above", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignBaseline(), this.getView(), null, "layout_alignBaseline", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignBottom(), this.getView(), null, "layout_alignBottom", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignLeft(), this.getView(), null, "layout_alignLeft", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignParentBottom(), this.getBooleanVA(), null, "layout_alignParentBottom", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignParentLeft(), this.getBooleanVA(), null, "layout_alignParentLeft", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignParentRight(), this.getBooleanVA(), null, "layout_alignParentRight", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignParentTop(), this.getBooleanVA(), null, "layout_alignParentTop", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignTop(), this.getView(), null, "layout_alignTop", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_alignWithParentIfMissing(), this.getBooleanVA(), null, "layout_alignWithParentIfMissing", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_below(), this.getView(), null, "layout_below", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_centerHorizontal(), this.getBooleanVA(), null, "layout_centerHorizontal", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_centerInParent(), this.getBooleanVA(), null, "layout_centerInParent", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_centerVertical(), this.getBooleanVA(), null, "layout_centerVertical", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_toLeftOf(), this.getView(), null, "layout_toLeftOf", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutProperties_Layout_toRightOf(), this.getView(), null, "layout_toRightOf", null, 0, 1, LayoutProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(layoutDimensionKindEEnum, LayoutDimensionKind.class, "LayoutDimensionKind");
		addEEnumLiteral(layoutDimensionKindEEnum, LayoutDimensionKind.FILL_PARENT);
		addEEnumLiteral(layoutDimensionKindEEnum, LayoutDimensionKind.MATCH_PARENT);
		addEEnumLiteral(layoutDimensionKindEEnum, LayoutDimensionKind.WRAP_CONTENT);

		initEEnum(layoutVisibilityKindEEnum, LayoutVisibilityKind.class, "LayoutVisibilityKind");
		addEEnumLiteral(layoutVisibilityKindEEnum, LayoutVisibilityKind.VISIBLE);
		addEEnumLiteral(layoutVisibilityKindEEnum, LayoutVisibilityKind.INVISIBLE);
		addEEnumLiteral(layoutVisibilityKindEEnum, LayoutVisibilityKind.GONE);

		initEEnum(layoutGravityKindEEnum, LayoutGravityKind.class, "LayoutGravityKind");
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.TOP);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.BOTTOM);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.LEFT);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.RIGHT);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CENTER);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CENTER_VERTICAL);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CENTER_HORIZONTAL);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.FILL);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.FILL_VERTICAL);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.FILL_HORIZONTAL);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CLIP_VERTICAL);
		addEEnumLiteral(layoutGravityKindEEnum, LayoutGravityKind.CLIP_HORIZONTAL);

		initEEnum(layoutOrientationKindEEnum, LayoutOrientationKind.class, "LayoutOrientationKind");
		addEEnumLiteral(layoutOrientationKindEEnum, LayoutOrientationKind.HORIZONTAL);
		addEEnumLiteral(layoutOrientationKindEEnum, LayoutOrientationKind.VERTICAL);

		initEEnum(autoLinkKindEEnum, AutoLinkKind.class, "AutoLinkKind");
		addEEnumLiteral(autoLinkKindEEnum, AutoLinkKind.NONE);
		addEEnumLiteral(autoLinkKindEEnum, AutoLinkKind.WEB);
		addEEnumLiteral(autoLinkKindEEnum, AutoLinkKind.EMAIL);
		addEEnumLiteral(autoLinkKindEEnum, AutoLinkKind.PHONE);
		addEEnumLiteral(autoLinkKindEEnum, AutoLinkKind.MAP);
		addEEnumLiteral(autoLinkKindEEnum, AutoLinkKind.ALL);

		initEEnum(capitalizeKindEEnum, CapitalizeKind.class, "CapitalizeKind");
		addEEnumLiteral(capitalizeKindEEnum, CapitalizeKind.NONE);
		addEEnumLiteral(capitalizeKindEEnum, CapitalizeKind.SENTENCES);
		addEEnumLiteral(capitalizeKindEEnum, CapitalizeKind.WORDS);
		addEEnumLiteral(capitalizeKindEEnum, CapitalizeKind.CHARACTERS);

		initEEnum(typefaceKindEEnum, TypefaceKind.class, "TypefaceKind");
		addEEnumLiteral(typefaceKindEEnum, TypefaceKind.NORMAL);
		addEEnumLiteral(typefaceKindEEnum, TypefaceKind.SANS);
		addEEnumLiteral(typefaceKindEEnum, TypefaceKind.SERIF);
		addEEnumLiteral(typefaceKindEEnum, TypefaceKind.MONOSPACE);

		initEEnum(textStyleKindEEnum, TextStyleKind.class, "TextStyleKind");
		addEEnumLiteral(textStyleKindEEnum, TextStyleKind.NORMAL);
		addEEnumLiteral(textStyleKindEEnum, TextStyleKind.BOLD);
		addEEnumLiteral(textStyleKindEEnum, TextStyleKind.ITALIC);

		// Create resource
		createResource(eNS_URI);
	}

} //DroidPackageImpl
