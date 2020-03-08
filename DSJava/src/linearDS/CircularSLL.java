package linearDS;

public class CircularSLL {

	Node head;
	
	/*
	 * main method
	 */
	public static void main(String args[]) {
		CircularSLL list = new CircularSLL();
		
		//check for Empty case
		System.out.println(list.isEmpty());
		
		//Create a node with data=10
		Node node = new Node();
		node.data=10;
		list.insertAtBegin(node);
		list.traverse();
		
		//insertAtBegin
		node = new Node();
		node.data=20;
		list.insertAtBegin(node);
		list.traverse();
		
		//insertAtEnd
		node = new Node();
		node.data=200;
		list.insertAtEnd(node);
		list.traverse();
		
		//insertAtPosition
		node = new Node();
		node.data=250;
		int position=3;
		list.insertByPosition(node, position);
		list.traverse();
		
		//insertAtData
		node = new Node();
		node.data=220;
		int data=250;
		list.insertByData(node, data);
		list.traverse();
		
		//countNode
		System.out.println("\nTotal nodes: "+list.countNodes());
				
		//search 250
		System.out.println("\nSearch 220 at: "+list.search(250));
				
		//deleteFromBegin
		node = list.deleteFromBegin();
		System.out.println("\nDeleted node: "+node);
		list.traverse();
		
		//deleteFromEnd
		node = list.deleteFromEnd();
		System.out.println("\nDeleted node: "+node);
		list.traverse();
		
		//deleteByPosition
		node = list.deleteByPosition(2);
		System.out.println("\nDeleted node: "+node);
		list.traverse();
		
		//deleteByData
		node=list.deleteByData(10);
		System.out.println("\nDeleted node: "+node);
		list.traverse();
		
		//countNode
		System.out.println("\nTotal nodes: "+list.countNodes());
		
		//search 220
		System.out.println("\nSearch 220 at: "+list.search(220));
	}
	
	/*
	 * method to insertAtBegin
	 */
	public void insertAtBegin(Node node) {
		//check for empty case, if yes add node as first node 
		if(this.isEmpty()==true) {
			head=node;
			node.next=head;
			return;
		}
		
		//initialize temp node to head node
		Node temp=head;
		
		//Repeat till temp.next is not head
		while(temp.next!=head)
			temp=temp.next;
		
		//change references of last node and new node
		temp.next=node;
		node.next=head;
		head=node;
	}
	
	/*
	 * method to insertAtEnd
	 */
	public void insertAtEnd(Node node) {
		if(isEmpty()==true) {
			head=node;
			node.next=head;
			return;
		}
		
		Node temp = head;
		while(temp.next!=head)
			temp = temp.next;
		node.next=temp.next;
		temp.next=node;
	}
	
	/*
	 * method to insertByPosition
	 */
	public void insertByPosition(Node node, int position) {
		if(isEmpty()==true) {
			head=node;
			node.next=head;
			return;
		}
		
		int count=0;
		Node temp=head;
		
		while(temp.next!=head) {
			count++;
			if(count==position-1)
				break;
			temp = temp.next;
		}
		
		node.next=temp.next;
		temp.next=node;
	}
	
	/*
	 * method to insertByData
	 */
	public void insertByData(Node node, int data) {
		if(isEmpty()==true) {
			head=node;
			node.next=head;
			return;
		}
		
		Node temp=head;
		
		while(temp.next!=head) {
			if(temp.data==data)
				break;
			temp = temp.next;
		}
		
		node.next=temp.next;
		temp.next=node;
	}
	
	/*
	 * method to deleteFromBegin
	 */
	public Node deleteFromBegin() {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		
		Node temp = head;
		while(temp.next!=head)
			temp = temp.next;
		Node n = head;
		head = head.next;
		temp.next=head;
		n.next=null;
		return n;
	}
	
	/*
	 * method to deleteFromEnd
	 */
	public Node deleteFromEnd() {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		
		Node temp=head;
		Node n=null;
		while(temp.next!=head) {
			n=temp;
			temp = temp.next;
		}
			
		n.next=head;
		temp.next=null;
		return temp;
	}
	
	/*
	 * method to deleteByPosition
	 */
	public Node deleteByPosition(int position) {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		if(position==1) {
			return deleteFromBegin();
		}
		
		Node temp = head;
		Node n=null;
		int pos = 0;
		while(temp.next!=head) {
			pos++;
			if(pos==position)
				break;
			n=temp;
			temp = temp.next;
		}
		
		n.next = temp.next;
		temp.next=null;
		return temp;
	}
	
	/*
	 * method to deleteByData
	 */
	public Node deleteByData(int data) {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		
		if(data==head.data)
			return deleteFromBegin();
		Node temp=head;
		Node n=null;
		while(temp.next!=head) {
			if(temp.data==data)
				break;
			n=temp;
			temp = temp.next;
		}
		
		n.next=temp.next;
		temp.next=null;
		return temp;
	}
	
	/*
	 * method to countNodes
	 */
	public int countNodes() {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return -1;
		}
		
		Node temp=head;
		int count =0;
		while(temp.next!=head) {
			count++;
			temp = temp.next;
		}
		
		return ++count;
	}
	
	/*
	 * method to traverse
	 */
	public void traverse() {
		if(this.isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return;
		}
		
		//initialize temp node to head node
		Node temp=head;
		System.out.println();
		
		//Repeat till temp.next is not head
		while(temp.next!=head) {
			//Each iteration print the data of temp and to to next node
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
		//print the data of last node
		System.out.print(temp.data+"->null");
	}
	
	/*
	 * method to search
	 */
	public int search(int data) {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return -1;
		}
		
		if(head.data==data)
			return 1;
		
		Node temp=head;
		int count =0;
		while(temp.next!=head) {
			count++;
			if(temp.data==data)
				break;
			temp = temp.next;
		}
		return count;
	}
	
	/*
	 * method to update data of a given position
	 */
	public boolean updateBegin(int newData) {
		
		return false;
	}
	
	/*
	 * method to update data of a given oldData value
	 */
	public boolean updateEnd(int oldData, int newData) {
		
		return false;
	}
	
	/*
	 * method to update data of a given position
	 */
	public boolean updateByPosition(int newData) {
		
		return false;
	}
	
	/*
	 * method to update data of a given oldData value
	 */
	public boolean updateByData(int oldData, int newData) {
		
		return false;
	}
	
	/*
	 * method to check Circular Linked List Empty case
	 */
	public boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
}
