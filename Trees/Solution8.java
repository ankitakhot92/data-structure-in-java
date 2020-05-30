
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
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here

        TreeNode<Integer> ans = root;
        int sum = 0;
        for(int i=0; i<root.children.size(); i++){
            sum += root.children.get(i).data;
        }
        sum += root.data;
        TreeNode<Integer> xans;
        
        for(int i=0; i<root.children.size(); i++){
            xans = maxSumNode(root.children.get(i));
            int xsum = 0;
            for(int j=0; j<xans.children.size(); j++){
                xsum += xans.children.get(j).data;
                
            }
            xsum += xans.data;
            if(xsum > sum){
                    sum = xsum;
                    ans = xans;
                }
        }
        return ans;
	}
	
		
}
