package chapter3;

import java.util.EmptyStackException;

public class Stack<T extends Comparable<T>> {
	
	private static class StackNode<T extends Comparable<T>> {
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	private T min;
	private int size = 0;
	
	public T pop() {
		if (top == null) throw new EmptyStackException();
		T item = top.data;
		
		top = top.next;
		
		size--;
		
		if(item == min){
			if(size == 0) min = null;
			else findNewMin();
		}

		return item;
	}
	
	public int size(){
		return size;
	}

	public void push(T item) {
		StackNode<T> node = new StackNode<T>(item);
		node.next = top;
		top = node;
		
		if(min == null || item.compareTo(min) < 0) min = item;
		size++;
	}
	
	public T peek() {
		if(top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public T min() {
		return min;
	}
	
	private void findNewMin() {
		StackNode<T> cur = top;
		T value;
		while(cur != null) {
			value = cur.data;
			if(min == null || value.compareTo(min) < 0) min = value;
			cur = cur.next;
		}
		
	}
	
}
