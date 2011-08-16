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
public interface InvokeScreenActionPropertiesEditionPart {

	/**
	 * @return the screen
	 * 
	 */
	public EObject getScreen();

	/**
	 * Init the screen
	 * @param settings the combo setting
	 */
	public void initScreen(EObjectFlatComboSettings settings);

	/**
	 * Defines a new screen
	 * @param newValue the new screen to set
	 * 
	 */
	public void setScreen(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setScreenButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the screen edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToScreen(ViewerFilter filter);

	/**
	 * Adds the given filter to the screen edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToScreen(ViewerFilter filter);





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
