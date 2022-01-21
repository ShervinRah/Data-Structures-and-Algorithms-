package DynamicProgramming;
public class LIS
{
    /* lis() returns the length of the longest
       increasing subsequence in arr[] of size n */
    static int lis1(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        /* Compute optimized LIS values in
           bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
        
        
        for(int z = 0; z <lis.length; z++) {
        	
        	if(z != lis.length-1) {
        	
        		System.out.print(lis[z] + ", ");
        	}
        	else {
        		
        		System.out.print(lis[z]);
        		
        	}
        	
        	
        }
 
        return max;
    }
    
   
    public static void main(String args[])
    {
        int arr1[] = { 67, 65, 72, 75, 73, 70, 70, 68 };
        int arr2[] = { 68, 70, 70, 73, 75, 72, 65, 67};
        
        int n = arr1.length;
        System.out.println("\nLength of lis is " + lis1(arr1, n)
                           + "\n");
        System.out.println("\nLength of lis is " + lis1(arr2, n)
        + "\n");

    }
}