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

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        LinkedListNode<Integer> temp = head;
        
        if(i == 0){
            head = temp.next;
            return head;
        }
        int index = 0;
        while(index < i-1){
            temp = temp.next;
            index++;
        }
        if(temp.next == null){
            return head;
        }
        temp.next = temp.next.next;
        return head;
		
	}
}