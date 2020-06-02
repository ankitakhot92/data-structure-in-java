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

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in){
		
			// Write your code here
        return getTreeFromPostorderAndInorderHelper(post, in, 0, in.length-1, post.length-1, 0);
		
	}
    public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorderHelper(int[] post,
			int[] in, int inS, int inE, int poS, int poE){
        
        if(poS < poE){
            return null;
        }
        
        int rootData = post[poS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
        int index = -1;
        for(int i=inS; i<=inE; i++){
            if(in[i] == rootData){
                index = i;
                break;
            }
        }
        if(index == -1){
            return null;
        }
        
        int RinS = index + 1;
        int RinE = inE;
        int RpoS = poS - 1;
        int RpoE = RpoS + RinS - RinE;
        int LinS = inS;
        int LinE = index - 1;
        int LpoS = RpoE - 1;
        int LpoE = poE;
        
        root.left = getTreeFromPostorderAndInorderHelper(post, in, LinS, LinE, LpoS, LpoE);
        root.right = getTreeFromPostorderAndInorderHelper(post, in, RinS, RinE, RpoS, RpoE);
        
        return root;
        
    }

	


}
