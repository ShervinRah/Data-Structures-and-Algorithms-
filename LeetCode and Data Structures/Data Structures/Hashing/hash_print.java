package Hashing;
import java.util.*;

public class hash_print {
	
	public static void main (String args[]) {
		
		int nums [] = new int [] {4, 6, 7, 9};
		String str [] = {"Shervin", "Angelo", "Tadeh", "Shima"};
		
		HashMap<String,Integer> hash_map = new HashMap<String, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			
			hash_map.put(str[i], nums[i]);
		}
		
		System.out.println(hash_map);
	}

}
