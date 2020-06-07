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
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        replace(root, 0);
		
	}
    
    private static int replace(BinaryTreeNode<Integer> root, int sum){
        if(root == null){
            return 0;
        }
        int rightSum = replace(root.right, sum);
        int temp = root.data;
        root.data = root.data + sum + rightSum;
        int leftSum = replace(root.left, root.data);
        
        return rightSum + leftSum + temp;
    }
}
