package GUIBnkAccSorter;

//File name GUIBankAcctSorter.java
//Written by Ernest Mushinge
//Written on 4/28/15



//import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//This program will the modified program in assignment#7 a to display
//the list of the orders read in the from the file(create a data file using
// your CreateBankFile.java), which will at-least have 10 bank account records in it).
//The total number of bank account will be displayed at the bottom of the GUIBankAcctSorter
public class GUIBankAcctSorter extends JFrame implements ItemListener {

	// my own code results and finalResults
	String Results = null;
	String FinalResults = null;
	String ActualNumber;
	int Accounts;

	public String StringBuilderw() {
		String ProgrammerName = (" Ernest Mushinge \n" + " Assign 9\n"
				+ " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due April 29th, 2015\n\n");

		// this is to accept input from the user
		Scanner input = new Scanner(System.in);
		// Path file = Paths
		// .get("Macintosh\\HD\\Users\\ernestmushinge\\Documents\\All_MyJava_code\\Chapter.13\\RochesterBank.txt");

		// Add the String formatting constants and build a sample record String
		// so that you can determine the record size
		// To save time, you can copy these declarations from the
		// CreateFilesBasedOnState program

		final String ID_FORMAT = "000";
		final String NAME_FORMAT = "                   ";
		final int NAME_LENGTH = NAME_FORMAT.length();
		// final String HOME_STATE = "WI";
		final String BALANCE_FORMAT = "0000.00";
		String delimiter = ",";
		String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter
				+ BALANCE_FORMAT + System.getProperty("line.separator");
		final int RECSIZE = s.length();

		// The last set of declarations includes a byte array that you will use
		// with a ByteBuffer later in the program, a string that represent
		// the account number in an empty account, and an array of strings that
		// can hold the piece of a split record after it is read from the input
		// file. Add a variable for the numeric customer balance, which will be
		// converted from the string stored in the file
		// Also, declare a total and initialize it to 0 so the total customer
		// balance due value can be accumulated

		byte data[] = s.getBytes();
		// I thought of raping the data before reading it
		ByteBuffer buffer = ByteBuffer.wrap(data);
		final String EMPTY_CUST = "000";
		String[] array = new String[10];
		double Balance;
		int total = 0;

		// try and catch and declare an InputStream and BufferedReader to handle
		// reading the file
		try {
			// I forgot to establish the path to get reading file from
			Path file = Paths
					.get("Macintosh\\HD\\Users\\ernestmushinge\\Documents\\All_MyJava_code\\Chapter.13\\RochesterBank.txt");

			BufferedInputStream iStream = new BufferedInputStream(
					Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					iStream));

			// My code here,, I decided to put this code to read the file and
			// put content in s, and then use s with content below

			s = reader.readLine();
			// display a heading, and then read the first record from the file
			// into a String

			// String AllDefault=("\nAll non-default records: \n\n");

			// in a loop that continual while there is more data to read. split
			// the String using the comma delimiter. Test the first element
			// the account number and proceed only if it is not "000", if the
			// record entered was in the previous program.
			// display the split String element. Add the balance to a running
			// total. As the last action in the loop, read the record

			while (s != null) {

				array = s.split(delimiter);
				if (!array[2].equals(EMPTY_CUST)) {
					Balance = Double.parseDouble(array[2]);

					// My own code for total of bank accounts
					Accounts = Integer.parseInt(array[0]);

					// My own code

					if (Accounts != 0) {
						String CustomerNumber = array[0];
						String Names = array[1];
						Balance = Double.parseDouble(array[2]);

						String ActualResult = ("Cust# " + CustomerNumber
								+ " Name " + Names + "Balance $" + Balance + "\n\n");
						// total += Balance;
						total += Accounts;

						StringBuilder AllTotalNumber = new StringBuilder();
						AllTotalNumber.append(total);
						ActualNumber = AllTotalNumber.toString();

						FinalResults = ActualResult;
					}
					// String ActualResult = ("Cust# " + array[0] + " Name "
					// + array[1] + "Balance $" + array[2] + "\n\n");
					// ////// total += Balance;
					// total += Accounts;

					// StringBuilder AllTotalNumber = new StringBuilder();
					// AllTotalNumber.append(total);
					// ActualNumber = AllTotalNumber.toString();

					// FinalResults = ActualResult;

				}

				// This is my code to store s element in an array
				/*
				 * while((s=reader.readLine())!=null) { String[] AllMyRecord =
				 * new String[10]; int i = 0; while((s = reader.readLine())!=
				 * null){ // AllMyRecord[i] = line; System.out.println(data[i]);
				 * i++; //for (String token : s.split(delimiter)) {
				 * 
				 * 
				 * AllMyRecord[0]=s; AllMyRecord[1]=array[1];
				 * AllMyRecord[2]=array[2]; AllMyRecord[3]=array[3];
				 * AllMyRecord[4]=array[4]; AllMyRecord[5]=array[5]; // } //My
				 * code ends }
				 */

				// VERY IMPORTANT, AT THIS POINT I DISPLAY THE RESULT
				// After all the records have been processed, display the total
				// and
				// close the reader
				// STRING BUILDER CODE WAS HERE, REMEMBER TO REPLACE IT HERE

				// /////////////////////////////////////////////////////////////////////
				// MY OWN CODE
				// ///////////////////////////////////////////////
				StringBuilder results = new StringBuilder();

				String newline = System.getProperty("line.separator");
				results.append(ProgrammerName);
				results.append(newline);
				// results.append(AllDefault);
				results.append(FinalResults);
				// results.append(actualTotal);
				results.append(s);

				// results.append(s1);
				Results = results.toString();
				// System.out.println("Total of all balances is $" + total);
				// System.out.println(s);
				s = reader.readLine();

			}

			// The reader close suppose to be out of while loop or else it won't
			// loop
			reader.close();

		}

		catch (Exception ex) {
			System.out.println("Error was cought" + ex);
		}

		return Results;
	}

	// This code will create a label, a text field and a button to JFrame

	JLabel header = new JLabel("Bank Account Sorter");
	// I have to make this text field hold multiple text
	JTextArea textArea = new JTextArea(StringBuilderw(), 10, 25);

	JTextField TotalNumber = new JTextField(ActualNumber);
	JLabel sortBy = new JLabel("Sort By");
	JLabel totalNumberOfBankAcct = new JLabel("Total # of Bank Accounts");

	// JCheckBoxes
	JCheckBox boxCustomer = new JCheckBox("Cust#", false);
	JCheckBox boxBalance = new JCheckBox("Balance", false);
	JCheckBox boxName = new JCheckBox("Name", false);

	// This is to make the textField scroll horizontally as need and not always.
	// Vertical scroll is as needed as well
	JScrollPane scroll = new JScrollPane(textArea);

	// This is to set a font for JLabel header to be big
	private Font bigFont = new Font("Arial", Font.BOLD, 20);

	// GUIBankAcctSorter Constructor.
	// (Notes)This is important as any object created from a class
	// is evoked, the constructor is first called, and I want a constructor
	// to add these to whatever the object is called for at first instance
	public GUIBankAcctSorter() {

		super("Bank Account Sorter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		// adding components to JFrame
		add(header);
		header.setFont(bigFont);
		// I decide to show scroll not textArea
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		add(scroll);

		// textArea.add(scroll);
		// add(textArea);
		// textArea.setEditable(false);
		// scroll.setBounds(5, 5, 300, 200);
		add(sortBy);
		add(boxCustomer);
		add(boxBalance);
		add(boxName);
		add(totalNumberOfBankAcct);
		add(TotalNumber);
		TotalNumber.setEditable(false);
		textArea.setEditable(false);

		// Registering the class as listener for events
		// generated by each three JCheckBoxes

		boxCustomer.addItemListener(this);
		boxBalance.addItemListener(this);
		boxName.addItemListener(this);

	}

	// This method defines what the ItemListener will do after the event
	// is registered or else ItemListerner won't function
	// It is important to know what event listener to be
	// as different JFrame components have different event handler

	@Override
	public void itemStateChanged(ItemEvent event) {
		Object Source = event.getSource();
		int Select = event.getStateChange();

		// This is were I define what happens when
		// boxCustomer CheckBox is selected
		if (Source == boxCustomer) {

			// this is to check if boxCustomer is selected
			// then the other check boxes should not be checked
			if (boxCustomer.isSelected()) {
				boxName.setSelected(false);
				boxBalance.setSelected(false);
			}

		}
		// this is to see if boxCustomer is sure selected from
		// event.getStateChange() method
		if (Select == ItemEvent.SELECTED) {
			// code here
			// Sort elements in an object array(bauble sort) using customer

		}

		// This is were I define what happens when
		// boxName CheckBox is select

		if (Source == boxName) {

			// this is to check if boxName is selected
			// then the other check boxes should not be checked
			if (boxName.isSelected()) {

				boxCustomer.setSelected(false);
				boxBalance.setSelected(false);
			}
		}
		// this is to see if boxCustomer is sure selected from
		// event.getStateChange() method
		if (Select == ItemEvent.SELECTED) {
			// code here
			// Sort elements in an object array(bauble sort) using Names
		}

		// This is were I define what happens when
		// boxBalance CheckBox is select
		if (Source == boxBalance) {
			// this is to check if boxBalance is selected
			// then the other checkboxes should not be checked
			if (boxBalance.isSelected()) {

				boxCustomer.setSelected(false);
				boxName.setSelected(false);

			}
			// this is to see if boxCustomer is sure selected from
			// event.getStateChange() method
			if (Select == ItemEvent.SELECTED) {
				// code here
				// Sort elements in an object array(bauble sort) using balance
			}

		}
	}

	// Main Method
	public static void main(String[] args) {
		GUIBankAcctSorter gui = new GUIBankAcctSorter();
		gui.setSize(350, 350);
		gui.setVisible(true);
		gui.setResizable(false);

	}

}
