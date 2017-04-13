package chapter1;

public class Q3 {
	
	//Time: O(n) Space: O(n)
	public static String replaceSpaces (String s) {
		char[] array = s.toCharArray();
		
		int i = 0;
		while(i<array.length){
			if(array[i] == ' '){
				array[i] = '%';
				array[i+1] = '2';
				array[i+2] = '0';
				i += 2;
			}
			else i++;
		}
		
		return array.toString();
		
	}

}
