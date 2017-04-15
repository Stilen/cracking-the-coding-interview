package chapter2;

import java.util.HashSet;
import java.util.Set;

public class Q7 {
	
	//Time: O(m+n) Space: O(m)
	public static boolean intersect(Node list1, Node list2){
		if(list1 == null || list2 == null) return false;
		
		Node l1 = list1;
		Node l2 = list2;
		
		Set<Node> nodes = new HashSet<Node>();
		
		while(l1 != null) {
			nodes.add(l1);
			l1 = l1.next;
		}
		
		while(l2 != null) {
			if(nodes.contains(l2)) return false;
			l2 = l2.next;
		}
		
		return true;
	}
	
}
