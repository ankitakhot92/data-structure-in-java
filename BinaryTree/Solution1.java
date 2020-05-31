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
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Print output and don't return it.
		* Taking input is handled automatically.
		*/
        if(root == null) {
			return;
		}

		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
				String toBePrinted = front.data + ":";
				if(front.left != null) {
					toBePrinted += "L:" + front.left.data + ",";
					pendingNodes.enqueue(front.left);
				}else{
                    toBePrinted += "L:" + -1 + ",";
                }
				if(front.right != null) {
					toBePrinted += "R:" + front.right.data;
					pendingNodes.enqueue(front.right);
				}else{
                    toBePrinted += "R:" + -1;
                }
				System.out.println(toBePrinted);
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				return;
			}
			
		}
		
	}
	
}
