package trees;

public class HeightOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int height(Node node) {
		if(node == null) {
			return 0;
		}
		else {
		int lDepth = height(node.left);
		int rDepth = height(node.right);
		
		if(lDepth > rDepth) {
			return lDepth + 1;
		}
		return rDepth + 1;
		}
	}

}
