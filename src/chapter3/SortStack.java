package chapter3;

public class SortStack<T extends Comparable<T>> {
	
	private Stack<T> stack = new Stack<T>();
	private Stack<T> extra = new Stack<T>();
	
	public void push(T data) {
		while(!stack.isEmpty() || stack.peek().compareTo(data) < 0) {
			extra.push(stack.pop());
		}
		stack.push(data);
		
		while(!extra.isEmpty())
			stack.push(extra.pop());
	}
	
	public T pop() {
		while(!extra.isEmpty())
			stack.push(extra.pop());
		
		return stack.pop();
	}
	
	public T peek() {
		while(!extra.isEmpty())
			stack.push(extra.pop());
		
		return stack.peek();
	}

	public boolean isEmpty() {
		return stack.isEmpty() && extra.isEmpty();
	}
}
