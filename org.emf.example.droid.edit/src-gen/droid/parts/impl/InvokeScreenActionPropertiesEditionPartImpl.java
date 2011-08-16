/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import droid.parts.DroidViewsRepository;
import droid.parts.InvokeScreenActionPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class InvokeScreenActionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InvokeScreenActionPropertiesEditionPart {

	protected EObjectFlatComboViewer screen;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InvokeScreenActionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence invokeScreenActionStep = new BindingCompositionSequence(propertiesEditionComponent);
		invokeScreenActionStep
			.addStep(DroidViewsRepository.InvokeScreenAction.Properties.class)
			.addStep(DroidViewsRepository.InvokeScreenAction.Properties.screen);
		
		
		composer = new PartComposer(invokeScreenActionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.InvokeScreenAction.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.InvokeScreenAction.Properties.screen) {
					return createScreenFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(DroidMessages.InvokeScreenActionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createScreenFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.InvokeScreenActionPropertiesEditionPart_ScreenLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.InvokeScreenAction.Properties.screen, DroidViewsRepository.SWT_KIND));
		screen = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(DroidViewsRepository.InvokeScreenAction.Properties.screen, DroidViewsRepository.SWT_KIND));
		screen.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		screen.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InvokeScreenActionPropertiesEditionPartImpl.this, DroidViewsRepository.InvokeScreenAction.Properties.screen, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScreen()));
			}

		});
		GridData screenData = new GridData(GridData.FILL_HORIZONTAL);
		screen.setLayoutData(screenData);
		screen.setID(DroidViewsRepository.InvokeScreenAction.Properties.screen);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.InvokeScreenAction.Properties.screen, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
