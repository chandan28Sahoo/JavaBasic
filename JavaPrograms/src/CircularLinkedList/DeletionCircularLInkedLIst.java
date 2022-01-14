package CircularLinkedList;

public class DeletionCircularLInkedLIst {
	static Node head;
	static Node tail;
	static Node newNode;
	static Node currentNode;
	public static class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static void addFirst(int data) {
		newNode = new Node(data);
		//		System.out.println(newNode.data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
			return;
		}
		newNode.next = head;
		head = newNode;
		tail.next = head;
	}

	public static void addLast(int data) {
		newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
			return;
		}

		tail.next = newNode;
		tail = newNode;
		newNode.next = head;

	}

	public static void deleteFirst() {
		currentNode = head;
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		currentNode = currentNode.next;
		head = currentNode;
		tail.next = head;
	}
	
	public static void deleteLast() {
		currentNode = head;
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node secondNode = currentNode.next;
		while(secondNode.next != head) {
			currentNode = secondNode;
			secondNode = secondNode.next;
		}
		currentNode.next = head;
		tail = secondNode;
	}
	public static void printElementOfList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		currentNode = head;			
		do{
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
		while(currentNode != head);	
	}
	
	public static void deleteSpecificPosition(int pos) {
		currentNode = head;
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node secondNode = currentNode.next;
		for(int i = 1; i<(pos - 1); i++) {
			currentNode = secondNode;
			secondNode = secondNode.next;
		}
		currentNode.next = secondNode.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFirst(1);
		addLast(2);
		addLast(3);
		addLast(4);
//		deleteFirst();
//		deleteLast();
		deleteSpecificPosition(3);
		printElementOfList();
	}

}
