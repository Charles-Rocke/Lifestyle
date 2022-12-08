import java.util.ArrayList;
/** This is the Car class
	* @author Charles Rocke
	* 11/23/2022
	*/
public class User {
	// attributes
	// car name
	private String name;
	// career
	private String career;
	// garage
	private Garage garage;
	
	
	// Constructors
	/** This is the default constructor
	*/
	public User() {
		// set name
		this.name = "";
		// set career
		this.career = "";
		// set garage
		
		
	} // end default constructor

	
	/** This is the overloaded constructor
		*@param name Name of object
		*@param career Career of object
		*@param garage Garage of object
		*@param tier Tier of car
	*/
	public User (String name, String career, Garage garage) {
		// set name
		this.name = name;
		// set career
		this.career = career;
		// set garage
		this.garage = garage;
		
	} // end overloaded constructor

	
	// Setters and Getters

	// Setters
	/** This is the name setter
	* @param name Name of object
	*/
	public void setName (String name) {
		// set objects name
		this.name = name;
	} // end setName method


	/** This is the career setter
	* @param career Career of object
	*/
	public void setCareer (String career) {
		// set objects style
		this.career = career;
	} // end setCareer method


	/** This is the garage setter
	* @param garage Garage of object
	*/
	public void setGarage (Garage garage) {
		// set objects door type
		this.garage = garage;
	} // end setGarage method


	// Getters
	/** This is the name getter
	* @return name Name of object
	*/
	public String getName () {
		// get objects name
		return name;
	} // end getName method


	/** This is the career getter
	* @return career Career of object
	*/
	public String getCareer () {
		// get objects career
		return career;
	} // end getCareer method


	/** This is the garage getter
	* @return garage Garage of object
	*/
	public Garage getGarage () {
		// get objects garage
		return garage;
	} // end getGarage method
	
	
} // end class