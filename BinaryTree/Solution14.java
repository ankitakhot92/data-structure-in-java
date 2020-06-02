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
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		
		// Write your code here
        Pair ans = checkBalancedHelper(root);
        return ans.isBalanced;
		
	}
    
    public static Pair checkBalancedHelper(BinaryTreeNode<Integer> root){
        
        if(root == null){
            Pair ans = new Pair();
            ans.height = 0;
            ans.isBalanced = true;
            return ans;
        }
        
        Pair a = checkBalancedHelper(root.left);
        Pair b = checkBalancedHelper(root.right);
        
        Pair ans = new Pair();
        
        if(a.isBalanced == false || b.isBalanced == false){
            ans.isBalanced = false;
        }else if(a.height - b.height > 1 || a.height - b.height < -1){
            ans.isBalanced = false;
        }else{
            ans.isBalanced = true;
        }
        ans.height = 1 + Math.max(a.height, b.height);
        
        return ans;
    }

	
	
}
class Pair{
    int height;
    boolean isBalanced;
}
