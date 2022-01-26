package Stack; 

public class Stacks{
	
	
	public static void main (String args[]) {
		
		
		StackClassed stk = new StackClassed();
		
		stk.push(4);
		stk.push(8);
		stk.push(3);
		//stk.pop();
		//stk.show();
		System.out.println(stk.peek());		
		System.out.println(stk.isEmpty());
	}
	
}

class StackClassed{
	
	int arr [] = new int [10];
	int top = 0;
	
	public void push(int num) {
		
		if(top == 10) {
			
			System.out.println("Stack is full!");
		}
		else {
			
			arr[top] = num;
			top++;
		}
		
	}
	
	public void show() {
		
		for(int i = arr.length - 1; i >= 0; i--) {
			
			System.out.println(arr[i] + " ");
		}
		
	}
	
	public boolean isEmpty() {
		
		return top <= 0;
		
	}
	
	public int pop() {
		
		int temp;
		top--;
		temp = arr[top];
		arr[top] = 0;
		return temp;
		
	}
	
	public int peek() {
		
		int peek; 
		top--;
		peek = arr[top];
		return peek;
	}
}
