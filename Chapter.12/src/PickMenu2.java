//File name PickMenu2.java
	//Written by Ernest Mushinge
	//Written on 03/8/15


//this class passes on an exception object
import javax.swing.*;
public class PickMenu2 {

	private static Menu2 briefMenu;
	private String guestChoice = new String();
	
	//this use of a constructor enables the change of menu class content without 
	//changing the code in this class
	//second reason of passing this kind of constructor is you can add or subtract code in menu
	//class and it will still update in this class
	public PickMenu2(Menu2 theMenu) throws MenuException
	{
		//I have to know about this kind of constructor[NB](own study purposes)
		briefMenu = theMenu;
		setGuestChoice();
	}
	
	public void setGuestChoice() throws MenuException
	{
		JOptionPane.showMessageDialog(null, "Choose from the following menu:" );
		guestChoice = briefMenu.displayMenu();
		
	}
	
	public String getGuestChoice()
	{
		return(guestChoice);
	}
	
	
}
