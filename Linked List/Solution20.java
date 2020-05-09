
public class Solution {



	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		//Write your code here
        for(int i=0; i<len(head); i++){
            LinkedListNode<Integer> curr = head;
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> next;
            
            while(curr.next != null){
            if(curr.next.data < curr.data){
                if(prev == null){
                    next = curr.next;
                    curr.next = next.next;
                    next.next = curr;
                    head = next;
                    prev = next;
                }else{
                    prev.next = curr.next;
                    next = curr.next;
                    curr.next = next.next;
                    next.next = curr;
                    prev = prev.next;
                }
            }else{
                prev = curr;
                curr = curr.next;
            }
            }
        }
     return head;   
	}
    public static int len(LinkedListNode<Integer> head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }



}
