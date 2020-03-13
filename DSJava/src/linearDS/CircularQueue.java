package linearDS;

public class CircularQueue {
	final int SIZE;
	int FRONT;
	int REAR;
	int arr[];
	
	public static void main(String args[]) {
		CircularQueue queue = new CircularQueue(5);
		queue.enQueue(10);
		System.out.println("FRONT: "+queue.getFront()+" FRONT: "+queue.getRear());
		queue.enQueue(20);
		System.out.println("FRONT: "+queue.getFront()+" FRONT: "+queue.getRear());
		queue.enQueue(30);
		System.out.println("FRONT: "+queue.getFront()+" FRONT: "+queue.getRear());
		queue.enQueue(40);
		System.out.println("FRONT: "+queue.getFront()+" FRONT: "+queue.getRear());
		queue.enQueue(50);
		System.out.println("FRONT: "+queue.getFront()+" FRONT: "+queue.getRear());
		
		queue.enQueue(60);
		System.out.println("FRONT: "+queue.getFront()+" FRONT: "+queue.getRear());
		queue.deQueue();
		queue.enQueue(60);
		System.out.println("FRONT: "+queue.getFront()+" FRONT: "+queue.getRear());
		
		//queue.deQueue();
		queue.display();
		System.out.println("Total count: "+queue.count());
	}
	
	public CircularQueue(int capacity) {
		SIZE = capacity;
		FRONT = -1;
		REAR = -1;
		arr = new int[SIZE];
	}

	/*
	 * enQueue operation
	 */
	public void enQueue(int data) {
		if(isFull()==true) {
			System.out.println("Queue is Full!!!");
			return;
		}
		else if(isEmpty()==true) {
			FRONT = 0;
			REAR = 0;
			arr[REAR] = data;
		}
		else if(REAR==SIZE-1 && FRONT!=0) {
			REAR=0;
			arr[REAR]=data;
		}
		else {
			REAR++;
			arr[REAR]=data;
		}
		
	}
	
	/*
	 * deQueue operation
	 */
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!!");
			return -1;
		}
		else if(REAR==FRONT) {
			int data = arr[FRONT];
			FRONT=-1;
			REAR =-1;
			return data;
		}
		else if(FRONT==SIZE-1) {
			int data = arr[FRONT];
			FRONT=0;
			return data;
		}
		else {
			int data = arr[FRONT];
			FRONT++;
			return data;
		}
	}
	
	/*
	 * display operation
	 */
	
	public void display() {
		int i;
	    if(isEmpty()) {
	    	System.out.println("Queue is Empty!!!");
	    	return;
	    	}
	    
	    	System.out.print("FRONT: "+FRONT+" [");
	        for( i = FRONT; i!=REAR; i=(i+1)%SIZE) {
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println(arr[i]+"] REAR: "+REAR);
	    }
	
	/*
	 * count total element
	 */
	public int count() {
		int i,c=0;;
	    if(isEmpty()) {
	    	System.out.println("Queue is Empty!!!");
	    	return 0;
	    	}
	    
	        for( i = FRONT; i!=REAR; i=(i+1)%SIZE) {
	        	c++;
	        }
		return c+1;
	}
	
	/*
	 * getFront operation
	 */
	public int getFront() {
		if(!isEmpty()) 
			return arr[FRONT];
		return -1;
	}
	
	/*
	 * getRear operation
	 */
	public int getRear() {
		if(!isEmpty())
			return arr[REAR];
		return -1;
	}
	
	/*
	 * isFull operation
	 */
	public boolean isFull() {
		if((REAR==SIZE-1 && FRONT==0)||(REAR==FRONT-1))
			return true;
		return false;
	}
	
	/*
	 * isEmpty operation
	 */
	public boolean isEmpty() {
		if(FRONT==-1)
			return true;
		return false;
	}
}
