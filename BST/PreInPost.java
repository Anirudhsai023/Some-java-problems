package BST;
import java.util.*;

class Nodepip{
	Nodepip left, right;
	int data;
	int visited = 0;
	Nodepip(int data){
		this.data = data;
		
	}
}

public class PreInPost {
	Nodepip head;
	public static void traversal(Nodepip node) {
		ArrayList<Integer> pre = new ArrayList<>();
		ArrayList<Integer> in = new ArrayList<>();
		ArrayList<Integer> post = new ArrayList<>();
		if(node == null)return;
		if(node.visited == 0) {
			pre.add(node.data);
		}else if(node.visited == 1) {
			in.add(node.data);
		}else {
			post.add(node.data);
		}
		node.visited++;
		traversal(node.left);
		node.visited++;
		traversal(node.right);
		System.out.println(pre);
		System.out.println(in);
		System.out.println(post);
	}
	
	public static void main(String[] args) {
		PreInPost tree = new PreInPost();
		tree.head = new Nodepip(8);
		tree.head.left = new Nodepip(3);
		tree.head.left.left = new Nodepip(1);
		tree.head.left.right = new Nodepip(6);
		tree.head.left.right.left = new Nodepip(4);
		tree.head.left.right.right = new Nodepip(7);
		tree.head.right = new Nodepip(10);
		tree.head.right.right = new Nodepip(14);
		tree.head.right.right.left = new Nodepip(13);
		traversal(tree.head);
	}

}
