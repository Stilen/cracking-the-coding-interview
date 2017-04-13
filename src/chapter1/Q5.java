package chapter1;

public class Q5 {
	
	//Time: O(n) Space: O(1)
	public static boolean isOneEditAway (String s1, String s2) {
		int length1 = s1.length();
		int length2 = s2.length();
		// Difference in lengths cannot be greater than 1
		if( Math.abs( length1 - length2 ) > 1 ) return false;
		
		boolean edited = false;
		
		int i = 0, j = 0;
		while(i < length1 && j < length2) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(j);
			
			if(c1 != c2) {
				if(edited == true) return false;
				
				edited = true;
				
				if(length1 == length2) {
					i++;
					j++;
				}
				else if(length1 < length2)	
					j++;
				else
					i++;
			}
			
			else {
				i++;
				j++;
			}
		}
		
		return true;
	}

}
