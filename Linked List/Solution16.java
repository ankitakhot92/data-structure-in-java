
/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}



}
* */
public class Solution {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> oddH = null;
        LinkedListNode<Integer> oddT = null;
        LinkedListNode<Integer> evenH = null;
        LinkedListNode<Integer> evenT = null;
        
        if(head == null || head.next == null){
            return head;
        }
        
        
        while(head != null){
            
        if(head.data % 2 != 0){
            if(oddH == null){
                oddH = head;
                oddT = head;
                head = head.next;
            }else{
                oddT.next = head;
                oddT = oddT.next;
                head = head.next;
            }
        }else{
            if(evenH == null){
                evenH = head;
                evenT = head;
                head = head.next;
            }else{
                evenT.next = head;
                evenT = evenT.next;
                head = head.next;
            }
        }
        }
      
        if(oddH == null){
            return evenH;
        }else if(evenH == null){
            return oddH;
        }
        oddT.next = evenH;
        evenT.next = null;
        return oddH;
        
        
        

	}
}
