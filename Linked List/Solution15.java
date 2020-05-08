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
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return indexOfNRec(head, n, 0);
	}
    public static int indexOfNRec(LinkedListNode<Integer> head, int n, int index){
        if(head == null){
            return -1;
        }
        if(head.data == n){
            return index;
        }
        return indexOfNRec(head.next, n, index+1);
    }
}