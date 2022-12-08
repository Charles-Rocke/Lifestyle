import java.util.ArrayList;
/** This is the Garage class and stores a Persons Car
	* @author Charles Rocke
	* 11/25/2022
	*/
public class Garage {
	
	// attributes
	// owner
	private User owner;
	// cars
	private ArrayList<Car> garage;
	
	
	// Constructors
	/** This is the default constructor
	*/
	public Garage() {
		// set owner
		this.owner = new User();
		// set garage
		this.garage = new ArrayList<Car>();
		
	} // end default constructor

	
	/** This is the overloaded constructor
		*@param cars ArrayList of cars
	*/
	public Garage (User owner, ArrayList<Car> cars) {
		// set owner
		this.owner = owner;
		// set garage
		this.garage = cars;
		
	} // end overloaded constructor

	/** This is owner setter
		*@param owner Owner of cars
	*/
	public void setOwner (User user) {
		this.owner = user;
	} // end setOwner method

	// other methods
	/** This method adds a car to the garage
		* @param car Car being added to the garage
		*/
	public void addCar (Car car) {
		garage.add(car);
		System.out.println(car.getName() + " has been added to the garage");
	} // end addCar method


	/** This method removes a car from the garage
		* @param car Car being added to the garage
		*/
	public void sellCar (Car car) {
		garage.remove(car);
		System.out.println("Car sold.");
	} // end addCar method


	/** This method prints the contents of the garage
		*/
	public String toString () {	
		String str = "\n";
		// indicator string
		str += owner.getName() +  "'s garage: \n";
		for (Car car : garage) {
			
			str += "Name: " + car.getName() + "\n";
			str += "Style: " + car.getStyle() + "\n";
			str += "Door: " + car.getDoor() + "\n";
			str += "Tier: " + car.getTier() + "\n";
			str += "\n";
		} // end for
		
		return str;
	} // end toString method

} // end class