import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;

import static java.nio.file.StandardOpenOption.*;

import java.util.Scanner;
import java.text.*;

//This application will create 10,000 blank files and then allow
//the user to enter customer account information
//including an account number that is 9999 or less
//a last name, and a balance. Insert each new record into
//a data file at a location that is equal to the account
//number. Assume that the user will not enter invalid account#
//Force each name to eight characters, padding it with spaces
//or truncating it if necessary. Also assume that the user will not
//enter bank account greater than 99, 000.00

public class CreateBankFile {

	// ///////////////////////////////////////////
	// MAIN METHOD STARTS HERE
	public static void main(String[] args)

	{

		// final String LastNameFormat= " ";
		// final BankBalance

		int AccountNumber = 9999;
		String Name;
		// String FirstName;
		double Balance;
		String idString;
		// I decided to create a variable called names to hold first and last
		// name
		// then assign String builder to names

		// I decided to include this code for fileChannel
		FileChannel RochesterBankRecord = null;

		boolean QUIT = false;

		// Build a string that can be used to format the empty files that are
		// created before any actual customer data is written.
		// Include constant for the format of the account number(three
		// digits),the customer name(10 spaces), the customer's state, and the
		// customer's balance(up to 9999.99). After defining the field delimiter
		// (a comma), you can build a generic customer
		// string by assembling the pieces. The record size is then calculated
		// from the dummy record.A consistent record size is important so it can
		// be used to calculate a record's position when the files are accessed
		// randomly.

		final String CUST_FORMAT = "000";
		final String NAME_FORMAT = "                    ";
		// Am not sure if am going to use Name_Length
		final int NAME_LENGTH = NAME_FORMAT.length();
		// final String HOME_STATE = "WI";
		final String BALANCE_FORMAT = "0000.00";
		String delimiter = ",";
		String s = CUST_FORMAT + delimiter + NAME_FORMAT + delimiter
				+ BALANCE_FORMAT + System.getProperty("line.separator");

		// Am not sure if am going to use RecSize
		final int RECSIZE = s.length();

		// I decide to create a path where the file is going to be created

		Path RochesterBankRec = Paths
				.get("Macintosh\\HD\\Users\\ernestmushinge\\Documents\\All_MyJava_code\\Chapter.13\\RochesterBank.txt");

		// Next you call a method that creates the empty files into which
		// randomly placed data records can eventually be written. The
		// method accepts the path for file and the String that defines the
		// record format.
		// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		createEmptyFile(RochesterBankRec, s);

		// Next I decided to rap the code that actually creates the file in a
		// try and catch block. Just in case the file doesn't
		// exist then it should be created, if it exists then it should be
		// written to

		// In a try block, declare a new OutputStream using the method's Path
		// parameter.
		// then create a BufferWritter using the OutputStream

		try

		{
			Scanner input = new Scanner(System.in);

			// set up the FileChannel reference for RochesterBankRecord path
			RochesterBankRecord = (FileChannel) Files.newByteChannel(
					RochesterBankRec, CREATE, WRITE);

			// /////////////////////////////////////////////////////////////////////////////////////////////////
			// MY OWN CODE HERE

			System.out.print("Enter customer account number  >> ");
			idString = input.nextLine();

			while (!(idString.equals(QUIT))) {
				AccountNumber = Integer.parseInt(idString);
				// Prompt the user for and accept the customer's name. To ensure
				// that entered names are stored using a uniform length, assign
				// the name
				// to a stringBuilder object, and set the length to the standard
				// length. then assign the newly sized StringBuilder back to the
				// String

				System.out.print("Enter names for customer >> ");
				Name = input.nextLine();
				StringBuilder sb = new StringBuilder();
				sb.append(Name);
				sb.setLength(NAME_LENGTH);

				/*
				 * // I decide to prompt the user for the customer first name
				 * System.out.print("Enter first name for customer >> ");
				 * FirstName = input.nextLine(); sb.append(FirstName);
				 * sb.setLength(NAME_LENGTH);
				 */

				// I decided to create a variable called names to hold first and
				// last name
				// then assign String builder to names

				// String Names;
				Name = sb.toString();

				// Prompt the user for and accept the customer's balance.
				// Because you use the nextDouble() method to retrieve the
				// balance, you follow
				// it with a call to nextLine() to absorb the Enter key value
				// left in the input stream. Then you can use the Decimal Format
				// class
				// to ensure that the balance meets the format requirements of
				// the file. Because the BALANCE_FORMAT String's value is
				// 0000.00, zeros
				// will be added to the front or back of any double that would
				// not otherwise meet the standard. For example, 200.99 will be
				// stored as 0200.99
				// and 0.1 will be stored as 0001.00. Appendix C contains more
				// information on the DecimalFormat class and describe other
				// potential formats

				System.out.print("Enter balance >> ");
				Balance = input.nextDouble();
				input.nextLine();
				DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);

				// /////////////////////////////////////////////////////////////////////////////////////////////////
				// This will insert a new record into a data file at a location
				// that is equal to the account number
				// but I have to accumulate data to a buffer so its organized
				// before writing to a file

				// Construct the String to be written to the file by
				// concatenating the entered fields with the comma delimiter and
				// the line separator
				s = idString + delimiter + Name + delimiter
						+ df.format(Balance)
						+ System.getProperty("line.separator");

				// Convert the constructed String to an array of bytes, and wrap
				// the array into a ByteBuffer.

				byte data[] = s.getBytes();
				ByteBuffer buffer = ByteBuffer.wrap(data);

				if (AccountNumber < 9999) {
					// ////////THIS IS WHERE THE PROBLEM IS(IT DOESN'T ALLOW
					// CASTING OF FileChannel)
					// ( (FileChannel) file).position(AccountNumber* RECSIZE);
					// //////////////////////////////Actual code before comment
					// outputStr.position(AccountNumber* RECSIZE);
					// //////////////////////////////////////
					// ((FileChannel) file).write(buffer);

					RochesterBankRecord.position(AccountNumber * RECSIZE);
					// ((FileChannel) file).write(buffer);
					RochesterBankRecord.write(buffer);
				} else if (AccountNumber > 9999) {
					System.out
							.print("Error on writing the file, It seems like the account number exceeds 9999\n"
									+ "Please try again ");

					// I decide to implement this code for user to try again
					// System.out.print("Enter customer account number or 8888 to quit >> ");
					// idString = input.nextLine();

				}

				else if (Balance > 99000) {
					System.out
							.println("Balance exceeds limit\nPlease enter balance less than $99,000.00");
					QUIT = true;
					System.out
							.println("Thank you, your files will now be written to the RochesterBankRec file");
					System.exit(0);

					// Prompt the user for and accept the customer's balance.
					// Because you use the nextDouble() method to retrieve the
					// balance, you follow
					// it with a call to nextLine() to absorb the Enter key
					// value left in the input stream. Then you can use the
					// Decimal Format class
					// to ensure that the balance meets the format requirements
					// of the file. Because the BALANCE_FORMAT String's value is
					// 0000.00, zeros
					// will be added to the front or back of any double that
					// would not otherwise meet the standard. For example,
					// 200.99 will be stored as 0200.99
					// and 0.1 will be stored as 0001.00. Appendix C contains
					// more information on the DecimalFormat class and describe
					// other potential formats

					System.out.print("Enter balance >> ");
					Balance = input.nextDouble();
					input.nextLine();

				}

				else if (AccountNumber == 20000) {
					QUIT = true;
					System.out
							.println("Thank you, your files will now be written to the RochesterBankRec file");
					System.exit(0);
				}

				// Prompt the user for the next customer account number, and add
				// a closing curly brace for the while loop.

				System.out
						.print("Enter next customer account number or 20000 to quit >> ");
				idString = input.nextLine();
				// Close the FileChannels, and add a closing curly brace for the
				// class
				// I USED TO MAKE A MISTAKE WITH THIS CODE. I USED TO PUT THIS
				// CODE AT THE END OF THE CLASS(WRONG!)

			}
			RochesterBankRecord.close();

		}

		// add a catch block to handle any Exception thrown from the try block,
		// and add a closing curly brace for the method
		catch (Exception e) {
			System.out.println("Error on writing the file, sorry try again: "
					+ e);
		}
		/*
		 * //This will insert a new record into a data file at a location that
		 * is equal to the account number //but I have to accumulate data to a
		 * buffer so its organized before writing to a file
		 * 
		 * //Construct the String to be written to the file by concatenating the
		 * entered fields with the comma delimiter and the line separator
		 * s=idString + delimiter + name + delimiter + df.format(balance) +
		 * System.getProperty("line.separator");
		 * 
		 * //Convert the constructed String to an array of bytes, and wrap the
		 * array into a ByteBuffer.
		 * 
		 * byte data[] = s.getBytes(); ByteBuffer buffer =
		 * ByteBuffer.wrap(data);
		 * 
		 * if(AccountNumber<9999) { fcIn.position(AccountNumber* RECSIZE);
		 * fcIn.write(buffer); } else { fcOut.position(AccountNumber* RECSIZE);
		 * fcOut.write(buffer); }
		 * 
		 * //Prompt the user for the next customer account number, and add a
		 * closing curly brace for the while loop.
		 * 
		 * System.out.print("Enter next customer account number or " + QUIT +
		 * " to quit >> "); idString = input.nextLine();
		 */

	}

	// END OF MAIN METHOD

	// /////////////////////////////////////////////////////////////////////////////////

	// I DECIDED TO PUT THIS METHOD OUTSIDE MAIN METHOD
	// thinking of not carrying any argument
	public static void createEmptyFile(Path file, String s) {

		// Scanner input = new Scanner(System.in);
		// this will create 10,000 blank records;
		final int NUMRECS = 10000;

		// In a try block, declare a new OutputStream using the method's Path
		// parameter.
		// then create a BufferWritter using the OutputStream

		try

		{

			OutputStream outputStr = new BufferedOutputStream(
					Files.newOutputStream(file, CREATE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					outputStr));
			// Use a for loop to write 10,000 . Then close the BufferWriter,
			// and add a closing brace for the try block.
			for (int count = 0; count < NUMRECS; ++count) {

				// have to come back to this
				writer.write(s, 0, s.length());

			}
			writer.close();
		}

		// add a catch block to handle any Exception thrown from the try block,
		// and add a closing curly brace for the method
		catch (Exception e) {
			System.out.println("Error on writing the file: " + e);
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////

	}
}
