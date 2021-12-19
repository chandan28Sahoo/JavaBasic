package LinkListPractice;

public class LL_practice {
	Node head;
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
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
		System.out.println(newNode.data);
		if(head == null) {
			head = newNode;
			return;
		}

		Node currentNode = head;
		if(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}

		head = head.next;
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
		Node seconeLastNode = head;
		Node lastNode = head.next;
		if(lastNode.next != null) {
			lastNode = lastNode.next;
			seconeLastNode =  seconeLastNode.next;
		}
		seconeLastNode.next = null;
	}
	
	
	public void printList() {
		if(head == null) {
			System.out.println("empty list");
			return;
		}
		
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL_practice ob = new LL_practice();
		ob.addFirst("this");
		ob.addFirst("is");
		ob.addLast("list");
		ob.printList();
		ob.deleteFirst();
		ob.printList();		
		ob.deleteLast();
		ob.printList();		
	}

}
