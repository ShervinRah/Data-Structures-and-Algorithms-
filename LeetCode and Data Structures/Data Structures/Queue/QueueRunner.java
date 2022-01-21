package Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class QueueRunner {
	
	public static void main(String args []) {
		
	    Queue<Integer> q1 = new LinkedList<Integer>();
		
		Stack<Integer> s1 = new Stack();
		s1.add(4);
		s1.add(3);
		s1.add(7);
		
		System.out.println("Elements in Stack: " + s1);
		
		
	}

}
