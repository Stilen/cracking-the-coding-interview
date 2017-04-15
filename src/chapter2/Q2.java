package chapter2;

public class Q2 {
	
	//Time: O(n) Space: O(1)
	public static int findKtoLast(Node head, int k) {
		
		Node cur = head;
		int n = getSize(head) - k - 1;
		
		while(n > 0) {
			cur = cur.next;
			n--;
		}
		
		return cur.data;
	}
	
	private static int getSize(Node head) {
		int size = 0;
		Node cur = head;
		while(cur != null){
			size++;
			cur = cur.next;
		}
		return size;
	}

}
