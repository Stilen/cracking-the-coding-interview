package chapter2;

import java.util.HashSet;
import java.util.Set;

public class Q8 {

	
	//Time: O(n) Space: O(n)
	public static boolean hasLoop(Node head) {
		
		Set<Node> nodes = new HashSet<Node>();
		
		Node cur = head;
		
		while(cur != null) {
			if(nodes.contains(cur)) return false;
			cur = cur.next;
		}
		
		return true;
	}
}
