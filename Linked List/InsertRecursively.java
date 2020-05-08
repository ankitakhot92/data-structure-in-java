package LinkedList;

public class InsertRecursively {
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int elem){
		if(pos == 0) {
			Node<Integer> newNode = new Node<Integer>(elem);
			newNode.next = head;
			return newNode;
		}
		if(head == null) {
			return head;
		}
		head.next = insert(head.next, pos-1, elem);
		return head;
	}
	
	public static void main(String args[]) {
		
		Node<Integer> head = LinkedListUse.takeInput();
		head = insert(head, 2, 80);
		LinkedListUse.print(head);
	}

}
