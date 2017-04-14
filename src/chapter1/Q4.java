package chapter1;

import java.util.HashSet;

public class Q4 {
	
	/*
	 * A palindrome has at most one character with an odd number
	 * of occurrences, all the others occur an even number of times.
	 * 
	 * Time: O(n) Space: O(n)
	 */
	public static boolean isPermutationOfPalindrome (String s) {
		s = s.toLowerCase();
		HashSet<Character> chars = new HashSet<Character>();
		
		for(int i=0; i < s.length(); i++){
			char c = s.charAt(i);
			if(chars.contains(c)) chars.remove(c);
			else chars.add(c);
		}
		
		return chars.size() <= 1;
	}

}
