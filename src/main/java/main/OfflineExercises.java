package main;

import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
//		
//		String[] each = input.split("");
//		String newString = "";
			
//		for ( int i = 0; i < input.length(); i++) {
//			
//			newString = each[i] + each[i] + each[i];
//		}
//		return newString;
//			
		int count = 1;
		String val = "";
		String newVal = "";
		for ( int i = 0; i < input.length(); i++) {
			val = input.substring(i, count);
			count += 1;
			newVal += val + val + val;
			//System.out.println(newVal);
		}
		
		return newVal;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		if (((b - a) ==  (c - b)))
		{
			return true;
		}
		
		
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		String output;
		output = input.substring(input.length() / 2, 1);
		 return output;
	
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("jh") → false
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		
		int stringLength = input.length();
		 boolean result = false;
		String compare = input.substring(stringLength - 3, stringLength);
		//String compare = input.substring((input.length() - 3), input.length());
		if(compare.equals("dev"))
		{
			result = true;
		}
		
		return result;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		
		String eachInput = input.split("");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(eachInput);
		for ( int i = 0; i < input.length(); i++)
		{
			if( )
		}
		 
		
		
		
		
		return -1;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int count = 0;
		int wordCount = 0;
		String word = "am";
		for (int i = 0; i < arg1.length(); i++) {
			
			if (arg1.substring(wordCount, i) == word)
			{
				return count + 1;
			}
//			else if (arg1.substring(wordCount, i) != word) {
//				
//				continue;
//			}
			
			wordCount += 1;
		}
		return count;
		
		
		
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		if(((arg1%3 == 0)) && ((arg1%5) == 0)) {
			return "fizzbuzz";
		}
		else if ((arg1% 5) == 0) {
			return "buzz";
		}
		else if ((arg1%3) == 0) {
			return "fizz";
		}
		else {

			return "value is not a multiple of 3 or 5";
		}
		
		
		
		
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		
		String[] eachNum = arg1.split(" ");
		
		for (int i = 0; i < arg1.length; i++)
		{
			eachNum[0]
		}
		
		
		
		return 0;
		
	}
	
	
}
