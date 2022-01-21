package LinkedList;

class AddNums {
	
	static ListNode head1;
	static ListNode head2;
	
	class ListNode{
		
		int key; 
		ListNode next;
		
		public ListNode(int data) {
			
			key = data;
			next = null;
		}
		
	}
	
	public ListNode addLists(ListNode list1, ListNode list2) {
		
		ListNode dummyHead = new ListNode(0);
	    ListNode p = list1, q = list2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.key : 0;
	        int y = (q != null) ? q.key : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
		
		/*
		ListNode result = null;
		ListNode prev = null;
		ListNode temp = null;
		
		int sum = 0;
		int carry = 0;
		int x,y;
		
		while(list1 != null || list2 != null) {
			
			if(list1 != null) {
				
				x = list1.key;
			}
			else {
				
				x = 0;
			}
			if(list2 != null) {
				
				y = list2.key;
			}
			else {
				
				y = 0;
			}
			
			sum = carry + x + y;
			
			
			
		}
		
		return result;
		*/
	}
	
	void printList(ListNode head)
    {
        while (head != null) {
        	
            System.out.print(head.key + " ");
            head = head.next;
        }
        System.out.println("");
    }
	/*
	public static void main (String args[]) {
		
		
		AddNums list1 = new AddNums();
        // creating first list
        list1.head1 = new ListNode(7);
        list1.head1.next = new ListNode(5);
        list1.head1.next.next = new ListNode(9);
        list1.head1.next.next.next = new ListNode(4);
        list1.head1.next.next.next.next = new ListNode(6);
        System.out.print("First List is ");
        list1.printList(head1);
 
        // creating second list
        list1.head2 = new ListNode(8);
        list1.head2.next = new ListNode(4);
        System.out.print("Second List is ");
        list1.printList(head2);
 
        // add the two lists and see the result
        ListNode rs = list1.addLists(head1, head2);
        System.out.print("Resultant List is ");
        list1.printList(rs);
		
	}*/

}
