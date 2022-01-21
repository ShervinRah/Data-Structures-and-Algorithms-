
package Stack;
import java.util.Stack;
import java.util.Arrays;

public class StockStack {

	 // Driver method 
    public static void main(String[] args){ 
    	
        int price[] = { 3, 91, 23, 133, 81, 12 }; // price per day 
        int n = price.length;   // length of day -> 0 1 2 3 4 5 6
        int span[] = new int[n]; // array of size n to store span for each day 
  
        // Fill the span values in array S[] 
        calculateSpan(price, n, span); 
  
        // print the calculated span values 
        printArray(span); 
        System.out.println();
        
        for(int i = 0; i < span.length; i++) {
        	
        	System.out.print(span[i] + ", ");
        	
        }
    } 
    
    // Time Complexity O(2n) = O(n)
    // Space Complexity O(n) 
	static void calculateSpan(int price[], int n, int span[]){ 
	       
			// create a stack to hold day number 0,1,2,3,4,5,6 
	        Stack<Integer> st = new Stack<>(); 
	        
	        //push day 0 to stack 
	        st.push(0); 
	  
	        // Span value of first element is always 1 
	        span[0] = 1; 
	  
	        // Calculate span values for rest of the elements 
	        for (int i = 1; i < n; i++) { 
	        	
	        	// { 100, 80, 60, 70, 60, 75, 85 }
	        	
	        	while (!st.empty() && price[st.peek()] <= price[i]) {
	            	
	        		st.pop(); 
	            }
	        	
	        	if(st.empty()) {
	        		
	        		span[i] = i + 1;
	        	}
	     
	        	else {
	        		
	        		span[i] = i - st.peek();
	        		
	        	}
	
	            st.push(i); 
	         
	        } 
	    } 
	  
	    // A utility function to print elements of array 
	    static void printArray(int arr[]){ 
	    	
	        System.out.print(Arrays.toString(arr)); 
	    } 
	 
	   
}
