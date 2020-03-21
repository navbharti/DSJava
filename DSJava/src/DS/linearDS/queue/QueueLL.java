package DS.linearDS.queue;

import linearDS.Node;

public class QueueLL {
	Node FRONT;
	Node REAR;
	
	/*
	 * method to add a node to REAR
	 */
	public void add(Node node) {
		if(isEmpty()==true) {
			FRONT = node;
			REAR = node;
			return;
		}
		
		REAR.next=node;
		REAR = node;
		
	}
	
	/*
	 * method to remove a node from FRONT
	 */
	public Node remove() {
		if(isEmpty()==true) {
			System.out.println("Queue is Empty!!!");
			return null;
		}
		else if(FRONT==REAR) {
			Node temp=FRONT;
			FRONT=null;
			REAR=null;
			return temp;
		}
		
		Node temp=FRONT;
		FRONT = FRONT.next;
		temp.next=null;
		return temp;
	}
	
	/*
	 * method to display Queue data
	 */
	public void display() {
		if(isEmpty()==true) {
			System.out.println("Queue is Empty!!!");
			return;
		}
		
		System.out.print("Queue: ");
		for(Node temp=FRONT; temp!=null; temp=temp.next)
			System.out.print(temp.data+" ");
		System.out.println();
	}
	
	/*
	 * method to check for Empty case
	 */
	public boolean isEmpty() {
		if(FRONT == null)
			return true;
		return false;
	}
}
