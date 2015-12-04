//File name Insured.java
//Written by Ernest Mushinge
//Written on 03/16/15

/* 
 Assignment #6
 Java Programming
 Spring 2015 CRN 11438
 Due: March 25, 2015
*/

//This is an Insured interface for use with classes that represent objects that can be insured.
//for example, you might use this interface with classes such as jewelry or House representing objects to be insured.

public interface Insured {

	public void setCoverage();
	public int getCoverage();
}
