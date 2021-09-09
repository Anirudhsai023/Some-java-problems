package LinkedList;

public class ReverseLinkedList {
	Node head;
	public static Node ReversedLinkedList(Node root){
		Node current = root;
		Node next;
		Node previous = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		
		return previous;
	}
	public static void printLinkedList(Node temp) {
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		ReverseLinkedList ll = new ReverseLinkedList();
		ll.head = new Node(0);
		ll.head.next = new Node(1);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(3);
		ll.head.next.next.next.next = new Node(4);
		ll.head.next.next.next.next.next = new Node(5);
		ll.head.next.next.next.next.next.next = new Node(6);
		System.out.print("Before Reversing : ");
		printLinkedList(ll.head);
		Node root = ReversedLinkedList(ll.head);
		System.out.println();
		System.out.print("After Reversing : ");
		printLinkedList(root);
	}

}
