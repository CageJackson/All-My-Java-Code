
//File name MenuException.java
	//Written by Ernest Mushinge
	//Written on 03/8/15

//This class will extends Exception class that has built it exception methods
//that passes an argument

public class MenuException extends Exception {
	
	public MenuException(String choice)
	{
		super(choice);
	}

}
