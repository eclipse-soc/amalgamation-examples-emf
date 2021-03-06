/**
 * Generated with Acceleo
 */
package droid.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface BooleanRAPropertiesEditionPart {

	/**
	 * @return the value
	 * 
	 */
	public String getValue();

	/**
	 * Defines a new value
	 * @param newValue the new value to set
	 * 
	 */
	public void setValue(String newValue);


	/**
	 * @return the package
	 * 
	 */
	public String getPackage_();

	/**
	 * Defines a new package
	 * @param newValue the new package to set
	 * 
	 */
	public void setPackage_(String newValue);


	/**
	 * @return the externalResource
	 * 
	 */
	public String getExternalResource();

	/**
	 * Defines a new externalResource
	 * @param newValue the new externalResource to set
	 * 
	 */
	public void setExternalResource(String newValue);


	/**
	 * @return the resource
	 * 
	 */
	public EObject getResource();

	/**
	 * Init the resource
	 * @param settings the combo setting
	 */
	public void initResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new resource
	 * @param newValue the new resource to set
	 * 
	 */
	public void setResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the resource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the resource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
