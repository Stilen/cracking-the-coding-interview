package chapter3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


//Problem 3.3 - Stack of Plates
public class SetOfStacks<T extends Comparable<T>> {
	
	private List<Stack<T>> stacks = new ArrayList<Stack<T>>();
	int threshold;
	
	public SetOfStacks(T data, int threshold){
		stacks.add(new Stack<T>());
		Stack<T> temp = stacks.get(0);
		temp.push(data);
		
		if(threshold < 1) threshold = 1;
		this.threshold = threshold;
	}
	
	public void push(T data){
		Stack<T> temp = stacks.get( stacks.size() - 1 );
		if(temp.size() >= threshold) {
			temp = new Stack<T>();
			temp.push(data);
			stacks.add(temp);
		}
	}
	
	public T pop(){
		int stackIndex = stacks.size() - 1;
		if(stacks.size() == 0 || stacks.get(stackIndex).size() == 0)
			throw new EmptyStackException();
		
		Stack<T> stack = stacks.get(stackIndex);
		T data = stack.pop();
		
		if(stack.size() == 0){
			stacks.remove(stackIndex);
		}
		
		return data;
	}
	
	public T popAt(int index) {
		if(stacks.size() == 0 || stacks.get(index).size() == 0)
			throw new EmptyStackException();
		
		if(index >= stacks.size()) throw new ArrayIndexOutOfBoundsException();
		
		Stack<T> stack = stacks.get(index);
		T data = stack.pop();
		
		if(stack.size() == 0){
			stacks.remove(index);
		}
		
		return data;
	}

}
