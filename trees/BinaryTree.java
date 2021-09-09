package trees;

import java.util.Scanner;

public class BinaryTree {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Node root = createNode();
		preOrder(root);
	}
	
	static Node createNode() {
		Node root = null;
		System.out.print("Enter Data : ");
		int data = sc.nextInt();
		if(data == -1) return null;
		root = new Node(data);
		
		System.out.println("Enter left of " + data);
		root.left = createNode();

		System.out.println("Enter right of " + data);
		root.left = createNode();
		
		return root;
		
	}
	static void preOrder(Node root) {
		if(root == null) return; 
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);	
	}
}
class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data = data;
	}
}
