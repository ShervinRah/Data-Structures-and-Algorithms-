package Stack;
import java.util.Stack;
import java.util.Arrays;

public class stockstacktest {
	
	public static void main(String args[]) {
		
		
		
		int price [] = {100,80,60,70,60,75,85};
		int days = price.length;
		int span [] = new int[days];
		
		int result [] = calcSpan(price,days,span);
		
		for(int i = 0; i < result.length; i++) {
			
			System.out.print(result[i] + " ");
		}	
	}
	
	static int[] calcSpan(int price [], int days, int span[]) {
		
		
		// stack to push the number of days 
		Stack<Integer> s1 = new Stack<Integer>();
		
		s1.push(0); // push 0 to stack since minimum span of first day will always be 1
		span[0] = 1; // assign 1 to day 0
		
		for(int i = 1; i < price.length; i++) {
			
			// while the stack is not empty and the price of the top of the stack is less than price of that day -> keep popping 
			while(!s1.empty() && price[s1.peek()] < price[i]) {
				
				s1.pop();
			}
			
			// if the stack is empty the span is all the days 
			if(s1.empty()) {
				
				span[i] = i + 1;
			}
			// else the span is i - peek 
			else {
				
				span[i] = i - s1.peek();
			}
			
			// push day to the stack 
			s1.push(i);
		}
		
		// return the span array 
		return span;
		
		
	}
	
	static void printSpan(int arr []) {
		
		System.out.println(Arrays.toString(arr));
	}

}
