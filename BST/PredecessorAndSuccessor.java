package BST;

public class PredecessorAndSuccessor {
	Node head;
	public static void findVal(int num, Node node) {
		if(node.data == num){
			
		}
	}

	public static void main(String[] args) {
		PredecessorAndSuccessor tree = new PredecessorAndSuccessor();
		tree.head = new Node(8);
		tree.head.left = new Node(3);
		tree.head.left.left = new Node(1);
		tree.head.left.right = new Node(6);
		tree.head.left.right.left = new Node(4);
		tree.head.left.right.right = new Node(7);
		tree.head.right = new Node(10);
		tree.head.right.right = new Node(14);
		tree.head.right.right.left = new Node(13);
		findVal(7,tree.head);
	}

}
