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
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
        rootToLeafPathsSumToK(root, k, "");
		
	}
    
    private static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String path){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(k == root.data){
                System.out.println(path + root.data);
            }
        }
        path += root.data + " "; 
        rootToLeafPathsSumToK(root.left, k-root.data, path);
        rootToLeafPathsSumToK(root.right, k-root.data, path);
        
        
        
        
        
        
        
        
        
    }
}
