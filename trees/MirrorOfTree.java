package trees;
import java.util.*;
public class MirrorOfTree {
	Node head;
	public static void mirrortree(Node node) {
		Queue<Node> qu = new LinkedList<>();
		Node temp = node;
		qu.add(temp);
		while(!qu.isEmpty()) {
			Node temp2 = qu.poll();
			Node swap = temp2.left;
			temp2.left = temp2.right;
			temp2.right = swap;
			if(temp2.left != null) qu.add(temp2.left);
			if(temp2.right != null) qu.add(temp2.right);
		}
		
		
	}
	
	
	
	public static void inorder(Node node) {
		if(node == null) {
			return;
		}
		else {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}
	}
	public static void main(String[] args) {
		MirrorOfTree tree = new MirrorOfTree();
		tree.head = new Node(5);
		tree.head.left = new Node(3);
		tree.head.right = new Node(6);
		tree.head.left.left = new Node(2);
		tree.head.left.right = new Node(4);
		System.out.print("Before mirroring : ");
		inorder(tree.head);
		System.out.println();
		System.out.print("After mirroring : ");
		mirrortree(tree.head);
		inorder(tree.head);
	}

}
