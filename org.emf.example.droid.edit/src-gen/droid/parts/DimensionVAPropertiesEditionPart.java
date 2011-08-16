/**
 * Generated with Acceleo
 */
package droid.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface DimensionVAPropertiesEditionPart {

	/**
	 * @return the const_value
	 * 
	 */
	public Enumerator getConst_value();

	/**
	 * Init the const_value
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initConst_value(EEnum eenum, Enumerator current);

	/**
	 * Defines a new const_value
	 * @param newValue the new const_value to set
	 * 
	 */
	public void setConst_value(Enumerator newValue);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
