package chapter2;

import java.util.HashSet;

public class Q1 {
	
	/*
	 * Time: O(n) Space: O(1)
	 * Without hashset time would be O(n^2)
	 */
	
	public static void removeDups(Node head) {
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(head.data);
		
		Node cur = head.next, prev = head;
		while(cur != null) {
			
			if(values.contains(cur.data)){
				prev.next = cur.next;
				cur = cur.next;
			}
		}
	}
	
}
