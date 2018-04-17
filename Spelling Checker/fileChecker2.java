//Trying files with linked lists instead
/*NOTE*/ //Linked Lists did not work

import java.util.*;
import java.io.*;

//Anthony is trying WAY too hard to make this thing work

public class fileChecker2{	
		
	public static void main(String [] args) throws IOException{
		//Creating Dictionary
		String [] wordArray = utilities.fileToStringArray("./largeList.txt");
		List<String> wordList = Arrays.asList(wordArray);
		HashMap<String, Integer> hM = new HashMap<String, Integer>();	
			
			//Creating file array to check
			String [] wordArray1 = utilities.fileToStringArray("./article.txt");	
			//System.out.println(wordArray1[2]);
			
			//Creates a stack to push words spelled incorrectly
			Stack<String> wrongWords = new Stack<String>();	
				
		//Creating Dictionary HashMap
		try {
			for(int i=0; i<wordArray.length; i++){
				hM.put(wordList.get(i).toLowerCase(), wordList.get(i).toLowerCase().hashCode());
			}
		}
		catch (Exception e){
			System.out.println("Something isn't right here");
		}
			//Running through the file to check for incorrectly spelled words
			//If they are incorrect, push them into a stack for easy retrieval
			for(int j=0; j<wordArray1.length; j++){
				
				Object hash = wordArray1[j].toLowerCase().hashCode();
				if(!hM.containsValue(hash)){
					wrongWords.push(wordArray1[j]);		
			}	
			
			//Printing the words that are incorrectly spelled then popping them out of the stack
			while(!wrongWords.isEmpty()){
				//System.out.println("The following word is spelled incorrectly: " + wrongWords.peek());
				System.out.println("The following word is spelled incorrectly: " + wrongWords.pop());
				
			}			
		}
			if(wrongWords.isEmpty()){
				System.out.println("The file has been checked!");
		}
	}
}

	//CODE THAT NEVER REALLY WORKED LIKE WE WANTED IT TO!

	//int correctWords = 0;
	//int wrongWords = 0;
	
	//public static void checkDictionary(String [] s){
			//Can't seem to get this to work, moving
			//entire method to MAIN

		
	/*	Set entrySet = hM.entrySet();
		
		Iterator it= entrySet.iterator();
				
		while(it.hasNext()){
			if(hM.containsValue(wordList1.hashCode())){
				correctWords++;
			}else{
				wrongWords++;				
			}
			Map.Entry me = (Map.Entry)it.next();
			//for(int j=0; j< wordArray.length; j++){
			//	if(me.getValue(wordList1.get(j), wordList1.get(j).hashCode()) = wordList.get(j)){
					//correctWords++;
				}
			}
		}*/
		
		
		//}
//}