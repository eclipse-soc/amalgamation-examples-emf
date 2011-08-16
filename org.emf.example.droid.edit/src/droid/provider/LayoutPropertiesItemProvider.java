/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.provider;


import droid.DroidFactory;
import droid.DroidPackage;
import droid.LayoutProperties;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link droid.LayoutProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutPropertiesItemProvider
	extends ItemProviderAdapter
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
	public LayoutPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addLayout_abovePropertyDescriptor(object);
			addLayout_alignBaselinePropertyDescriptor(object);
			addLayout_alignBottomPropertyDescriptor(object);
			addLayout_alignLeftPropertyDescriptor(object);
			addLayout_alignTopPropertyDescriptor(object);
			addLayout_belowPropertyDescriptor(object);
			addLayout_toLeftOfPropertyDescriptor(object);
			addLayout_toRightOfPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Layout above feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_abovePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutProperties_layout_above_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutProperties_layout_above_feature", "_UI_LayoutProperties_type"),
				 DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ABOVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout align Baseline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_alignBaselinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutProperties_layout_alignBaseline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutProperties_layout_alignBaseline_feature", "_UI_LayoutProperties_type"),
				 DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_BASELINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout align Bottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_alignBottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutProperties_layout_alignBottom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutProperties_layout_alignBottom_feature", "_UI_LayoutProperties_type"),
				 DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_BOTTOM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout align Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_alignLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutProperties_layout_alignLeft_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutProperties_layout_alignLeft_feature", "_UI_LayoutProperties_type"),
				 DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_LEFT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout align Top feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_alignTopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutProperties_layout_alignTop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutProperties_layout_alignTop_feature", "_UI_LayoutProperties_type"),
				 DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_TOP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout below feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_belowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutProperties_layout_below_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutProperties_layout_below_feature", "_UI_LayoutProperties_type"),
				 DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_BELOW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout to Left Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_toLeftOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutProperties_layout_toLeftOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutProperties_layout_toLeftOf_feature", "_UI_LayoutProperties_type"),
				 DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_TO_LEFT_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout to Right Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_toRightOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutProperties_layout_toRightOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutProperties_layout_toRightOf_feature", "_UI_LayoutProperties_type"),
				 DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_TO_RIGHT_OF,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_HEIGHT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_WIDTH);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_WEIGHT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_BOTTOM);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_LEFT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_RIGHT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_TOP);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_BOTTOM);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_LEFT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_RIGHT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_TOP);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_HORIZONTAL);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_IN_PARENT);
			childrenFeatures.add(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_VERTICAL);
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
	 * This returns LayoutProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LayoutProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LayoutProperties_type");
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

		switch (notification.getFeatureID(LayoutProperties.class)) {
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_HEIGHT:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_WIDTH:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_WEIGHT:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_MARGIN_BOTTOM:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_MARGIN_LEFT:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_MARGIN_RIGHT:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_MARGIN_TOP:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_BOTTOM:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_LEFT:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_RIGHT:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_TOP:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_CENTER_HORIZONTAL:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_CENTER_IN_PARENT:
			case DroidPackage.LAYOUT_PROPERTIES__LAYOUT_CENTER_VERTICAL:
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
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_HEIGHT,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_HEIGHT,
				 DroidFactory.eINSTANCE.createLayoutDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_HEIGHT,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_WIDTH,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_WIDTH,
				 DroidFactory.eINSTANCE.createLayoutDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_WIDTH,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_WEIGHT,
				 DroidFactory.eINSTANCE.createIntegerVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_WEIGHT,
				 DroidFactory.eINSTANCE.createIntegerRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_BOTTOM,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_BOTTOM,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_LEFT,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_LEFT,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_RIGHT,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_RIGHT,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_TOP,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_TOP,
				 DroidFactory.eINSTANCE.createDimensionRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_BOTTOM,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_BOTTOM,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_LEFT,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_LEFT,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_RIGHT,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_RIGHT,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_TOP,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_TOP,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_HORIZONTAL,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_HORIZONTAL,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_IN_PARENT,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_IN_PARENT,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_VERTICAL,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_VERTICAL,
				 DroidFactory.eINSTANCE.createBooleanRA()));
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
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_HEIGHT ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_WIDTH ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_BOTTOM ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_LEFT ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_RIGHT ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_MARGIN_TOP ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_BOTTOM ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_LEFT ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_RIGHT ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_PARENT_TOP ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_HORIZONTAL ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_IN_PARENT ||
			childFeature == DroidPackage.Literals.LAYOUT_PROPERTIES__LAYOUT_CENTER_VERTICAL;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DroidEditPlugin.INSTANCE;
	}

}
