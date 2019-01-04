package prob5;

import java.util.Arrays;

public class MyStack<T> {
	private int top;
	private T[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		top = -1;
		buffer = (T[])new Object[capacity];
	}

	public void push(T s) {
		top++;
		if(top == buffer.length) {
			buffer = Arrays.copyOf(buffer, buffer.length+1);
			buffer[top] = s;
			
		} else {
			buffer[top] = s;
		}
	}

	public T pop() throws MyStackException {
		
		if(isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		T result = buffer[top];
		top--;
		return result;
		
	}

	public boolean isEmpty() {
		return top == -1;
	}
}