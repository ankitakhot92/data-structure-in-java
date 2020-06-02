import java.util.ArrayList;

public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		// Write your code here
        if(root == null){
            return null;
        }
        // int rootData = root.data;
        
        Node<BinaryTreeNode<Integer>> head1 = new Node<>(root);
        ArrayList<Node<BinaryTreeNode<Integer>>> ans = new ArrayList<>();
        ans.add(head1);
        
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        
        while(!pendingNodes.isEmpty()){
            
            int n = pendingNodes.size();
            
            Node<BinaryTreeNode<Integer>> head = null;
            Node<BinaryTreeNode<Integer>> tail = null;
            
            while(n > 0){
                try{
                    BinaryTreeNode<Integer> front = pendingNodes.dequeue();
                
                if(front.left != null){
                    pendingNodes.enqueue(front.left);
                    Node<BinaryTreeNode<Integer>> node = new Node<>(front.left);
                    if(head == null){
                        head = node;
                        tail = node;
                        
                    }else{
                        tail.next = node;
                        tail = node;
                    }
                }
                if(front.right != null){
                    pendingNodes.enqueue(front.right);
                    Node<BinaryTreeNode<Integer>> node = new Node<>(front.right);
                    if(head == null){
                        head = node;
                        tail = node;
                        
                    }else{
                        tail.next = node;
                        tail = node;
                    }
                }
                
                }catch (QueueEmptyException e){
                    
                }
                n--;
                
            }
            ans.add(head);
        }
        
        return ans;

	}


}
