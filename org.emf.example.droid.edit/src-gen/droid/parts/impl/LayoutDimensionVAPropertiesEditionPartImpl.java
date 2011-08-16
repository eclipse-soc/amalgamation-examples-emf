/**
 * Generated with Acceleo
 */
package droid.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import droid.parts.DroidViewsRepository;
import droid.parts.LayoutDimensionVAPropertiesEditionPart;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class LayoutDimensionVAPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LayoutDimensionVAPropertiesEditionPart {

	protected EMFComboViewer const_value;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LayoutDimensionVAPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence layoutDimensionVAStep = new BindingCompositionSequence(propertiesEditionComponent);
		layoutDimensionVAStep
			.addStep(DroidViewsRepository.LayoutDimensionVA.Properties.class)
			.addStep(DroidViewsRepository.LayoutDimensionVA.Properties.const_value);
		
		
		composer = new PartComposer(layoutDimensionVAStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.LayoutDimensionVA.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == DroidViewsRepository.LayoutDimensionVA.Properties.const_value) {
					return createConst_valueEMFComboViewer(parent);
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
		propertiesGroup.setText(DroidMessages.LayoutDimensionVAPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createConst_valueEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, DroidMessages.LayoutDimensionVAPropertiesEditionPart_Const_valueLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.LayoutDimensionVA.Properties.const_value, DroidViewsRepository.SWT_KIND));
		const_value = new EMFComboViewer(parent);
		const_value.setContentProvider(new ArrayContentProvider());
		const_value.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData const_valueData = new GridData(GridData.FILL_HORIZONTAL);
		const_value.getCombo().setLayoutData(const_valueData);
		const_value.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LayoutDimensionVAPropertiesEditionPartImpl.this, DroidViewsRepository.LayoutDimensionVA.Properties.const_value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConst_value()));
			}

		});
		const_value.setID(DroidViewsRepository.LayoutDimensionVA.Properties.const_value);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.LayoutDimensionVA.Properties.const_value, DroidViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see droid.parts.LayoutDimensionVAPropertiesEditionPart#getConst_value()
	 * 
	 */
	public Enumerator getConst_value() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) const_value.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LayoutDimensionVAPropertiesEditionPart#initConst_value(EEnum eenum, Enumerator current)
	 */
	public void initConst_value(EEnum eenum, Enumerator current) {
		const_value.setInput(eenum.getELiterals());
		const_value.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.LayoutDimensionVAPropertiesEditionPart#setConst_value(Enumerator newValue)
	 * 
	 */
	public void setConst_value(Enumerator newValue) {
		const_value.modelUpdating(new StructuredSelection(newValue));
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.LayoutDimensionVA_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
