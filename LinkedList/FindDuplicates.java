package LinkedList;

public class FindDuplicates {

	public static void main(String[] args) {
		Node root = new Node(2);
		Node root2 = new Node(2);
		Node root3 = new Node(3);
		Node root4 = new Node(3);
		Node root5 = new Node(5);
		Node root6 = new Node(5);
		root.next = root2;
		root2.next = root3;
		root3.next = root4;
		root4.next = root5;
		root5.next = root6;
		FindDuplicate(root);

	}
	static void FindDuplicate(Node root) {
		while(root.next != null) {
			if(root.next.data == root.data) System.out.print(root.data + " ");
			root = root.next;
		}
	}

}

class Node{
	int data;
	Node next = null;
	public Node(int data) {
		this.data = data;
	}
}
