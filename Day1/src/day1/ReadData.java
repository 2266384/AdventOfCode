package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadData {

	
	/** Method to read the file	*/
	public static ArrayList<String> readData(String fileName) {
		
		ArrayList<String> in = new ArrayList<>();				
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			
			String line = reader.readLine();
			
			while (line != null) {
					
					in.add(line);
					//System.out.println(line);
				
				line = reader.readLine();
				}
			
			reader.close();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
			
		return in;
		
	}
	

}