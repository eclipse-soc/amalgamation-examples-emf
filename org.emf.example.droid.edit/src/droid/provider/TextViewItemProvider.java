/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.provider;


import droid.DroidFactory;
import droid.DroidPackage;
import droid.TextView;

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
 * This is the item provider adapter for a {@link droid.TextView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextViewItemProvider
	extends WidgetItemProvider
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
	public TextViewItemProvider(AdapterFactory adapterFactory) {
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

			addAutoLinkPropertyDescriptor(object);
			addCapitalizePropertyDescriptor(object);
			addGravityPropertyDescriptor(object);
			addTypefacePropertyDescriptor(object);
			addTextStylePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextView_autoLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_autoLink_feature", "_UI_TextView_type"),
				 DroidPackage.Literals.TEXT_VIEW__AUTO_LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capitalize feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapitalizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextView_capitalize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_capitalize_feature", "_UI_TextView_type"),
				 DroidPackage.Literals.TEXT_VIEW__CAPITALIZE,
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
				 getString("_UI_TextView_gravity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_gravity_feature", "_UI_TextView_type"),
				 DroidPackage.Literals.TEXT_VIEW__GRAVITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Typeface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypefacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextView_typeface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_typeface_feature", "_UI_TextView_type"),
				 DroidPackage.Literals.TEXT_VIEW__TYPEFACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextView_textStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_textStyle_feature", "_UI_TextView_type"),
				 DroidPackage.Literals.TEXT_VIEW__TEXT_STYLE,
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
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__TEXT);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__FADE_SCROLL_BARS);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__IS_SCROLL_CONTAINER);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__AUTO_TEXT);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__DIGITS);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__EDITABLE);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__HINT);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__NUMERIC);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__PASSWORD);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__PHONE_NUMBER);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__SINGLE_LINE);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__TEXT_COLOR);
			childrenFeatures.add(DroidPackage.Literals.TEXT_VIEW__TEXT_SIZE);
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
	 * This returns TextView.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextView"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TextView)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TextView_type") :
			getString("_UI_TextView_type") + " " + label;
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

		switch (notification.getFeatureID(TextView.class)) {
			case DroidPackage.TEXT_VIEW__AUTO_LINK:
			case DroidPackage.TEXT_VIEW__CAPITALIZE:
			case DroidPackage.TEXT_VIEW__GRAVITY:
			case DroidPackage.TEXT_VIEW__TYPEFACE:
			case DroidPackage.TEXT_VIEW__TEXT_STYLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.TEXT_VIEW__TEXT:
			case DroidPackage.TEXT_VIEW__FADE_SCROLL_BARS:
			case DroidPackage.TEXT_VIEW__IS_SCROLL_CONTAINER:
			case DroidPackage.TEXT_VIEW__AUTO_TEXT:
			case DroidPackage.TEXT_VIEW__DIGITS:
			case DroidPackage.TEXT_VIEW__EDITABLE:
			case DroidPackage.TEXT_VIEW__HINT:
			case DroidPackage.TEXT_VIEW__NUMERIC:
			case DroidPackage.TEXT_VIEW__PASSWORD:
			case DroidPackage.TEXT_VIEW__PHONE_NUMBER:
			case DroidPackage.TEXT_VIEW__SINGLE_LINE:
			case DroidPackage.TEXT_VIEW__TEXT_COLOR:
			case DroidPackage.TEXT_VIEW__TEXT_SIZE:
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
				(DroidPackage.Literals.TEXT_VIEW__TEXT,
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__TEXT,
				 DroidFactory.eINSTANCE.createStringRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__FADE_SCROLL_BARS,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__FADE_SCROLL_BARS,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__IS_SCROLL_CONTAINER,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__IS_SCROLL_CONTAINER,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__AUTO_TEXT,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__AUTO_TEXT,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__DIGITS,
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__DIGITS,
				 DroidFactory.eINSTANCE.createStringRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__EDITABLE,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__EDITABLE,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__HINT,
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__HINT,
				 DroidFactory.eINSTANCE.createStringRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__NUMERIC,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__NUMERIC,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__PASSWORD,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__PASSWORD,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__PHONE_NUMBER,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__PHONE_NUMBER,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__SINGLE_LINE,
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__SINGLE_LINE,
				 DroidFactory.eINSTANCE.createBooleanRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__TEXT_COLOR,
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__TEXT_COLOR,
				 DroidFactory.eINSTANCE.createColorRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__TEXT_SIZE,
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.TEXT_VIEW__TEXT_SIZE,
				 DroidFactory.eINSTANCE.createDimensionRA()));
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
			childFeature == DroidPackage.Literals.VIEW__BACKGROUND ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__TEXT_COLOR ||
			childFeature == DroidPackage.Literals.WIDGET__TOP ||
			childFeature == DroidPackage.Literals.WIDGET__LEFT ||
			childFeature == DroidPackage.Literals.WIDGET__WIDTH ||
			childFeature == DroidPackage.Literals.WIDGET__HEIGHT ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__TEXT_SIZE ||
			childFeature == DroidPackage.Literals.WIDGET__CLICKABLE ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__FADE_SCROLL_BARS ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__IS_SCROLL_CONTAINER ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__AUTO_TEXT ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__EDITABLE ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__NUMERIC ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__PASSWORD ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__PHONE_NUMBER ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__SINGLE_LINE ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__TEXT ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__DIGITS ||
			childFeature == DroidPackage.Literals.TEXT_VIEW__HINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
