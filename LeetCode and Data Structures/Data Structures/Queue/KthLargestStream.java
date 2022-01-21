package Queue;
import java.util.*;


class KthLargestStream {
	
	PriorityQueue<Integer> min_heap = new PriorityQueue<>();

	public int add_stream(int num, int k) {
		
		if(min_heap.size() < k) {
			
			min_heap.add(num);
			return min_heap.size() == k ? min_heap.peek() : -1;

		}
		if(num > min_heap.peek()) {
			
			min_heap.poll();
			min_heap.add(num);
		}
		
		return min_heap.peek();
	}
	
	public static void main (String args[]) {
		

		KthLargestStream stream1 = new KthLargestStream();
		
		int [] arr = new int [] {10, 7, 11, 5, 27, 8, 9, 45};
		int k = 3;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(stream1.add_stream(arr[i], k));
		}
		
	}
}
