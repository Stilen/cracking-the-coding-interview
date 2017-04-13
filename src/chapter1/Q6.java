package chapter1;

public class Q6 {
	
	//Time: O(n) Space: O(n)
	public static String compressString (String s) {
		StringBuilder builder = new StringBuilder();
		
		int i=0;
		char cur = s.charAt(0);
		int count = 0;
		while(i<s.length()) {
			char c = s.charAt(i);
			if(c == cur) count++;
			else{
				builder.append(cur+count);
				cur = c;
				count = 1;
			}
		}
		
		String result = builder.toString();
		if(result.length() < s.length()) return result;
		return s;
	}

}
