
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
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        int count = 1;
        LinkedListNode<Integer> h1 = head;
        LinkedListNode<Integer> t1 = head;
        LinkedListNode<Integer> h2;
        
        if(head == null){
            return null;
        }
        
        while(count != k && t1.next != null){
            t1 = t1.next;
            count++;
        }
        
        h2 = t1.next;
        t1.next = null;
        LinkedListNode<Integer> newHead = reverse_R(head);
        
        LinkedListNode<Integer> temp = newHead;
        while(temp.next != null){
            temp = temp.next;
        }
        LinkedListNode<Integer> newTail = temp;
        
        newTail.next = kReverse(h2, k);
        return newHead;
    }
    
    public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
        
        //base case
        if(head == null || head.next == null){
            return head;
        }
        
        LinkedListNode<Integer> smallAns = reverse_R(head.next);
        head.next.next = head;
        head.next = null;
        return smallAns;
        
		
	}
}
