package application;

/**
* A Wear Location for character equipment
*
* @author	Richard Salvaty
* @version	1.0
*/
public enum WearLoc {
	HEAD("Head"), LEFT_HAND("Left Hand"), RIGHT_HAND("Right Hand"), BODY("Body");
	
	public final String label;
	
	/**
	 * A single argument constructor for setting the label
	 * @param label		The enum name in "string form"
	 */
	private WearLoc(String label)
	{
		this.label = label;
	}
	
	/**
	 * An override to the toString() method to get the label string in place of Enum.name()
	 */
	@Override
	public String toString()
	{
		return this.label;
	}

}
