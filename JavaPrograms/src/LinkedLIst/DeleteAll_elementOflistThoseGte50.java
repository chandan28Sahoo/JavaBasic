package LinkedLIst;

import LinkedLIst.SingleEnded_linkedLIst.Node;

public class DeleteAll_elementOflistThoseGte50 {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			System.out.println("this empty list");
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	public void deleteLast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(secondLast.next != null) {
			System.out.println(lastNode.data);
			if(secondLast.data > 25) {
//				lastNode = lastNode.next;
				secondLast = null;
			}
			lastNode = lastNode.next;
		}
		
//		 secondLast.next = null;
	}
	public void printList() {
		if(head == null) {
			System.out.println("this empty list");
			return;
		}
		
		Node currentNode = head;
		while(currentNode != null) {
			System.out.println(currentNode.data + "  ->" );
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteAll_elementOflistThoseGte50 list = new DeleteAll_elementOflistThoseGte50();
		list.addFirst(1);
		for(int i = 2; i<=50; i++) {
			list.addLast(i);
		}
		list.deleteLast();
//		list.printList();
		
	}

}
