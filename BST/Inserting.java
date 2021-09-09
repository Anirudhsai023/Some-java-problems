package BST;

public class Inserting {
	
	public static Node insertEle(int num, Node node) {
		if(node == null) {
			node = new Node(num);
			return node;
			
		}else if(num > node.data) {
			node.right = insertEle(num, node.right);
		}else {
			node.left = insertEle(num, node.left);			
		}
		return node;
	}
	public static void inorder(Node node) {
		if(node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	
	Node head;
	public static void main(String[] args) {
		Searching tree = new Searching();
		tree.head = new Node(8);
		tree.head.left = new Node(3);
		tree.head.left.left = new Node(1);
		tree.head.left.right = new Node(6);
		tree.head.left.right.left = new Node(4);
		tree.head.left.right.right = new Node(7);
		tree.head.right = new Node(10);
		tree.head.right.right = new Node(14);
		tree.head.right.right.left = new Node(13);
		System.out.print("Before Insertion : ");
		inorder(tree.head);
		System.out.println();
		insertEle(9,tree.head);
		insertEle(-1,tree.head);
		System.out.println();
		System.out.print("After Insertion : ");
		inorder(tree.head);
	}

}
