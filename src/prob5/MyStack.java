package prob5;

import java.util.Arrays;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		top = -1;
		buffer = new String[capacity];
	}

	public void push(String s) {
		top++;
		if(top == buffer.length) {
			buffer = Arrays.copyOf(buffer, buffer.length+1);
			buffer[top] = s;
			
		} else {
			buffer[top] = s;
		}
	}

	public String pop() throws MyStackException {
		
		if(top == -1) {
			throw new MyStackException("stack is empty");
		}
		String result = buffer[top];
		top--;
		return result;
		
	}

	public boolean isEmpty() {
		return top == -1;
	}
}