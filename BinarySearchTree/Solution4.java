public class Solution {

/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return SortedArrayToBSTHelper(arr, 0, arr.length-1);

	}
    public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int sI, int eI){
        if(sI > eI){
            return null; 
        }
        int mid = (sI + eI)/2;
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        
        root.left = SortedArrayToBSTHelper(arr, sI, mid-1);
        root.right = SortedArrayToBSTHelper(arr, mid+1, eI);
        
        return root;
    }
}	