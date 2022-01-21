package LinkedList;

public class LinkRunner {

	public static void main (String args[]) {
		
		LinkedList list = new LinkedList();
		
		list.insertAtFront(3);
		list.insertAtFront(9);
		list.insertAtFront(5);
		list.insertAtEnd(8);
		list.insertAtFront(213);
		list.insertAfterIndex(4, 30);
		list.insertAfterNode(list.head.next.next, 1110);
		list.show();
		list.deleteAt(3);
		list.show();
		
	}
}
