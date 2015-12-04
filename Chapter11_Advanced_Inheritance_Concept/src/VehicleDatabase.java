

//import com.vehicleswesell.vehilcle.Vehicle;
//import com.vehicleswesell.vehicle.Sailboat;
//import com.vehicleswesell.vehicle.Bicycle;
import javax.swing.*;
import java.lang.*;

//public class VehiclePackage\VehicleDatabase {
	public class VehicleDatabase {
	public static void main(String[] args) {

		// String UUserEntry=" ";//my own code
		// int VVehicleType = 0;//my own code

		// Sailboat aBoat = new Sailboat(UUserEntry, VVehicleType);//my own code
		// Bicycle aBike = new Bicycle();//my own code

		// array of five vehicle references and an integer subscript to use with
		// the array.

		Vehicle[] vehicles = new Vehicle[5];
		int x;

		// for loop to prompt the user to select whether to enter a sailboat or
		// a bicycle in the array
		// based on the user input, instantiate the appropriate object type.

		for (x = 0; x < vehicles.length; ++x) {
			String userEntry;
			int VehicleType;
			userEntry = JOptionPane.showInputDialog(null,
					"Please select type of \n"
							+ "Vehicle you want to enter: \n1 -Saleboat\n"
							+ "2 - Bicycle");

			// To collect the input from user and convert it to integer
			VehicleType = Integer.parseInt(userEntry);

			// if statement to see if 1 or 2 is entered and assign(Very
			// important code) and then create an object.

			if (VehicleType == 1)

				// this will create Sailboat object in vehicles array, x is an
				// element in vehicles
				vehicles[x] = new Sailboat();

			else
				// this will assume the user entered 2 or other numbers that
				// assign an object to bicycle
				vehicles[x] = new Bicycle();

			// after entering the information for each Vehicle, display array
			// content by typing the code
			// First create a String buffer to hold the list of Vehicles.[NB]
			// Then, in a for loop, build an output String by repeatedly adding
			// a newline character
			// a counter, and a vehicle from the array to the String buffer
			// object
			// The String buffer will be displayed in a dialog box.

			StringBuffer outString = new StringBuffer();
			for (x = 0; x < vehicles.length; ++x) {
				// this will add String to the String buffer object
				outString.append("\n#" + (x + 1) + " ");
				// this will access toString method in either bicycle class or
				// sailboat class
				outString.append(vehicles[x].toString());
				JOptionPane.showMessageDialog(null, vehicles[x].AuthorName()
						+ "\n\n\nOur vailable Vehicles include:" + outString);
			}

		}

	}

}
