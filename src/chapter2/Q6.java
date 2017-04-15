package chapter2;

import java.util.HashSet;
import java.util.Set;

public class Q6 {
	
	//Time: O(n) Space: O(1)
	public static boolean isPalindrome(Node head) {
		Set<Integer> set = new HashSet<Integer>();
		
		Node cur = head;
		while(cur != null) {
			if(set.contains(cur.data)) return false;
			set.add(cur.data);
			cur = cur.next;
		}
		
		return true;
	}
}
