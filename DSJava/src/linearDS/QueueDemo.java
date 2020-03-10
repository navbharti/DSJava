package linearDS;

public class QueueDemo {

	public static void main(String[] args) {
		//Create Queue object queue
		Queue queue = new Queue(5);
		
		//add element
		queue.add(10);
		queue.display();
		queue.add(20);
		queue.add(30);
		queue.display();
		
		System.out.println(queue.remove()+" is removed");
		queue.display();
		System.out.println(queue.remove()+" is removed");
		queue.display();
	}

}
