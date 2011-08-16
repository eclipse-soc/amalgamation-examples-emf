/**
 * Generated with Acceleo
 */
package droid.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import droid.BitmapDrawableResource;
import droid.DroidPackage;
import droid.parts.BitmapDrawableResourcePropertiesEditionPart;
import droid.parts.DroidViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BitmapDrawableResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public BitmapDrawableResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bitmapDrawableResource, String editing_mode) {
		super(editingContext, bitmapDrawableResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.BitmapDrawableResource.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final BitmapDrawableResource bitmapDrawableResource = (BitmapDrawableResource)elt;
			final BitmapDrawableResourcePropertiesEditionPart basePart = (BitmapDrawableResourcePropertiesEditionPart)editingPart;
			// init values
			if (bitmapDrawableResource.getName() != null && isAccessible(DroidViewsRepository.BitmapDrawableResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), bitmapDrawableResource.getName()));
			
			if (bitmapDrawableResource.getFilename() != null && isAccessible(DroidViewsRepository.BitmapDrawableResource.Properties.filename))
				basePart.setFilename(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), bitmapDrawableResource.getFilename()));
			
			// init filters
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BitmapDrawableResource bitmapDrawableResource = (BitmapDrawableResource)semanticObject;
		if (DroidViewsRepository.BitmapDrawableResource.Properties.name == event.getAffectedEditor()) {
			bitmapDrawableResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.BitmapDrawableResource.Properties.filename == event.getAffectedEditor()) {
			bitmapDrawableResource.setFilename((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			BitmapDrawableResourcePropertiesEditionPart basePart = (BitmapDrawableResourcePropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getResource_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.BitmapDrawableResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DroidPackage.eINSTANCE.getBitmapDrawableResource_Filename().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.BitmapDrawableResource.Properties.filename)) {
				if (msg.getNewValue() != null) {
					basePart.setFilename(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setFilename("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (DroidViewsRepository.BitmapDrawableResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getResource_Name().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.BitmapDrawableResource.Properties.filename == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getBitmapDrawableResource_Filename().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getBitmapDrawableResource_Filename().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
