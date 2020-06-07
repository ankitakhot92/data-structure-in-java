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

	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		// Write your code here
        if(root == null){
            return -1;
        }
        if(root.data == a || root.data == b){
            return root.data;
        }
        int leftAns = -1;
        int rightAns = -1;
        if(a < root.data && b < root.data){
            leftAns = lcaInBST(root.left, a, b);
        }else if(a > root.data && b > root.data){
            rightAns = lcaInBST(root.right, a, b);
        }else{
            leftAns = lcaInBST(root.left, a, b);
            rightAns = lcaInBST(root.right, a, b);
        }
        
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