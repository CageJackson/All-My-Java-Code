//File name ReadingRecordsFromRandomData.java
//Written by Ernest Mushinge
//Written on 4/27/15

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingRecordsFromRandomData {

	public static void main(String[] args) {

		String[] array = new String[10];
		String s = "";
		String delimiter = ",";
		int id;
		String stringId;
		String name;

		double Balance;

		try {
			Path file = Paths
					.get("Macintosh\\HD\\Users\\ernestmushinge\\Documents\\All_MyJava_code\\Chapter.13\\RochesterBank.txt");

			BufferedInputStream iStream = new BufferedInputStream(
					Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					iStream));

			System.out.println();
			s = reader.readLine();

			while (s != null) {
				array = s.split(delimiter);
				stringId = array[0];
				id = Integer.parseInt(array[0]);
				if (id != 0) {
					name = array[1];
					Balance = Double.parseDouble(array[2]);
					System.out.println("Cust#" + stringId + " " + name + "  $"
							+ Balance);
				}

				s = reader.readLine();
			}

			reader.close();
		}

		catch (Exception e) {
			System.out.println(" Lolesheni bwino bakamba" + e);
		}

	}
}
