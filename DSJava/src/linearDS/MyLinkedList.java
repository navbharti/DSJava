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
		 //output: 500->300->
		 
		 //insert a node at the end of the list
		 node = new Node();
		 node.data=150;
		 list.insertAtEnd(node);
		 System.out.println();
		 list.traverseList();
		 //output: 500->300->150->
		 
		 //insert a node at position=2
		 int pos=2;
		 node=new Node();
		 node.data=175;
		 list.insertByPositioin(node, pos);
		 System.out.println();
		 list.traverseList();
		 //output: 500->175->300->150->
		 
		 //insert a node after data 175
		 int data=175;
		 node=new Node();
		 node.data = 1500;
		 list.insertByData(node, data);
		 System.out.println();
		 list.traverseList();
		 //output: 500->175->1500->300->150->
		 
		 //delete the first node
		 node = list.deleteFromBegin();
		 System.out.println();
		 System.out.println(node.data+" is deleted!!!");
		 list.traverseList();
		 //output: 500 is deleted!!!
		 //175->1500->300->150->
		 
		 //delete the last node
		 node=list.deleteFromEnd();
		 System.out.println();
		 System.out.println(node.data+" is deleted!!!");
		 list.traverseList();
		 //output: 150 is deleted!!!
		 //175->1500->300->
		 
		 //delete the node by position=2
		 pos=2;
		 node=list.deleteByPosition(pos);
		 System.out.println();
		 System.out.println(node.data+" is deleted!!!");
		 list.traverseList();
		 //output: 1500 is deleted!!!
		 //175->300->
		 
		 //search key=300
		 data=300;
		 node=list.search(data);
		 System.out.println();
		 if(node==null)
			 System.out.println("Key not found!!!");
		 else
			 System.out.println("Key is found location: "+node+", data: "+node.data);
	 
		 //update data value of pos=2 to 400
		 pos=2;
		 data = 400;
		 System.out.println(list.updateByPosition(data, pos));
		 list.traverseList();
		 //output: true
		 //300->400->
		 
		 //update data value of oldData=175 to newData=1500
		 data=175;
		 int newData = 1500;
		 System.out.println();
		 System.out.println(list.updateByData(data, newData));
		 list.traverseList();
		 //output: true
		 //1500->400->
				 
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
		//initialize temp node with head
		Node temp=head;
		
		//traverse till the end
		while(temp.next!=null)
			temp=temp.next;
		
		temp.next=node;
		
	}
	
	/*
	 * method to insert a given node by given position
	 */
	
	public void insertByPositioin(Node node, int position) {
		int count=1;
		Node temp=head;
		while(temp!=null) {
			if(count==position-1)
				break;
			temp = temp.next;
		}
		node.next=temp.next;
		temp.next=node;
	}
	
	/*
	 * method to insert a given node by given data value of matching node
	 */
	public void insertByData(Node node, int data) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==data)
				break;
			temp = temp.next;
		}
		node.next=temp.next;
		temp.next=node;
	}
	
	/*
	 *method to delete a node from the beginning 
	 */
	public Node deleteFromBegin() {
		if(this.isEmpty()==true) {
			System.out.println("List is Empty...Deletion is not Possible!!!");
			return null;
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	
	/*
	 * method to delete a node from the end 
	 * 
	 */
	public Node deleteFromEnd() {
		if(this.isEmpty()==true) {
			System.out.println("List is Empty...Deletion is not Possible!!!");
			return null;
		}
		Node temp=head;
		while(temp.next.next!=null)
			temp=temp.next;
		Node n=temp.next;
		temp.next=null;
		n.next=null;
		return n;
	}
	
	/*
	 * method to delete a node  given position
	 */
	public Node deleteByPosition(int position) {
		if(this.isEmpty()==true) {
			System.out.println("List is Empty...Deletion is not possible!!!");
			return null;
		}
		Node temp=head;
		int count=0;
		while(temp.next!=null) {
			count++;
			if(count==position-1)
				break;
			temp=temp.next;
		}
		Node n=temp.next;
		temp.next=temp.next.next;
		n.next=null;
		return n;
	}
	
	/*
	 * method to delete a node by given data value of a node
	 */
	public Node deleteByData(int data) {
		if(this.isEmpty()==true) {
			System.out.println("List is Empty...Deletion is not possible!!!");
			return null;
		}
		Node temp=head;
		while(temp.next!=null) {
			if(temp.data==data)
				break;
			temp=temp.next;
		}
		Node n=temp.next;
		temp.next=temp.next.next;
		n.next=null;
		return n;
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
		if(this.isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		Node temp=head;
		boolean flag=false;
		while(temp!=null) {
			if(temp.data==data) {
				flag=true;
				break;
			}
			temp=temp.next;
		}
		if(flag==true)
			return temp;
		else
			return null;
	}
	
	/*
	 * method to update data to a given position of a node 
	 */
	public boolean updateByPosition(int data, int position) {
		if(this.isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return false;
		}
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			if(count==position)
				break;
			temp=temp.next;
		}
		temp.data=data;
		return true;
	}
	
	/*
	 * method to update data value to a node
	 */
	public boolean updateByData(int oldData, int newData) {
		if(this.isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return false;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.data==oldData)
				break;
		}
		temp.data=newData;
		return true;
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
