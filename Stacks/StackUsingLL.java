package Stack;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;
	
	//constructor
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public T top() {
		return head.data;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void push(T elem) {
		Node newNode = new Node(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T pop() throws Exception{
		if(head == null) {
			//Stack Empty Exception
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	

}
