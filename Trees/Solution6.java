
public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static void postOrder(TreeNode<Integer> root){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */
        if(root == null){
            return;
        }
        if(root.children.size() == 0){
            System.out.print(root.data + " ");
            return;
        }
        for(int i=0; i<root.children.size(); i++){
            postOrder(root.children.get(i));
        }
        System.out.print(root.data + " ");
        
	}
	
}
