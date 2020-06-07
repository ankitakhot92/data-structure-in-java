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

	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
		// Write your code here
        
        if(root == null){
            return -1;
        }
        
        if(root.data == a || root.data == b){
            return root.data;
        }
        int leftAns = lcaBinaryTree(root.left, a, b);
        int rightAns = lcaBinaryTree(root.right, a, b);
        
        if(leftAns == -1 && rightAns == -1){
            return -1;
        }else if(leftAns == -1){
            return rightAns;
        }else if(rightAns == -1){
            return leftAns;
        }else{
            return root.data;
        }
        

	}
}