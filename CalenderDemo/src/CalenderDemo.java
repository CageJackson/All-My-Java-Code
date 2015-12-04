//File name CalenderDemo.java
	//Written by Ernest Mushinge
	//Written on 2/2/15


import java.util.*;

import javax.swing.JOptionPane;

public class CalenderDemo {

	
	
	public static void main(String[] args) {
		//this is to display my name and course information
		System.out.println(" Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 4, 2015");	
		System.out.println(" Exercise 3 c \n");
		
		//this are variables 
		int time1, time2, milli1, milli2, sec1, sec2, timeDifference;
		final int MILLISECS_IN_SECOND=1000;
		
		//using import java.util.*; and import javax.swing.JOptionPane;


		GregorianCalendar before = new GregorianCalendar();
		milli1 = before.get(GregorianCalendar.MILLISECOND);
		sec1 = before.get(GregorianCalendar.SECOND);
		time1 = MILLISECS_IN_SECOND * sec1 + milli1;
		
		JOptionPane.showConfirmDialog(null, "Is stealling ever justified?");
		GregorianCalendar after = new GregorianCalendar();
		milli2 = after.get(GregorianCalendar.MILLISECOND);
		sec2 = after.get(GregorianCalendar.SECOND);
		time2 = MILLISECS_IN_SECOND*sec2 + milli2;
		
		//Computer time in difference and display the result
		
		timeDifference = time2 - time1;
		JOptionPane.showMessageDialog(null," Ernest Mushinge ITMP2650 Java Programming, Spring 2015, CRN 11438, Due Feb 4, 2015\n" + "You Do It (Chapter 4 )\n "+  "\nIt took  " + timeDifference + " milliseconds for you to answer");
		
		
		
		GregorianCalendar now = new GregorianCalendar();
		System.out.println(" Year: " + now.get(Calendar.YEAR));
		System.out.println(" Month: " + now.get(Calendar.MONTH));
		System.out.println(" WEEK_OF_YEAR: " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println(" WEEK_OF_MONTH: " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println(" DATE: " + now.get(Calendar.DATE));
		System.out.println(" DAY_OF_MONT: " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println(" DAY_OF_YEAR: " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println(" DAY_OF_WEEK: " + now.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(" AM_PM: " + now.get(Calendar.AM_PM));
		System.out.println(" HOUR: " + now.get(Calendar.HOUR));
		System.out.println(" MINUTE: " + now.get(Calendar.MINUTE));
		System.out.println(" SECOND: " + now.get(Calendar.SECOND));
		System.out.println(" MILLISECOND: " + now.get(Calendar.MILLISECOND));
		
		
		
		

	}

}
