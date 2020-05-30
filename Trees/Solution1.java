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
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
        System.out.println(root.data);
		
		while(!pendingNodes.isEmpty()) {
            
            int n = pendingNodes.size();
            
            while(n > 0){
                
            TreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
				String s = "";
				for(int i=0; i<front.children.size(); i++) {
					TreeNode<Integer> childNode = front.children.get(i);
					pendingNodes.enqueue(childNode);
					s = s + childNode.data + " ";
				}
				System.out.print(s);
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                n--;
            }
            System.out.println();
			
			
		}

	}
		
}
