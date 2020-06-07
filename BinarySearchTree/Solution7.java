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
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Write your code here
        if(root == null){
            return;
        }
        int rootData = root.data;
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(rootData);
        newNode.left = root.left;
        newNode.right = null;
        root.left = newNode;
        
        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
		
	}
}
