package trees;
import java.util.*;
public class SpiralTraversal {
	Node head;
	
	public static void spiralTraversal(Node node) {
		Queue<Node> queue = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		queue.add(node);
		int ltr = 0;
		while(!queue.isEmpty() || !stack.isEmpty()) {
			while(!queue.isEmpty() && ltr == 0) {
				Node queueVal = queue.poll();
				System.out.print(queueVal.data + " ");
				if(queueVal.left != null) stack.add(queueVal.left);
				if(queueVal.right != null) stack.add(queueVal.right);
			}
			ltr = 1;
			while(!stack.isEmpty() && ltr == 1) {
				Node stackVal = stack.pop();
				System.out.print(stackVal.data + " ");
				if(stackVal.left != null) stack.add(stackVal.left);
				if(stackVal.right != null) stack.add(stackVal.right);
			}
			ltr = 0;
		}
	}
	public static void main(String[] args) {
		SpiralTraversal tree = new SpiralTraversal();
		tree.head = new Node(1);
		tree.head.left = new Node(2);
		tree.head.left.left = new Node(3);
		tree.head.right = new Node(4);
		tree.head.right.left = new Node(5);
		tree.head.right.left.right = new Node(6);
		tree.head.right.left.right.right = new Node(7);
		spiralTraversal(tree.head);
	}

}
