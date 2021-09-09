package trees;
import java.util.*;

class pair{
	Node node;
	int height;
	pair(Node node,int height){
		this.node = node;
		this.height = height;
	}
}

public class TopView {
	Node head;
	
	public static void inorder(Node node) {
		if(node == null) return;
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	public static void levelorder(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) queue.add(temp.left);
			if(temp.right != null) queue.add(temp.right);
		}
	}
	public static ArrayList<Integer> topview(Node node){
		ArrayList<Integer> res = new ArrayList<>();
		Map<Integer, Integer> vt = new HashMap<>();		
		Queue<pair> queue = new LinkedList<>();
		queue.add(new pair(node,0));
		while(!queue.isEmpty()) {
			pair val = queue.poll();
			Node temp = val.node;
			int data = val.height;
			if(!vt.containsKey(data)) vt.put(data,temp.data);
			if(temp.left != null) queue.add(new pair(temp.left, data - 1));
			if(temp.right != null) queue.add(new pair(temp.right, data + 1));	
		}
		for (Map.Entry<Integer,Integer> entry : vt.entrySet()) {
			res.add(entry.getValue());
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		//Node class is defined in other class of same package so no need to write again.
		TopView tree = new TopView();
		tree.head = new Node(1);
		tree.head.left = new Node(2);
		tree.head.left.left = new Node(3);
		tree.head.right = new Node(4);
		tree.head.right.left = new Node(5);
		tree.head.right.left.right = new Node(6);
		tree.head.right.left.right.right = new Node(7);
		System.out.print("Inoder Traversal : ");
		inorder(tree.head);
		System.out.println();
		System.out.print("Level order traversal : ");
		levelorder(tree.head);
		System.out.println();
		System.out.print("Top view of a binary tree : ");
		System.out.print(topview(tree.head));
		
	}

}
