/** This is the Car class
	* @author Charles Rocke
	* 11/23/2022
	*/
public class Car {
	
	// attributes
	// car name
	private String name;
	// car style
	private String style;
	// door type
	private String door;
	// car class tier
	private String tier;
	// car owner
	private User owner;
	
	// Constructors
	/** This is the default constructor
	*/
	public Car() {
		// set name
		this.name = "";
		// set car style
		this.style = "";
		// set door type
		this.door = "";
		// set car tier
		this.tier = "";
		// set owner
		this.owner = new User();
	} // end default constructor

	
	/** This is the overloaded constructor
		*@param name Name of attribute
		*@param style Style of car
		*@param door Type of doors
		*@param tier Tier of car
	*/
	public Car (String name, String style, String door, String tier, User owner) {
		// set name
		this.name = name;
		// set car style
		this.style = style;
		// set door type
		this.door = door;
		// set car tier
		this.tier = tier;
		// set car owner
		this.owner = owner;
	} // end overloaded constructor

	
	// Setters and Getters

	// Setters
	/** This is the name setter
	* @param name Name of attribute
	*/
	public void setName (String name) {
		// set objects name
		this.name = name;
	} // end setName method


	/** This is the style setter
	* @param style Style of car
	*/
	public void setSyle (String style) {
		// set objects style
		this.style = style;
	} // end setStyle method


	/** This is the door setter
	* @param door Door type
	*/
	public void setDoor (String door) {
		// set objects door type
		this.door = door;
	} // end setDoor method


	/** This is the tier setter
	* @param tier Tier of car
	*/
	public void setTier (String tier) {
		// set objects tier
		this.tier = tier;
	} // end setTier method

	
	/** This is the owner setter
		* @param owner Owner of car
		*/
	public void setOwner (User owner) {
		// set objects owner
		this.owner = owner;
	} // end setOwner method

	
	// Getters
	/** This is the name getter
	* @return name Name of attribute
	*/
	public String getName () {
		// get objects name
		return name;
	} // end getName method


	/** This is the style getter
	* @return style Style of car
	*/
	public String getStyle () {
		// get objects style
		return style;
	} // end getStyle method


	/** This is the door getter
	* @return door Door type
	*/
	public String getDoor () {
		// get objects door type
		return door;
	} // end getDoor method


	/** This is the tier getter
	* @return tier Tier of car
	*/
	public String getTier () {
		// set objects tier
		return tier;
	} // end setTier method


	/** This is the owner getter
	* @return owner Owner of car
	*/
	public String getOwner () {
		// set objects owner
		return owner.getName();
	} // end getOwner method
	
} // end class