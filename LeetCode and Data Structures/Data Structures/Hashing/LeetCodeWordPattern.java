package Hashing;
import java.util.Arrays;
import java.util.HashMap;

public class LeetCodeWordPattern {
	
	public static void main (String arg[]) {
		
		String pattern = "abba";
		String word = "doge cat cat dogeg";
		
		String sArr [] = word.split(" ", 3);
		
		for(int i = 0; i < sArr.length; i++) {
			
			//System.out.println(sArr[i]);
		}
		
		System.out.println(Arrays.toString(sArr));
		
		boolean isTrue = isPattern(pattern,word);
		System.out.println(isTrue);
		

	}
	
	public static boolean isPattern(String pattern, String words) {
		
		
		String split_words [] = words.split(" ");
		
		if(split_words.length != pattern.length()) {
			
			return false;
		}
		
		HashMap<Character, String> word_map = new HashMap<Character,String>();
		
		for(int i = 0; i < pattern.length(); i++) {
			
			char curr_char = pattern.charAt(i);
			
			if(word_map.containsKey(curr_char)) {
				
				if(!word_map.get(curr_char).equals(split_words[i])){
					
					return false;
					
				}
			}
			else {
				
				if(word_map.containsValue(split_words[i])) {
					
					return false; 
				}
			}
			
			word_map.put(curr_char, split_words[i]);
		}
		
		return true;
		
		
	}

}
