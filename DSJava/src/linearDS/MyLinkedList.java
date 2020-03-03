package linearDS;

public class MyLinkedList {
	//head is used to keep the beginning node reference
	 Node head;
	 
	 public static  void main(String args[]) {
		 MyLinkedList list = new MyLinkedList();
		 //create a new node 
		 Node node = new Node();
		 node.data=300;
		 list.insertAtBegin(node);
		 node=new Node();
		 node.data=500;
		 list.insertAtBegin(node);
		 list.traverseList();
	 }
	 
	 /*
	  * method to insert a given node at the beginning
	  */
	public void insertAtBegin(Node node) {
		//check of empty case
		if(this.isEmpty()==true) {
			head=node;
		}
		else {
			node.next=head;
			head=node;
		}
		
	}
	
	/*
	 * method to insert a given node at the end
	 */
	public void insertAtEnd(Node node) {
		
	}
	
	/*
	 * method to insert a given node by given position
	 */
	
	public void insertByPositioin(Node node, int position) {
		
	}
	
	/*
	 * method to insert a given node by given data value of matching node
	 */
	public void insertByData(Node node, int data) {
		
	}
	
	/*
	 *method to delete a node from the beginning 
	 */
	public Node deleteFromBegin() {
		
		return null;
	}
	
	/*
	 * method to delete a node from the end 
	 * 
	 */
	public Node deleteFromEnd() {
		
		return null;
	}
	
	/*
	 * method to delete a node  given position
	 */
	public Node deleteByPosition(int position) {
		
		return null;
	}
	
	/*
	 * method to delete a node by given data value of a node
	 */
	public Node deleteByData(int data) {
		
		return null;
	}
	
	/*
	 * method to traverse all the nodes in the list
	 */
	public void traverseList() {
		if(isEmpty()==true) {
			System.out.println("List is Empty");
			return;
		}
		else {
			Node temp=this.head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
		}
	}
	
	/*
	 * method to search data
	 */
	public Node search(int data) {
		
		return null;
	}
	
	/*
	 * method to update data to a given position of a node 
	 */
	public boolean updateByPosition(int position) {
		
		return false;
	}
	
	/*
	 * method to update data value to a node
	 */
	public boolean updateByData(int oldData, int newData) {
		
		return false;
	}
	
	/*
	 * method to count total number of nodes in the list
	 */
	public int countNodes() {
		
		return 0;
	}
	
	/*
	 * method to check whether list is empty
	 */
	public boolean isEmpty() {
		if(this.head==null)
			return true;
		return false;
	}
}
