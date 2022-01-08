package LinkedLIst;

import LinkedLIst.Reverse_aLinkedList.Node;

public class SwapNodesInPairs {
	node head;
	class node{
		int data;
		node next;
		node(int data){
			this.data = data;
			this.next = null;
		}
		node(){
		}
	}
	
	public void addFirst(int data) {
		node newNode = new node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		node newNode = new node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	public void reverseInpairs() {
		
		if(head == null || head.next == null) {
			return;
		}
	}
	public void printList() {
		if(head == null) {
			System.out.println("empty list");
			return;
		}
		
		node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " ->");
			currNode = currNode.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNodesInPairs ob = new SwapNodesInPairs();
		ob.addFirst(2);
		ob.addFirst(1);
		ob.addLast(3);
		ob.addLast(4);

		ob.printList();
		ob.reverseInpairs();
		ob.printList();
	} 

}
