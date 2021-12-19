package LinkedLIst;

public class Find_the_IndexOfAny_element {

	Node head;
	private int index;
	
	Find_the_IndexOfAny_element(){
		this.index = -1;
	}
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
//			index++;
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
	
	public void findIndex(int num) {
		if(head == null) {
			System.out.println("this empty list");
			return;
		}
		
		Node currentNode = head;
		while(currentNode != null) {
			if(num == currentNode.data) {
				index++;
				System.out.println(currentNode.data + "  ->" + index);
			}
			currentNode = currentNode.next;
			index++;
		}
		
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_the_IndexOfAny_element list = new Find_the_IndexOfAny_element();

		list.addLast(5);
		list.addLast(7);
		list.addLast(3);
		list.addLast(8);
		list.addLast(2);
		list.addLast(3);
		list.findIndex(8);
	}

}
