package Trees;

import java.util.Scanner;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput(Scanner sc){
		
		System.out.println("Enter next node: ");
		int n = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);
		
		System.out.println("Enter no of childrens for " + n);
		int childCount = sc.nextInt();
		
		for(int i=0; i<childCount; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.children.add(child);
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		
		TreeNode<Integer> root = new TreeNode<>(rootData);
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter number of childrens of " + frontNode.data);
				int numChildren = sc.nextInt();
				
				for(int i=0; i<numChildren; i++) {
					System.out.println("Enter " + (i+1) + "th child of " + frontNode.data);
					int child = sc.nextInt();
					TreeNode<Integer> childNode = new TreeNode<>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				//shouldn't come here
			}
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		
		String s = root.data + ":";
		
		for(int i=0; i<root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		
		for(int i=0 ;i<root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static void printLevelWise(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		String s;
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
				s = front.data + ":";
				for(int i=0; i<front.children.size(); i++) {
					TreeNode<Integer> childNode = front.children.get(i);
					pendingNodes.enqueue(childNode);
					s = s + childNode.data + ",";
				}
				System.out.println(s);
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(5);
//		TreeNode<Integer> node4 = new TreeNode<>(6);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		
//		System.out.println(root);
		
		//take input and print - recursively
		
//		Scanner sc = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(sc);
		
		TreeNode<Integer> root = takeInputLevelWise();
//		print(root);
		printLevelWise(root);

		
	}

}
