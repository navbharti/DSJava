package linearDS;

public class Queue {
	int arr[];
	final int SIZE;
	int FRONT;
	int REAR;
	
	public Queue(int capacity) {
		SIZE = capacity;
		arr = new int[SIZE];
		FRONT = -1;
		REAR = -1;
	}
	
	/*
	 * method to add element from REAR
	 */
	public void add(int data) {
		 if(isFull()==true) {
			System.out.println("Queue is full!!!");
			return;
		 }
		else if(isEmpty()==true) {
			FRONT=0;
			REAR=0;
			arr[REAR]=data;
			return;
		}
		
		REAR++;
		arr[REAR]=data;
		
	}
	
	/*
	 * method to remove element from FRONT
	 */
	public int remove() {
		int data;
		if(isEmpty()==true) {
			System.out.println("Queue is Empty!!!");
			return -1;
		}
		else if(FRONT==REAR) {
			data = arr[FRONT];
			FRONT=-1;
			REAR=-1;
			return data;
		}
		
		data = arr[FRONT];
		FRONT++;
		return data;
	}
	
	/*
	 * method to display elements of Queue
	 */
	public void display() {
		if(isEmpty()==true) {
			System.out.println("Queue is Empty!!!");
			return;
		}
		System.out.print("Queue: ");
		for(int i=FRONT; i<=REAR; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}
	
	/*
	 * method to check empty case
	 */
	public boolean isEmpty() {
		if(FRONT==-1)
			return true;
		return false;
	}
	
	/*
	 * method to check for full case
	 */
	public boolean isFull() {
		if(REAR==SIZE-1)
			return true;
		return false;
	}

}
