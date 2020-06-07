/***************
 * BinaryTreeNode class already given - 
 * 
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
***************/

/**************
 * Main function that we are using internally 
 * 
public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int choice, input;
		while(true) {
			choice = s.nextInt();
			switch(choice) {
				case 1 : 
					input = s.nextInt();
					bst.insertData(input);
					break;
				case 2 : 
					input = s.nextInt();
					bst.deleteData(input);
					break;
				case 3 : 
					input = s.nextInt();
					System.out.println(bst.search(input));
					break;
				default :
					bst.printTree();
					return;
			}

		}
*******************/

public class BinarySearchTree {
	// Complete this class
    
    private BinaryTreeNode<Integer> root;
    
    public boolean search(int data){
        return hasDataHelper(root, data);
    }
    
    private boolean hasDataHelper(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }else if(root.data > data){
            return hasDataHelper(root.left, data);
        }else{
            return hasDataHelper(root.right, data);
        }
    }
    
    public void insertData(int data){
        root = insertHelper(root, data);
    }
    
    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            BinaryTreeNode<Integer> node = new BinaryTreeNode<>(data);
            return node;
        }
        if(root.data > data){
            root.left = insertHelper(root.left, data);
        }else{
            root.right = insertHelper(root.right, data);
        }
        return root;
    }
    
    public void deleteData(int data){
        root = deleteHelper(root, data);
    }

    
    private BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return null;
        }
        if(root.data == data){
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                BinaryTreeNode<Integer> minNode = root.right;
                while(minNode.left != null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteHelper(root.right, minNode.data);
                return root;
            }
        }
        if(root.data > data){
            root.left = deleteHelper(root.left, data);
            return root;
        }else{
            root.right = deleteHelper(root.right, data);
            return root;
        }
    }
    
    public void printTree(){
        
        printTreeHelper(root);
        
    }
    
    private BinaryTreeNode<Integer> printTreeHelper(BinaryTreeNode<Integer> root){
        
        if(root == null){
            return null;
        }
        String toBePrinted = root.data + ":";
        if(root.left != null){
            toBePrinted += "L:" + root.left.data + ",";
        }
        if(root.right != null){
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        printTreeHelper(root.left);
        printTreeHelper(root.right);
        
        return null;
    }
    
   
	
}
