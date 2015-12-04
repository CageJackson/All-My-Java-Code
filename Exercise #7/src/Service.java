//File name Service.java
//Written by Ernest Mushinge
//Written on 3/04/15
import javax.swing.JOptionPane;

public class Service {

	private String ServiceDescription;
	private int Price;
	private int NumberOfMinutes;

	/*
	 * public Service( String serviceDescription, int price, int
	 * numberOfMinutes) { this.ServiceDescription = serviceDescription;
	 * this.Price = price; this.NumberOfMinutes = numberOfMinutes;
	 * 
	 * }
	 */

	public void setDescription(String description) {
		this.ServiceDescription = description;
	}

	public void setPrice(int price) {
		this.Price = price;
	}

	public void setTime(int time) {
		this.NumberOfMinutes = time;
	}

	public String getDescription() {
		return ServiceDescription;
	}

	public int getPrice() {
		return Price;
	}

	public int getMinutes() {
		return NumberOfMinutes;
	}

	// to do, create a method to display all the content and delete JOptionPane
	// from main

	public void display(String service[], int price[], int time[]) {
		String ss = "";// stringBuilder
		for (int s = 0; s < service.length; s++) {
			for (int p = 0; p < service[s].length(); p++) {
				for (int t = 0; t < price[p]; t++) {

					ss += ", " + time[t];
					// JOptionPane.showMessageDialog(null, time[t] + " \t");
				}
			}
		}

		JOptionPane.showMessageDialog(null, "Sorted by " + service + price
				+ time);// take this to display method in class
		// JOptionPane.showMessageDialog(null, "Sorted by " +ServiceDescription
		// + Price + NumberOfMinutes);//take this to display method in class
	}
}
