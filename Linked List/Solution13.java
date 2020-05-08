
/*
 class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
 * */
public class Solution {
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> temp;
        
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
		
	}

}