
package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> takeInput(Scanner sc){
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		root.left = takeInput(sc);
		root.right = takeInput(sc);
		return root;
		
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		String toBePrinted = root.data + "";
		if(root.left != null) {
			toBePrinted += "L:" + root.left.data;
		}
		if(root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
				
				System.out.println("Enter left child of " + front.data);
				int leftchild = sc.nextInt();
				if(leftchild != -1) {
					BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftchild);
					front.left = child;
					pendingNodes.enqueue(child);
				}
				
				System.out.println("Enter Right child of " + front.data);
				int rightchild = sc.nextInt();
				if(rightchild != -1) {
					BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightchild);
					front.right = child;
					pendingNodes.enqueue(child);
				}
				
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				return null;
			}
			
			  
			
		}
		return root;
	}
	
	public static void printInputLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}

		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
				String toBePrinted = front.data + ": ";
				if(front.left != null) {
					toBePrinted += "L: " + front.left.data + ",";
					pendingNodes.enqueue(front.left);
				}
				if(front.right != null) {
					toBePrinted += "R: " + front.right.data;
					pendingNodes.enqueue(front.right);
				}
				System.out.println(toBePrinted);
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				return;
			}
			
		}
	}
	
	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);
		return ans;
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		
		return Math.max(option1, Math.max(option2, option3));
		
		//but the T.C. here is O(n^2)
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left),height(root.right));
	}
	
	public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
		
		//this helps in reducing the T.C. to O(n)
		if(root == null) {
			Pair<Integer, Integer> output = new Pair<>();
			output.first = 0;
			output.second = 0;
			return output;
		}
		
		Pair<Integer, Integer> lo = heightDiameter(root.left);
		Pair<Integer, Integer> ro = heightDiameter(root.right);
		
		int height = 1 + Math.max(lo.first, ro.first);
		
		int option1 = lo.first + ro.first;
		int option2 = lo.second;
		int option3 = ro.second;
		int diameter = Math.max(option1, Math.max(option2, option3));
		
		Pair<Integer, Integer> output = new Pair<>();
		output.first = height;
		output.second = diameter;
		return output;
	}
	
	public static void inorder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public static void preorder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//		
//		root.left = node1;
//		root.right = node2;
		
//		Scanner sc = new Scanner(System.in);
//		BinaryTreeNode<Integer>root = takeInput(sc);
		BinaryTreeNode<Integer>root = takeInputLevelWise();
//		printTree(root);
		printInputLevelWise(root);
		System.out.println(countNodes(root));
//		System.out.println("diameter:" + diameter(root));
		System.out.println("diameter:" + heightDiameter(root).second);
		System.out.println("height:" + heightDiameter(root).first);
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);

	}

}
