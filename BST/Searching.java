package BST;

public class Searching {
	Node head;
	public static Node Search(int num, Node node) {
		if(node == null || node.data == num) {
			return node;
		}else if(num > node.data) {
			return Search(num,node.right);
		}else {
			return Search(num,node.left);
		}
	}
	
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
		if(Search(18,tree.head) != null)System.out.println("Element Present");
		else System.out.println("Element Not present");
	}

}
