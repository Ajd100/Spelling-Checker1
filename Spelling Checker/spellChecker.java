//Calls upon dictionary to check if the word is spelled correctly

import java.util.*;
import java.io.*;

public class spellChecker{	
	
	//dictionary dict = new dictionary();
	public static void main(String [] args) throws IOException{
		//creating the dictionary
		String [] wordArray = utilities.fileToStringArray("./largeList.txt");
		List<String> wordList = Arrays.asList(wordArray);
		HashMap<String, Integer> hM = new HashMap<String, Integer>();
		
		//hashing the dictionary and putting it to lower case. 
		try {
			for(int i=0; i<wordArray.length; i++){
				hM.put(wordList.get(i).toLowerCase(), wordList.get(i).toLowerCase().hashCode());
			}
		}
		catch (Exception e){
			System.out.println("Something isn't right here");
		}
		
		
		System.out.println(hM); //prints the entire dictionary file
		String s = "";
		
		//this is so you can check another word after checking one. 
		while(!s.equals(null)){
			//take a user input
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a word to check in the dictionary \nOr type 'CLOSE CHECKER' to close the program.");
			s = input.nextLine().toLowerCase();
			
			System.out.println("\n");
			
			//end the program when the user is ready and doesn't have to exit the command line
			if(s.equals("close checker")){
				break;
			}
			
			Object hash = s.hashCode();
			
			//check if the word the user input is in the dictionary, if it is then say if it is correct or not. 
			if(hM.containsValue(hash)){
				System.out.println(s + " is Spelled Correctly \n");
			}
			else if(hash.equals(0) || hash.equals(32)){
				System.out.println("There are no words in the input");
			}
			else{
				System.out.println(s + " is spelled incorrectly, or by some chance it is not in the dictionary \n");
			}
		}
	}
}