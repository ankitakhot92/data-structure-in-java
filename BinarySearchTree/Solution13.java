public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

/* LinkedList Node Class
*
*	
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
*/

	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> output = new Pair();
        output = BSTToSortedLLHelper(root);
        return output.head;
		
	}
    
    public static Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> BSTToSortedLLHelper(BinaryTreeNode<Integer> root){
        
        if(root == null){
            Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> output = new Pair<>();
            output.head = null;
            output.tail = null;
            return output;
        }
        
        Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> askLeft = BSTToSortedLLHelper(root.left);
        Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> askRight = BSTToSortedLLHelper(root.right);
        
        LinkedListNode<Integer> node = new LinkedListNode<Integer>(root.data);
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        
        if(askLeft.tail == null){
            head = node;
        }else{
            head = askLeft.head;
            askLeft.tail.next = node;
        }
        if(askRight.head == null){
            tail = node;
            node.next = null;
        }else{
            node.next = askRight.head;
            tail = askRight.tail;
        }
        
        Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> output = new Pair<>();
        output.head = head;
        output.tail = tail;
        return output;
        
   
    }
}
class Pair<T,V>{
    T head;
    V tail;
}



