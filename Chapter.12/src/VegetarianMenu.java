//File name VegetarianMenu.java
	//Written by Ernest Mushinge
	//Written on 03/6/15

public class VegetarianMenu extends Menu2 {
	
	String[] vegEntreeChoice = {"Spinach Lasagna", "Cheese Enchiladas", "Fruit Plate"};
	
	
	public VegetarianMenu()
	{
		super();
		for(int x = 0; x < vegEntreeChoice.length; ++x)
		{
			entreeChoice[x] = vegEntreeChoice[x];
		}
	}

}
