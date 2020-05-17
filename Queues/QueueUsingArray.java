package Queues;

public class QueueUsingArray {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueUsingArray() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	int front() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public void enqueue(int element) throws QueueFullException{
		//queue full exception
		if(size == data.length) {
			throw new QueueFullException();
//			doubleCapacity();    for dynamic array
		}
		if(size == 0) {
			front = 0;
		}
		
		//circular queue
		rear = (rear + 1) % data.length;
		data[rear] = element;
		size++;
	}
	
	public int dequeue() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException();
		}
		int temp = data[front];
		front = (front + 1)%data.length;
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
	
//	//for dynamic Array
//	private void doubleCapacity() {
//		int temp[] = data;
//		data = new int[2 * temp.length];
//		int index = 0;
//		for(int i=front; i<temp.length; i++) {
//			data[index] = temp[i];
//			index++;
//		}
//		for(int i=0; i<front-1; i++) {
//			data[index] = temp[i];
//			index++;
//		}
//		front = 0;
//		rear = temp.length-1;
//	}

}
