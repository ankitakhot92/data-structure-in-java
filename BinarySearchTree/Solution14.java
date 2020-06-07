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
	
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		// Write your code here
        print(root, k, node);
		
	}
    
    public static void printNodesAtDepth(BinaryTreeNode<Integer> root, int k){
        if(root == null || k<0){
            return;
        }
        if(k == 0){
            System.out.println(root.data);
            return;
        }
        printNodesAtDepth(root.left, k-1);
        printNodesAtDepth(root.right, k-1);
        
        
    }
    
    private static int print(BinaryTreeNode<Integer> root, int k, int elem){
        
        if(root == null || k < 0){
            return -1;
        }
        if(root.data == elem){
            printNodesAtDepth(root, k);
            return 0;
        }
        int lD = print(root.left, k, elem);
        
        if(lD == -1){
            int rD = print(root.right, k, elem);
        
        	if(rD == -1){
           		 return -1;
        	}
       	    if(rD != -1){
          	  if(rD+1 == k){
           	     System.out.println(root.data);
          	  }else{
          	      printNodesAtDepth(root.left, k-rD-2);
          	  }
            	return 1 + rD;
            
        	}
        }
        if(lD != -1){
            if(lD + 1 == k){
                System.out.println(root.data);
            }else{
                printNodesAtDepth(root.right, (k-lD-2));
                
            }
            return 1 + lD;
            
        }
        
        
        return -1;
    }
}
