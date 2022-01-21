package Queue;

public class Queue{
	
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) { // to insert to Queue
		
		 queue[rear] = data;
		 rear++; // rear = rear + 1;
		 size++; // size = size + 1;
	}
	
	public void show() {
		
		System.out.print("Elements in Queue: [");
		
		for(int i = 0; i < size; i++) {
			
			System.out.print(" " + queue[i] + " ");
		}
		
		System.out.println("]");
		
	}

}
