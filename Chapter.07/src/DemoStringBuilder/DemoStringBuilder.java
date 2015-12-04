//File name DemoStringBulder.java
//Written by Ernest Mushinge
//Written on 2/21/15

package DemoStringBuilder;// For my packaging of code

public class DemoStringBuilder {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder(" singing");

		// Print my information
		System.out.println(" Ernest Mushinge \n" + " Assign 5\n"
				+ " Java Programming, Spr 2015 CRN 11438,\n"
				+ " Due March 1st, 2015\n");


		str.append(" in the dead of ");
		print(str);

		// use insert() method to insert characters. Then display the String
		// builder, insert additional characters, and display it again
		str.insert(0, " Black ");
		print(str);
		str.insert(6, " Bird ");
		print(str);

		// add one more append() and print() combination

		str.append(" night ");
		print(str);
	}

	// create a method

	public static void print(StringBuilder s) {
		System.out.println(s);

	}

}
