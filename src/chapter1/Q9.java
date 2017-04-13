package chapter1;

public class Q9 {
	
	//Time: O(n*O(isSubstring())) Space: O(n*O(isSubstring()))
	public static boolean isRotation(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		int beg = s1.charAt(0);
		
		int i=0;
		while(i<s2.length()){
			if(s2.charAt(i) == beg){ 
				String substring = s2.substring(i, s2.length()) + s2.substring(0, i-1);
				if(isSubstring( substring , s1)) 
					return true;
			}
			i++;
		}
		return false;
	}

	private static boolean isSubstring(String substring, String string) {
		// TODO Auto-generated method stub
		return false;
	}

}
