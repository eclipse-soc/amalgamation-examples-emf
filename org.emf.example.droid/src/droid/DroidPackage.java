/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see droid.DroidFactory
 * @model kind="package"
 * @generated
 */
public interface DroidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "droid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xtext.org/example/droid/Droid";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "droid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DroidPackage eINSTANCE = droid.impl.DroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link droid.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ApplicationImpl
	 * @see droid.impl.DroidPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Version Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION_CODE = 2;

	/**
	 * The feature id for the '<em><b>Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION_NAME = 3;

	/**
	 * The feature id for the '<em><b>Sdk Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SDK_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Screens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SCREENS = 5;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LAYOUTS = 6;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESOURCES = 7;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link droid.impl.ApplicationUsesSDKImpl <em>Application Uses SDK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ApplicationUsesSDKImpl
	 * @see droid.impl.DroidPackageImpl#getApplicationUsesSDK()
	 * @generated
	 */
	int APPLICATION_USES_SDK = 1;

	/**
	 * The feature id for the '<em><b>Min Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_USES_SDK__MIN_SDK_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Max Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_USES_SDK__MAX_SDK_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Target Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_USES_SDK__TARGET_SDK_VERSION = 2;

	/**
	 * The number of structural features of the '<em>Application Uses SDK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_USES_SDK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link droid.impl.ScreenImpl <em>Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ScreenImpl
	 * @see droid.impl.DroidPackageImpl#getScreen()
	 * @generated
	 */
	int SCREEN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN__WIDGETS = 2;

	/**
	 * The number of structural features of the '<em>Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link droid.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ActionImpl
	 * @see droid.impl.DroidPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link droid.impl.GoToURLActionImpl <em>Go To URL Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.GoToURLActionImpl
	 * @see droid.impl.DroidPackageImpl#getGoToURLAction()
	 * @generated
	 */
	int GO_TO_URL_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_URL_ACTION__URL = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go To URL Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_URL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.ShowLayoutActionImpl <em>Show Layout Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ShowLayoutActionImpl
	 * @see droid.impl.DroidPackageImpl#getShowLayoutAction()
	 * @generated
	 */
	int SHOW_LAYOUT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_LAYOUT_ACTION__LAYOUT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Show Layout Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_LAYOUT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.InvokeScreenActionImpl <em>Invoke Screen Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.InvokeScreenActionImpl
	 * @see droid.impl.DroidPackageImpl#getInvokeScreenAction()
	 * @generated
	 */
	int INVOKE_SCREEN_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Screen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_SCREEN_ACTION__SCREEN = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invoke Screen Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_SCREEN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ViewImpl
	 * @see droid.impl.DroidPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BACKGROUND = 1;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ON_CLICK = 2;

	/**
	 * The feature id for the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LAYOUT_PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link droid.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.LayoutImpl
	 * @see droid.impl.DroidPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__BACKGROUND = VIEW__BACKGROUND;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ON_CLICK = VIEW__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LAYOUT_PROPERTIES = VIEW__LAYOUT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__IS_RELATIVE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ALPHA = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MIN_HEIGHT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MIN_WIDTH = VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Next Focus Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT_FOCUS_DOWN = VIEW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Next Focus Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT_FOCUS_LEFT = VIEW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Next Focus Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT_FOCUS_RIGHT = VIEW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Next Focus Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT_FOCUS_UP = VIEW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING = VIEW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING_BOTTOM = VIEW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING_LEFT = VIEW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING_RIGHT = VIEW_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PADDING_TOP = VIEW_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ROTATION = VIEW_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rotation X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ROTATION_X = VIEW_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Rotation Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ROTATION_Y = VIEW_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Save Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SAVE_ENABLED = VIEW_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SCALE_X = VIEW_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SCALE_Y = VIEW_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Scroll X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SCROLL_X = VIEW_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Scroll Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SCROLL_Y = VIEW_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Scrollbars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__SCROLLBARS = VIEW_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Transform Pivot X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TRANSFORM_PIVOT_X = VIEW_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Transform Pivot Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TRANSFORM_PIVOT_Y = VIEW_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Translation X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TRANSLATION_X = VIEW_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Translation Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TRANSLATION_Y = VIEW_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VISIBILITY = VIEW_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__GRAVITY = VIEW_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ORIENTATION = VIEW_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VIEWS = VIEW_FEATURE_COUNT + 29;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 30;

	/**
	 * The meta object id for the '{@link droid.impl.ViewCollectionImpl <em>View Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ViewCollectionImpl
	 * @see droid.impl.DroidPackageImpl#getViewCollection()
	 * @generated
	 */
	int VIEW_COLLECTION = 8;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLLECTION__VIEWS = 0;

	/**
	 * The number of structural features of the '<em>View Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link droid.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.WidgetImpl
	 * @see droid.impl.DroidPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__BACKGROUND = VIEW__BACKGROUND;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ON_CLICK = VIEW__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LAYOUT_PROPERTIES = VIEW__LAYOUT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TOP = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LEFT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__WIDTH = VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__HEIGHT = VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CLICKABLE = VIEW_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = VIEW_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link droid.impl.TextViewImpl <em>Text View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TextViewImpl
	 * @see droid.impl.DroidPackageImpl#getTextView()
	 * @generated
	 */
	int TEXT_VIEW = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__ON_CLICK = WIDGET__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__LAYOUT_PROPERTIES = WIDGET__LAYOUT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__FADE_SCROLL_BARS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__IS_SCROLL_CONTAINER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auto Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__AUTO_LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__AUTO_TEXT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capitalize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__CAPITALIZE = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__DIGITS = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__EDITABLE = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__GRAVITY = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__HINT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__NUMERIC = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__PASSWORD = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__PHONE_NUMBER = WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Single Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__SINGLE_LINE = WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT_COLOR = WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Typeface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TYPEFACE = WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Text Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT_SIZE = WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW__TEXT_STYLE = WIDGET_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Text View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link droid.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ButtonImpl
	 * @see droid.impl.DroidPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ON_CLICK = WIDGET__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_PROPERTIES = WIDGET__LAYOUT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__SRC = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HINT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.ImageViewImpl <em>Image View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ImageViewImpl
	 * @see droid.impl.DroidPackageImpl#getImageView()
	 * @generated
	 */
	int IMAGE_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__ON_CLICK = WIDGET__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__LAYOUT_PROPERTIES = WIDGET__LAYOUT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__SRC = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__FADE_SCROLL_BARS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW__IS_SCROLL_CONTAINER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.SpinnerImpl <em>Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.SpinnerImpl
	 * @see droid.impl.DroidPackageImpl#getSpinner()
	 * @generated
	 */
	int SPINNER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__ON_CLICK = WIDGET__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__LAYOUT_PROPERTIES = WIDGET__LAYOUT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__PROMPT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__FADE_SCROLL_BARS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER__IS_SCROLL_CONTAINER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINNER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.EditTextImpl <em>Edit Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.EditTextImpl
	 * @see droid.impl.DroidPackageImpl#getEditText()
	 * @generated
	 */
	int EDIT_TEXT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__BACKGROUND = WIDGET__BACKGROUND;

	/**
	 * The feature id for the '<em><b>On Click</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__ON_CLICK = WIDGET__ON_CLICK;

	/**
	 * The feature id for the '<em><b>Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__LAYOUT_PROPERTIES = WIDGET__LAYOUT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TOP = WIDGET__TOP;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__LEFT = WIDGET__LEFT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__WIDTH = WIDGET__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__HEIGHT = WIDGET__HEIGHT;

	/**
	 * The feature id for the '<em><b>Clickable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__CLICKABLE = WIDGET__CLICKABLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fade Scroll Bars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__FADE_SCROLL_BARS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Scroll Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__IS_SCROLL_CONTAINER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auto Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__AUTO_LINK = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__AUTO_TEXT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capitalize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__CAPITALIZE = WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__DIGITS = WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__EDITABLE = WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__GRAVITY = WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__HINT = WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Numeric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__NUMERIC = WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__PASSWORD = WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__PHONE_NUMBER = WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Single Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__SINGLE_LINE = WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT_COLOR = WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Typeface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TYPEFACE = WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Text Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT_SIZE = WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT__TEXT_STYLE = WIDGET_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Edit Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link droid.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ResourceImpl
	 * @see droid.impl.DroidPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link droid.impl.StringResourceImpl <em>String Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringResourceImpl
	 * @see droid.impl.DroidPackageImpl#getStringResource()
	 * @generated
	 */
	int STRING_RESOURCE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.IntegerResourceImpl <em>Integer Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerResourceImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerResource()
	 * @generated
	 */
	int INTEGER_RESOURCE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.BooleanResourceImpl <em>Boolean Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BooleanResourceImpl
	 * @see droid.impl.DroidPackageImpl#getBooleanResource()
	 * @generated
	 */
	int BOOLEAN_RESOURCE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.ColorResourceImpl <em>Color Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ColorResourceImpl
	 * @see droid.impl.DroidPackageImpl#getColorResource()
	 * @generated
	 */
	int COLOR_RESOURCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.DimensionResourceImpl <em>Dimension Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DimensionResourceImpl
	 * @see droid.impl.DroidPackageImpl#getDimensionResource()
	 * @generated
	 */
	int DIMENSION_RESOURCE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RESOURCE__VALUE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimension Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.ArrayResourceImpl <em>Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ArrayResourceImpl
	 * @see droid.impl.DroidPackageImpl#getArrayResource()
	 * @generated
	 */
	int ARRAY_RESOURCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Array Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link droid.impl.IntegerArrayResourceImpl <em>Integer Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerArrayResourceImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerArrayResource()
	 * @generated
	 */
	int INTEGER_ARRAY_RESOURCE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARRAY_RESOURCE__NAME = ARRAY_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARRAY_RESOURCE__ITEMS = ARRAY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Array Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARRAY_RESOURCE_FEATURE_COUNT = ARRAY_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.StringArrayResourceImpl <em>String Array Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringArrayResourceImpl
	 * @see droid.impl.DroidPackageImpl#getStringArrayResource()
	 * @generated
	 */
	int STRING_ARRAY_RESOURCE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_RESOURCE__NAME = ARRAY_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_RESOURCE__ITEMS = ARRAY_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Array Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_RESOURCE_FEATURE_COUNT = ARRAY_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.DrawableResourceImpl <em>Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DrawableResourceImpl
	 * @see droid.impl.DroidPackageImpl#getDrawableResource()
	 * @generated
	 */
	int DRAWABLE_RESOURCE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The number of structural features of the '<em>Drawable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link droid.impl.BitmapDrawableResourceImpl <em>Bitmap Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BitmapDrawableResourceImpl
	 * @see droid.impl.DroidPackageImpl#getBitmapDrawableResource()
	 * @generated
	 */
	int BITMAP_DRAWABLE_RESOURCE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_DRAWABLE_RESOURCE__NAME = DRAWABLE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_DRAWABLE_RESOURCE__FILENAME = DRAWABLE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bitmap Drawable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_DRAWABLE_RESOURCE_FEATURE_COUNT = DRAWABLE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.TransitionDrawableResourceImpl <em>Transition Drawable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.TransitionDrawableResourceImpl
	 * @see droid.impl.DroidPackageImpl#getTransitionDrawableResource()
	 * @generated
	 */
	int TRANSITION_DRAWABLE_RESOURCE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DRAWABLE_RESOURCE__NAME = DRAWABLE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DRAWABLE_RESOURCE__FROM = DRAWABLE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DRAWABLE_RESOURCE__TO = DRAWABLE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition Drawable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_DRAWABLE_RESOURCE_FEATURE_COUNT = DRAWABLE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link droid.impl.ValueAccessImpl <em>Value Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ValueAccessImpl
	 * @see droid.impl.DroidPackageImpl#getValueAccess()
	 * @generated
	 */
	int VALUE_ACCESS = 28;

	/**
	 * The number of structural features of the '<em>Value Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link droid.impl.AnyDrawableVAImpl <em>Any Drawable VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.AnyDrawableVAImpl
	 * @see droid.impl.DroidPackageImpl#getAnyDrawableVA()
	 * @generated
	 */
	int ANY_DRAWABLE_VA = 29;

	/**
	 * The number of structural features of the '<em>Any Drawable VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_DRAWABLE_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link droid.impl.StringVAImpl <em>String VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringVAImpl
	 * @see droid.impl.DroidPackageImpl#getStringVA()
	 * @generated
	 */
	int STRING_VA = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.IntegerVAImpl <em>Integer VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerVAImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerVA()
	 * @generated
	 */
	int INTEGER_VA = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.BooleanVAImpl <em>Boolean VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BooleanVAImpl
	 * @see droid.impl.DroidPackageImpl#getBooleanVA()
	 * @generated
	 */
	int BOOLEAN_VA = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.ColorVAImpl <em>Color VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ColorVAImpl
	 * @see droid.impl.DroidPackageImpl#getColorVA()
	 * @generated
	 */
	int COLOR_VA = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_VA__VALUE = ANY_DRAWABLE_VA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_VA_FEATURE_COUNT = ANY_DRAWABLE_VA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.DimensionVAImpl <em>Dimension VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DimensionVAImpl
	 * @see droid.impl.DroidPackageImpl#getDimensionVA()
	 * @generated
	 */
	int DIMENSION_VA = 34;

	/**
	 * The feature id for the '<em><b>Const value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VA__CONST_VALUE = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VA__VALUE = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimension VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link droid.impl.LayoutDimensionVAImpl <em>Layout Dimension VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.LayoutDimensionVAImpl
	 * @see droid.impl.DroidPackageImpl#getLayoutDimensionVA()
	 * @generated
	 */
	int LAYOUT_DIMENSION_VA = 35;

	/**
	 * The feature id for the '<em><b>Const value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIMENSION_VA__CONST_VALUE = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layout Dimension VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DIMENSION_VA_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link droid.impl.DrawableVAImpl <em>Drawable VA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DrawableVAImpl
	 * @see droid.impl.DroidPackageImpl#getDrawableVA()
	 * @generated
	 */
	int DRAWABLE_VA = 36;

	/**
	 * The number of structural features of the '<em>Drawable VA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_VA_FEATURE_COUNT = ANY_DRAWABLE_VA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link droid.impl.ResourceAccessImpl <em>Resource Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ResourceAccessImpl
	 * @see droid.impl.DroidPackageImpl#getResourceAccess()
	 * @generated
	 */
	int RESOURCE_ACCESS = 37;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS__PACKAGE = VALUE_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS__EXTERNAL_RESOURCE = VALUE_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_FEATURE_COUNT = VALUE_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link droid.impl.StringRAImpl <em>String RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.StringRAImpl
	 * @see droid.impl.DroidPackageImpl#getStringRA()
	 * @generated
	 */
	int STRING_RA = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RA__VALUE = STRING_VA__VALUE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RA__PACKAGE = STRING_VA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RA__EXTERNAL_RESOURCE = STRING_VA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RA__RESOURCE = STRING_VA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RA_FEATURE_COUNT = STRING_VA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.IntegerRAImpl <em>Integer RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.IntegerRAImpl
	 * @see droid.impl.DroidPackageImpl#getIntegerRA()
	 * @generated
	 */
	int INTEGER_RA = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RA__VALUE = INTEGER_VA__VALUE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RA__PACKAGE = INTEGER_VA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RA__EXTERNAL_RESOURCE = INTEGER_VA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RA__RESOURCE = INTEGER_VA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RA_FEATURE_COUNT = INTEGER_VA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.BooleanRAImpl <em>Boolean RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.BooleanRAImpl
	 * @see droid.impl.DroidPackageImpl#getBooleanRA()
	 * @generated
	 */
	int BOOLEAN_RA = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RA__VALUE = BOOLEAN_VA__VALUE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RA__PACKAGE = BOOLEAN_VA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RA__EXTERNAL_RESOURCE = BOOLEAN_VA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RA__RESOURCE = BOOLEAN_VA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RA_FEATURE_COUNT = BOOLEAN_VA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.ColorRAImpl <em>Color RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ColorRAImpl
	 * @see droid.impl.DroidPackageImpl#getColorRA()
	 * @generated
	 */
	int COLOR_RA = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RA__VALUE = COLOR_VA__VALUE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RA__PACKAGE = COLOR_VA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RA__EXTERNAL_RESOURCE = COLOR_VA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RA__RESOURCE = COLOR_VA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Color RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_RA_FEATURE_COUNT = COLOR_VA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.DimensionRAImpl <em>Dimension RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DimensionRAImpl
	 * @see droid.impl.DroidPackageImpl#getDimensionRA()
	 * @generated
	 */
	int DIMENSION_RA = 42;

	/**
	 * The feature id for the '<em><b>Const value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA__CONST_VALUE = DIMENSION_VA__CONST_VALUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA__VALUE = DIMENSION_VA__VALUE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA__PACKAGE = DIMENSION_VA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA__EXTERNAL_RESOURCE = DIMENSION_VA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA__RESOURCE = DIMENSION_VA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dimension RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_RA_FEATURE_COUNT = DIMENSION_VA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.ArrayRAImpl <em>Array RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.ArrayRAImpl
	 * @see droid.impl.DroidPackageImpl#getArrayRA()
	 * @generated
	 */
	int ARRAY_RA = 43;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_RA__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_RA__RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_RA__EXTERNAL_RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Array RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_RA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link droid.impl.DrawableRAImpl <em>Drawable RA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.DrawableRAImpl
	 * @see droid.impl.DroidPackageImpl#getDrawableRA()
	 * @generated
	 */
	int DRAWABLE_RA = 44;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RA__PACKAGE = DRAWABLE_VA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RA__EXTERNAL_RESOURCE = DRAWABLE_VA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RA__RESOURCE = DRAWABLE_VA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drawable RA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWABLE_RA_FEATURE_COUNT = DRAWABLE_VA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link droid.impl.LayoutPropertiesImpl <em>Layout Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.impl.LayoutPropertiesImpl
	 * @see droid.impl.DroidPackageImpl#getLayoutProperties()
	 * @generated
	 */
	int LAYOUT_PROPERTIES = 45;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Layout weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Layout margin Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_MARGIN_BOTTOM = 3;

	/**
	 * The feature id for the '<em><b>Layout margin Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_MARGIN_LEFT = 4;

	/**
	 * The feature id for the '<em><b>Layout margin Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_MARGIN_RIGHT = 5;

	/**
	 * The feature id for the '<em><b>Layout margin Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_MARGIN_TOP = 6;

	/**
	 * The feature id for the '<em><b>Layout above</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ABOVE = 7;

	/**
	 * The feature id for the '<em><b>Layout align Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_BASELINE = 8;

	/**
	 * The feature id for the '<em><b>Layout align Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_BOTTOM = 9;

	/**
	 * The feature id for the '<em><b>Layout align Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_LEFT = 10;

	/**
	 * The feature id for the '<em><b>Layout align Parent Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_BOTTOM = 11;

	/**
	 * The feature id for the '<em><b>Layout align Parent Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_LEFT = 12;

	/**
	 * The feature id for the '<em><b>Layout align Parent Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_RIGHT = 13;

	/**
	 * The feature id for the '<em><b>Layout align Parent Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_TOP = 14;

	/**
	 * The feature id for the '<em><b>Layout align Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_TOP = 15;

	/**
	 * The feature id for the '<em><b>Layout align With Parent If Missing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING = 16;

	/**
	 * The feature id for the '<em><b>Layout below</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_BELOW = 17;

	/**
	 * The feature id for the '<em><b>Layout center Horizontal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_CENTER_HORIZONTAL = 18;

	/**
	 * The feature id for the '<em><b>Layout center In Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_CENTER_IN_PARENT = 19;

	/**
	 * The feature id for the '<em><b>Layout center Vertical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_CENTER_VERTICAL = 20;

	/**
	 * The feature id for the '<em><b>Layout to Left Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_TO_LEFT_OF = 21;

	/**
	 * The feature id for the '<em><b>Layout to Right Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES__LAYOUT_TO_RIGHT_OF = 22;

	/**
	 * The number of structural features of the '<em>Layout Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_PROPERTIES_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link droid.LayoutDimensionKind <em>Layout Dimension Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.LayoutDimensionKind
	 * @see droid.impl.DroidPackageImpl#getLayoutDimensionKind()
	 * @generated
	 */
	int LAYOUT_DIMENSION_KIND = 46;

	/**
	 * The meta object id for the '{@link droid.LayoutVisibilityKind <em>Layout Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.LayoutVisibilityKind
	 * @see droid.impl.DroidPackageImpl#getLayoutVisibilityKind()
	 * @generated
	 */
	int LAYOUT_VISIBILITY_KIND = 47;

	/**
	 * The meta object id for the '{@link droid.LayoutGravityKind <em>Layout Gravity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.LayoutGravityKind
	 * @see droid.impl.DroidPackageImpl#getLayoutGravityKind()
	 * @generated
	 */
	int LAYOUT_GRAVITY_KIND = 48;

	/**
	 * The meta object id for the '{@link droid.LayoutOrientationKind <em>Layout Orientation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.LayoutOrientationKind
	 * @see droid.impl.DroidPackageImpl#getLayoutOrientationKind()
	 * @generated
	 */
	int LAYOUT_ORIENTATION_KIND = 49;

	/**
	 * The meta object id for the '{@link droid.AutoLinkKind <em>Auto Link Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.AutoLinkKind
	 * @see droid.impl.DroidPackageImpl#getAutoLinkKind()
	 * @generated
	 */
	int AUTO_LINK_KIND = 50;

	/**
	 * The meta object id for the '{@link droid.CapitalizeKind <em>Capitalize Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.CapitalizeKind
	 * @see droid.impl.DroidPackageImpl#getCapitalizeKind()
	 * @generated
	 */
	int CAPITALIZE_KIND = 51;

	/**
	 * The meta object id for the '{@link droid.TypefaceKind <em>Typeface Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.TypefaceKind
	 * @see droid.impl.DroidPackageImpl#getTypefaceKind()
	 * @generated
	 */
	int TYPEFACE_KIND = 52;

	/**
	 * The meta object id for the '{@link droid.TextStyleKind <em>Text Style Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see droid.TextStyleKind
	 * @see droid.impl.DroidPackageImpl#getTextStyleKind()
	 * @generated
	 */
	int TEXT_STYLE_KIND = 53;


	/**
	 * Returns the meta object for class '{@link droid.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see droid.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link droid.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link droid.Application#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see droid.Application#getPackageName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link droid.Application#getVersionCode <em>Version Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Code</em>'.
	 * @see droid.Application#getVersionCode()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_VersionCode();

	/**
	 * Returns the meta object for the attribute '{@link droid.Application#getVersionName <em>Version Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Name</em>'.
	 * @see droid.Application#getVersionName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_VersionName();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Application#getSdkVersion <em>Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sdk Version</em>'.
	 * @see droid.Application#getSdkVersion()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_SdkVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.Application#getScreens <em>Screens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screens</em>'.
	 * @see droid.Application#getScreens()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Screens();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.Application#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layouts</em>'.
	 * @see droid.Application#getLayouts()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Layouts();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.Application#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see droid.Application#getResources()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Resources();

	/**
	 * Returns the meta object for class '{@link droid.ApplicationUsesSDK <em>Application Uses SDK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Uses SDK</em>'.
	 * @see droid.ApplicationUsesSDK
	 * @generated
	 */
	EClass getApplicationUsesSDK();

	/**
	 * Returns the meta object for the attribute '{@link droid.ApplicationUsesSDK#getMinSdkVersion <em>Min Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Sdk Version</em>'.
	 * @see droid.ApplicationUsesSDK#getMinSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_MinSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link droid.ApplicationUsesSDK#getMaxSdkVersion <em>Max Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Sdk Version</em>'.
	 * @see droid.ApplicationUsesSDK#getMaxSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_MaxSdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link droid.ApplicationUsesSDK#getTargetSdkVersion <em>Target Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Sdk Version</em>'.
	 * @see droid.ApplicationUsesSDK#getTargetSdkVersion()
	 * @see #getApplicationUsesSDK()
	 * @generated
	 */
	EAttribute getApplicationUsesSDK_TargetSdkVersion();

	/**
	 * Returns the meta object for class '{@link droid.Screen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen</em>'.
	 * @see droid.Screen
	 * @generated
	 */
	EClass getScreen();

	/**
	 * Returns the meta object for the attribute '{@link droid.Screen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.Screen#getName()
	 * @see #getScreen()
	 * @generated
	 */
	EAttribute getScreen_Name();

	/**
	 * Returns the meta object for the reference '{@link droid.Screen#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see droid.Screen#getLayout()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Screen#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widgets</em>'.
	 * @see droid.Screen#getWidgets()
	 * @see #getScreen()
	 * @generated
	 */
	EReference getScreen_Widgets();

	/**
	 * Returns the meta object for class '{@link droid.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see droid.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link droid.GoToURLAction <em>Go To URL Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To URL Action</em>'.
	 * @see droid.GoToURLAction
	 * @generated
	 */
	EClass getGoToURLAction();

	/**
	 * Returns the meta object for the attribute '{@link droid.GoToURLAction#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see droid.GoToURLAction#getUrl()
	 * @see #getGoToURLAction()
	 * @generated
	 */
	EAttribute getGoToURLAction_Url();

	/**
	 * Returns the meta object for class '{@link droid.ShowLayoutAction <em>Show Layout Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Layout Action</em>'.
	 * @see droid.ShowLayoutAction
	 * @generated
	 */
	EClass getShowLayoutAction();

	/**
	 * Returns the meta object for the reference '{@link droid.ShowLayoutAction#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see droid.ShowLayoutAction#getLayout()
	 * @see #getShowLayoutAction()
	 * @generated
	 */
	EReference getShowLayoutAction_Layout();

	/**
	 * Returns the meta object for class '{@link droid.InvokeScreenAction <em>Invoke Screen Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Screen Action</em>'.
	 * @see droid.InvokeScreenAction
	 * @generated
	 */
	EClass getInvokeScreenAction();

	/**
	 * Returns the meta object for the reference '{@link droid.InvokeScreenAction#getScreen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Screen</em>'.
	 * @see droid.InvokeScreenAction#getScreen()
	 * @see #getInvokeScreenAction()
	 * @generated
	 */
	EReference getInvokeScreenAction_Screen();

	/**
	 * Returns the meta object for class '{@link droid.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see droid.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link droid.Layout#isIsRelative <em>Is Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Relative</em>'.
	 * @see droid.Layout#isIsRelative()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_IsRelative();

	/**
	 * Returns the meta object for the attribute '{@link droid.Layout#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see droid.Layout#getAlpha()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Height</em>'.
	 * @see droid.Layout#getMinHeight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_MinHeight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Width</em>'.
	 * @see droid.Layout#getMinWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_MinWidth();

	/**
	 * Returns the meta object for the reference '{@link droid.Layout#getNextFocusDown <em>Next Focus Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Down</em>'.
	 * @see droid.Layout#getNextFocusDown()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusDown();

	/**
	 * Returns the meta object for the reference '{@link droid.Layout#getNextFocusLeft <em>Next Focus Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Left</em>'.
	 * @see droid.Layout#getNextFocusLeft()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusLeft();

	/**
	 * Returns the meta object for the reference '{@link droid.Layout#getNextFocusRight <em>Next Focus Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Right</em>'.
	 * @see droid.Layout#getNextFocusRight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusRight();

	/**
	 * Returns the meta object for the reference '{@link droid.Layout#getNextFocusUp <em>Next Focus Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Focus Up</em>'.
	 * @see droid.Layout#getNextFocusUp()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_NextFocusUp();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding</em>'.
	 * @see droid.Layout#getPadding()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Padding();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPaddingBottom <em>Padding Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Bottom</em>'.
	 * @see droid.Layout#getPaddingBottom()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingBottom();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPaddingLeft <em>Padding Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Left</em>'.
	 * @see droid.Layout#getPaddingLeft()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPaddingRight <em>Padding Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Right</em>'.
	 * @see droid.Layout#getPaddingRight()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingRight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getPaddingTop <em>Padding Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding Top</em>'.
	 * @see droid.Layout#getPaddingTop()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_PaddingTop();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see droid.Layout#getRotation()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getRotationX <em>Rotation X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation X</em>'.
	 * @see droid.Layout#getRotationX()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_RotationX();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getRotationY <em>Rotation Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation Y</em>'.
	 * @see droid.Layout#getRotationY()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_RotationY();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getSaveEnabled <em>Save Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Save Enabled</em>'.
	 * @see droid.Layout#getSaveEnabled()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_SaveEnabled();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale X</em>'.
	 * @see droid.Layout#getScaleX()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_ScaleX();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale Y</em>'.
	 * @see droid.Layout#getScaleY()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_ScaleY();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getScrollX <em>Scroll X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scroll X</em>'.
	 * @see droid.Layout#getScrollX()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_ScrollX();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getScrollY <em>Scroll Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scroll Y</em>'.
	 * @see droid.Layout#getScrollY()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_ScrollY();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getScrollbars <em>Scrollbars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scrollbars</em>'.
	 * @see droid.Layout#getScrollbars()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Scrollbars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getTransformPivotX <em>Transform Pivot X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform Pivot X</em>'.
	 * @see droid.Layout#getTransformPivotX()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_TransformPivotX();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getTransformPivotY <em>Transform Pivot Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform Pivot Y</em>'.
	 * @see droid.Layout#getTransformPivotY()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_TransformPivotY();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getTranslationX <em>Translation X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation X</em>'.
	 * @see droid.Layout#getTranslationX()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_TranslationX();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getTranslationY <em>Translation Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translation Y</em>'.
	 * @see droid.Layout#getTranslationY()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_TranslationY();

	/**
	 * Returns the meta object for the attribute '{@link droid.Layout#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see droid.Layout#getVisibility()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Visibility();

	/**
	 * Returns the meta object for the attribute list '{@link droid.Layout#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Gravity</em>'.
	 * @see droid.Layout#getGravity()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Gravity();

	/**
	 * Returns the meta object for the attribute '{@link droid.Layout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see droid.Layout#getOrientation()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Layout#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Views</em>'.
	 * @see droid.Layout#getViews()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Views();

	/**
	 * Returns the meta object for class '{@link droid.ViewCollection <em>View Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Collection</em>'.
	 * @see droid.ViewCollection
	 * @generated
	 */
	EClass getViewCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link droid.ViewCollection#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see droid.ViewCollection#getViews()
	 * @see #getViewCollection()
	 * @generated
	 */
	EReference getViewCollection_Views();

	/**
	 * Returns the meta object for class '{@link droid.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see droid.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link droid.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the containment reference '{@link droid.View#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see droid.View#getBackground()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Background();

	/**
	 * Returns the meta object for the containment reference '{@link droid.View#getOnClick <em>On Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Click</em>'.
	 * @see droid.View#getOnClick()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_OnClick();

	/**
	 * Returns the meta object for the containment reference '{@link droid.View#getLayoutProperties <em>Layout Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Properties</em>'.
	 * @see droid.View#getLayoutProperties()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_LayoutProperties();

	/**
	 * Returns the meta object for class '{@link droid.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see droid.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see droid.Widget#getTop()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Top();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see droid.Widget#getLeft()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Left();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Width</em>'.
	 * @see droid.Widget#getWidth()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Width();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see droid.Widget#getHeight()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Height();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Widget#getClickable <em>Clickable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clickable</em>'.
	 * @see droid.Widget#getClickable()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Clickable();

	/**
	 * Returns the meta object for class '{@link droid.TextView <em>Text View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text View</em>'.
	 * @see droid.TextView
	 * @generated
	 */
	EClass getTextView();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see droid.TextView#getText()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Text();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.TextView#getFadeScrollBars()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.TextView#getIsScrollContainer()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_IsScrollContainer();

	/**
	 * Returns the meta object for the attribute '{@link droid.TextView#getAutoLink <em>Auto Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Link</em>'.
	 * @see droid.TextView#getAutoLink()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_AutoLink();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getAutoText <em>Auto Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Text</em>'.
	 * @see droid.TextView#getAutoText()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_AutoText();

	/**
	 * Returns the meta object for the attribute '{@link droid.TextView#getCapitalize <em>Capitalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capitalize</em>'.
	 * @see droid.TextView#getCapitalize()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Capitalize();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see droid.TextView#getDigits()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editable</em>'.
	 * @see droid.TextView#getEditable()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Editable();

	/**
	 * Returns the meta object for the attribute '{@link droid.TextView#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see droid.TextView#getGravity()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see droid.TextView#getHint()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric</em>'.
	 * @see droid.TextView#getNumeric()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Numeric();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see droid.TextView#getPassword()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_Password();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone Number</em>'.
	 * @see droid.TextView#getPhoneNumber()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Line</em>'.
	 * @see droid.TextView#getSingleLine()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_SingleLine();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see droid.TextView#getTextColor()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link droid.TextView#getTypeface <em>Typeface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeface</em>'.
	 * @see droid.TextView#getTypeface()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_Typeface();

	/**
	 * Returns the meta object for the containment reference '{@link droid.TextView#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Size</em>'.
	 * @see droid.TextView#getTextSize()
	 * @see #getTextView()
	 * @generated
	 */
	EReference getTextView_TextSize();

	/**
	 * Returns the meta object for the attribute list '{@link droid.TextView#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Style</em>'.
	 * @see droid.TextView#getTextStyle()
	 * @see #getTextView()
	 * @generated
	 */
	EAttribute getTextView_TextStyle();

	/**
	 * Returns the meta object for class '{@link droid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see droid.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see droid.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Text();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Button#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see droid.Button#getSrc()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Src();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Button#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see droid.Button#getHint()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Hint();

	/**
	 * Returns the meta object for class '{@link droid.ImageView <em>Image View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image View</em>'.
	 * @see droid.ImageView
	 * @generated
	 */
	EClass getImageView();

	/**
	 * Returns the meta object for the containment reference '{@link droid.ImageView#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Src</em>'.
	 * @see droid.ImageView#getSrc()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_Src();

	/**
	 * Returns the meta object for the containment reference '{@link droid.ImageView#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.ImageView#getFadeScrollBars()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.ImageView#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.ImageView#getIsScrollContainer()
	 * @see #getImageView()
	 * @generated
	 */
	EReference getImageView_IsScrollContainer();

	/**
	 * Returns the meta object for class '{@link droid.Spinner <em>Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinner</em>'.
	 * @see droid.Spinner
	 * @generated
	 */
	EClass getSpinner();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Spinner#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prompt</em>'.
	 * @see droid.Spinner#getPrompt()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_Prompt();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Spinner#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.Spinner#getFadeScrollBars()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.Spinner#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.Spinner#getIsScrollContainer()
	 * @see #getSpinner()
	 * @generated
	 */
	EReference getSpinner_IsScrollContainer();

	/**
	 * Returns the meta object for class '{@link droid.EditText <em>Edit Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Text</em>'.
	 * @see droid.EditText
	 * @generated
	 */
	EClass getEditText();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see droid.EditText#getText()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Text();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getFadeScrollBars <em>Fade Scroll Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fade Scroll Bars</em>'.
	 * @see droid.EditText#getFadeScrollBars()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_FadeScrollBars();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getIsScrollContainer <em>Is Scroll Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Scroll Container</em>'.
	 * @see droid.EditText#getIsScrollContainer()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_IsScrollContainer();

	/**
	 * Returns the meta object for the attribute '{@link droid.EditText#getAutoLink <em>Auto Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Link</em>'.
	 * @see droid.EditText#getAutoLink()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_AutoLink();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getAutoText <em>Auto Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Text</em>'.
	 * @see droid.EditText#getAutoText()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_AutoText();

	/**
	 * Returns the meta object for the attribute '{@link droid.EditText#getCapitalize <em>Capitalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capitalize</em>'.
	 * @see droid.EditText#getCapitalize()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Capitalize();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digits</em>'.
	 * @see droid.EditText#getDigits()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Digits();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editable</em>'.
	 * @see droid.EditText#getEditable()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Editable();

	/**
	 * Returns the meta object for the attribute '{@link droid.EditText#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see droid.EditText#getGravity()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hint</em>'.
	 * @see droid.EditText#getHint()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Hint();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numeric</em>'.
	 * @see droid.EditText#getNumeric()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Numeric();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see droid.EditText#getPassword()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_Password();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone Number</em>'.
	 * @see droid.EditText#getPhoneNumber()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Line</em>'.
	 * @see droid.EditText#getSingleLine()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_SingleLine();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Color</em>'.
	 * @see droid.EditText#getTextColor()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link droid.EditText#getTypeface <em>Typeface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeface</em>'.
	 * @see droid.EditText#getTypeface()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_Typeface();

	/**
	 * Returns the meta object for the containment reference '{@link droid.EditText#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Size</em>'.
	 * @see droid.EditText#getTextSize()
	 * @see #getEditText()
	 * @generated
	 */
	EReference getEditText_TextSize();

	/**
	 * Returns the meta object for the attribute list '{@link droid.EditText#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Text Style</em>'.
	 * @see droid.EditText#getTextStyle()
	 * @see #getEditText()
	 * @generated
	 */
	EAttribute getEditText_TextStyle();

	/**
	 * Returns the meta object for class '{@link droid.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see droid.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see droid.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link droid.StringResource <em>String Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Resource</em>'.
	 * @see droid.StringResource
	 * @generated
	 */
	EClass getStringResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.StringResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.StringResource#getValue()
	 * @see #getStringResource()
	 * @generated
	 */
	EAttribute getStringResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.IntegerResource <em>Integer Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Resource</em>'.
	 * @see droid.IntegerResource
	 * @generated
	 */
	EClass getIntegerResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.IntegerResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.IntegerResource#getValue()
	 * @see #getIntegerResource()
	 * @generated
	 */
	EAttribute getIntegerResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.BooleanResource <em>Boolean Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Resource</em>'.
	 * @see droid.BooleanResource
	 * @generated
	 */
	EClass getBooleanResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.BooleanResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.BooleanResource#getValue()
	 * @see #getBooleanResource()
	 * @generated
	 */
	EAttribute getBooleanResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.ColorResource <em>Color Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Resource</em>'.
	 * @see droid.ColorResource
	 * @generated
	 */
	EClass getColorResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.ColorResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.ColorResource#getValue()
	 * @see #getColorResource()
	 * @generated
	 */
	EAttribute getColorResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.DimensionResource <em>Dimension Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Resource</em>'.
	 * @see droid.DimensionResource
	 * @generated
	 */
	EClass getDimensionResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.DimensionResource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.DimensionResource#getValue()
	 * @see #getDimensionResource()
	 * @generated
	 */
	EAttribute getDimensionResource_Value();

	/**
	 * Returns the meta object for class '{@link droid.ArrayResource <em>Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Resource</em>'.
	 * @see droid.ArrayResource
	 * @generated
	 */
	EClass getArrayResource();

	/**
	 * Returns the meta object for class '{@link droid.IntegerArrayResource <em>Integer Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Array Resource</em>'.
	 * @see droid.IntegerArrayResource
	 * @generated
	 */
	EClass getIntegerArrayResource();

	/**
	 * Returns the meta object for the attribute list '{@link droid.IntegerArrayResource#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see droid.IntegerArrayResource#getItems()
	 * @see #getIntegerArrayResource()
	 * @generated
	 */
	EAttribute getIntegerArrayResource_Items();

	/**
	 * Returns the meta object for class '{@link droid.StringArrayResource <em>String Array Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Array Resource</em>'.
	 * @see droid.StringArrayResource
	 * @generated
	 */
	EClass getStringArrayResource();

	/**
	 * Returns the meta object for the attribute list '{@link droid.StringArrayResource#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see droid.StringArrayResource#getItems()
	 * @see #getStringArrayResource()
	 * @generated
	 */
	EAttribute getStringArrayResource_Items();

	/**
	 * Returns the meta object for class '{@link droid.DrawableResource <em>Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable Resource</em>'.
	 * @see droid.DrawableResource
	 * @generated
	 */
	EClass getDrawableResource();

	/**
	 * Returns the meta object for class '{@link droid.BitmapDrawableResource <em>Bitmap Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap Drawable Resource</em>'.
	 * @see droid.BitmapDrawableResource
	 * @generated
	 */
	EClass getBitmapDrawableResource();

	/**
	 * Returns the meta object for the attribute '{@link droid.BitmapDrawableResource#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see droid.BitmapDrawableResource#getFilename()
	 * @see #getBitmapDrawableResource()
	 * @generated
	 */
	EAttribute getBitmapDrawableResource_Filename();

	/**
	 * Returns the meta object for class '{@link droid.TransitionDrawableResource <em>Transition Drawable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Drawable Resource</em>'.
	 * @see droid.TransitionDrawableResource
	 * @generated
	 */
	EClass getTransitionDrawableResource();

	/**
	 * Returns the meta object for the reference '{@link droid.TransitionDrawableResource#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see droid.TransitionDrawableResource#getFrom()
	 * @see #getTransitionDrawableResource()
	 * @generated
	 */
	EReference getTransitionDrawableResource_From();

	/**
	 * Returns the meta object for the reference '{@link droid.TransitionDrawableResource#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see droid.TransitionDrawableResource#getTo()
	 * @see #getTransitionDrawableResource()
	 * @generated
	 */
	EReference getTransitionDrawableResource_To();

	/**
	 * Returns the meta object for class '{@link droid.ValueAccess <em>Value Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Access</em>'.
	 * @see droid.ValueAccess
	 * @generated
	 */
	EClass getValueAccess();

	/**
	 * Returns the meta object for class '{@link droid.AnyDrawableVA <em>Any Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Drawable VA</em>'.
	 * @see droid.AnyDrawableVA
	 * @generated
	 */
	EClass getAnyDrawableVA();

	/**
	 * Returns the meta object for class '{@link droid.StringVA <em>String VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String VA</em>'.
	 * @see droid.StringVA
	 * @generated
	 */
	EClass getStringVA();

	/**
	 * Returns the meta object for the attribute '{@link droid.StringVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.StringVA#getValue()
	 * @see #getStringVA()
	 * @generated
	 */
	EAttribute getStringVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.IntegerVA <em>Integer VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer VA</em>'.
	 * @see droid.IntegerVA
	 * @generated
	 */
	EClass getIntegerVA();

	/**
	 * Returns the meta object for the attribute '{@link droid.IntegerVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.IntegerVA#getValue()
	 * @see #getIntegerVA()
	 * @generated
	 */
	EAttribute getIntegerVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.BooleanVA <em>Boolean VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean VA</em>'.
	 * @see droid.BooleanVA
	 * @generated
	 */
	EClass getBooleanVA();

	/**
	 * Returns the meta object for the attribute '{@link droid.BooleanVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.BooleanVA#getValue()
	 * @see #getBooleanVA()
	 * @generated
	 */
	EAttribute getBooleanVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.ColorVA <em>Color VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color VA</em>'.
	 * @see droid.ColorVA
	 * @generated
	 */
	EClass getColorVA();

	/**
	 * Returns the meta object for the attribute '{@link droid.ColorVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.ColorVA#getValue()
	 * @see #getColorVA()
	 * @generated
	 */
	EAttribute getColorVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.DimensionVA <em>Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension VA</em>'.
	 * @see droid.DimensionVA
	 * @generated
	 */
	EClass getDimensionVA();

	/**
	 * Returns the meta object for the attribute '{@link droid.DimensionVA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see droid.DimensionVA#getValue()
	 * @see #getDimensionVA()
	 * @generated
	 */
	EAttribute getDimensionVA_Value();

	/**
	 * Returns the meta object for class '{@link droid.LayoutDimensionVA <em>Layout Dimension VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Dimension VA</em>'.
	 * @see droid.LayoutDimensionVA
	 * @generated
	 */
	EClass getLayoutDimensionVA();

	/**
	 * Returns the meta object for the attribute '{@link droid.LayoutDimensionVA#getConst_value <em>Const value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const value</em>'.
	 * @see droid.LayoutDimensionVA#getConst_value()
	 * @see #getLayoutDimensionVA()
	 * @generated
	 */
	EAttribute getLayoutDimensionVA_Const_value();

	/**
	 * Returns the meta object for class '{@link droid.DrawableVA <em>Drawable VA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable VA</em>'.
	 * @see droid.DrawableVA
	 * @generated
	 */
	EClass getDrawableVA();

	/**
	 * Returns the meta object for class '{@link droid.ResourceAccess <em>Resource Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access</em>'.
	 * @see droid.ResourceAccess
	 * @generated
	 */
	EClass getResourceAccess();

	/**
	 * Returns the meta object for the attribute '{@link droid.ResourceAccess#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see droid.ResourceAccess#getPackage()
	 * @see #getResourceAccess()
	 * @generated
	 */
	EAttribute getResourceAccess_Package();

	/**
	 * Returns the meta object for the attribute '{@link droid.ResourceAccess#getExternalResource <em>External Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Resource</em>'.
	 * @see droid.ResourceAccess#getExternalResource()
	 * @see #getResourceAccess()
	 * @generated
	 */
	EAttribute getResourceAccess_ExternalResource();

	/**
	 * Returns the meta object for class '{@link droid.StringRA <em>String RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String RA</em>'.
	 * @see droid.StringRA
	 * @generated
	 */
	EClass getStringRA();

	/**
	 * Returns the meta object for the reference '{@link droid.StringRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.StringRA#getResource()
	 * @see #getStringRA()
	 * @generated
	 */
	EReference getStringRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.IntegerRA <em>Integer RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer RA</em>'.
	 * @see droid.IntegerRA
	 * @generated
	 */
	EClass getIntegerRA();

	/**
	 * Returns the meta object for the reference '{@link droid.IntegerRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.IntegerRA#getResource()
	 * @see #getIntegerRA()
	 * @generated
	 */
	EReference getIntegerRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.BooleanRA <em>Boolean RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean RA</em>'.
	 * @see droid.BooleanRA
	 * @generated
	 */
	EClass getBooleanRA();

	/**
	 * Returns the meta object for the reference '{@link droid.BooleanRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.BooleanRA#getResource()
	 * @see #getBooleanRA()
	 * @generated
	 */
	EReference getBooleanRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.ColorRA <em>Color RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color RA</em>'.
	 * @see droid.ColorRA
	 * @generated
	 */
	EClass getColorRA();

	/**
	 * Returns the meta object for the reference '{@link droid.ColorRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.ColorRA#getResource()
	 * @see #getColorRA()
	 * @generated
	 */
	EReference getColorRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.DimensionRA <em>Dimension RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension RA</em>'.
	 * @see droid.DimensionRA
	 * @generated
	 */
	EClass getDimensionRA();

	/**
	 * Returns the meta object for the reference '{@link droid.DimensionRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.DimensionRA#getResource()
	 * @see #getDimensionRA()
	 * @generated
	 */
	EReference getDimensionRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.ArrayRA <em>Array RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array RA</em>'.
	 * @see droid.ArrayRA
	 * @generated
	 */
	EClass getArrayRA();

	/**
	 * Returns the meta object for the attribute '{@link droid.ArrayRA#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see droid.ArrayRA#getPackage()
	 * @see #getArrayRA()
	 * @generated
	 */
	EAttribute getArrayRA_Package();

	/**
	 * Returns the meta object for the reference '{@link droid.ArrayRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.ArrayRA#getResource()
	 * @see #getArrayRA()
	 * @generated
	 */
	EReference getArrayRA_Resource();

	/**
	 * Returns the meta object for the attribute '{@link droid.ArrayRA#getExternalResource <em>External Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Resource</em>'.
	 * @see droid.ArrayRA#getExternalResource()
	 * @see #getArrayRA()
	 * @generated
	 */
	EAttribute getArrayRA_ExternalResource();

	/**
	 * Returns the meta object for class '{@link droid.DrawableRA <em>Drawable RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawable RA</em>'.
	 * @see droid.DrawableRA
	 * @generated
	 */
	EClass getDrawableRA();

	/**
	 * Returns the meta object for the reference '{@link droid.DrawableRA#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see droid.DrawableRA#getResource()
	 * @see #getDrawableRA()
	 * @generated
	 */
	EReference getDrawableRA_Resource();

	/**
	 * Returns the meta object for class '{@link droid.LayoutProperties <em>Layout Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Properties</em>'.
	 * @see droid.LayoutProperties
	 * @generated
	 */
	EClass getLayoutProperties();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_height <em>Layout height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout height</em>'.
	 * @see droid.LayoutProperties#getLayout_height()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_height();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_width <em>Layout width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout width</em>'.
	 * @see droid.LayoutProperties#getLayout_width()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_width();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_weight <em>Layout weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout weight</em>'.
	 * @see droid.LayoutProperties#getLayout_weight()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_weight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_marginBottom <em>Layout margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Bottom</em>'.
	 * @see droid.LayoutProperties#getLayout_marginBottom()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_marginBottom();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_marginLeft <em>Layout margin Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Left</em>'.
	 * @see droid.LayoutProperties#getLayout_marginLeft()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_marginLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_marginRight <em>Layout margin Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Right</em>'.
	 * @see droid.LayoutProperties#getLayout_marginRight()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_marginRight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_marginTop <em>Layout margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout margin Top</em>'.
	 * @see droid.LayoutProperties#getLayout_marginTop()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_marginTop();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutProperties#getLayout_above <em>Layout above</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout above</em>'.
	 * @see droid.LayoutProperties#getLayout_above()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_above();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutProperties#getLayout_alignBaseline <em>Layout align Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Baseline</em>'.
	 * @see droid.LayoutProperties#getLayout_alignBaseline()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignBaseline();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutProperties#getLayout_alignBottom <em>Layout align Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Bottom</em>'.
	 * @see droid.LayoutProperties#getLayout_alignBottom()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignBottom();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutProperties#getLayout_alignLeft <em>Layout align Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Left</em>'.
	 * @see droid.LayoutProperties#getLayout_alignLeft()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_alignParentBottom <em>Layout align Parent Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Bottom</em>'.
	 * @see droid.LayoutProperties#getLayout_alignParentBottom()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignParentBottom();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_alignParentLeft <em>Layout align Parent Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Left</em>'.
	 * @see droid.LayoutProperties#getLayout_alignParentLeft()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignParentLeft();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_alignParentRight <em>Layout align Parent Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Right</em>'.
	 * @see droid.LayoutProperties#getLayout_alignParentRight()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignParentRight();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_alignParentTop <em>Layout align Parent Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align Parent Top</em>'.
	 * @see droid.LayoutProperties#getLayout_alignParentTop()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignParentTop();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutProperties#getLayout_alignTop <em>Layout align Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout align Top</em>'.
	 * @see droid.LayoutProperties#getLayout_alignTop()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignTop();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_alignWithParentIfMissing <em>Layout align With Parent If Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout align With Parent If Missing</em>'.
	 * @see droid.LayoutProperties#getLayout_alignWithParentIfMissing()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_alignWithParentIfMissing();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutProperties#getLayout_below <em>Layout below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout below</em>'.
	 * @see droid.LayoutProperties#getLayout_below()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_below();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_centerHorizontal <em>Layout center Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center Horizontal</em>'.
	 * @see droid.LayoutProperties#getLayout_centerHorizontal()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_centerHorizontal();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_centerInParent <em>Layout center In Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center In Parent</em>'.
	 * @see droid.LayoutProperties#getLayout_centerInParent()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_centerInParent();

	/**
	 * Returns the meta object for the containment reference '{@link droid.LayoutProperties#getLayout_centerVertical <em>Layout center Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout center Vertical</em>'.
	 * @see droid.LayoutProperties#getLayout_centerVertical()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_centerVertical();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutProperties#getLayout_toLeftOf <em>Layout to Left Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout to Left Of</em>'.
	 * @see droid.LayoutProperties#getLayout_toLeftOf()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_toLeftOf();

	/**
	 * Returns the meta object for the reference '{@link droid.LayoutProperties#getLayout_toRightOf <em>Layout to Right Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout to Right Of</em>'.
	 * @see droid.LayoutProperties#getLayout_toRightOf()
	 * @see #getLayoutProperties()
	 * @generated
	 */
	EReference getLayoutProperties_Layout_toRightOf();

	/**
	 * Returns the meta object for enum '{@link droid.LayoutDimensionKind <em>Layout Dimension Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Dimension Kind</em>'.
	 * @see droid.LayoutDimensionKind
	 * @generated
	 */
	EEnum getLayoutDimensionKind();

	/**
	 * Returns the meta object for enum '{@link droid.LayoutVisibilityKind <em>Layout Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Visibility Kind</em>'.
	 * @see droid.LayoutVisibilityKind
	 * @generated
	 */
	EEnum getLayoutVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link droid.LayoutGravityKind <em>Layout Gravity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Gravity Kind</em>'.
	 * @see droid.LayoutGravityKind
	 * @generated
	 */
	EEnum getLayoutGravityKind();

	/**
	 * Returns the meta object for enum '{@link droid.LayoutOrientationKind <em>Layout Orientation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Orientation Kind</em>'.
	 * @see droid.LayoutOrientationKind
	 * @generated
	 */
	EEnum getLayoutOrientationKind();

	/**
	 * Returns the meta object for enum '{@link droid.AutoLinkKind <em>Auto Link Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auto Link Kind</em>'.
	 * @see droid.AutoLinkKind
	 * @generated
	 */
	EEnum getAutoLinkKind();

	/**
	 * Returns the meta object for enum '{@link droid.CapitalizeKind <em>Capitalize Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Capitalize Kind</em>'.
	 * @see droid.CapitalizeKind
	 * @generated
	 */
	EEnum getCapitalizeKind();

	/**
	 * Returns the meta object for enum '{@link droid.TypefaceKind <em>Typeface Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Typeface Kind</em>'.
	 * @see droid.TypefaceKind
	 * @generated
	 */
	EEnum getTypefaceKind();

	/**
	 * Returns the meta object for enum '{@link droid.TextStyleKind <em>Text Style Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Style Kind</em>'.
	 * @see droid.TextStyleKind
	 * @generated
	 */
	EEnum getTextStyleKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DroidFactory getDroidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link droid.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ApplicationImpl
		 * @see droid.impl.DroidPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PACKAGE_NAME = eINSTANCE.getApplication_PackageName();

		/**
		 * The meta object literal for the '<em><b>Version Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__VERSION_CODE = eINSTANCE.getApplication_VersionCode();

		/**
		 * The meta object literal for the '<em><b>Version Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__VERSION_NAME = eINSTANCE.getApplication_VersionName();

		/**
		 * The meta object literal for the '<em><b>Sdk Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SDK_VERSION = eINSTANCE.getApplication_SdkVersion();

		/**
		 * The meta object literal for the '<em><b>Screens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SCREENS = eINSTANCE.getApplication_Screens();

		/**
		 * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__LAYOUTS = eINSTANCE.getApplication_Layouts();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__RESOURCES = eINSTANCE.getApplication_Resources();

		/**
		 * The meta object literal for the '{@link droid.impl.ApplicationUsesSDKImpl <em>Application Uses SDK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ApplicationUsesSDKImpl
		 * @see droid.impl.DroidPackageImpl#getApplicationUsesSDK()
		 * @generated
		 */
		EClass APPLICATION_USES_SDK = eINSTANCE.getApplicationUsesSDK();

		/**
		 * The meta object literal for the '<em><b>Min Sdk Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_USES_SDK__MIN_SDK_VERSION = eINSTANCE.getApplicationUsesSDK_MinSdkVersion();

		/**
		 * The meta object literal for the '<em><b>Max Sdk Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_USES_SDK__MAX_SDK_VERSION = eINSTANCE.getApplicationUsesSDK_MaxSdkVersion();

		/**
		 * The meta object literal for the '<em><b>Target Sdk Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_USES_SDK__TARGET_SDK_VERSION = eINSTANCE.getApplicationUsesSDK_TargetSdkVersion();

		/**
		 * The meta object literal for the '{@link droid.impl.ScreenImpl <em>Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ScreenImpl
		 * @see droid.impl.DroidPackageImpl#getScreen()
		 * @generated
		 */
		EClass SCREEN = eINSTANCE.getScreen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN__NAME = eINSTANCE.getScreen_Name();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__LAYOUT = eINSTANCE.getScreen_Layout();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN__WIDGETS = eINSTANCE.getScreen_Widgets();

		/**
		 * The meta object literal for the '{@link droid.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ActionImpl
		 * @see droid.impl.DroidPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link droid.impl.GoToURLActionImpl <em>Go To URL Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.GoToURLActionImpl
		 * @see droid.impl.DroidPackageImpl#getGoToURLAction()
		 * @generated
		 */
		EClass GO_TO_URL_ACTION = eINSTANCE.getGoToURLAction();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_TO_URL_ACTION__URL = eINSTANCE.getGoToURLAction_Url();

		/**
		 * The meta object literal for the '{@link droid.impl.ShowLayoutActionImpl <em>Show Layout Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ShowLayoutActionImpl
		 * @see droid.impl.DroidPackageImpl#getShowLayoutAction()
		 * @generated
		 */
		EClass SHOW_LAYOUT_ACTION = eINSTANCE.getShowLayoutAction();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_LAYOUT_ACTION__LAYOUT = eINSTANCE.getShowLayoutAction_Layout();

		/**
		 * The meta object literal for the '{@link droid.impl.InvokeScreenActionImpl <em>Invoke Screen Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.InvokeScreenActionImpl
		 * @see droid.impl.DroidPackageImpl#getInvokeScreenAction()
		 * @generated
		 */
		EClass INVOKE_SCREEN_ACTION = eINSTANCE.getInvokeScreenAction();

		/**
		 * The meta object literal for the '<em><b>Screen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_SCREEN_ACTION__SCREEN = eINSTANCE.getInvokeScreenAction_Screen();

		/**
		 * The meta object literal for the '{@link droid.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.LayoutImpl
		 * @see droid.impl.DroidPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Is Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__IS_RELATIVE = eINSTANCE.getLayout_IsRelative();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ALPHA = eINSTANCE.getLayout_Alpha();

		/**
		 * The meta object literal for the '<em><b>Min Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__MIN_HEIGHT = eINSTANCE.getLayout_MinHeight();

		/**
		 * The meta object literal for the '<em><b>Min Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__MIN_WIDTH = eINSTANCE.getLayout_MinWidth();

		/**
		 * The meta object literal for the '<em><b>Next Focus Down</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__NEXT_FOCUS_DOWN = eINSTANCE.getLayout_NextFocusDown();

		/**
		 * The meta object literal for the '<em><b>Next Focus Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__NEXT_FOCUS_LEFT = eINSTANCE.getLayout_NextFocusLeft();

		/**
		 * The meta object literal for the '<em><b>Next Focus Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__NEXT_FOCUS_RIGHT = eINSTANCE.getLayout_NextFocusRight();

		/**
		 * The meta object literal for the '<em><b>Next Focus Up</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__NEXT_FOCUS_UP = eINSTANCE.getLayout_NextFocusUp();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PADDING = eINSTANCE.getLayout_Padding();

		/**
		 * The meta object literal for the '<em><b>Padding Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PADDING_BOTTOM = eINSTANCE.getLayout_PaddingBottom();

		/**
		 * The meta object literal for the '<em><b>Padding Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PADDING_LEFT = eINSTANCE.getLayout_PaddingLeft();

		/**
		 * The meta object literal for the '<em><b>Padding Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PADDING_RIGHT = eINSTANCE.getLayout_PaddingRight();

		/**
		 * The meta object literal for the '<em><b>Padding Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PADDING_TOP = eINSTANCE.getLayout_PaddingTop();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ROTATION = eINSTANCE.getLayout_Rotation();

		/**
		 * The meta object literal for the '<em><b>Rotation X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ROTATION_X = eINSTANCE.getLayout_RotationX();

		/**
		 * The meta object literal for the '<em><b>Rotation Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ROTATION_Y = eINSTANCE.getLayout_RotationY();

		/**
		 * The meta object literal for the '<em><b>Save Enabled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__SAVE_ENABLED = eINSTANCE.getLayout_SaveEnabled();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__SCALE_X = eINSTANCE.getLayout_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__SCALE_Y = eINSTANCE.getLayout_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Scroll X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__SCROLL_X = eINSTANCE.getLayout_ScrollX();

		/**
		 * The meta object literal for the '<em><b>Scroll Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__SCROLL_Y = eINSTANCE.getLayout_ScrollY();

		/**
		 * The meta object literal for the '<em><b>Scrollbars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__SCROLLBARS = eINSTANCE.getLayout_Scrollbars();

		/**
		 * The meta object literal for the '<em><b>Transform Pivot X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__TRANSFORM_PIVOT_X = eINSTANCE.getLayout_TransformPivotX();

		/**
		 * The meta object literal for the '<em><b>Transform Pivot Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__TRANSFORM_PIVOT_Y = eINSTANCE.getLayout_TransformPivotY();

		/**
		 * The meta object literal for the '<em><b>Translation X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__TRANSLATION_X = eINSTANCE.getLayout_TranslationX();

		/**
		 * The meta object literal for the '<em><b>Translation Y</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__TRANSLATION_Y = eINSTANCE.getLayout_TranslationY();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__VISIBILITY = eINSTANCE.getLayout_Visibility();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__GRAVITY = eINSTANCE.getLayout_Gravity();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ORIENTATION = eINSTANCE.getLayout_Orientation();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__VIEWS = eINSTANCE.getLayout_Views();

		/**
		 * The meta object literal for the '{@link droid.impl.ViewCollectionImpl <em>View Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ViewCollectionImpl
		 * @see droid.impl.DroidPackageImpl#getViewCollection()
		 * @generated
		 */
		EClass VIEW_COLLECTION = eINSTANCE.getViewCollection();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COLLECTION__VIEWS = eINSTANCE.getViewCollection_Views();

		/**
		 * The meta object literal for the '{@link droid.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ViewImpl
		 * @see droid.impl.DroidPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__BACKGROUND = eINSTANCE.getView_Background();

		/**
		 * The meta object literal for the '<em><b>On Click</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__ON_CLICK = eINSTANCE.getView_OnClick();

		/**
		 * The meta object literal for the '<em><b>Layout Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__LAYOUT_PROPERTIES = eINSTANCE.getView_LayoutProperties();

		/**
		 * The meta object literal for the '{@link droid.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.WidgetImpl
		 * @see droid.impl.DroidPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__TOP = eINSTANCE.getWidget_Top();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__LEFT = eINSTANCE.getWidget_Left();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__WIDTH = eINSTANCE.getWidget_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__HEIGHT = eINSTANCE.getWidget_Height();

		/**
		 * The meta object literal for the '<em><b>Clickable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__CLICKABLE = eINSTANCE.getWidget_Clickable();

		/**
		 * The meta object literal for the '{@link droid.impl.TextViewImpl <em>Text View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.TextViewImpl
		 * @see droid.impl.DroidPackageImpl#getTextView()
		 * @generated
		 */
		EClass TEXT_VIEW = eINSTANCE.getTextView();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__TEXT = eINSTANCE.getTextView_Text();

		/**
		 * The meta object literal for the '<em><b>Fade Scroll Bars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__FADE_SCROLL_BARS = eINSTANCE.getTextView_FadeScrollBars();

		/**
		 * The meta object literal for the '<em><b>Is Scroll Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__IS_SCROLL_CONTAINER = eINSTANCE.getTextView_IsScrollContainer();

		/**
		 * The meta object literal for the '<em><b>Auto Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VIEW__AUTO_LINK = eINSTANCE.getTextView_AutoLink();

		/**
		 * The meta object literal for the '<em><b>Auto Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__AUTO_TEXT = eINSTANCE.getTextView_AutoText();

		/**
		 * The meta object literal for the '<em><b>Capitalize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VIEW__CAPITALIZE = eINSTANCE.getTextView_Capitalize();

		/**
		 * The meta object literal for the '<em><b>Digits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__DIGITS = eINSTANCE.getTextView_Digits();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__EDITABLE = eINSTANCE.getTextView_Editable();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VIEW__GRAVITY = eINSTANCE.getTextView_Gravity();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__HINT = eINSTANCE.getTextView_Hint();

		/**
		 * The meta object literal for the '<em><b>Numeric</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__NUMERIC = eINSTANCE.getTextView_Numeric();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__PASSWORD = eINSTANCE.getTextView_Password();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__PHONE_NUMBER = eINSTANCE.getTextView_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Single Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__SINGLE_LINE = eINSTANCE.getTextView_SingleLine();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__TEXT_COLOR = eINSTANCE.getTextView_TextColor();

		/**
		 * The meta object literal for the '<em><b>Typeface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VIEW__TYPEFACE = eINSTANCE.getTextView_Typeface();

		/**
		 * The meta object literal for the '<em><b>Text Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_VIEW__TEXT_SIZE = eINSTANCE.getTextView_TextSize();

		/**
		 * The meta object literal for the '<em><b>Text Style</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VIEW__TEXT_STYLE = eINSTANCE.getTextView_TextStyle();

		/**
		 * The meta object literal for the '{@link droid.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ButtonImpl
		 * @see droid.impl.DroidPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__TEXT = eINSTANCE.getButton_Text();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__SRC = eINSTANCE.getButton_Src();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__HINT = eINSTANCE.getButton_Hint();

		/**
		 * The meta object literal for the '{@link droid.impl.ImageViewImpl <em>Image View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ImageViewImpl
		 * @see droid.impl.DroidPackageImpl#getImageView()
		 * @generated
		 */
		EClass IMAGE_VIEW = eINSTANCE.getImageView();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_VIEW__SRC = eINSTANCE.getImageView_Src();

		/**
		 * The meta object literal for the '<em><b>Fade Scroll Bars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_VIEW__FADE_SCROLL_BARS = eINSTANCE.getImageView_FadeScrollBars();

		/**
		 * The meta object literal for the '<em><b>Is Scroll Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_VIEW__IS_SCROLL_CONTAINER = eINSTANCE.getImageView_IsScrollContainer();

		/**
		 * The meta object literal for the '{@link droid.impl.SpinnerImpl <em>Spinner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.SpinnerImpl
		 * @see droid.impl.DroidPackageImpl#getSpinner()
		 * @generated
		 */
		EClass SPINNER = eINSTANCE.getSpinner();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPINNER__PROMPT = eINSTANCE.getSpinner_Prompt();

		/**
		 * The meta object literal for the '<em><b>Fade Scroll Bars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPINNER__FADE_SCROLL_BARS = eINSTANCE.getSpinner_FadeScrollBars();

		/**
		 * The meta object literal for the '<em><b>Is Scroll Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPINNER__IS_SCROLL_CONTAINER = eINSTANCE.getSpinner_IsScrollContainer();

		/**
		 * The meta object literal for the '{@link droid.impl.EditTextImpl <em>Edit Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.EditTextImpl
		 * @see droid.impl.DroidPackageImpl#getEditText()
		 * @generated
		 */
		EClass EDIT_TEXT = eINSTANCE.getEditText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__TEXT = eINSTANCE.getEditText_Text();

		/**
		 * The meta object literal for the '<em><b>Fade Scroll Bars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__FADE_SCROLL_BARS = eINSTANCE.getEditText_FadeScrollBars();

		/**
		 * The meta object literal for the '<em><b>Is Scroll Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__IS_SCROLL_CONTAINER = eINSTANCE.getEditText_IsScrollContainer();

		/**
		 * The meta object literal for the '<em><b>Auto Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_TEXT__AUTO_LINK = eINSTANCE.getEditText_AutoLink();

		/**
		 * The meta object literal for the '<em><b>Auto Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__AUTO_TEXT = eINSTANCE.getEditText_AutoText();

		/**
		 * The meta object literal for the '<em><b>Capitalize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_TEXT__CAPITALIZE = eINSTANCE.getEditText_Capitalize();

		/**
		 * The meta object literal for the '<em><b>Digits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__DIGITS = eINSTANCE.getEditText_Digits();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__EDITABLE = eINSTANCE.getEditText_Editable();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_TEXT__GRAVITY = eINSTANCE.getEditText_Gravity();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__HINT = eINSTANCE.getEditText_Hint();

		/**
		 * The meta object literal for the '<em><b>Numeric</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__NUMERIC = eINSTANCE.getEditText_Numeric();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__PASSWORD = eINSTANCE.getEditText_Password();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__PHONE_NUMBER = eINSTANCE.getEditText_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Single Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__SINGLE_LINE = eINSTANCE.getEditText_SingleLine();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__TEXT_COLOR = eINSTANCE.getEditText_TextColor();

		/**
		 * The meta object literal for the '<em><b>Typeface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_TEXT__TYPEFACE = eINSTANCE.getEditText_Typeface();

		/**
		 * The meta object literal for the '<em><b>Text Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_TEXT__TEXT_SIZE = eINSTANCE.getEditText_TextSize();

		/**
		 * The meta object literal for the '<em><b>Text Style</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_TEXT__TEXT_STYLE = eINSTANCE.getEditText_TextStyle();

		/**
		 * The meta object literal for the '{@link droid.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ResourceImpl
		 * @see droid.impl.DroidPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '{@link droid.impl.StringResourceImpl <em>String Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.StringResourceImpl
		 * @see droid.impl.DroidPackageImpl#getStringResource()
		 * @generated
		 */
		EClass STRING_RESOURCE = eINSTANCE.getStringResource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_RESOURCE__VALUE = eINSTANCE.getStringResource_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.IntegerResourceImpl <em>Integer Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.IntegerResourceImpl
		 * @see droid.impl.DroidPackageImpl#getIntegerResource()
		 * @generated
		 */
		EClass INTEGER_RESOURCE = eINSTANCE.getIntegerResource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RESOURCE__VALUE = eINSTANCE.getIntegerResource_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.BooleanResourceImpl <em>Boolean Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.BooleanResourceImpl
		 * @see droid.impl.DroidPackageImpl#getBooleanResource()
		 * @generated
		 */
		EClass BOOLEAN_RESOURCE = eINSTANCE.getBooleanResource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_RESOURCE__VALUE = eINSTANCE.getBooleanResource_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.ColorResourceImpl <em>Color Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ColorResourceImpl
		 * @see droid.impl.DroidPackageImpl#getColorResource()
		 * @generated
		 */
		EClass COLOR_RESOURCE = eINSTANCE.getColorResource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_RESOURCE__VALUE = eINSTANCE.getColorResource_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.DimensionResourceImpl <em>Dimension Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.DimensionResourceImpl
		 * @see droid.impl.DroidPackageImpl#getDimensionResource()
		 * @generated
		 */
		EClass DIMENSION_RESOURCE = eINSTANCE.getDimensionResource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_RESOURCE__VALUE = eINSTANCE.getDimensionResource_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.ArrayResourceImpl <em>Array Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ArrayResourceImpl
		 * @see droid.impl.DroidPackageImpl#getArrayResource()
		 * @generated
		 */
		EClass ARRAY_RESOURCE = eINSTANCE.getArrayResource();

		/**
		 * The meta object literal for the '{@link droid.impl.IntegerArrayResourceImpl <em>Integer Array Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.IntegerArrayResourceImpl
		 * @see droid.impl.DroidPackageImpl#getIntegerArrayResource()
		 * @generated
		 */
		EClass INTEGER_ARRAY_RESOURCE = eINSTANCE.getIntegerArrayResource();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_ARRAY_RESOURCE__ITEMS = eINSTANCE.getIntegerArrayResource_Items();

		/**
		 * The meta object literal for the '{@link droid.impl.StringArrayResourceImpl <em>String Array Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.StringArrayResourceImpl
		 * @see droid.impl.DroidPackageImpl#getStringArrayResource()
		 * @generated
		 */
		EClass STRING_ARRAY_RESOURCE = eINSTANCE.getStringArrayResource();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ARRAY_RESOURCE__ITEMS = eINSTANCE.getStringArrayResource_Items();

		/**
		 * The meta object literal for the '{@link droid.impl.DrawableResourceImpl <em>Drawable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.DrawableResourceImpl
		 * @see droid.impl.DroidPackageImpl#getDrawableResource()
		 * @generated
		 */
		EClass DRAWABLE_RESOURCE = eINSTANCE.getDrawableResource();

		/**
		 * The meta object literal for the '{@link droid.impl.BitmapDrawableResourceImpl <em>Bitmap Drawable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.BitmapDrawableResourceImpl
		 * @see droid.impl.DroidPackageImpl#getBitmapDrawableResource()
		 * @generated
		 */
		EClass BITMAP_DRAWABLE_RESOURCE = eINSTANCE.getBitmapDrawableResource();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_DRAWABLE_RESOURCE__FILENAME = eINSTANCE.getBitmapDrawableResource_Filename();

		/**
		 * The meta object literal for the '{@link droid.impl.TransitionDrawableResourceImpl <em>Transition Drawable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.TransitionDrawableResourceImpl
		 * @see droid.impl.DroidPackageImpl#getTransitionDrawableResource()
		 * @generated
		 */
		EClass TRANSITION_DRAWABLE_RESOURCE = eINSTANCE.getTransitionDrawableResource();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_DRAWABLE_RESOURCE__FROM = eINSTANCE.getTransitionDrawableResource_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_DRAWABLE_RESOURCE__TO = eINSTANCE.getTransitionDrawableResource_To();

		/**
		 * The meta object literal for the '{@link droid.impl.ValueAccessImpl <em>Value Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ValueAccessImpl
		 * @see droid.impl.DroidPackageImpl#getValueAccess()
		 * @generated
		 */
		EClass VALUE_ACCESS = eINSTANCE.getValueAccess();

		/**
		 * The meta object literal for the '{@link droid.impl.AnyDrawableVAImpl <em>Any Drawable VA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.AnyDrawableVAImpl
		 * @see droid.impl.DroidPackageImpl#getAnyDrawableVA()
		 * @generated
		 */
		EClass ANY_DRAWABLE_VA = eINSTANCE.getAnyDrawableVA();

		/**
		 * The meta object literal for the '{@link droid.impl.StringVAImpl <em>String VA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.StringVAImpl
		 * @see droid.impl.DroidPackageImpl#getStringVA()
		 * @generated
		 */
		EClass STRING_VA = eINSTANCE.getStringVA();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VA__VALUE = eINSTANCE.getStringVA_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.IntegerVAImpl <em>Integer VA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.IntegerVAImpl
		 * @see droid.impl.DroidPackageImpl#getIntegerVA()
		 * @generated
		 */
		EClass INTEGER_VA = eINSTANCE.getIntegerVA();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VA__VALUE = eINSTANCE.getIntegerVA_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.BooleanVAImpl <em>Boolean VA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.BooleanVAImpl
		 * @see droid.impl.DroidPackageImpl#getBooleanVA()
		 * @generated
		 */
		EClass BOOLEAN_VA = eINSTANCE.getBooleanVA();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VA__VALUE = eINSTANCE.getBooleanVA_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.ColorVAImpl <em>Color VA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ColorVAImpl
		 * @see droid.impl.DroidPackageImpl#getColorVA()
		 * @generated
		 */
		EClass COLOR_VA = eINSTANCE.getColorVA();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_VA__VALUE = eINSTANCE.getColorVA_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.DimensionVAImpl <em>Dimension VA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.DimensionVAImpl
		 * @see droid.impl.DroidPackageImpl#getDimensionVA()
		 * @generated
		 */
		EClass DIMENSION_VA = eINSTANCE.getDimensionVA();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_VA__VALUE = eINSTANCE.getDimensionVA_Value();

		/**
		 * The meta object literal for the '{@link droid.impl.LayoutDimensionVAImpl <em>Layout Dimension VA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.LayoutDimensionVAImpl
		 * @see droid.impl.DroidPackageImpl#getLayoutDimensionVA()
		 * @generated
		 */
		EClass LAYOUT_DIMENSION_VA = eINSTANCE.getLayoutDimensionVA();

		/**
		 * The meta object literal for the '<em><b>Const value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_DIMENSION_VA__CONST_VALUE = eINSTANCE.getLayoutDimensionVA_Const_value();

		/**
		 * The meta object literal for the '{@link droid.impl.DrawableVAImpl <em>Drawable VA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.DrawableVAImpl
		 * @see droid.impl.DroidPackageImpl#getDrawableVA()
		 * @generated
		 */
		EClass DRAWABLE_VA = eINSTANCE.getDrawableVA();

		/**
		 * The meta object literal for the '{@link droid.impl.ResourceAccessImpl <em>Resource Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ResourceAccessImpl
		 * @see droid.impl.DroidPackageImpl#getResourceAccess()
		 * @generated
		 */
		EClass RESOURCE_ACCESS = eINSTANCE.getResourceAccess();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS__PACKAGE = eINSTANCE.getResourceAccess_Package();

		/**
		 * The meta object literal for the '<em><b>External Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS__EXTERNAL_RESOURCE = eINSTANCE.getResourceAccess_ExternalResource();

		/**
		 * The meta object literal for the '{@link droid.impl.StringRAImpl <em>String RA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.StringRAImpl
		 * @see droid.impl.DroidPackageImpl#getStringRA()
		 * @generated
		 */
		EClass STRING_RA = eINSTANCE.getStringRA();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_RA__RESOURCE = eINSTANCE.getStringRA_Resource();

		/**
		 * The meta object literal for the '{@link droid.impl.IntegerRAImpl <em>Integer RA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.IntegerRAImpl
		 * @see droid.impl.DroidPackageImpl#getIntegerRA()
		 * @generated
		 */
		EClass INTEGER_RA = eINSTANCE.getIntegerRA();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_RA__RESOURCE = eINSTANCE.getIntegerRA_Resource();

		/**
		 * The meta object literal for the '{@link droid.impl.BooleanRAImpl <em>Boolean RA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.BooleanRAImpl
		 * @see droid.impl.DroidPackageImpl#getBooleanRA()
		 * @generated
		 */
		EClass BOOLEAN_RA = eINSTANCE.getBooleanRA();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_RA__RESOURCE = eINSTANCE.getBooleanRA_Resource();

		/**
		 * The meta object literal for the '{@link droid.impl.ColorRAImpl <em>Color RA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ColorRAImpl
		 * @see droid.impl.DroidPackageImpl#getColorRA()
		 * @generated
		 */
		EClass COLOR_RA = eINSTANCE.getColorRA();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_RA__RESOURCE = eINSTANCE.getColorRA_Resource();

		/**
		 * The meta object literal for the '{@link droid.impl.DimensionRAImpl <em>Dimension RA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.DimensionRAImpl
		 * @see droid.impl.DroidPackageImpl#getDimensionRA()
		 * @generated
		 */
		EClass DIMENSION_RA = eINSTANCE.getDimensionRA();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION_RA__RESOURCE = eINSTANCE.getDimensionRA_Resource();

		/**
		 * The meta object literal for the '{@link droid.impl.ArrayRAImpl <em>Array RA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.ArrayRAImpl
		 * @see droid.impl.DroidPackageImpl#getArrayRA()
		 * @generated
		 */
		EClass ARRAY_RA = eINSTANCE.getArrayRA();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_RA__PACKAGE = eINSTANCE.getArrayRA_Package();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_RA__RESOURCE = eINSTANCE.getArrayRA_Resource();

		/**
		 * The meta object literal for the '<em><b>External Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_RA__EXTERNAL_RESOURCE = eINSTANCE.getArrayRA_ExternalResource();

		/**
		 * The meta object literal for the '{@link droid.impl.DrawableRAImpl <em>Drawable RA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.DrawableRAImpl
		 * @see droid.impl.DroidPackageImpl#getDrawableRA()
		 * @generated
		 */
		EClass DRAWABLE_RA = eINSTANCE.getDrawableRA();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWABLE_RA__RESOURCE = eINSTANCE.getDrawableRA_Resource();

		/**
		 * The meta object literal for the '{@link droid.impl.LayoutPropertiesImpl <em>Layout Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.impl.LayoutPropertiesImpl
		 * @see droid.impl.DroidPackageImpl#getLayoutProperties()
		 * @generated
		 */
		EClass LAYOUT_PROPERTIES = eINSTANCE.getLayoutProperties();

		/**
		 * The meta object literal for the '<em><b>Layout height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_HEIGHT = eINSTANCE.getLayoutProperties_Layout_height();

		/**
		 * The meta object literal for the '<em><b>Layout width</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_WIDTH = eINSTANCE.getLayoutProperties_Layout_width();

		/**
		 * The meta object literal for the '<em><b>Layout weight</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_WEIGHT = eINSTANCE.getLayoutProperties_Layout_weight();

		/**
		 * The meta object literal for the '<em><b>Layout margin Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_MARGIN_BOTTOM = eINSTANCE.getLayoutProperties_Layout_marginBottom();

		/**
		 * The meta object literal for the '<em><b>Layout margin Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_MARGIN_LEFT = eINSTANCE.getLayoutProperties_Layout_marginLeft();

		/**
		 * The meta object literal for the '<em><b>Layout margin Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_MARGIN_RIGHT = eINSTANCE.getLayoutProperties_Layout_marginRight();

		/**
		 * The meta object literal for the '<em><b>Layout margin Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_MARGIN_TOP = eINSTANCE.getLayoutProperties_Layout_marginTop();

		/**
		 * The meta object literal for the '<em><b>Layout above</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ABOVE = eINSTANCE.getLayoutProperties_Layout_above();

		/**
		 * The meta object literal for the '<em><b>Layout align Baseline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_BASELINE = eINSTANCE.getLayoutProperties_Layout_alignBaseline();

		/**
		 * The meta object literal for the '<em><b>Layout align Bottom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_BOTTOM = eINSTANCE.getLayoutProperties_Layout_alignBottom();

		/**
		 * The meta object literal for the '<em><b>Layout align Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_LEFT = eINSTANCE.getLayoutProperties_Layout_alignLeft();

		/**
		 * The meta object literal for the '<em><b>Layout align Parent Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_BOTTOM = eINSTANCE.getLayoutProperties_Layout_alignParentBottom();

		/**
		 * The meta object literal for the '<em><b>Layout align Parent Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_LEFT = eINSTANCE.getLayoutProperties_Layout_alignParentLeft();

		/**
		 * The meta object literal for the '<em><b>Layout align Parent Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_RIGHT = eINSTANCE.getLayoutProperties_Layout_alignParentRight();

		/**
		 * The meta object literal for the '<em><b>Layout align Parent Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_TOP = eINSTANCE.getLayoutProperties_Layout_alignParentTop();

		/**
		 * The meta object literal for the '<em><b>Layout align Top</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_TOP = eINSTANCE.getLayoutProperties_Layout_alignTop();

		/**
		 * The meta object literal for the '<em><b>Layout align With Parent If Missing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING = eINSTANCE.getLayoutProperties_Layout_alignWithParentIfMissing();

		/**
		 * The meta object literal for the '<em><b>Layout below</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_BELOW = eINSTANCE.getLayoutProperties_Layout_below();

		/**
		 * The meta object literal for the '<em><b>Layout center Horizontal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_CENTER_HORIZONTAL = eINSTANCE.getLayoutProperties_Layout_centerHorizontal();

		/**
		 * The meta object literal for the '<em><b>Layout center In Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_CENTER_IN_PARENT = eINSTANCE.getLayoutProperties_Layout_centerInParent();

		/**
		 * The meta object literal for the '<em><b>Layout center Vertical</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_CENTER_VERTICAL = eINSTANCE.getLayoutProperties_Layout_centerVertical();

		/**
		 * The meta object literal for the '<em><b>Layout to Left Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_TO_LEFT_OF = eINSTANCE.getLayoutProperties_Layout_toLeftOf();

		/**
		 * The meta object literal for the '<em><b>Layout to Right Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_PROPERTIES__LAYOUT_TO_RIGHT_OF = eINSTANCE.getLayoutProperties_Layout_toRightOf();

		/**
		 * The meta object literal for the '{@link droid.LayoutDimensionKind <em>Layout Dimension Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.LayoutDimensionKind
		 * @see droid.impl.DroidPackageImpl#getLayoutDimensionKind()
		 * @generated
		 */
		EEnum LAYOUT_DIMENSION_KIND = eINSTANCE.getLayoutDimensionKind();

		/**
		 * The meta object literal for the '{@link droid.LayoutVisibilityKind <em>Layout Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.LayoutVisibilityKind
		 * @see droid.impl.DroidPackageImpl#getLayoutVisibilityKind()
		 * @generated
		 */
		EEnum LAYOUT_VISIBILITY_KIND = eINSTANCE.getLayoutVisibilityKind();

		/**
		 * The meta object literal for the '{@link droid.LayoutGravityKind <em>Layout Gravity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.LayoutGravityKind
		 * @see droid.impl.DroidPackageImpl#getLayoutGravityKind()
		 * @generated
		 */
		EEnum LAYOUT_GRAVITY_KIND = eINSTANCE.getLayoutGravityKind();

		/**
		 * The meta object literal for the '{@link droid.LayoutOrientationKind <em>Layout Orientation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.LayoutOrientationKind
		 * @see droid.impl.DroidPackageImpl#getLayoutOrientationKind()
		 * @generated
		 */
		EEnum LAYOUT_ORIENTATION_KIND = eINSTANCE.getLayoutOrientationKind();

		/**
		 * The meta object literal for the '{@link droid.AutoLinkKind <em>Auto Link Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.AutoLinkKind
		 * @see droid.impl.DroidPackageImpl#getAutoLinkKind()
		 * @generated
		 */
		EEnum AUTO_LINK_KIND = eINSTANCE.getAutoLinkKind();

		/**
		 * The meta object literal for the '{@link droid.CapitalizeKind <em>Capitalize Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.CapitalizeKind
		 * @see droid.impl.DroidPackageImpl#getCapitalizeKind()
		 * @generated
		 */
		EEnum CAPITALIZE_KIND = eINSTANCE.getCapitalizeKind();

		/**
		 * The meta object literal for the '{@link droid.TypefaceKind <em>Typeface Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.TypefaceKind
		 * @see droid.impl.DroidPackageImpl#getTypefaceKind()
		 * @generated
		 */
		EEnum TYPEFACE_KIND = eINSTANCE.getTypefaceKind();

		/**
		 * The meta object literal for the '{@link droid.TextStyleKind <em>Text Style Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see droid.TextStyleKind
		 * @see droid.impl.DroidPackageImpl#getTextStyleKind()
		 * @generated
		 */
		EEnum TEXT_STYLE_KIND = eINSTANCE.getTextStyleKind();

	}

} //DroidPackage
