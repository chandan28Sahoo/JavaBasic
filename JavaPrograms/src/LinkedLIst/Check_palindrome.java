package LinkedLIst;

import LinkedLIst.Reverse_aLinkedList.Node;

public class Check_palindrome {
	node head;
	class node{
		int data;
		node next;
		
		node(int data){
			this.data = data;
			this.next = null;
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
	
	public node findMiddle(node head) {
		node hare = head;
		node tartle = head;
		while(hare.next != null || hare.next.next != null) {
			hare = hare.next.next;
			tartle = tartle.next;
		}
		return tartle;
	}
	public node reverse(node head) {
		node prevNode = null;
		node currentNode = head;
		
		while(currentNode != null) {
			node nextNode = currentNode.next;
			currentNode.next = prevNode;
			
			//update
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	}
	
	public boolean isPalindrome(node head) {
		if(head == null || head.next == null) {
			return true;
		}
		
		node middle = findMiddle(head);
		node secondHalf = reverse(middle.next);
		node firstHalf = head;
		while(secondHalf  != null) {
			if(secondHalf.data != firstHalf.data) {
				return false;
			}
			secondHalf = secondHalf.next;
			firstHalf = firstHalf.next;
		}
		return true;
	}
	public void printlist() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("null");
//		boolean data = isPalindrome(head);
//		System.out.println(data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Check_palindrome list = new Check_palindrome();
		list.addFirst(1);
		list.addLast(2);
		list.addLast(1);
		list.printlist();
//		boolean list.head = list.isPalindrome(list.head);
//		System.out.println(data);
	}

}
