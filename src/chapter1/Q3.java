package chapter1;

public class Q3 {
	
	//Time: O(n) Space: O(n)
	public static String replaceSpaces (String s) {
		char[] array = s.toCharArray();
		
		int i = array.length - 1;
		
		while(i >= array.length / 3 && array[i] == ' ') 
			i--;
		
		int j = array.length - 1;
		while(i >= 0 && i <= j) {
			if(array[i] != ' '){
				array[j--] = array[i--];
			}
			else {
				array[j--] = '0';
				array[j--] = '2';
				array[j--] = '%';
				i--;
			}
		}

		StringBuilder builder = new StringBuilder();
		for(char c : array)
			builder.append(c);
		return builder.toString();
		
	}

}
