import java.util.Scanner;
import java.util.ArrayList;

/** This is the CarRunner main application
	* @author Charles Rocke
	* 11/23/2022
	*/
class Main {

	/** This is the main method
	*/
  public static void main(String[] args) {
		// set scanner
		Scanner keyboard = new Scanner(System.in);
		// set user
		User person = new User();
		
		// initiate garage to add cars
		Garage garage = new Garage();

		// prompmt user for their name
		System.out.println("enter your name:");
		String username = keyboard.nextLine();
		// set users name
		person.setName(username);
		// print users name
		System.out.println(person.getName());

		// add a car into users garage
		System.out.println("do you own a car(s)? y/n");
		String bool = keyboard.nextLine();
		// debugging
		System.out.println(bool);

		if (bool.equals("y")) {
			// set owner of Garage
			garage.setOwner(person);
			System.out.println("How many do you own?");
			int numOwned = keyboard.nextInt();
			keyboard.nextLine();

			// for each number owned, enter in each
			for (int i = 0; i < numOwned; i++) {
				// prompt user for car name
				System.out.println("enter car name: ");
				String name = keyboard.nextLine();
				// debugging
				System.out.println(name);

				// prompt user for car style
				System.out.println("enter car style: ");
				String style = keyboard.nextLine();

				// prompt user for car door type
				System.out.println("enter car door type: ");
				String door = keyboard.nextLine();

				// prompt user for car tier
				System.out.println("enter car tier: ");
				String tier = keyboard.nextLine();

				// initiate the new car
				Car car = new Car(name, style, door, tier, person);

				// add car to array list
				garage.addCar(car);
				
			} // end for
		} // end if

		// Display all of the users cars in garage
		System.out.println(garage.toString());

		keyboard.close();
  } // end main
} // end class