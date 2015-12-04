//File name Publication.java
//Written by Ernest Mushinge
//Written on 03/24/15

// Assignment #6
// Java Programming
 //Spring 2015 CRN 11438
// Due: March 25, 2015
// Worth 50 points

import javax.swing.JOptionPane;

public class PublicationArray {

	public static void main(String[] args) {

		int i;
		

		// This array will hold five books and five magazine
		Publication[] publication = new Publication[10];

		publication[0] = new Magazine(" American Fisherman", 2, 100);
		publication[1] = new Book("The boy", 85.9, 100);
		publication[2] = new Book(" C++ Programming ", 30, 70);
		publication[3] = new Book(" J++ ", 30, 55);
		publication[4] = new Book(" Morning Dove ", 15, 39);
		publication[5] = new Magazine(" Time ", 1.5, 100);
		publication[6] = new Magazine(" Nerd ", 3, 10);
		publication[7] = new Magazine(" New Yorker ", 2.25, 28);
		publication[8] = new Magazine(" Devorced ", 1.75, 33);
		publication[9] = new Book(" The Secret", 3.9, 60);

		StringBuffer outString = new StringBuffer();
		for (i = 0; i < publication.length; ++i) {
			// this will add String to the String buffer object
			outString.append("\n Publication [" + (i + 1) + "] ");
			outString.append(publication[i].toString());
			
		}

		JOptionPane.showMessageDialog(null, Magazine.ProgrammerName()+" The following is the list of book\n\n" + outString);
	}

}
