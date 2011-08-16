/**
 * Generated with Acceleo
 */
package droid.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import droid.DimensionVA;
import droid.DroidPackage;
import droid.LayoutDimensionKind;
import droid.parts.DimensionVAPropertiesEditionPart;
import droid.parts.DroidViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DimensionVAPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Default constructor
	 * 
	 */
	public DimensionVAPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject dimensionVA, String editing_mode) {
		super(editingContext, dimensionVA, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.DimensionVA.class;
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
			final DimensionVA dimensionVA = (DimensionVA)elt;
			final DimensionVAPropertiesEditionPart basePart = (DimensionVAPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.DimensionVA.Properties.const_value)) {
				basePart.initConst_value((EEnum) DroidPackage.eINSTANCE.getLayoutDimensionVA_Const_value().getEType(), dimensionVA.getConst_value());
			}
			if (dimensionVA.getValue() != null && isAccessible(DroidViewsRepository.DimensionVA.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dimensionVA.getValue()));
			
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
		DimensionVA dimensionVA = (DimensionVA)semanticObject;
		if (DroidViewsRepository.DimensionVA.Properties.const_value == event.getAffectedEditor()) {
			dimensionVA.setConst_value((LayoutDimensionKind)event.getNewValue());
		}
		if (DroidViewsRepository.DimensionVA.Properties.value == event.getAffectedEditor()) {
			dimensionVA.setValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DimensionVAPropertiesEditionPart basePart = (DimensionVAPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getLayoutDimensionVA_Const_value().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.DimensionVA.Properties.const_value))
				basePart.setConst_value((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getDimensionVA_Value().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.DimensionVA.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setValue("");
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
				if (DroidViewsRepository.DimensionVA.Properties.const_value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getLayoutDimensionVA_Const_value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getLayoutDimensionVA_Const_value().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.DimensionVA.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getDimensionVA_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getDimensionVA_Value().getEAttributeType(), newValue);
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
