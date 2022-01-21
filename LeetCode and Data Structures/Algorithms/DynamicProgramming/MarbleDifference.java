package DynamicProgramming;

import java.util.Scanner;

//Main class
public class MarbleDifference {
     
     // Main method
     public static void main(String[] args) {
             
             // Scanner object created
             Scanner sc = new Scanner(System.in);
             
             int n;
             System.out.print("Enter length of marble array: ");
             
             // Length of array is taken as input
             n = sc.nextInt();
     
             int[] arr = new int[n];
             System.out.println("Enter the numbers in marbles: ");
             
             // The numbers of the marble is taken as input
             for(int i = 0; i < n; i++) {
            	 
            	 arr[i] = sc.nextInt();
                 
            	 
             }       
             // Scanner object is closed
             sc.close();
             
             // Method called to find maximum difference
             int diff = MaxDiff(n, arr);
             
             // Maximum Difference is printed
             System.out.println("The Maximum Difference in Scores: " + diff);
             
             
     }
     
     // Method to find maximum difference
     static int MaxDiff(int n, int arr[]) {
    	 
             // Array of n+1 size is created to store the sum of prefix of the array
             int prefixSum[] = new int[n + 1];
             
             prefixSum[0] = 0;
             for(int i=0; i<n; i++) {
            	 
            	 prefixSum[i+1] = prefixSum[i] + arr[i];
             }
             
             // A 2D array is created to have the difference value stored in it
             int[][] OPT = new int[n][n];
             
             for(int i = 0; i < n; i++) {
            	 
                     for(int j = 0; j < n; j++) {
                    	 
                             OPT[i][j] = 0;
                     }
             }
             
             // Loop for i = n-2 to 0
             for(int i = n - 2; i >= 0; i--) {
            	 
                     // Loop for i+1 to n-1
                     for(int j = i + 1; j < n; j++) {
                    	 
                             int score_if_take_i = prefixSum[j+1] - prefixSum[i+1] - OPT[i+1][j];
                             int score_if_take_j = prefixSum[j] - prefixSum[i] - OPT[i][j-1];
                             
                             // Maximum of both scores will be stored in the 2D array
                             OPT[i][j] = max(score_if_take_i, score_if_take_j);
                     }
             }
             
             for(int i = 0; i < 5; i++) {
      			
      			for(int j = 0; j < 5; j++) {
      				
      				System.out.print(OPT[i][j] + " ");
      			}
      			System.out.println();
      		}
             
             // Return the value
             return OPT[0][n-1];
     }
     
     
     // Method to return the maximum value among the two
     static int max(int a, int b) {
    	 
    	 if(a > b) {
    		 
    		 return a;
    	 }
    	 else {
    		 
    		 return b;
    	 }
             //return a>b ? a : b;
     }
     
}

