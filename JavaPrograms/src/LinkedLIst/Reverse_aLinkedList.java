package LinkedLIst;


public class Reverse_aLinkedList {
	Node head;

	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null; 
		}
	} 

	// add - add first , add last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	
	public void reverseList() {
		
		if(head == null || head.next == null) {
			return;
		}
		Node prevNode = head;
		Node currentNode = head.next;
		
		while(currentNode != null) {
			Node nextNode = currentNode.next;
			currentNode.next = prevNode;
			
			//update
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}
	
	public Node reverseRecursive(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node NewHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return NewHead;
	}
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}

		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " -->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_aLinkedList list = new Reverse_aLinkedList();
		list.addFirst("1");
		list.addLast("2");
		list.addLast("3");
		list.printList();
//		list.reverseList();
		list.head = list.reverseRecursive(list.head);
		list.printList();
	}

}
