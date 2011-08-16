/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.parts.DroidViewsRepository;
import droid.parts.InvokeScreenActionPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class InvokeScreenActionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, InvokeScreenActionPropertiesEditionPart {

	protected EObjectFlatComboViewer screen;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InvokeScreenActionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence invokeScreenActionStep = new BindingCompositionSequence(propertiesEditionComponent);
		invokeScreenActionStep
			.addStep(DroidViewsRepository.InvokeScreenAction.Properties.class)
			.addStep(DroidViewsRepository.InvokeScreenAction.Properties.screen);
		
		
		composer = new PartComposer(invokeScreenActionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.InvokeScreenAction.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.InvokeScreenAction.Properties.screen) {
					return createScreenFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(DroidMessages.InvokeScreenActionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createScreenFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.InvokeScreenActionPropertiesEditionPart_ScreenLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.InvokeScreenAction.Properties.screen, DroidViewsRepository.FORM_KIND));
		screen = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.InvokeScreenAction.Properties.screen, DroidViewsRepository.FORM_KIND));
		widgetFactory.adapt(screen);
		screen.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData screenData = new GridData(GridData.FILL_HORIZONTAL);
		screen.setLayoutData(screenData);
		screen.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InvokeScreenActionPropertiesEditionPartForm.this, DroidViewsRepository.InvokeScreenAction.Properties.screen, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getScreen()));
			}

		});
		screen.setID(DroidViewsRepository.InvokeScreenAction.Properties.screen);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.InvokeScreenAction.Properties.screen, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InvokeScreenActionPropertiesEditionPart#getScreen()
	 * 
	 */
	public EObject getScreen() {
		if (screen.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) screen.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InvokeScreenActionPropertiesEditionPart#initScreen(EObjectFlatComboSettings)
	 */
	public void initScreen(EObjectFlatComboSettings settings) {
		screen.setInput(settings);
		if (current != null) {
			screen.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InvokeScreenActionPropertiesEditionPart#setScreen(EObject newValue)
	 * 
	 */
	public void setScreen(EObject newValue) {
		if (newValue != null) {
			screen.setSelection(new StructuredSelection(newValue));
		} else {
			screen.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InvokeScreenActionPropertiesEditionPart#setScreenButtonMode(ButtonsModeEnum newValue)
	 */
	public void setScreenButtonMode(ButtonsModeEnum newValue) {
		screen.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InvokeScreenActionPropertiesEditionPart#addFilterScreen(ViewerFilter filter)
	 * 
	 */
	public void addFilterToScreen(ViewerFilter filter) {
		screen.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.InvokeScreenActionPropertiesEditionPart#addBusinessFilterScreen(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToScreen(ViewerFilter filter) {
		screen.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.InvokeScreenAction_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
