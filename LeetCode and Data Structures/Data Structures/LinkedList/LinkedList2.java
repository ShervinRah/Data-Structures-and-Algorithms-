package LinkedList;

class Node2{
	
	int key; 
	Node2 next;
	
	public Node2(int data) {
		
		key = data;
		next = null;
		
	}
}

class LinkedList2{
	
	Node2 head;
	
	public LinkedList2() {
		
		head = null;
	}
	
	public boolean isEmpty() {
		
		return head == null;
	}
	
	public void insertFront(int new_data) {
		
		// create a new node 
		
		Node2 new_node = new Node2(new_data);
		
		new_node.next = head;
		head = new_node;
		
	}
	
	public void insertEnd(int new_data) {
		
		Node2 new_node = new Node2(new_data);
		
		if(head == null) {
			
			head = new_node;
		}
		
		new_node.next = null;
		
		Node2 first = head;
		
		while(first.next != null) {
			
			first = first.next;
		}
		
		first.next = new_node;
	}
	
	public void insertAfterIndex(int new_data, int index) {
		
		Node2 new_node = new Node2(new_data);
		
		
	}
}


