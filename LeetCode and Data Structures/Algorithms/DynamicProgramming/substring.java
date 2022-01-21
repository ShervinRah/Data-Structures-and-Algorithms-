package DynamicProgramming;

import java.util.Arrays;

public class substring {
	
	public static void main(String args[])
    {
 
        // Initializing String
        String Str = new String("sexiam");
 
        // using substring() to extract substring
        // returns (whiteSpace)geeksforgeeks
       
        for (int i = 1; i <= Str.length(); i++)
        {
            // consider all prefixes of the current string
            String prefix = Str.substring(0, i);
            System.out.println(prefix);
        }
        
        String prefix1 = Str.substring(1);
        System.out.println(prefix1);
        
        String word = "sheasixx";
        
        int[] lookup = new int[word.length()];
        Arrays.fill(lookup, -1);
        
        for(int i = 0; i < lookup.length; i++) {
        	
        	System.out.print(lookup[i] + " ");
        }
        
        System.out.println("Length is " + word.length());
        

         
    }

}
