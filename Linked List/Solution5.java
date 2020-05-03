
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
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
        
        int len = 0;
        LinkedListNode<Integer> temp = root;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        LinkedListNode<Integer> curr = root;
        int i = 1;
        int count = len - n;
        while(i <= count){
            curr=curr.next;
            i++;
        }
        LinkedListNode<Integer> head2 = curr.next;
        curr.next = null;
        temp = head2;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = root;
        return head2;
        
    }
}
