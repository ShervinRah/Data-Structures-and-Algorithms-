package LinkedList;
/* Linked List Data structure
 * Node that holds a value and a reference to the next node
 * First object will have a reference of the second object and so on 
 * every object will have a reference of another object, but last object will 
 * have a reference to null 
 */

class Node{
	
	int key; 
	Node next;
	
	public Node(int data) {
		
		key = data;
		next = null;
	}
	
}

class LinkedList{
	
	Node head; 
	
	public LinkedList() {
		
		head = null;
	}
	
	public boolean isEmpty() {
		
		return head == null;
	}
	
	public void insertAtFront(int new_data) {
		
		// create a new node of object type Node 
		Node new_node = new Node(new_data);
		
		// the next of this node will by the current head node 
		new_node.next = head;
		
		// the new head will be the new node with the new data 
		head = new_node;
		
	}
	
	public void insertAtEnd(int new_data) {
		
		Node new_node = new Node(new_data);
		
		// if head is null, make this new node the head and next is null 
		if(head == null) {
			
			head = new_node;
			return;
		}
		
		new_node.next = null;
		
		Node last = head;
		
		while(last.next != null) {
			
			last = last.next;
		}
		
		last.next = new_node;
		
		//return;
		
	}
	
	public void show() {
		
		Node node = head;
		
		while(node.next != null) {
			
			System.out.println(node.key);
			node = node.next;
		}
		
		System.out.println(node.key);
	}
	
	public void insertAfterNode(Node prev_node, int new_data) {
		
		if(prev_node == null) {
			
			System.out.println("The given previous node cannot be null!");
			return;
			
		}
		
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	public void insertAfterIndex(int prev_index, int new_data) {
		
		
		Node new_node = new Node(new_data);
		new_node.key = new_data;
		new_node.next = null;
		
		Node n = head;
		
		for(int i = 0; i < prev_index - 1; i++) {
			
			n = n.next;
		}
		
		new_node.next = n.next;
		n.next = new_node;
		
		
		
	}
	
	public void deleteAt(int position) {
		
		// if position to be deleted is 0, make head node the next node 
		if(position == 0) {
			
			head = head.next; 
		}
		else {
			
			Node n = head;
			Node n1 = null;
		
			// traverse through the linked list 
			for(int i = 0; i < position - 1; i++) {
			
				n = n.next;
				
			}
			
			n1 = n.next;
			n.next = n1.next;
			System.out.println("Number Deleted: " + n1.key);
		
		}
		
		
		
		
	}
	
}