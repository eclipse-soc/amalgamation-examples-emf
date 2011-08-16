/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.provider;


import droid.Application;
import droid.DroidFactory;
import droid.DroidPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link droid.Application} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationItemProvider
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
	public ApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPackageNamePropertyDescriptor(object);
			addVersionCodePropertyDescriptor(object);
			addVersionNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_name_feature", "_UI_Application_type"),
				 DroidPackage.Literals.APPLICATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_packageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_packageName_feature", "_UI_Application_type"),
				 DroidPackage.Literals.APPLICATION__PACKAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_versionCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_versionCode_feature", "_UI_Application_type"),
				 DroidPackage.Literals.APPLICATION__VERSION_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Application_versionName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Application_versionName_feature", "_UI_Application_type"),
				 DroidPackage.Literals.APPLICATION__VERSION_NAME,
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
			childrenFeatures.add(DroidPackage.Literals.APPLICATION__SDK_VERSION);
			childrenFeatures.add(DroidPackage.Literals.APPLICATION__SCREENS);
			childrenFeatures.add(DroidPackage.Literals.APPLICATION__LAYOUTS);
			childrenFeatures.add(DroidPackage.Literals.APPLICATION__RESOURCES);
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
	 * This returns Application.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Application"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Application)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Application_type") :
			getString("_UI_Application_type") + " " + label;
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

		switch (notification.getFeatureID(Application.class)) {
			case DroidPackage.APPLICATION__NAME:
			case DroidPackage.APPLICATION__PACKAGE_NAME:
			case DroidPackage.APPLICATION__VERSION_CODE:
			case DroidPackage.APPLICATION__VERSION_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.APPLICATION__SDK_VERSION:
			case DroidPackage.APPLICATION__SCREENS:
			case DroidPackage.APPLICATION__LAYOUTS:
			case DroidPackage.APPLICATION__RESOURCES:
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
				(DroidPackage.Literals.APPLICATION__SDK_VERSION,
				 DroidFactory.eINSTANCE.createApplicationUsesSDK()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__SCREENS,
				 DroidFactory.eINSTANCE.createScreen()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__LAYOUTS,
				 DroidFactory.eINSTANCE.createLayout()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createStringResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createIntegerResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createBooleanResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createColorResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createDimensionResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createArrayResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createIntegerArrayResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createStringArrayResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createDrawableResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createBitmapDrawableResource()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.APPLICATION__RESOURCES,
				 DroidFactory.eINSTANCE.createTransitionDrawableResource()));
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
