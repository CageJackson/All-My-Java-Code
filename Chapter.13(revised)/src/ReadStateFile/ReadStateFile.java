package ReadStateFile;

//File name ReadStateFile.java
//Written by Ernest Mushinge
//Written on 03/8/15

import java.nio.ByteBuffer;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

import static java.nio.file.StandardOpenOption.*;

import java.nio.ByteBuffer.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class ReadStateFile {
	// Declare a scanner object to handle keyboard input. Then declare a String
	// that will hold the name of the file the program will use.
	// prompt the user for the filename, concatenate it with the correct path,
	// and create a path object

	// I decided to put this code in a method to avoid the error
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String fileName;
		// I forgot this lines of code
		System.out.print("Enter name of file to use>> ");
		fileName = kb.nextLine();
		fileName = "Macintosh\\HD\\Users\\ernestmushinge\\Documents\\All_MyJava_code\\Chapter.13\\";
		Path file = Paths.get(fileName);

		// Add the String formatting constants and build a sample record String
		// so that you can determine the record size
		// To save time, you can copy these declarations from the
		// CreateFilesBasedOnState program

		final String ID_FORMAT = "000";
		final String NAME_FORMAT = " ";
		final int NAME_LENGTH = NAME_FORMAT.length();
		final String HOME_STATE = "WI";
		final String BALANCE_FORMAT = "0000.00";
		String delimiter = ",";
		String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + HOME_STATE
				+ delimiter + BALANCE_FORMAT
				+ System.getProperty("line.separator");
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
		final String EMPTY_ACCT = "000";
		String[] array = new String[4];
		double balance;
		double total = 0;

		/*
		 * //My own code to set file name to use public void setFileName(String
		 * fileName) { this.fileName = fileName; }
		 */

		// System.out.print("Enter name of file to use >> ");

		// fileName = kb.nextLine();

		/*
		 * //My own code to get file
		 * 
		 * fileName =
		 * "/Users/ernestmushinge/Documents/All My Java code/Chapter.13" +
		 * fileName; Path file = Paths.get(fileName); //I should try to return
		 * file (here)if it doesn't work return file;
		 */

		// insert a try block in which you declare a BasicFileAttributes object.
		// Then add statements to display the file's creation time and size.
		// Include a catch block to handle any thrown exceptions
		try {

			// I forgot to include this path to get the BasicFileAttributes from
			Path file1 = Paths
					.get(fileName);
			BasicFileAttributes attr = Files.readAttributes(file1,
					BasicFileAttributes.class);
			System.out.println("\nAttributes of the file:");
			System.out.println("Creation time " + attr.creationTime());
			System.out.println("Size" + attr.size());

		} catch (IOException e) {
			System.out.println("IO Exception" + e);
		}

		// try and catch and declare an InputStream and BufferedReader to handle
		// reading the file
		try {
			// I forgot to establish the path to get reading file from
			Path file2 = Paths
					.get(fileName);

			BufferedInputStream iStream = new BufferedInputStream(
					Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					iStream));
			// display a heading, and then read the first record from the file
			// into a String

			System.out.println("\nAll non-default records: \n");

			// in a loop that continual while there is more data to read. split
			// the String using the comma delimiter. Test the first element
			// the account number and proceed only if it is not "000", if the
			// record entered was in the previous program.
			// display the split String element. Add the balance to a running
			// total. As the last action in the loop, read the record

			while (s != null) {
				array = s.split(delimiter);
				if (!array[0].equals(EMPTY_ACCT)) {
					balance = Double.parseDouble(array[3]);
					System.out.println("ID #" + array[0] + " " + array[1]
							+ array[2] + " $" + array[3]);
					total += balance;
				}
				s = reader.readLine();
			}

			// VERY IMPORTANT, AT THIS POINT I DISPLAY THE RESULT
			// After all the records have been processed, display the total and
			// close the reader

			System.out.println("Total of all balances is $" + total);
			reader.close();
		} catch (Exception ex) {
			System.out.println("Error was cought" + ex);
		}

		// VERY IMPORTANT CODE
		// /////////////////////////////
		// I LOVE THIS CODE RIGHT HERE
		// Add a new try block that declares a FileChannel and ByteBuffer and
		// then prompts the user for and accepts an account
		// to search for in the file

		try {

			// I forgot to establish the path to get reading file from
			Path file3 = Paths
					.get(fileName);

			// I added Scanner kb2 object for findAcct
			// Scanner kb2 = new Scanner(System.in);
			FileChannel fc = (FileChannel) Files.newByteChannel(file3, READ);
			ByteBuffer buffer = ByteBuffer.wrap(data);
			int findAcct;
			System.out.println("\nEnter accout to seek >> ");
			findAcct = kb.nextInt();

			// Calculate the position of the sought-after record in the file by
			// multiplying the record number by the file size.
			// Read the selected record into the ByteBuffer, and convert the
			// associated byte array to a string that you can display
			// Add a closing curly brace for the try block
			fc.position(findAcct * RECSIZE);
			// read raped data that is buffer
			fc.read(buffer);
			// Converting data into string for display
			s = new String(data);
			System.out.println("Desired record:" + s);
		} catch (Exception ep) {
			System.out.println("Error found" + ep);
		}
	}
}
