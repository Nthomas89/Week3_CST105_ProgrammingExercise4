import java.io.File;
import java.util.*;

/**
 * Program: Read text from file
 * File: PigLatin.java
 * Summary: translating a text file to Pig Latin
 * Author: Nicholas Thomas
 * Date: December 3, 2017
 */


public class PigLatin {

		private static Scanner input;
		public static String vowels = "aeuioy";
		final static String suffix1 = "way";
		final static String suffix2 = "ay";
		
		
		public static void toPigLatin(String s) {
			char[] letters = s.toLowerCase().toCharArray();
			
			if(vowels.contains(Character.toString(letters[0]))) {
				System.out.println(s + "\t\t" + (s + suffix1).toUpperCase());
			} 
			
			
			else {
				
				String prefix = "";
				int count = 0;
				
				while(!vowels.contains(Character.toString(letters[count]))
						&& count < s.length()-1) {
					prefix += letters[count];
					count++;
				}
				
				String root = s.substring(count);
				System.out.println(s + "\t\t" + (root + prefix + suffix2).toUpperCase());
			}
		}
		
		// pulling in the text file to have translated.
		public static void main(String[] args) throws Exception {
			
			File myFile = new File("E:\\GCU\\CST-105\\WK 3\\Exercise-4.txt");
			input = new Scanner(myFile);
			
			while(input.hasNext()) {
				toPigLatin(input.next());
			}
			
			input.close();
	}

}
