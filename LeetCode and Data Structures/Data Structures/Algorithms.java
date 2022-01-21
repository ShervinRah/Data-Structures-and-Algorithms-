
public class Algorithms {
	
	public static void main (String args[]) {
		
		int [] input = {3,2,5,6};
		System.out.println(minNum1(input));
		System.out.println(minNum2(input));
	}
	
	public static int minNum1(int [] arr) {
		
		int temp = 0;
		int secondMin = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				secondMin = arr[1];
			}
		}
		
		return secondMin;
	}
	
	public static int minNum2(int [] arr) {
		
		int min = arr[0];
		int min2 = arr[1];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < min) {
				
				min2 = min;
				min = arr[i];
			}
			else if(arr[i] < min2) {
			
				min2 = arr[i];
			}
		}
		
		return min2;
	}
	
}
