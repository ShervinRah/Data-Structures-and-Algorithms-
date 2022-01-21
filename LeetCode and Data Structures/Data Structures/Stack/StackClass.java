package Stack;

/* Stack Data Structure 
 * A linear data structure which follows a particular order in which the operations are performed
 
 Orders: LIFO(Last In First Out) or FILO(First In Last Out)
 
 3 Basic Operations 
 
 Push: Adds items in the stack. If the stack is full, then overflow condition
 Pop: Removes an item from the stack. The items are popped in reverse order in which 
 they are pushed. If the stack is empty, then underflow condition 
 Peek or Top: Returns top element of stack 
 isEmpty: Returns true if stack is empty, else false 
 
 */
public class StackClass{
	
	public static void main (String args[]) {
	
		Stack st = new Stack();
	
		long startTime1 = System.nanoTime(); 
		st.push(5);
		st.push(3);
		st.push(7);
		st.push(8);
		st.push(23);
		st.push(19);
		long estimatedTime1 = System.nanoTime() - startTime1;
		
		System.out.println("Stack Array Implementation took: " + estimatedTime1 + " nanoseconds");
		
		
		for(int i = 0; i < 6; i++) {
			
			st.pop();
		}
		
		st.show();

	}
}
class Stack{
	
	int stack [] = new int[10]; //stack of size 10:0-9
	int top =  0;
	
	public void push(int data) {
		
		if(top == 10) {
			
			System.out.println("\nThe stack is full!");
		}
		else {
			stack[top] = data; //push element to the stack 
			top++; //push another element to the stack so increment here 
		}
	}
	
	public int pop() {
		
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data; 
	}
	
	public int peek() {
		
		int data;
		data = stack[top - 1];
		return data;
	}
	
	public int sizeOf() {
		
		return top;
	}
	
	public boolean isEmpty() {
		
		return top <= 0;
	}
	public void show() {
		
		for(int i = 0; i < stack.length; i++) {
			
			System.out.print(stack[i] + " ");
		}
		System.out.println();
		
		/*
		for(int n : stack) {
			
			System.out.print(n + " ");
		}
		*/
	}
	
	
}
