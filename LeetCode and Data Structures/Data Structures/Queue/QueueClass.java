package Queue;

public class QueueClass {
	
	public static void main (String args[]) {
		
		QueueClassed que = new QueueClassed();
		que.enQueue(5);
		que.enQueue(3);
		que.enQueue(8);
		que.enQueue(6);
		que.enQueue(1);
		//que.show();
		//System.out.println();
		que.deQueue();
		//que.show();
		que.deQueue();
		que.show();
		
		
	}
	
}

class QueueClassed{
	
	int queue [] = new int [5];
	int size;
	int front; 
	int rear;
	
	public void enQueue(int data) {
		
		queue[rear] = data;
		rear++;
		size++;
		
	}
	public int deQueue() {
		
		int data = queue[front];
		front++;
		size--;
		
		
		return data;
		
	}
	
	public void show() {
		
		for(int i = 0; i < size; i++) {
			
			System.out.print(queue[front + i] + " ");
		}
	}
	
}