import java.util.ArrayList;
import java.util.Collections;

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

	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		// Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newlist = new ArrayList<>();
        newlist = nodesSumToS(root, sum, list);
        
         // list.sort();
        Collections.sort(newlist);
        
        int i = 0;
        int j = newlist.size() - 1;
        
        while(i < j){
            int pairSum = newlist.get(i) + newlist.get(j);
            if(pairSum > sum){
                j--;
            }else if(pairSum < sum){
                i++;
            }else{
                System.out.println(newlist.get(i) + " " + newlist.get(j));
                i++;
                j--;
            }
        }
        
        
        

	}
    
    private static ArrayList<Integer> nodesSumToS(BinaryTreeNode<Integer> root, int sum, ArrayList<Integer> list){
        if(root == null){
            return null;
        }
        
        
        list.add(root.data);
        
        nodesSumToS(root.left, sum, list);
        nodesSumToS(root.right, sum, list);
        
 		return list;
        
       
    }
    
    
    
}