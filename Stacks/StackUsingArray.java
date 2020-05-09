package Stack;

public class StackUsingArray {
	
	private int[] data;
	private int top;
	
	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}
	
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top+1;
	}
	
	public int top() throws StackEmptyException{
		if(size() == 0) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem) throws StackFullException {
		//handle StackFullException
		if(size() == data.length) {
			StackFullException e = new StackFullException();
			throw e;
		}
		top++;
		data[top] = elem;
	}
	
	public int pop() throws StackEmptyException{
		//handle if stack is empty
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
	

}
