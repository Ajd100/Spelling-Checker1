// A class with useful utilities

import java.io.*;

public class utilities {
	
	public static String[] fileToStringArray (String fileName) throws IOException{
		String data = fileToString(fileName);
		String str = cleanText(data);
		String[] wordArray = str.split(" ");
		
		return wordArray;
	}
	
	public static String fileToString (String fileName){
		String result = "";
		try{
			FileInputStream file = new FileInputStream(fileName);
			byte[] b = new byte[file.available()];
		//System.out.println("Number of byes in this file = " + file.available());
			file.read(b);
			file.close();
			result = new String(b);
		}
		catch (Exception e) {
			System.out.println("NO FILE DETECTED!");
		}
		return result;
		//System.out.println(result);
	}
	
	public static String cleanText(String s){
		s = s.replaceAll("\\p{Punct}", " ");
		s = s.replaceAll("\\W", " ");
		s = s.replaceAll("\\s+", " ");
		return s;
	}
	
}