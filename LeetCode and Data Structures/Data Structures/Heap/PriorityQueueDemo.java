package Heap;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String args[])
    {
        // Creating an empty PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> reverse = new PriorityQueue<Integer>(Collections.reverseOrder());
  
        // Use add() method to add elements into the Queue
        queue.add(10);
        queue.add(15);
        queue.add(30);
        queue.add(20);
        queue.add(5);
        
        reverse.add(10);
        reverse.add(15);
        reverse.add(30);
        reverse.add(20);
        reverse.add(5);
  
        // Displaying the PriorityQueue
        System.out.println("Initial PriorityQueue: " + queue);
  
        // Fetching the element at the head of the queue
        System.out.println("The element at the head of the"
                           + " queue is: " + queue.peek());
  
        // Displaying the Queue after the Operation
        System.out.println("Final PriorityQueue: " + queue);
        
        // Displaying the PriorityQueue
        System.out.println("Initial PriorityQueue: " + reverse);
  
        // Fetching the element at the head of the queue
        System.out.println("The element at the head of the"
                           + " queue is: " + reverse.peek());
  
        // Displaying the Queue after the Operation
        System.out.println("Final PriorityQueue: " + reverse);
    }
}
