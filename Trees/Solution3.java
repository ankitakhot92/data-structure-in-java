public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here	
        if(root == null){
            return 0;
        }
        int ans = 0;
        if(root.data > x){
            ans = 1;
        }
        for(int i=0; i<root.children.size(); i++){
            ans += numNodeGreater(root.children.get(i), x);
        }
        return ans;
	}
	
}
