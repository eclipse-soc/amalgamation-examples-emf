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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import droid.ArrayRA;
import droid.ArrayResource;
import droid.DroidFactory;
import droid.DroidPackage;
import droid.parts.ArrayRAPropertiesEditionPart;
import droid.parts.DroidViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ArrayRAPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for resource EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings resourceSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public ArrayRAPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject arrayRA, String editing_mode) {
		super(editingContext, arrayRA, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.ArrayRA.class;
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
			final ArrayRA arrayRA = (ArrayRA)elt;
			final ArrayRAPropertiesEditionPart basePart = (ArrayRAPropertiesEditionPart)editingPart;
			// init values
			if (arrayRA.getPackage() != null && isAccessible(DroidViewsRepository.ArrayRA.Properties.package_))
				basePart.setPackage_(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), arrayRA.getPackage()));
			
			if (isAccessible(DroidViewsRepository.ArrayRA.Properties.resource)) {
				// init part
				resourceSettings = new EObjectFlatComboSettings(arrayRA, DroidPackage.eINSTANCE.getArrayRA_Resource());
				basePart.initResource(resourceSettings);
				// set the button mode
				basePart.setResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (arrayRA.getExternalResource() != null && isAccessible(DroidViewsRepository.ArrayRA.Properties.externalResource))
				basePart.setExternalResource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), arrayRA.getExternalResource()));
			
			// init filters
			
			basePart.addFilterToResource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ArrayResource); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for resource
			// End of user code
			
			
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
		ArrayRA arrayRA = (ArrayRA)semanticObject;
		if (DroidViewsRepository.ArrayRA.Properties.package_ == event.getAffectedEditor()) {
			arrayRA.setPackage((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.ArrayRA.Properties.resource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				resourceSettings.setToReference((ArrayResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ArrayResource eObject = DroidFactory.eINSTANCE.createArrayResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				resourceSettings.setToReference(eObject);
			}
		}
		if (DroidViewsRepository.ArrayRA.Properties.externalResource == event.getAffectedEditor()) {
			arrayRA.setExternalResource((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ArrayRAPropertiesEditionPart basePart = (ArrayRAPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getArrayRA_Package().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ArrayRA.Properties.package_)) {
				if (msg.getNewValue() != null) {
					basePart.setPackage_(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPackage_("");
				}
			}
			if (DroidPackage.eINSTANCE.getArrayRA_Resource().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ArrayRA.Properties.resource))
				basePart.setResource((EObject)msg.getNewValue());
			if (DroidPackage.eINSTANCE.getArrayRA_ExternalResource().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.ArrayRA.Properties.externalResource)) {
				if (msg.getNewValue() != null) {
					basePart.setExternalResource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setExternalResource("");
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
				if (DroidViewsRepository.ArrayRA.Properties.package_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getArrayRA_Package().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getArrayRA_Package().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.ArrayRA.Properties.externalResource == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getArrayRA_ExternalResource().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getArrayRA_ExternalResource().getEAttributeType(), newValue);
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
