package chapter1;

import java.util.HashSet;


//Without additional data structures time would be O(n^2)
public class Q1 {

	
	
	//Time: O(n) Space: O(n)
	public static boolean hasAllUniqueChars (String s) {
		HashSet<Character> chars = new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(chars.contains(c)) return false;
			chars.add(c);
		}
		
		return true;
	}

}
