package chapter3;

//Problem 3.4 - Queue via Stacks
public class MyQueue<T extends Comparable<T>> {
	
	private Stack<T> left = new Stack<T>();
	private Stack<T> right = new Stack<T>();
	
	public void push(T data) {
		while(left.size() != 0) {
			right.push(left.pop());
		}
		left.push(data);
	}
	
	public T pop() {
		while(right.size() != 0) {
			left.push(right.pop());
		}
		 return left.pop();
	}
}
