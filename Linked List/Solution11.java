
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
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
        
        //get the length of list
        int len = 0;
        LinkedListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
         
        
        //get the mid
        int mid;
        if(len%2 == 0){
            mid = len/2;
        }else{
            mid = len/2 + 1;
        }
        
        //get the second half
        temp = head;
        
        int i = 0;
        while(i < mid){
            temp = temp.next;
            i++;
        }
        
        //reverse the second half
        temp = reverse(temp);
        
        //compare data from first half and second half
        while(temp != null){
            if(temp.data != head.data){
                return false;
            }else{
                temp = temp.next;
                head = head.next;
            }
        }
        return true;
        
        
    }

    
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        
        //base case
        if(head == null || head.next == null){
            return head;
        }
        
        LinkedListNode<Integer> smallAns = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return smallAns;
        
		
	}
    
}