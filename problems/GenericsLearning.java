package problems;
//import java.util.*;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data = data;
	}
}

public class GenericsLearning {
 Node head;
	
	public void printll() {
		printll(head);
	}
	
	public void printll(Node head) {
		while(head!=null) {
			System.out.println(head);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		GenericsLearning ll = new GenericsLearning();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		ll.head.next.next.next.next = new Node(5);
		ll.printll();
		
	}

}
