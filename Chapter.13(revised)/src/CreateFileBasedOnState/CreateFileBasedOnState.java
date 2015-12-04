package CreateFileBasedOnState;
//File name CreateFileBasedOnState.java
	//Written by Ernest Mushinge
	//Written on 03/8/15

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;

//In this class you prompt the user for customer data and assigns the data to one of two
//files depending on the customer's state of residence. This program assumes that Wisconsin(WI)
//records are assigned to in-state file and that all other records are assigned to out-of-state file
//First there are empty files to store the records, and then the code that places each record in the correct file

public class CreateFileBasedOnState {
	
	//Main method
	
	public static void main(String[] args) throws IOException
	{
		
		System.out.println(" Ernest Mushinge \n"
				+ " Assign 9\n" + " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 8th, 2015");
		
		Scanner input = new Scanner(System.in);
		
		//uses two paths of in-state and out-of-state customers to hold records
		//you can use a different String value for your paths based on your System and the location
		//Where you want to save your files.
		
		Path inStateFile = Paths.get("Macintosh\\HD\\Users\\ernestmushinge\\Documents\\All_MyJava_code\\Chapter.13\\InStateCusts.txt");
		Path outOfStateFile = Paths
				.get("Macintosh\\HD\\Users\\ernestmushinge\\Documents\\All_MyJava_code\\Chapter.13\\outOfStateCusts.txt");
		
		//Build a string that can be used to format the empty files that are created before any actual customer data is written. 
		//Include constant for the format of the account number(three digits),the customer name(10 spaces), the customer's state, and the
		//customer's balance(up to 9999.99). After defining the field delimiter (a comma), you can build a generic customer
		//string by assembling the pieces. The record size is then calculated from the dummy record.A consistent record size is important so it can
		//be used to calculate a record's position when the files are accessed randomly.
		
		final String ID_FORMAT = "000";
		final String NAME_FORMAT = " ";
		final int NAME_LENGTH = NAME_FORMAT.length();
		final String HOME_STATE = "WI";
		final String BALANCE_FORMAT = "0000.00";
		String delimiter = ",";
		String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + HOME_STATE + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
		
		//String s = null;
		final int RECSIZE = s.length();
		
		//The last declarations are for two FileChannel reference; String and integer representations of the customer's account number
		//the customer's name, state, and balance fields; and Quit constant that identifies the end of data entry
		
		FileChannel fcIn = null;
		FileChannel fcOut = null;
		String idString;
		int id;
		String name;
		String state;
		double balance;
		final String QUIT = "999";
		
		//Next you call a method that creates the empty files into which randomly placed data records can eventually be written. The 
		//method accepts the path for file and the String that defines the record format.
		
		createEmptyFile(inStateFile, s);
		createEmptyFile(outOfStateFile, s);
		
		//try block that will handle all the data entry and file writing for customer records
		
		try
		{
			//set up the FileChannel reference for both the in-state and out-state files
			fcIn = (FileChannel)Files.newByteChannel(inStateFile, CREATE, WRITE);
			fcOut = (FileChannel)Files.newByteChannel(outOfStateFile, CREATE, WRITE);
		
		
		//Prompt the user for a customer account number, and accept it from the keyboard. Then start to loop that will continue as long the user
		//the user does not enter the QUIT value. Next convert the entered account number into an integer so it can be used to calculate the file
		//position for the entered record. In a full-blown application, you would add code to ensure that the account number is three
		//digits, but to keep this example shorter, this program assumes that the user will enter valid account numbers.
		System.out.print("Enter customer account number >> ");
		idString = input.nextLine();
		
		
		
		while(!(idString.equals(QUIT)))
		{
			id = Integer.parseInt(idString);
			//Prompt the user for and accept the customer's name. To ensure that entered names are stored using a uniform length, assign the name
			//to a stringBuilder object, and set the length to the standard length. then assign the newly sized StringBuilder back to the String
			
			System.out.print("Enter name for customer >> ");
			name = input.nextLine();
			StringBuilder sb = new StringBuilder(name);
			sb.setLength(NAME_LENGTH);
			name = sb.toString();
			
			//Prompt the user for and accept the customer's state of residence.(In a fully developed program, you would check the entered state
			//against a list of valid state, but this step is omitted to keep the program shorter.)
			
			System.out.println("Enter state >> ");
			state = input.nextLine();
			
			//Prompt the user for and accept the customer's balance. Because you use the nextDouble() method to retrieve the balance, you follow
			//it with a call to nextLine() to absorb the Enter key value left in the input stream. Then you can use the Decimal Format class
			//to ensure that the balance meets the format requirements of the file. Because the BALANCE_FORMAT String's value is 0000.00, zeros 
			//will be added to the front or back of any double that would not otherwise meet the standard. For example, 200.99 will be stored as 0200.99
			//and 0.1 will be stored as 0001.00. Appendix C contains more information on the DecimalFormat class and describe other potential formats
			
			System.out.print("Enter balance >> ");
			balance = input.nextDouble();
			input.nextLine();
			DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);
			
			
			
			//Construct the String to be written to the file by concatenating the entered fields with the comma delimiter and the line separator
			 s=idString + delimiter + name + delimiter + state + delimiter +df.format(balance) + System.getProperty("line.separator");
			
			//Convert the constructed String to an array of bytes, and wrap the array into a ByteBuffer.
			
			byte data[] = s.getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(data);
			
			//Depending on the customer's state, use the in-state or out-of-state FileChannel. Position the file pointer to start writing a record
			//in the correct position based on the account number, and write the data String.
			
			if(state.equals(HOME_STATE))
			{
				fcIn.position(id* RECSIZE);
				fcIn.write(buffer);
			}
			else
			{
				fcOut.position(id* RECSIZE);
				fcOut.write(buffer);
			}
			
			//Prompt the user for the next customer account number, and add a closing curly brace for the while loop.
			
			System.out.print("Enter next customer account number or " + QUIT + " to quit >> ");
			idString = input.nextLine();
			
			
		}
		//Close the FileChannels, and add a closing curly brace for the class
		//I USED TO MAKE A MISTAKE WITH THIS CODE. I USED TO PUT THIS CODE AT THE END OF THE CLASS(WRONG!)
		fcIn.close();
		fcOut.close();
		}
		//I coded this catch method as it was giving me an error
		catch(Exception e)
		{
			System.out.println("Error message: " + e);
		}
		

	}
	
	//END OF MAIN METHOD
	
	
	
	//A method that creates empty files using the default record format string. The method will create 1,000 records with an account number 
	//of 000
	
	public static void createEmptyFile(Path file, String s)
	{
		//define a constant for the number of records to be written;
		final int NUMRECS = 1000;
		
		//In a try block, declare a new OutputStream using the method's Path parameter.
		//then create a BufferWritter using the OutputStream
		
		try
		
		{
			
		    OutputStream outputStr = new BufferedOutputStream(Files.newOutputStream(file,CREATE));	
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStr));
			//Use a for loop to write 1,000 default record using the parameter String. Then close the BufferWriter,
			//and add a closing brace for the try block.
			for(int count = 0; count < NUMRECS; ++count)
			{
				writer.write(s, 0, s.length());
				writer.close();
			}
			
		}
		
		//add a catch block to handle any Exception thrown from the try block, and add a closing curly brace for the method
		catch(Exception e)
		{
			System.out.println("Error on writing the file: " + e);
		}
		
	
		
		
	}

}
