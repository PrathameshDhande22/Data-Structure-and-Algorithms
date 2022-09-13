package dsa;

class Node{
	Node next;
	int value;
	public Node(int d) {
		this.value=d;
		this.next=null;
	}
}

class LinkedList23{
	Node head;
	public void create_linkedlist() {
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		
		head=first;
		first.next=second;
		second.next=third;
	}
	
	public void printList() {
		while(head!=null) {
			System.out.print(head.value+"->");
			head=head.next;
		}
		System.out.print("null");
	}
	
}



public class linkedList {

	public static void main(String[] args) {
		LinkedList23 ll=new LinkedList23();
		ll.create_linkedlist();
		ll.printList();

	}

}
