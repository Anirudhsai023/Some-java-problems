package LinkedList;

public class SortByAbsoluteValue {
	Node head;
	public static void printll(Node node) {
		while(node != null) {
			System.out.print(node.data + " ");
		}
	}
	public static void main(String[] args) {
		SortByAbsoluteValue ll = new SortByAbsoluteValue();
		ll.head = new Node(1);
		ll.head.next = new Node(-2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(-4);
		ll.head.next.next.next.next = new Node(-5);
		ll.head.next.next.next.next.next = new Node(6);
		ll.head.next.next.next.next.next.next = new Node(7);
		ll.head.next.next.next.next.next.next.next = new Node(-8);
		printll(ll.head);

	}

}
