package chapter1;

import java.util.HashMap;

public class Q2 {
	
	
	/* Time: O( max(s1.length, s2.length) ) Space: O(s1.length)
	 * 
	 * Alternate solution is converting both strings to 
	 * char arrays, sorting and comparing them
	 * Would run in O(nlog(n))
	 */
	public static boolean isPermutation (String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
		
		for(int i=0; i < s1.length(); i++){
			char c = s1.charAt(i);
			
			if(chars.containsKey(c))
				chars.put(c, chars.get(c)+1);
			else
				chars.put(c, 1);
		}
		
		for(int i=0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			if(!chars.containsKey(c)) return false;
			
			if(chars.get(c) > 1)
				chars.put(c, chars.get(c) - 1);
			else
				chars.remove(c);
		}
		
		return true;
	}

}
