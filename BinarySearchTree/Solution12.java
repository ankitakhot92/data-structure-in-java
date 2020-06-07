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
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
        
        return largestBSTSubtreeHelper(root).height;
		
	}
    
    private static Wrapper<Integer, Boolean>  largestBSTSubtreeHelper(BinaryTreeNode<Integer> root){
        if(root == null){
            Wrapper<Integer, Boolean> output = new Wrapper<>();
            output.min = Integer.MAX_VALUE;
            output.max = Integer.MIN_VALUE;
            output.isBST = true;
            output.height = 0;
            return output;
        }
        
        Wrapper<Integer, Boolean> leftAns = largestBSTSubtreeHelper(root.left);
        Wrapper<Integer, Boolean> rightAns = largestBSTSubtreeHelper(root.right);
        
        Wrapper<Integer, Boolean> output = new Wrapper<>();
        
        output.isBST = leftAns.isBST && rightAns.isBST && (leftAns.max < root.data) && (rightAns.min > root.data);
        output.min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        output.max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
        
        if(output.isBST){
            output.height = 1 + Math.max(leftAns.height, rightAns.height);
        }else{
            output.height = Math.max(leftAns.height, rightAns.height);
        }
        
        return output;
        
        
    }
    

}
class Wrapper<T, V>{
    public T min;
    public T max;
    public V isBST;
    public T height;
}
