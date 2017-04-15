package chapter2;

public class Q3 {
	
	//Time: O(1) Space: O(1)
	public static void removeMiddleNode(Node mid) {
		mid.data = mid.next.data;
		mid.next = mid.next.next;
	}
}
