//Calls upon dictionary to check if the word is spelled correctly

import java.util.*;
import java.io.*;

//Anthony is trying WAY too hard to make this damn thing work

public class fileChecker{	
	
	//dictionary dict = new dictionary();
	public static void main(String [] args) throws IOException{
		String [] wordArray = utilities.fileToStringArray("./largeList.txt");
		List<String> wordList = Arrays.asList(wordArray);
		HashMap<String, Integer> hM = new HashMap<String, Integer>();
		
			String [] wordArray1 = utilities.fileToStringArray("./file1.txt");
			List<String> wordList1 = Arrays.asList(wordArray1);
			HashMap<String, Integer> hM1 = new HashMap<String, Integer>();
		
		//Creating Dictionary HashMap
		try {
			for(int i=0; i<wordArray.length; i++){
				hM.put(wordList.get(i).toLowerCase(), wordList.get(i).toLowerCase().hashCode());
			}
		}
		catch (Exception e){
			System.out.println("Something isn't right here");
		}
				
			//Creating HashMap for the file needing to be checked
			try {
				for(int j=0; j<wordArray1.length; j++){
					hM1.put(wordList1.get(j).toLowerCase(), wordList1.get(j).toLowerCase().hashCode());
				}
			}
			catch (Exception e){
				System.out.println("Something isn't right here");
			}
			//System.out.println(hM1);
			
			//for(int j= 0; j<wordArray1.length; j++){
			//System.out.println(wordList1.get(j).hashCode());
		//}
			//Initializing variables...
		boolean contains = false;
		int wordCount = 0;
		//String word = " ";
		//
	
		//if(contains = false){
		
		//Stupid piece of SHIT code that doesn't work like I want it to.
		//Right now, it's counting every word in both files
		for(String s2 : hM.keySet()){
				//System.out.println(s2);
			if (hM.get(s2).equals(hM1.get(s2))){
				contains = false;
				//System.out.println(s2.hashCode());
				wordCount++;
			
			}
		}
		for(String s1 : hM1.keySet()){
			if (hM1.get(s1).equals(hM.get(s1))){
				contains = false;
				wordCount++;
				}
			} 
		//}else 
			//contains = true;
		
	System.out.println( "\n" + wordCount);
	}	
}
		
	
	/*	try{
			for(String s : hM.keySet()){
				if (hM1.get(s).equals(hM.get(s))){
					contains = false;
					word = s;
					wordCount++;
						//if(contains = false){
					//	System.out.println(s + "isn't spelled correctly or isn't in the dictionary \n");
				//	}
				}
			}
			for(String s1 : hM1.keySet()){
				if (!hM.containsKey(s1)) {
					contains = false;
						//if(contains = false){
						//System.out.println(s1 + "isn't spelled correctly or isn't in the dictionary \n");
					//}
				}
			}
		}	catch (NullPointerException e){
				contains = false;
				System.out.println("Eh... Something gave us a null pointer");
		}
		contains = true;
		
		if(contains = false){
					System.out.println("You have " + wordCount + "misspelled words, these are what they are: " + word);
				}*/
		
	
	
		
		//System.out.println(hM);	
		
		
		//this is so you can check another word after checking one. 
	//	while(!s.equals(null)){
			//Scanner input = new Scanner(System.in);
			//System.out.println("Please enter a word to check in the dictionary or type 'CLOSE CHECKER' to close the program.");
			//for(int i=0; i<wordArray1.length; i++){
		//	s = aL.hashCode(i);
		//	}
		//	System.out.println("\n");
			
			//end the program when the user is ready and doesn't have to exit the command line
			//if(s.equals("close checker")){
			//	break;
			//}
			
		//	Object hash = s.hashCode();
		
		//	boolean contains = false;
		
		//	if(hM.containsValue(hash)){
		//		System.out.println("The word is in the dictionary and spelled correctly.");
		//		contains = true;
		//	}
		//	else if(hash.equals(0)){
		//		System.out.println("There are no words in the input");
		//	}
		//	else{
		//		System.out.println("The word is spelled incorrectly, or by some chance it is not in the dictionary");
		//		contains = false;
		//	}
		//}
	//}