package ReadRochesterBankRecords;

//import CreateBankFile;

import java.nio.ByteBuffer;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

import static java.nio.file.StandardOpenOption.*;

import java.nio.ByteBuffer.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class ReadBankAcountSequentially {

	// Main method
	public static void main(String[] args) {

		String ProgrammerName=(" Ernest Mushinge \n" + " Assign 9\n"
				+ " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due April 29th, 2015");

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
		String[] array = new String[12];
		double Balance;
		double total = 0;

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
			
			//My code here
			System.out.println();
			s = reader.readLine();
			// display a heading, and then read the first record from the file
			// into a String

			System.out.println("\nAll non-default records: \n");

			// in a loop that continual while there is more data to read. split
			// the String using the comma delimiter. Test the first element
			// the account number and proceed only if it is not "000", if the
			// record entered was in the previous program.
			// display the split String element. Add the balance to a running
			// total. As the last action in the loop, read the record
			String line = null;
			/*while (s != null) {
				array = s.split(delimiter);
				if (!array[2].equals(EMPTY_CUST))
				
				
				{
					Balance = Double.parseDouble(array[2]);
					line=("Cust# " + array[0] + " Name " + array[1]
							+ "Banlace $" + array[2] );
					
					
					//total += Balance;
					
				}*/
			
			int i = 0;
		    while(s != null){
		    	array = s.split(delimiter); 
			if (!array[2].equals(EMPTY_CUST))	
			{
				Balance = Double.parseDouble(array[2]);
				line=("Cust# " + array[0] + " Name " + array[1]
						+ "Banlace $" + array[2] );
			}
				
				 array[i] = line;
			        System.out.println(array[i]);
			        i++;
				
				
				s = reader.readLine();
				
				
				// VERY IMPORTANT, AT THIS POINT I DISPLAY THE RESULT
				// After all the records have been processed, display the total
				// and
				// close the reader
///////////////////////////////////////////////////////////////////////
				//MY OWN CODE
				/////////////////////////////////////////////////
				StringBuilder results = new StringBuilder();
				
				String actualTotal = "Total of all balance is $"+ total;
				results.append(ProgrammerName);
				results.append(actualTotal);
				results.append(s);
				results.toString();
				//System.out.println("Total of all balances is $" + total);
				//System.out.println(s);

			}
			// The reader close suppose to be out of while loop or else it won't
			// loop
			reader.close();

		}

		catch (Exception ex) {
			System.out.println("Error was cought" + ex);
		}

	}

}
