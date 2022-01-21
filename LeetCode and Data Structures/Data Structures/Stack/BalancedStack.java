package Stack;
import java.util.Stack;

public class BalancedStack {
	
	public static void main (String args[]) {
		
		String exp1 = "{()}";
		String exp2 = "{[)}[]()";
		System.out.println(isBalanced(exp1));
		System.out.println(isBalanced(exp2));
        if (isBalanced(exp1)) {
        	
            System.out.println("The expression is balanced");
            
        } 
        else {
        	
            System.out.println("The expression is not balanced");
        }
        
        if (isBalanced(exp2)) {
        	
            System.out.println("The expression is balanced");
            
        } 
        else {
        	
            System.out.println("The expression is not balanced");
        }
	}
	
	public static boolean isBalanced(String exp){
		
		// check to see if length of string is even by using modulus operator 
		if(exp.length() % 2 == 1) {
			
			return false;
		}
		// if((exp.length() = 8 & 2 == 0 -> false
		
		// create a stack of characters 
		Stack<Character> bal = new Stack<Character>();
		
		// for each character put in array and loop
		for(char c: exp.toCharArray()) {
			
			if(c == '(' || c ==  '[' || c == '{') {
				
				bal.push(c);
			}
			/* if(c == '{')
			   bal.push({)
			   if(c == '(')
			   bal.push(()
			   if(c == '[')
			   bal.push([)
			   if(c == '{')
			   bal.push({)
			 
			 */
			
			if (c == ')' || c == '}' || c == ']'){
	        
				if (bal.empty()) {
				
					return false;
	            }
				Character top = bal.pop();
				
				/* if(c == ')')
				   top = bal.pop(()
				   if(c == '}')
				   top = bal.pop({)
				   if(c == '}')
				   top = bal.pop({)
				   if(c == ']')
				   top = bal.pop([) 
				 */
	 
	      
	 
	            // if the popped character if not an opening brace or does not pair
	            // with current character of the expression
	            if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')) {
	            	
	            	return false;
	            }
			}
		}
		
		return bal.empty();

	}
}
