package linearDS;

public class QueueLLDemo {

	public static void main(String[] args) {
		//Create QueueLL object
		QueueLL queue = new QueueLL();
		
		//Create a node with data=10 and add that node
		Node node = new Node();
		node.data=10;
		queue.add(node);
		queue.display();
		
		node = new Node();
		node.data=100;
		queue.add(node);
		queue.display();
		
		System.out.println(queue.remove().data+" is removed");
		queue.display();
	}

}
