package Heap;

import java.util.PriorityQueue;
import java.util.*;

class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> max_heap;
    PriorityQueue<Integer> min_heap;
    
    public MedianFinder() {
        max_heap = new PriorityQueue<>(Collections.reverseOrder());          // put the data in decreasing order
        min_heap = new PriorityQueue<>();            // put data in increasing order
    }
    
    public void addNum(int num){
    	
        if(max_heap.isEmpty() && min_heap.isEmpty()){                 // if both empty add in small
           
        	max_heap.add(num);
            findMedian();       
            return;
        }
        
        if(max_heap.size() > min_heap.size()){                     // if small size is greater then num must be added to large
            
        	if(num > max_heap.peek()){
                min_heap.add(num);
            }else{
                min_heap.add(max_heap.poll());                // if largest of small queue is greater than num then poll and add this to large and then add num to small
                max_heap.add(num);
            }
        }
        else{
            
        	if(num < min_heap.peek()){
                max_heap.add(num);
            }else{
                max_heap.add(min_heap.poll());
                min_heap.add(num);
            }
        }
        
        findMedian();
    }
    
    public double findMedian() {
        if(max_heap.size() == min_heap.size()){
            return (max_heap.peek() + min_heap.peek())/2.0;           // if large and small elements are equal numbered then avg will be median
        }else{
            return max_heap.peek();                // else return top element of small  (biggest of small queue)
        }
    }
}
public class HeapMedian{
	
        public static void main(String args[]) {
                MedianFinder obj = new MedianFinder();
                Random r = new Random();
                for(int i=0;i<7;i++)
                {
                        int rand = r.nextInt(30)+1;
                        obj.addNum(rand);
                        System.out.print(rand+" ");
                }
                System.out.println();
                System.out.println("Median is: "+obj.findMedian());
        }
}
