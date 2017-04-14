package chapter2;

import java.util.HashSet;

public class Q1 {
	
	//Time: O(n) Space: O(1)
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
