import java.util.Stack;

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
    private static int count(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int leftAns = count(root.left);
        int rightAns = count(root.right);
        
        return leftAns + rightAns + 1;
    }


	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return;
        }
        int n = 0;
        int count = count(root);
        
        Stack<BinaryTreeNode<Integer>> s1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> s2 = new Stack<>();
        
        BinaryTreeNode<Integer> root1 = root;
        BinaryTreeNode<Integer> root2 = root;
        
        while(root1 != null){
            s1.push(root1);
            root1 = root1.left;
        }
        
        while(root2 != null){
            s2.push(root2);
            root2 = root2.right;
        }
        
        while(n <= count){
            
       
        if(s1.peek().data + s2.peek().data == s){
            
            root1 = s1.pop();
            root2 = s2.pop();
            
            if(root1.data != root2.data){
                System.out.println(root1.data + " " + root2.data);
            }
            
            
            n += 2;
            
            if(n == count){
                return;
            }
            
            root1 = root1.right;
            while(root1 != null){
                s1.push(root1);
                root1 = root1.left;
            }
            
            root2 = root2.left;
            while(root2 != null){
                s2.push(root2);
                root2 = root2.right;
            }
            
        }else if(s1.peek().data + s2.peek().data < s){
            root1 = s1.pop();
            
            n += 1;
            
            if(n == count){
                return;
            }
            
            root1 = root1.right;
            while(root1 != null){
                s1.push(root1);
                root1 = root1.left;
            }
        }else{
            root2 = s2.pop();
            
            n += 1;
            
            if(n == count){
                return;
            }
            
            root2 = root2.left;
            while(root2 != null){
                s2.push(root2);
                root2 = root2.right;
            }
        }
        }
        
        
        

	}
}