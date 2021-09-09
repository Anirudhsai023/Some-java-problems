package LinkedList;

public class DetectLoop {
	Node head;
	public static void printll(Node node) {
		Node hare = node.next;
		Node turtle = node;
		while(turtle != hare ) {
			turtle =turtle.next;
			if(hare.next == null || hare.next.next == null) {
				hare = null;
				break;
			}
			hare = hare.next.next;
		}
		if(hare == null) {
			System.out.println("No Loop present");
		}else {
			System.out.println("Loop present");
		}
	}
	public static void main(String[] args) {
		DetectLoop ll = new DetectLoop();
		ll.head = new Node(0);
		ll.head.next = new Node(1);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(3);
		ll.head.next.next.next.next = new Node(4);
		ll.head.next.next.next.next.next = new Node(5);
		ll.head.next.next.next.next.next.next = new Node(6);
		ll.head.next.next.next.next.next.next.next = ll.head.next.next.next.next;
		printll(ll.head);
	}

}
