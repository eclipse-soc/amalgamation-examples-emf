/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.provider;


import droid.DroidFactory;
import droid.DroidPackage;
import droid.Layout;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link droid.Layout} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutItemProvider
	extends ViewItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIsRelativePropertyDescriptor(object);
			addAlphaPropertyDescriptor(object);
			addNextFocusDownPropertyDescriptor(object);
			addNextFocusLeftPropertyDescriptor(object);
			addNextFocusRightPropertyDescriptor(object);
			addNextFocusUpPropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addGravityPropertyDescriptor(object);
			addOrientationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Relative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRelativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_isRelative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_isRelative_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__IS_RELATIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alpha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlphaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_alpha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_alpha_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__ALPHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Focus Down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFocusDownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_nextFocusDown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_nextFocusDown_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__NEXT_FOCUS_DOWN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Focus Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFocusLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_nextFocusLeft_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_nextFocusLeft_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__NEXT_FOCUS_LEFT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Focus Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFocusRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_nextFocusRight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_nextFocusRight_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__NEXT_FOCUS_RIGHT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Focus Up feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFocusUpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_nextFocusUp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_nextFocusUp_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__NEXT_FOCUS_UP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_visibility_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__VISIBILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gravity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGravityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_gravity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_gravity_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__GRAVITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orientation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrientationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_orientation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_orientation_feature", "_UI_Layout_type"),
				 DroidPackage.Literals.LAYOUT__ORIENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__MIN_HEIGHT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__MIN_WIDTH);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__PADDING);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__PADDING_BOTTOM);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__PADDING_LEFT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__PADDING_RIGHT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__PADDING_TOP);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__ROTATION);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__ROTATION_X);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__ROTATION_Y);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__SAVE_ENABLED);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__SCALE_X);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__SCALE_Y);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__SCROLL_X);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__SCROLL_Y);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__SCROLLBARS);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__TRANSFORM_PIVOT_X);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__TRANSFORM_PIVOT_Y);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__TRANSLATION_X);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__TRANSLATION_Y);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT__VIEWS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Layout.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Layout"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Layout)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Layout_type") :
			getString("_UI_Layout_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Layout.class)) {
			case DroidPackage.LAYOUT__IS_RELATIVE:
			case DroidPackage.LAYOUT__ALPHA:
			case DroidPackage.LAYOUT__VISIBILITY:
			case DroidPackage.LAYOUT__GRAVITY:
			case DroidPackage.LAYOUT__ORIENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.LAYOUT__MIN_HEIGHT:
			case DroidPackage.LAYOUT__MIN_WIDTH:
			case DroidPackage.LAYOUT__PADDING:
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
			case DroidPackage.LAYOUT__PADDING_LEFT:
			case DroidPackage.LAYOUT__PADDING_RIGHT:
			case DroidPackage.LAYOUT__PADDING_TOP:
			case DroidPackage.LAYOUT__ROTATION:
			case DroidPackage.LAYOUT__ROTATION_X:
			case DroidPackage.LAYOUT__ROTATION_Y:
			case DroidPackage.LAYOUT__SAVE_ENABLED:
			case DroidPackage.LAYOUT__SCALE_X:
			case DroidPackage.LAYOUT__SCALE_Y:
			case DroidPackage.LAYOUT__SCROLL_X:
			case DroidPackage.LAYOUT__SCROLL_Y:
			case DroidPackage.LAYOUT__SCROLLBARS:
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_X:
			case DroidPackage.LAYOUT__TRANSFORM_PIVOT_Y:
			case DroidPackage.LAYOUT__TRANSLATION_X:
			case DroidPackage.LAYOUT__TRANSLATION_Y:
			case DroidPackage.LAYOUT__VIEWS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__MIN_HEIGHT,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__MIN_HEIGHT,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__MIN_WIDTH,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__MIN_WIDTH,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING_BOTTOM,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING_BOTTOM,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING_LEFT,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING_LEFT,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING_RIGHT,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING_RIGHT,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING_TOP,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__PADDING_TOP,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__ROTATION,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__ROTATION,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__ROTATION_X,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__ROTATION_X,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__ROTATION_Y,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__ROTATION_Y,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SAVE_ENABLED,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SAVE_ENABLED,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCALE_X,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCALE_X,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCALE_Y,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCALE_Y,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCROLL_X,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCROLL_X,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCROLL_Y,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCROLL_Y,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCROLLBARS,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__SCROLLBARS,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__TRANSFORM_PIVOT_X,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__TRANSFORM_PIVOT_X,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__TRANSFORM_PIVOT_Y,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__TRANSFORM_PIVOT_Y,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__TRANSLATION_X,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__TRANSLATION_X,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__TRANSLATION_Y,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__TRANSLATION_Y,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT__VIEWS,
				 DroidFactory.eINSTANCE.createViewCollection()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DroidPackage.Literals.LAYOUT__MIN_HEIGHT ||
			childFeature == DroidPackage.Literals.LAYOUT__MIN_WIDTH ||
			childFeature == DroidPackage.Literals.LAYOUT__PADDING ||
			childFeature == DroidPackage.Literals.LAYOUT__PADDING_BOTTOM ||
			childFeature == DroidPackage.Literals.LAYOUT__PADDING_LEFT ||
			childFeature == DroidPackage.Literals.LAYOUT__PADDING_RIGHT ||
			childFeature == DroidPackage.Literals.LAYOUT__PADDING_TOP ||
			childFeature == DroidPackage.Literals.LAYOUT__ROTATION ||
			childFeature == DroidPackage.Literals.LAYOUT__ROTATION_X ||
			childFeature == DroidPackage.Literals.LAYOUT__ROTATION_Y ||
			childFeature == DroidPackage.Literals.LAYOUT__SCALE_X ||
			childFeature == DroidPackage.Literals.LAYOUT__SCALE_Y ||
			childFeature == DroidPackage.Literals.LAYOUT__SCROLL_X ||
			childFeature == DroidPackage.Literals.LAYOUT__SCROLL_Y ||
			childFeature == DroidPackage.Literals.LAYOUT__TRANSFORM_PIVOT_X ||
			childFeature == DroidPackage.Literals.LAYOUT__TRANSFORM_PIVOT_Y ||
			childFeature == DroidPackage.Literals.LAYOUT__TRANSLATION_X ||
			childFeature == DroidPackage.Literals.LAYOUT__TRANSLATION_Y ||
			childFeature == DroidPackage.Literals.LAYOUT__SAVE_ENABLED ||
			childFeature == DroidPackage.Literals.LAYOUT__SCROLLBARS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
