
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
	
	public static int sum(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if(root == null){
            return 0;
        }
        
        int ans = root.data;
        ans += sum(root.left);
        ans += sum(root.right);
        
        return ans;

	}
	
}
