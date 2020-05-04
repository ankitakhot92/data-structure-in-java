
public class Solution {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		// write your code here
        
        //if list has only one element or no element, then already sorted
        if(head == null || head.next == null){
            return head;
        }
        
        //get the mid
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
                
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedListNode<Integer> mid = slow;
        
        //break the list into two parts around mid
        LinkedListNode<Integer> h2 = mid.next;
        mid.next = null;
        LinkedListNode<Integer> h1 = head;
        
        //recursively apply merger sort on both halves
        LinkedListNode<Integer> smallAns1 = mergeSort(h1);
        LinkedListNode<Integer> smallAns2 = mergeSort(h2);
        
        //call merge funtions on sorted halves
        return mergeTwoList(smallAns1, smallAns2);

	}
    
    	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        LinkedListNode<Integer> h3;
        LinkedListNode<Integer> t3;
        
        if(head1.data < head2.data){
            h3 = head1;
            t3 = head1;
            head1 = head1.next;
        }else{
            h3 = head2;
            t3 = head2;
            head2 = head2.next;
        }
        
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                t3.next = head1;
                t3 = t3.next;
                head1 = head1.next;
            }else{
                t3.next = head2;
                t3 = t3.next;
                head2 = head2.next;
            }
        }
        if(head1 == null){
            t3.next = head2;
        }else{
            t3.next = head1;
        }
        return h3;
        
		
	}

}
