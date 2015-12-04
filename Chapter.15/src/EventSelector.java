//File name EventSelector.java
//Written by Ernest Mushinge
//Written on 4/25/15

import java.awt.event.ActionEvent;//Imported this on my own
import java.awt.event.ActionListener;

import javax.swing.JFrame;//Imported this on my own
import javax.swing.JLabel;//Imported this on my own
import javax.swing.JMenu;//Imported this on my own
import javax.swing.JMenuBar;//Imported this on my own
import javax.swing.JMenuItem;//Imported this on my own
import javax.swing.JPanel;//Imported this on my own
import javax.swing.JRadioButton;//Imported this on my own

import java.awt.*;
import java.awt.color.*;

//This is an application for party planning company that uses
//a menu bar with multiple user options, and that uses
// separate JPanels with different layout managers to organize components

public class EventSelector extends JFrame implements ActionListener {

	//Create a JMenuBar and its two JMenus
	private JMenuBar mainBar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	private JMenu menu2 = new JMenu("Event types");
	
	//Next create the item the will appear within the menus
	//The File menu contains an Exit option. The Event types menu
	//contains two sub-menus: Adult and Child. Each of those sub-menus
	//contains more options
	
	private JMenu exit = new JMenu("Exit");
	private JMenu Adult = new JMenu("Adult");
	private JMenu Child = new JMenu("Child");
	private JMenuItem AdultBirthDay = new JMenuItem("AdultBirthDay");
	private JMenu anniversary = new JMenu("Anniversary");
	private JMenu retairement = new JMenu("Retairement");
	private JMenu adultOther = new JMenu("Other");
	private JMenu ChildBirthday = new JMenu("Birthday");
	private JMenu ChildOther = new JMenu("Other");
	
	//Declare several other components that will be used to show how JFrame are composed
	
	private JPanel birthdayPanel = new JPanel();
	private JPanel OtherPanel = new JPanel();
	//JLabel
	private JLabel birthdayLabel = new JLabel("Birthday events are our specialty");
	private JLabel OtherLabel = new JLabel("We have lots of ideas for memorable events");
	
	//JPanel
	private JPanel buttonPanel = new JPanel();
	//JRadio
	private JRadioButton radButton1 = new JRadioButton("Formal events");
	private JRadioButton radButton2 = new JRadioButton("Casual events");
	
	
	//Write the constructor for the JFrame. Set the title, the default close operation
	// and the layout. Call separate methods to compose the menu, to add the necessary
	//action listeners to the menu items, and to lay out the JFrame's components.
	//These tasks could be performed directly within the constructor,
	//but you can place them in separate methods to better organize the application
	
	public EventSelector()
	{
		setTitle("Event Selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		addActionListeners();
		layoutComponents();
		
		//My own code
		composeMenu();
		addActionListeners();
		layoutComponents();
		
	}
	
	//Add the composeMenus() method, Set the menu bar, and add two menus to it,
	//Then add one option to the first menu and two sub-menus to the second menu.
	//Finally, add four items to the first sub-menu and two item to the other one.
	
	public void composeMenu()
	{
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		mainBar.add(menu2);
		menu1.add(exit);
		menu2.add(Adult);
		menu1.add(Child);
		Adult.add(AdultBirthDay);
		Adult.add(anniversary);
		Adult.add(retairement);
		Adult.add(adultOther);
		Child.add(ChildBirthday);
		Child.add(ChildOther);
		
	}
	
	//Add the addActionListeners() method, which makes the JFrame become a listener for each menu item
	
	public void addActionListeners()
	{
		//come back to this and finish
		exit.addActionListener(this);
		AdultBirthDay.addActionListener(this);
		anniversary.addActionListener(this);
		retairement.addActionListener(this);
		adultOther.addActionListener(this);
		ChildBirthday.addActionListener(this);
		exit.addActionListener(this);
		ChildOther.addActionListener(this);
	}
	
	//The layoutComponents() method arranges all the components that appear
	//in the content pane. The birthdayPanel object contains a single label. The
	//otherPanel object contains a label and another panel(buttonPanel) in a
	//grid. The buttonPanel contains two radio buttons. For this demonstration, the
	//radio buttons are not functional, but in a more complicated application, an addActionListener() 
	//method could be applied to them. Also, in a more complicated application, you continue to place
	//panels within another panel to achieve complex designs
	
	public void layoutComponents()
	{
		birthdayPanel.setLayout(new FlowLayout());
		OtherPanel.setLayout(new GridLayout(2, 1, 3, 3));
		birthdayPanel.add(birthdayLabel);
		OtherPanel.add("other", OtherLabel);
		OtherPanel.add("buttons", buttonPanel);
		buttonPanel.add(radButton1);
		buttonPanel.add(radButton2);
		add(birthdayPanel);
		add(OtherPanel);
		
		
	}
	
	//Add an actionPerformed() method that responds to menu selections. 
	//Different background colors are set depending on the user's choices.
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		Container con = getContentPane();
		if(source ==exit)
		
			System.exit(0);
		
		else if(source == ChildBirthday || source == ChildOther)
			con.setBackground(Color.PINK);
		
		else
			con.setBackground(Color.WHITE);
		if(source == AdultBirthDay || source == ChildBirthday)
		{
			birthdayPanel.setBackground(Color.YELLOW);
			OtherPanel.setBackground(Color.WHITE);
		}
		else
		{
			birthdayPanel.setBackground(Color.WHITE);
			OtherPanel.setBackground(Color.YELLOW);
		}
		
	}
	
	
	//Main method that instantiates an EventSelector object and sets its size and visibility. 
	 
	public static void main(String[] args)
	{
		EventSelector frame = new EventSelector();
		final int WIDTH = 400;
		final int HEIGHT = 200;
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
}
