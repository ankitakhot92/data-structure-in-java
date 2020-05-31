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

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		
			// Write your code here
        return getTreeFromPreorderAndInorder(pre, in, 0, pre.length-1, 0, in.length-1);
		
	}
    
    public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in, int preS, int preE, int inS, int inE){
        
        if(inS > inE){
            return null;
        }
        
        int rootData = pre[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
        int index=-1;
        for(int i=inS; i<=inE; i++){
            if(in[i] == rootData){
                index = i;
                break;
            }
        }
        if(index == -1){
            return null;
        }
        
        int leftInS = inS;
        int leftInE = index - 1;
        int leftpreS = preS + 1;
        int leftpreE = leftInE - leftInS + leftpreS;
        int rightIns = index + 1;
        int rightInE = inE;
        int rightpreS = leftpreE + 1;
        int rightpreE = preE;
        
        root.left = getTreeFromPreorderAndInorder(pre, in, leftpreS, leftpreE, leftInS, leftInE);
        root.right = getTreeFromPreorderAndInorder(pre, in, rightpreS, rightpreE, rightIns, rightInE);
        
        return root;
    }

}
