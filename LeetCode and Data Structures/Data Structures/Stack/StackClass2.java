package Stack;

public class StackClass2 {
	
	public static void main (String args[]) {
		
		Stacked st1 = new Stacked();
		
		st1.push(5);
		st1.push(3);
		st1.push(8);
		st1.push(4);
		
	    st1.printStack();
	}

}

class Stacked{
	
	
	int stack [] = new int [10];
	int top = 0;
	
	public void push(int data) {
		
		if(top == 10) {
			
			System.out.println("Stack is full!");
			
		}
		else {
			
			stack[top] = data;
			top++;
		}
	}
	public int pop() {
		
		int data = 0;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;
	}
	
	public int peek() {
		
		int data;
		data = stack[top-1];
		return data;
	}
	
	public int sizeOf() {
		
		return top;
	}
	
	public boolean isEmpty() {
		
		return top == 0;
	}
	
	public void printStack() {
		
		for(int i = 0; i < stack.length; i++) {
			
			System.out.println(stack[i]);
		}
	}

	
}
