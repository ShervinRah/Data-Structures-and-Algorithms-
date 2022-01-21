package Stack;
import java.util.EmptyStackException;

public class StackLinkedList {
	
	
	class Node{
		
		int key;
		Node link;
		
		Node(int key){
			
			this.key = key;
		}
	}

	Node top = null;
	int size;

	public void push(int data) {
		
		Node tempNode = new Node(data);
		tempNode.link = top;
		top = tempNode;
		size++;
		
		/*
		 
		 
		 top -> 5|null
		 
		 top -> 7|&5 -> 5|null
		 top -> 9|&7 -> 7|&5 -> 5|null
		 
		 tempNode = 5
		 tempNode.link = null
		 top = 5
		 size++ = 1
		 
		 tempNode = 7
		 tempNode.link = 5
		 top = 7
		 size++ = 2
		 
		 tempNode = 9
		 tempNode.link = 7
		 top = 9
		 size++ = 3
		 */
		
	}
	
	public int pop() {
		
		
		if(isEmpty()) {
			
			throw new EmptyStackException();
			
		}
		
		int result = top.key;
		top = top.link;
		size--;
		return result;
		
		/*
		 
		 if pop() were to be called 3 times
		 
		 top -> 9|&7 -> 7|&5 -> 5|null
		 top -> 7|&5 -> 5|null
		 top -> 5|null
		 
		 */
		
	}
	
	public int peek() {
		
		if(isEmpty()) {
			
			throw new EmptyStackException();
		}
		
		return top.key;
	}
	
	public boolean isEmpty() {
		
		return size == 0;
	}
	
	public int sizeOf() {
		
		return size;
	}
	
	public void displayStack() {
		
		Node current = top;
		
		while(current != null) {
			
			System.out.println(current.key + " ");
			current = current.link;
		}
	}
	
	public static void main(String args[]) {
		
		
		StackLinkedList stacklink = new StackLinkedList();
		
		long startTime1 = System.nanoTime(); 
		stacklink.push(5);
		stacklink.push(3);
		stacklink.push(7);
		stacklink.push(8);
		stacklink.push(23);
		stacklink.push(19);
		long estimatedTime1 = System.nanoTime() - startTime1;
		System.out.println("Stack Linked List Implementation took: " + estimatedTime1 + " nanoseconds");
		stacklink.displayStack();
		
		
	}
	

}
