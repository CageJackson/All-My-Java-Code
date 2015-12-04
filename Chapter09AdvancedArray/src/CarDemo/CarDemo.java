//File name CarDemo.java
//Written by Ernest Mushinge
//Written on 2/28/15

package CarDemo;

// instantiates two car objects and assign values to them using enumeration values for the model and color
public class CarDemo {

	public static void main(String[] args) {

		Car firstCar = new Car(2009, model.MINIVAN, color.BLUE);
		Car secondCar = new Car(2011, model.CONVERTIBLE, color.RED);

		// to print my name and class
		System.out.println(" Ernest Mushinge \n" + " Assign 5\n"
				+ " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 1st, 2015\n");
		firstCar.display();
		secondCar.display();
	}

}
