package CircularLinkedList;

public class CreationCircularLinkEdList {
	static Node head;
	static Node tail;
	public static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	//add first
	public static void addFirst(int data) {
		Node newNode = new Node(data);
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
	public static void addElementAddLast(int data) {
		//add last
		Node newNode = new Node(data);
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
	
	public static void addInSpecificPosition(int pos, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
			return;
		}else {
			Node currentNode = head;
			for(int i = 1; i< (pos-1); i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}
	public static void traversed() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}else {
			Node currentNode = head;			
			do{
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
			while(currentNode != head);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFirst(1);
		addFirst(2);
		addFirst(3);
		addFirst(8);
//		addFirst(10);
//		addElementAddLast(20);
//		addElementAddLast(30);
		addInSpecificPosition(2,2);
		traversed();
	}
}
