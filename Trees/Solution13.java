

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
    

	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
        
        Pair ans = helper(root);
        return ans.smax;

	}
    public static Pair helper(TreeNode<Integer> root){
        if(root.children.size() == 0){
            Pair ans = new Pair();
            ans.max = root;
            ans.smax = null;
            return ans;
        }
        
        Pair ans = new Pair();
            ans.max = root;
            ans.smax = null;
        
        for(int i=0; i<root.children.size(); i++){
            Pair temp = helper(root.children.get(i));
            if(temp.max.data > ans.max.data){
                if(ans.smax == null && temp.smax == null){
                    ans.smax = ans.max;
                    ans.max = temp.max;
                }else if(ans.smax == null){
                    if(temp.smax.data > ans.max.data){
                        ans.smax = temp.smax;
                        ans.max = temp.max;
                    }else{
                        if(ans.max.data != temp.max.data){
                           ans.smax = ans.max;
                       	   ans.max = temp.max; 
                        }else{
                            ans.smax = temp.smax;
                            ans.max = temp.max;
                        }
                        
                    }
                }else if(temp.smax == null){
                    ans.smax = ans.max;
                    ans.max = temp.max;
                }else{
                    if(ans.max.data > temp.smax.data){
                        ans.smax = ans.max;
                        ans.max = temp.max;
                    }else{
                        ans.smax = temp.smax;
                        ans.max = temp.max;
                    }
                }
            }else if(temp.max.data < ans.max.data){
                if(ans.smax == null && temp.smax == null){
                    if(temp.max.data != ans.max.data){
                        ans.smax = temp.max;
                    }
                    
                }else if(ans.smax == null){
                    if(ans.max != temp.max){
                        ans.smax = temp.max;
                    }else{
                        if(temp.smax.data != ans.max.data){
                            ans.smax = temp.smax;
                        }
                        
                    }
                    
                }else if(temp.smax == null){
                    if(temp.max.data != ans.max.data){
                        if((temp.max.data > ans.smax.data)){
                            ans.smax = temp.max;
                        }
                    }
                    
                }else{
                    if(temp.max.data != ans.max.data){
                        if(temp.max.data > ans.smax.data){
                        ans.smax = temp.max;
                    	}
                    }
                    
                }
            }else{
                if(temp.smax == null && ans.smax == null){
                    ans = ans;
                }else if(ans.smax == null){
                    if(temp.smax != ans.max){
                        ans.smax = temp.smax;
                    }else{
                        ans = ans;
                    }
                    
                }else if(temp.smax == null){
                    ans = ans;
                }else {
                    if(ans.smax.data > temp.smax.data && temp.smax.data != ans.max.data){
                        ans = ans;
                    }
                    if(temp.smax.data > ans.smax.data && temp.smax.data != ans.max.data){
                        ans.smax = temp.smax;
                    }
                }
            }
        }
        return ans;
    }
	
	
}
class Pair{
    TreeNode<Integer> max;
    TreeNode<Integer> smax;
    
}
