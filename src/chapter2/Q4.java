package chapter2;

public class Q4 {
	
	//Time: O(n) Space: O(1)
	public static Node partition(Node head, int x) {
		Node cur = head;
		Node low = null,
				high = null;
		
		while(cur != null && (low == null || high == null)) {
			if(cur.data < x) low = cur;
			else high = cur;
		}
		
		if(low == null || high == null) return head;
		
		cur = head;
		
		low.next = null;
		high.next = null;
		
		while(cur != null) {
			if(cur.data < x && cur != low) {
				Node tmp = cur;
				cur = cur.next;
				tmp.next = low.next;
				low.next = tmp;
			}
			else if(cur != high) {
				Node tmp = cur;
				cur = cur.next;
				tmp.next = high.next;
				high.next = tmp;
			}
			else cur = cur.next;
		}
		
		return low;
	}

}
