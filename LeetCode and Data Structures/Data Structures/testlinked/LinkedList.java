package testlinked;

class LinkedNums {

	static ListNode head1, head2;

	static class ListNode {

		int key;
		ListNode next;

		ListNode(int data)
		{
			key = data;
			next = null;
		}
	}
	
	public ListNode addTwoLists(ListNode list1, ListNode list2){
		
		 ListNode dummyHead = new ListNode(0);
		 
		 ListNode prev = list1;
		 ListNode temp = list2;
		 ListNode curr = dummyHead;
		 
		 int carry = 0;
		 while (prev != null || temp != null) {
			 
		        int x = 0;
		        int y = 0;
		        
		        if(prev != null) {
		        	
		        	x = prev.key;
		        }
		        else {
		        	
		        	x = 0;
		        }
		        
		        if(temp != null) {
		        	
		        	y = temp.key;
		        }
		        else {
		        	
		        	y = 0;
		        }
		        
		        int sum = carry + x + y;
		        /*
		         
		        list1   ->    7   5   9   4   6  null
		        list2   ->    8   4   3   9   5  null
		        carry   ->        1   1   1   1   1
		                      -   -   -   -   -   -
		        curr    ->    5   0   3   4   2   1
		       
		       
		     
		         */
		        carry = sum / 10;
		        curr.next = new ListNode(sum % 10);
		        curr = curr.next;
		        
		        if (prev != null) {
		        	
		        	prev = prev.next;
		        	
		        }
		        if (temp != null) {
		        	
		        	temp = temp.next;
		        }
		    }
		 
		    if (carry > 0) {
		    	
		        curr.next = new ListNode(carry);
		    }
		    
		    return dummyHead.next;
		
	}
	

	void printList(ListNode head)
	{
		while (head != null) {
			
			System.out.print(head.key + " ");
			head = head.next;
		}
		
		System.out.println("");
	}

	// Driver Code
	public static void main(String[] args)
	{
		LinkedNums list = new LinkedNums();

		// creating first list
		list.head1 = new ListNode(7);
		list.head1.next = new ListNode(5);
		list.head1.next.next = new ListNode(9);
		list.head1.next.next.next = new ListNode(4);
		list.head1.next.next.next.next = new ListNode(6);
		System.out.print("First List is ");
		list.printList(head1);
		
		// creating second list
		list.head2 = new ListNode(8);
		list.head2.next = new ListNode(4);
		list.head2.next.next = new ListNode(3);
		list.head2.next.next.next = new ListNode(9);
		list.head2.next.next.next.next = new ListNode(5);
		System.out.print("Second List is ");
		list.printList(head2);

		// add the two lists and see the result
		ListNode rs = list.addTwoLists(head1, head2);
		System.out.print("Resultant List is ");
		list.printList(rs);
	}
}


