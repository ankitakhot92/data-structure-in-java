

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
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> curr = head.next;
        while(curr != null){
            if(temp.data.equals(curr.data)){
                curr = curr.next;
            }else{
                temp.next=curr;
                temp = curr;
                curr = curr.next;
            }
        }
        temp.next=curr;
        return head;
    }
}