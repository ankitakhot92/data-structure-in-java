/***********

public static void main(String[] args) throws StackEmptyException {
      		Scanner s = new Scanner(System.in);

		Stack<Integer> st = new Stack<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.push(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.pop());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.top());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
    }


class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

************/

public class Stack<T> {
    
    private Node<T> head;
    private int size;
	
	public Stack() {
        head = null;
        size = 0;

	}
	
	public int size() {
        return size;

	}
	
	public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;

	}
	
	public boolean isEmpty() {
        return (head == null);

	}
	
	public T pop() throws StackEmptyException {
        if(head == null){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;

	}
	
	public T top() throws StackEmptyException {
        if(head == null){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return head.data;

	}
}
class StackEmptyException extends Exception{
    
}