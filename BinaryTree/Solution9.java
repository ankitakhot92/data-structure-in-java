import java.util.ArrayList;
import java.util.Queue;


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

	public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if(root == null){
            return;
        }
        System.out.println(root.data + " ");
        
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        
        while(!pendingNodes.isEmpty()){
            
            int n = pendingNodes.size();
            
            while(n > 0){
                try{
                    BinaryTreeNode<Integer> front = pendingNodes.dequeue();
                
                    String s = "";
                    if(front.left != null){
                        s += front.left.data + " ";
                        pendingNodes.enqueue(front.left);
                    }
                    if(front.right != null){
                        s += front.right.data + " ";
                        pendingNodes.enqueue(front.right);
                    }
            	 	
                
                	System.out.print(s);                
                	
                }catch (QueueEmptyException e){
                    return;
                }
                n--;
            }
            System.out.println();
        }


	}



}
