package trees;
import java.util.*;
public class BottomView {
	Node head;
	public static void printBottomView(Node node) {
		ArrayList<Integer> res = new ArrayList<>();
		Queue<pair> queue = new LinkedList<>();
		Map<Integer,Integer> val = new TreeMap<>();
		queue.add(new pair(node,0));
		while(!queue.isEmpty()) {
			pair temp = queue.poll();
			Node currentNode = temp.node;
			int h = temp.height;
			val.put(h, currentNode.data);
			if(currentNode.left != null) queue.add(new pair(currentNode.left, h - 1));
			if(currentNode.right != null) queue.add(new pair(currentNode.right, h + 1));
		}
		for (Map.Entry<Integer,Integer> entry : val.entrySet()) {
			System.out.print(entry.getValue() + " ");
			res.add(entry.getValue());
		}
	}
	public static void main(String[] args) {
		BottomView tree = new BottomView();
		tree.head = new Node(1);
		tree.head.left = new Node(2);
		tree.head.left.left = new Node(3);
		tree.head.left.right = new Node(4);
		tree.head.right = new Node(5);
		tree.head.right.right = new Node(6);
		tree.head.right.right.left = new Node(7);
		printBottomView(tree.head);
	}

}
