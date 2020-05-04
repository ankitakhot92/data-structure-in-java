/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

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