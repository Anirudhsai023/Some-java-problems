package trees;

public class CheckIfBalanced {
    Node head;
    public static boolean balanceCheck(Node node) {
         if(node == null) {
        	 return true;
         }else{
        	int lh = height(node.left); 
        	int rh = height(node.right);
        	if(Math.abs(lh-rh) <=1 ) return true;
        	else return false;
         }
    }
    public static int height(Node node) {
    	if(node == null) {    		
    		return 0;
    	}else {
    		int lDepth = height(node.left);
    		int rDepth = height(node.right);
    		
    		if(lDepth > rDepth) {
    			return lDepth + 1;
    		}
    		else {
    			return rDepth + 1;
    		}
    	} 	
    }
	public static void main(String[] args) {
		CheckIfBalanced tree = new CheckIfBalanced();
		tree.head = new Node(1);
		tree.head.left = new Node(1);
		tree.head.right = new Node(1);
		tree.head.left.left = new Node(1);
		tree.head.left.right = new Node(1);
		tree.head.right.left = new Node(1);
		tree.head.right.right = new Node(1);
		tree.head.left.left.right = new Node(1);
//		tree.head.left.left.right.left = new Node(1);
		tree.head.right.right.left = new Node(1);
//		boolean res = balanceCheck(tree.head) ? :
		if(balanceCheck(tree.head)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}

}
