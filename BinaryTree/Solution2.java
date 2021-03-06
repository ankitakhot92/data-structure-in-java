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
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        boolean ans = false;
        ans = ans || isNodePresent(root.left, x);
        ans = ans || isNodePresent(root.right, x);
        
        return ans;

	}
	
}
