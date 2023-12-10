package day1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Array to hold the data from the file
		ArrayList<String> codes = ReadData.readData("in.txt");
		
		
		int total = 0;
		
		
		
		// Iterate through the array and get the values
		for (String c : codes) {

			// String to contain the concatenated values
			String value = "";
			
			// Get the first digit
			value = value + getDigit(c);
			
			// Get the second digit
			StringBuilder t = new StringBuilder(c).reverse();
			
			value = value + getDigit(t.toString());
			
			// Add the value to the total
			total = total + Integer.parseInt(value);
		}
		

		System.out.println(total);

	}
	
	
	private static String getDigit(String searchText) {
		
		int i = 0;
		
		while (i < searchText.length() && !Character.isDigit(searchText.charAt(i))) {
			
			i++;
			
		}
		
		return String.valueOf(searchText.charAt(i));
		
		
	}
	
	

}