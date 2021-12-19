package LinkedLIst;

public class SingleEnded_linkedLIst {
	Node head;
	private int size;
	
	SingleEnded_linkedLIst(){
		this.size = 0;
	}
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null; 
			size++;
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
	public void deleteFirst() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		
		 secondLast.next = null;
	}
	public void addInMiddle(int index, String data) {
	       if(index > size || index < 0) {
	           System.out.println("Invalid Index value");
	           return;
	       }
	       size++;
	 
	       Node newNode = new Node(data);
	       if(head == null || index == 0) {
	           newNode.next = head;
	           head = newNode;
	           return;
	       }
	       Node currNode = head;
	       for(int i=1; i<size; i++) {
	           if(i == index) {               
	        	   Node nextNode = currNode.next;
	               currNode.next = newNode;
	               newNode.next = nextNode;
	               break;
           }
	           currNode = currNode.next;
	       }
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
		SingleEnded_linkedLIst list = new SingleEnded_linkedLIst();
		/*
		 * insert
		 * print
		 * delete
		 * size
		 */
//		list.addFirst("this");
		list.addLast("is");
		list.addLast("a");

		list.addLast("list");
		list.printList();
//		list.deleteFirst();
		list.addInMiddle(2, "that");
		list.printList();
	}

}
