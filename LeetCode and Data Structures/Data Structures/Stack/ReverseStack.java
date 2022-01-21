package Stack;
import java.util.Stack;

public class ReverseStack {

	public static void main(String args[]) {
		
		Stack<String> st = new Stack<String>();
		
		st.push("Shervin 1");
		st.push("Shervin 2");
		st.push("Shervin 3");
		st.push("Shervin 4");
		st.push("Shervin 5");
		System.out.println("Original Stack: " + st + "\n");
	    reverse(st);
		System.out.println("Reversed Stack: " + st);
	}
	
	 public static void reverse(Stack<String> stack){

	        if(!stack.isEmpty()){

	            String x = stack.pop();
	            reverse(stack);
	            insert_at_bottom(stack, x);
	            
	            /*
	             
	             x = 3
	             reverse(1,2)
	             x = 2 
	             reverse(1)
	             x = 1
	             insert_at_bottom(stack(empty),1)
	             stack.push(1)
	             insert_at_bottom(stack(1),2)
	             topElement = 1
	             insert_at_bottom(stack(empty),2)
	             stack.push(2)
	             stack.push(1) -> [2,1]
	             insert_at_bottom(stack(1,2),3)
	             topElement = 1 
	             insert_at_bottom(stack(2),3)
	             topElement = 2
	             insert_at_bottom(stack(empty),3)
	             stack.push(3)
	             stack.push(2)
	             stack.push(1) -> [3,2,1]
	             
	             
	             */
	            
	       }
	    }

	    public static void insert_at_bottom(Stack<String> stack, String x){

	        if(stack.isEmpty()){
	            stack.push(x);
	            return;
	        }

	        String topElement = stack.pop();
	
	        insert_at_bottom(stack, x);

	        stack.push(topElement);
	    }
	

}
