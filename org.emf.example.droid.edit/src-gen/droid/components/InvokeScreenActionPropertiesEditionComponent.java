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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import droid.DroidFactory;
import droid.DroidPackage;
import droid.InvokeScreenAction;
import droid.Screen;
import droid.parts.DroidViewsRepository;
import droid.parts.InvokeScreenActionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class InvokeScreenActionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for screen EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings screenSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public InvokeScreenActionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject invokeScreenAction, String editing_mode) {
		super(editingContext, invokeScreenAction, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.InvokeScreenAction.class;
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
			final InvokeScreenAction invokeScreenAction = (InvokeScreenAction)elt;
			final InvokeScreenActionPropertiesEditionPart basePart = (InvokeScreenActionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.InvokeScreenAction.Properties.screen)) {
				// init part
				screenSettings = new EObjectFlatComboSettings(invokeScreenAction, DroidPackage.eINSTANCE.getInvokeScreenAction_Screen());
				basePart.initScreen(screenSettings);
				// set the button mode
				basePart.setScreenButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToScreen(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Screen); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for screen
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
		InvokeScreenAction invokeScreenAction = (InvokeScreenAction)semanticObject;
		if (DroidViewsRepository.InvokeScreenAction.Properties.screen == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				screenSettings.setToReference((Screen)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Screen eObject = DroidFactory.eINSTANCE.createScreen();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				screenSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			InvokeScreenActionPropertiesEditionPart basePart = (InvokeScreenActionPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getInvokeScreenAction_Screen().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.InvokeScreenAction.Properties.screen))
				basePart.setScreen((EObject)msg.getNewValue());
			
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
