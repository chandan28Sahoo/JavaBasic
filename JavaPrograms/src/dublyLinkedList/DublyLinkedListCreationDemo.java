package dublyLinkedList;

import CircularLinkedList.CreationCircularLinkEdList.Node;

public class DublyLinkedListCreationDemo {

	public static Node head;
	public static Node tail;
	public static 	Node newNode;
	public static class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public static void addFirst(int data) {
		newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}
	
	public static void addLast(int data) {
		newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	public static void addElementInSpecificPosition(int pos, int data) {
		newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
 		Node firstNode = head;
		Node secondNode = firstNode.next;
		for(int i = 1; i< (pos-1); i++) {
			firstNode = secondNode;
			secondNode = secondNode.next;
		}
		newNode.prev = firstNode;
		newNode.next = secondNode;
		firstNode.next = newNode;
		secondNode.prev = newNode;
	}
	public static void deleteFirst() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currentNode = head.next;
		head = currentNode;
		head.prev = null;
	}
	
	public static void deleteLast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}

		Node currentNode = tail;
		tail = currentNode.prev;
		tail.next = null;
	}
	
	public static void deleteSpecificPosition(int pos) {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currentNode = head;
		Node secondNode = currentNode.next;
		for(int i = 1; i< (pos - 1); i++) {
			currentNode = secondNode;
			secondNode = secondNode.next;
		}
		
		currentNode.next = secondNode.next;
		secondNode.prev = currentNode;
	}
	
	public static void traverseListForword() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currentNode = head;
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next; 
		}
	}
	
	public static void traverseListBackWord() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currentNode = tail;
//		System.out.println(currentNode.data);
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.prev; 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFirst(1);
		addLast(2);
		addLast(3);
		addLast(4);
		addLast(5);
		addLast(6);
		//addElementInSpecificPosition(5,6);
		//deleteFirst();
		//deleteLast();
		deleteSpecificPosition(4);
		traverseListForword();
		//traverseListBackWord();
	}

/*
 	
 			Node currentNode = head;
		for(int i = 1; i< (pos-1); i++) {
			currentNode = currentNode.next;
		}
		newNode.next = currentNode.next;
		newNode.prev = currentNode;
		currentNode.next = newNode;
		
 		Node firstNode = head;
		Node secondNode = firstNode.next;
		for(int i = 1; i< (pos-1); i++) {
			firstNode = secondNode;
			secondNode = secondNode.next;
		}
		newNode.prev = firstNode;
		newNode.next = secondNode;
		firstNode.next = newNode;
		secondNode.prev = newNode;
 * */
}
