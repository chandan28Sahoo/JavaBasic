package LinkedLIst;

public class Find_nth_NodeFromLast {
	listNode head;
	class listNode{
		int data;
		listNode next;
		listNode(){}
		listNode(int data){
			this.data = data;
			this.next = null; 
		}
		listNode(int val, listNode next){
			this.data = val;
			this.next = next;
		}
	}

	// add - add first , add last
	public void addFirst(int data) {
		listNode newNode = new listNode(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		listNode newNode = new listNode(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		listNode currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}
	
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}

		listNode currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " -->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	public listNode removeNthFromEnd(listNode head,int n) {
		if(head.next == null) {
			return null;
		}
		listNode curr = head;
		int size=0;
		while(curr != null) {
			curr = curr.next;
			size++;
		}
		
		if(size == n) {
			return head.next;
		}
		int indexToSearch = size - n;
		listNode prev = head;
		
		int i = 1;
		while(i<indexToSearch) {
			System.out.println(prev.data);
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_nth_NodeFromLast list = new Find_nth_NodeFromLast();
		list.addFirst(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.printList();
		list.head = list.removeNthFromEnd(list.head, 3);
		list.printList();
		
	}

}
