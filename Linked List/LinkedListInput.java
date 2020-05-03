package LinkedList;

import java.util.Scanner;

public class LinkedListInput {
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head = null, tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
					
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		sc.close();
		return head;

	}
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

//			Node<Integer> node1 = new Node<Integer>(10);
//			Node<Integer> node2 = new Node<Integer>(20);
//			Node<Integer> node3 = new Node<Integer>(30);
//			
//			node1.next = node2;
//			node2.next = node3;
			
//			Node<Integer> head = node1;
			
			Node<Integer> head = takeInput();
			print(head);
			
		}

	}


