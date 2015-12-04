//File name PlanVegetarianMenu.java
	//Written by Ernest Mushinge
	//Written on 03/6/15

import javax.swing.*;

public class PlanVegetarianMenu {

	public static void main(String[] args) {

		System.out.println(" Ernest Mushinge \n" + " Assign 9\n"
				+ " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 8th, 2015");

		Menu2 briefMenue = new Menu2();
		// VegetarianMenu briefMenu = new VegetarianMenu();
		PickMenu2 entree = null;
		String guestChoice = new String();

		try {
			PickMenu2 selection = new PickMenu2(briefMenue);
			entree = selection;

			guestChoice = entree.getGuestChoice();
		}

		/*
		 * catch(Exception error) { guestChoice =
		 * "an invalid vegetarian selection";
		 * //JOptionPane.showMessageDialog(null, "You chose "+ guestChoice); }
		 * 
		 * //After the catch block, the application continues to display the
		 * code
		 * 
		 * //JOptionPane.showMessageDialog(null, "You chose "+ guestChoice +
		 * briefMenu.displayMenu()); JOptionPane.showMessageDialog(null,
		 * "You chose "+ guestChoice);
		 */

		catch (MenuException error) {
			guestChoice = error.getMessage();
			// JOptionPane.showMessageDialog(null, "You chose "+ guestChoice);
		}

		catch (Exception error) {
			guestChoice = "an invalid vegetarian selection";
			// JOptionPane.showMessageDialog(null, "You chose "+ guestChoice);
		}

		// After the catch block, the application continues to display the code

		// JOptionPane.showMessageDialog(null, "You chose "+ guestChoice +
		// briefMenu.displayMenu());
		JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
	}

}
