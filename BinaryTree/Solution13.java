import java.util.ArrayList;
import java.util.Stack;


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

	public static void printZigZag(BinaryTreeNode<Integer> root) {
		

		// Write your code here		
        Stack<BinaryTreeNode<Integer>> s1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> s2 = new Stack<>();
        
        s1.push(root);
        
        while(!(s1.isEmpty() && s2.isEmpty())){
            
            while(!(s1.isEmpty())){
                BinaryTreeNode<Integer> elem = s1.pop();
                System.out.print(elem.data + " ");
                if(elem.left != null){
                   s2.push(elem.left); 
                }
                if(elem.right != null){
                    s2.push(elem.right);
                }
                
            }
            
            System.out.println();
            
            while(!(s2.isEmpty())){
                BinaryTreeNode<Integer> elem = s2.pop();
                System.out.print(elem.data + " ");
                if(elem.right != null){
                    s1.push(elem.right);
                }
                if(elem.left != null){
                    s1.push(elem.left);
                }
                
            }
            
            System.out.println();
        }


	}


}
