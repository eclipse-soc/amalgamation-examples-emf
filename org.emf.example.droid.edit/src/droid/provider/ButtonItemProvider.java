/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package droid.provider;


import droid.Button;
import droid.DroidFactory;
import droid.DroidPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link droid.Button} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ButtonItemProvider
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
	public ButtonItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DroidPackage.Literals.BUTTON__TEXT);
			childrenFeatures.add(DroidPackage.Literals.BUTTON__SRC);
			childrenFeatures.add(DroidPackage.Literals.BUTTON__HINT);
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
	 * This returns Button.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Button"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Button)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Button_type") :
			getString("_UI_Button_type") + " " + label;
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

		switch (notification.getFeatureID(Button.class)) {
			case DroidPackage.BUTTON__TEXT:
			case DroidPackage.BUTTON__SRC:
			case DroidPackage.BUTTON__HINT:
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
				(DroidPackage.Literals.BUTTON__TEXT,
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.BUTTON__TEXT,
				 DroidFactory.eINSTANCE.createStringRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.BUTTON__SRC,
				 DroidFactory.eINSTANCE.createAnyDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.BUTTON__SRC,
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.BUTTON__SRC,
				 DroidFactory.eINSTANCE.createDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.BUTTON__SRC,
				 DroidFactory.eINSTANCE.createColorRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.BUTTON__SRC,
				 DroidFactory.eINSTANCE.createDrawableRA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.BUTTON__HINT,
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.Literals.BUTTON__HINT,
				 DroidFactory.eINSTANCE.createStringRA()));
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
			childFeature == DroidPackage.Literals.BUTTON__SRC ||
			childFeature == DroidPackage.Literals.WIDGET__TOP ||
			childFeature == DroidPackage.Literals.WIDGET__LEFT ||
			childFeature == DroidPackage.Literals.WIDGET__WIDTH ||
			childFeature == DroidPackage.Literals.WIDGET__HEIGHT ||
			childFeature == DroidPackage.Literals.BUTTON__TEXT ||
			childFeature == DroidPackage.Literals.BUTTON__HINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
