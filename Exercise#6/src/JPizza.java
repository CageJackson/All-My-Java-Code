
//ITMP 2650
//CRN 11438
//Ernest Mushinge
//Due:04/15/2015
//Spring 2015
//Assignment #8

//This application will allow the user to order choices of pizza from
//the list box and the application will display the price. The user will be able to 
//choose pizza in different sizes of small ($7), medium ($9) and Large($11),or extra Large($14), and one 
//of any number of tapings. There is no additional charge for cheese, but any other toping adds $1
//to the base price. Offer at-least five different toping choices

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import javax.swing.JComboBox;

public class JPizza extends JFrame implements ActionListener {

	int TotalPrice;

	// Here I will create JComboBoxes

	JComboBox<String> pizza = new JComboBox<String>();
	JComboBox<String> toping = new JComboBox<String>();

	// I included JLabels to hold user instructions and information and a
	// JTextFiled in
	// which to display the total price

	Font headlineFont = new Font("Arial", Font.BOLD,36);
	JLabel TowerOfPizza = new JLabel("Tower of Pizza");
	JLabel SizeList = new JLabel("Size List ");
	JLabel Toping = new JLabel("Topping List ");
	JTextField totalPrice = new JTextField(15);

	public JPizza() {
		super("Tower of Pizza");

		// sets the layout of the form
		setLayout(new FlowLayout());
		//setLayout(new BorderLayout());
		//setLayout(new CardLayout());
		
		// adds items to pizza
		pizza.addItem("None");
		pizza.addItem("Small");
		pizza.addItem("Medium");
		pizza.addItem("Large");
		pizza.addItem("Extra large");

		// adds items to toping list
		toping.addItem("None");
		toping.addItem("Cheese");
		toping.addItem("Sausage");
		toping.addItem("Lettus");
		toping.addItem("carrots");
		toping.addItem("Meet lovers");

		// add labels

		add(TowerOfPizza);
		//This will set the fon't of the TowerOfPizza
		TowerOfPizza.setFont(headlineFont);
		add(SizeList);
		add(pizza);
		add(Toping);
		add(toping);
		add(totalPrice);

		// Closes the program upon exit
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Finally in the constructor I registered a class as a
		// listener for events generated by each of the three JComboBoxes

		pizza.setSelectedIndex(0);
		toping.setSelectedIndex(0);
		totalPrice.setEditable(false);
		pizza.addActionListener(this);
		toping.addActionListener(this);
		// prices.addItemListener(this);

	}

	// Begin the itemStateChanged() or actionPerformed() method that executes
	// when the user selects
	// one of the elements
	// in the JComboBox. Use the appropriate
	// method to determine which specific member is the source of the current
	// ItemEvent and whether the event was generated.

	public void actionPerformed(ActionEvent e) {

		int positionOfSelected = (pizza).getSelectedIndex();

		int topingPositionSelected = toping.getSelectedIndex();

		// Switch statement for positionOfSelected

		switch (positionOfSelected) {
		case 0:
			TotalPrice = 0;
			totalPrice.setText("The Price is $" + TotalPrice);
			break;
		case 1:
			TotalPrice = 7;
			totalPrice.setText("The Price is $" + TotalPrice);
			break;
		case 2:
			TotalPrice = 9;
			totalPrice.setText("The Price is $" + TotalPrice);
			break;
		case 3:
			TotalPrice = 11;
			totalPrice.setText("The Price is $" + TotalPrice);
			break;
		case 4:
			TotalPrice = 14;
			totalPrice.setText("The Price is $" + TotalPrice);
			break;

		default:
			totalPrice.setText("The Price is $" + TotalPrice);
			break;
		}
		// If statement that adds a dollar to the total price for a topping

		if (topingPositionSelected == 2 || topingPositionSelected == 3
				|| topingPositionSelected == 4) {

			TotalPrice++;
			totalPrice.setText("The Price is $" + TotalPrice);

		}

		else

			totalPrice.setText("The Price is $" + TotalPrice);

	}

	// Main Method

	public static void main(String[] args) {

		JPizza aFrame = new JPizza();

		final int WIDTH = 300;
		final int HEIGHT = 200;

		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);

	}

}
