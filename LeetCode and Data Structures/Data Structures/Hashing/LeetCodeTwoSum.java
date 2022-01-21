package Hashing;
import java.util.*;

public class LeetCodeTwoSum {
	
	public static void main (String args[]) {
		
		
		int nums [] = new int [] {3, 5, 8, 2, 15}; 
		int target = 17; 
		
		int brute [] = twoSumsBrute(nums,target);
		int hashOne [] = twoSumsHash(nums,target);
		int hashTwo [] = twoSumHashPass(nums,target);
		
		System.out.println(brute[0] +  " and " + brute[1]);
		System.out.println(hashOne[0] + " and " + hashOne[1]);
		System.out.println(hashTwo[0] + " and " + hashTwo[1]);
		
	}
	
	public static int [] twoSumsBrute(int nums [], int target) {
		
		int size = nums.length;
		
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = i + 1; j < nums.length; j++) {
				
				if(nums[i] + nums[j] == target) {
					
					return new int [] {i,j};
				}
			}
			
		}
		
		throw new IllegalArgumentException("No two numbers sum up to target number!");

	}
	
	
	public static int [] twoSumsHash(int nums [], int target) {
		
		int size = nums.length;
	
		HashMap<Integer,Integer> hash1 = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			
			hash1.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i++) {
			
			int complement = target - nums[i];
			
			if(hash1.containsKey(complement)) {
				
				return new int [] {i, hash1.get(complement)};
			}
			
		}
		
		throw new IllegalArgumentException("No two numbers sum up to target number!");
		
		
	}
	
	public static int [] twoSumHashPass(int nums[], int target) {
		
		
		int size = nums.length;
		
		HashMap<Integer,Integer> hash1 = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			
			int complement = target - nums[i];
			
			if(hash1.containsKey(complement)) {
				
				return new int [] {i, hash1.get(complement)};
			}
			hash1.put(nums[i], i);
			
		}
		
		throw new IllegalArgumentException("No two numbers sum up to target number!");

		
	}

}
