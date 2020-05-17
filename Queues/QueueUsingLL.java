package Queues;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rare;
	private int size;
	
	public QueueUsingLL() {
		front = null;
		rare = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	public T front() throws QueueEmptyException{
		if(front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public void enqueue(T elem) {
		Node<T> newNode = new Node<T>(elem);
		if(size == 0) {
			front = newNode;
			rare = newNode;
			size++;
		}else {
			rare.next = newNode;
			rare = newNode;
			size++;	
		}

	}
	public T dequeue() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException();
		}
		Node<T> temp = front;
		front = front.next;
		if(size == 1) {
			rare = null;
		}
		size--;
		return temp.data;
	}

}
