package chapter2;

public class Q5 {
	
	//Time: O(m+n) Space: O(m+n)
	public static Node sumLists(Node list1, Node list2) {
		if(list2 == null) return list1;
		if(list1 == null) return list2;
		
		Node head = new Node( (list1.data + list2.data) % 10),
				cur = head;
		int carry = (list1.data + list2.data) / 10;
		
		Node l1 = list1.next;
		Node l2 = list2.next;
		
		while(l1 != null || l2 != null) {
			int a, b;
			
			if(l1 != null) a = list1.data;
			else a = 0;
			
			if(l2 != null) b = list2.data;
			else b = 0;
			
			int sum = a + b + carry;
			cur.next = new Node(sum % 10);
			carry = sum / 10;
			cur = cur.next;
		}
		
		if(carry != 0) cur.next = new Node(carry);
		
		return head;
	}
}
