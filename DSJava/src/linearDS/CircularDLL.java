package linearDS;

public class CircularDLL {

	DNode head;
	//DNode tail;
	public static void main(String args[]) {
		CircularDLL list = new CircularDLL();
		list.traverse();
		
		//insert a node at beginning
		DNode node = new DNode();
		node.data=10;
		list.insertAtBegin(node);
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		//insert a node at beginning
		node = new DNode();
		node.data=100;
		list.insertAtBegin(node);
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		//insert a node at beginning
		node = new DNode();
		node.data=105;
		list.insertAtBegin(node);
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		//insert a node at end
		node = new DNode();
		node.data=120;
		list.insertAtEnd(node);
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		//insert a node at end
		node = new DNode();
		node.data=115;
		list.insertAtEnd(node);
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		//insert a node at end
		node = new DNode();
		node.data=145;
		list.insertAtEnd(node);
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		
		//insert a node at position=3
		int position = 3;
		node = new DNode();
		node.data=165;
		list.insertByPosition(node, position);
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		
		//insert a node by data value 165
		int data = 165;
		node = new DNode();
		node.data=195;
		list.insertByData(node, data);
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		//delete from beginning
		node = list.deleteFromBegin();
		System.out.println(node.data+" is deleted");
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		//delete from last
		node = list.deleteFromEnd();
		System.out.println(node.data+" is deleted");
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		
		//delete from position=2
		node = list.deleteByPosition(2);
		System.out.println(node.data+" is deleted");
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		
		//delete a node by given data value
		node = list.deleteByData(195);
		System.out.println(node.data+" is deleted");
		list.traverse();
		//System.out.println("Reverse: ");list.reverseTraversal();
		
		//count node 
		System.out.println(list.countNodes()+" node are connected");
		
		//traverse reverse
		System.out.println("Reverse order");
		list.reverseTraversal();
		
		//search the key data=120
		System.out.println(list.search(120)+" search");
		
		//update by position=2 to newData=130
		list.updateByPosition(130, 2);
		list.traverse();
		
		//update by oldData=130 to newData=180
		list.updateByData(130, 180);
		list.traverse();
		
		//update by oldData=130 to newData=180
		list.updateBegin(500);
		list.traverse();
		
		//update by oldData=130 to newData=180
		list.updateEnd(1000);
		list.traverse();
}
	
	/*
	 * method to insertAtBegin
	 */
	public void insertAtBegin(DNode node) {
		if(isEmpty()==true) {
			head=node;
			//tail=node;
			node.next=head;
			node.prev=head;
			return;
		}
		
		node.prev = head.prev;
		node.next = head;
		head.prev.next = node;
		head.prev = node;
		head = node;

	}
	
	/*
	 * method to insertAtEnd
	 */
	public void insertAtEnd(DNode node) {
		if(isEmpty()==true) {
			head=node;
			//tail=node;
			node.next=head;
			node.prev=head;
			return;
		}
		/*
		DNode temp = head;
		while(temp.next!=head)
			temp = temp.next;
		*/
		node.prev=head.prev;
		node.next=head;
		head.prev.next=node;
		head.prev=node;
		
		
	}
	
	/*
	 * method to insertByPosition
	 */
	public void insertByPosition(DNode node, int position) {
		if(isEmpty()==true) {
			head=node;
			//tail=node;
			node.next=head;
			node.prev=head;
			return;
		}
		
		DNode temp=head;
		DNode n=null;
		int count=0;
		while(temp.next!=head) {
			count++;
			if(count==position)
				break;
			n = temp;
			temp=temp.next;
		}
		
		node.prev=n;
		node.next=temp;
		n.next=node;
		temp.prev=node;
		
	}
	
	/*
	 * method to insertByData
	 */
	public void insertByData(DNode node, int data) {
		//Empty case
		if(isEmpty()==true) {
			head=node;
			//tail=node;
			node.next=head;
			node.prev=head;
			return;
		}
		
		DNode temp=head;
		while(temp.next!=head) {
			if(temp.data==data)
				break;
			temp = temp.next;
		}
		
		node.prev=temp;
		node.next=temp.next;
		temp.next.prev=node;
		temp.next=node;
	}
	
	/*
	 * method to deleteFromBegin
	 */
	public DNode deleteFromBegin() {
		//Empty case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		
		//non Empty case and only one node
		if(head.next==head) {
			DNode temp = head;
			head = null;
			return temp;
		}
		
		//non Empty case and two or more nodes
		DNode temp = head;
		head = head.next;
		temp.prev.next=head;
		head.prev=temp.prev;
		
		temp.prev=null;
		temp.next=null;
		
		return temp;
	}
	
	/*
	 * method to deleteFromEnd
	 */
	public DNode deleteFromEnd() {
		//Empty case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		
		//Only one case
		if(head.next==head) {
			DNode temp=head;
			head=null;
			return temp;
		}
		
		//two or more node case
		DNode temp=head.prev;
		temp.prev.next=head;
		head.prev=temp.prev;
		
		temp.prev=null;
		temp.next=null;
		return temp;
	}
	
	/*
	 * method to deleteByPosition
	 */
	public DNode deleteByPosition(int position) {
		//Empty case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		
		//Only one node case
		if(head.next==head) {
			DNode temp=head;
			head=null;
			return temp;
		}
		
		//two or more node case
		DNode temp = head;
		DNode n=null;
		int count=0;
		while(temp.next!=head) {
			count++;
			if(count==position)
				break;
			n=temp;
			temp = temp.next;
			
		}
		
		n.next=temp.next;
		temp.next.prev=n;
		return temp;
	}
	
	/*
	 * method to deleteByData
	 */
	public DNode deleteByData(int data) {
		//Empty case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		
		//Only one node case
		if(head.next==head) {
			DNode temp = head;
			head=null;
			return temp;
		}
		
		//two or more node case
		DNode temp = head;
		DNode n=null;
		while(temp.next!=null) {
			if(temp.data==data)
				break;
			n=temp;
			temp = temp.next;
		}
		
		//Change the references
		n.next = temp.next;
		temp.next.prev = n;
		return temp;
	}
	
	/*
	 * method to countNodes
	 */
	public int countNodes() {
		//Empty case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return 0;
		}
		
		//non Empty case
		int count=0;
		DNode temp = head;
		while(temp.next!=head) {
			count++;
			temp = temp.next;
		}
		return count+1;
	}
	
	/*
	 * method to traverse
	 */
	public void traverse() {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return;
		}
		DNode temp=head;
			
		while(temp.next!=head) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	/*
	 * method to reverse traversal
	 */
	public void reverseTraversal() {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return;
		}
		
		//otherwise case, assign head to temp and traverse back using previous referende.
		DNode temp = head.prev;
		while(temp!=head) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
		System.out.println(temp.data);
	}
	
	/*
	 * method to search
	 */
	public DNode search(int data) {
		//Empty case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return null;
		}
		
		DNode temp = head;
		while(temp.next!=head) {
			if(temp.data==data)
				break;
			temp = temp.next;
		}
		return temp;
	}
	
	/*
	 * method to update first node data value
	 */
	public boolean updateBegin(int newData) {
		//Empty Case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return false;
		}
		
		head.data = newData;
		return true;
	}
	
	/*
	 * method to update last node data value
	 */
	public boolean updateEnd(int newData) {
		//Empty Case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return false;
		}
		
		head.prev.data = newData;
		return true;
	}
	/*
	 * method to update data of a given position
	 */
	public boolean updateByPosition(int newData, int position) {
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return false;
		}
		
		DNode temp = head;
		int count = 0;
		while(temp.next!=head) {
			count++;
			if(count==position) {
				temp.data=newData;
				return true;
			}
			
			temp = temp.next;
		}
		
		return false;
	}
	
	/*
	 * method to update data of a given oldData value
	 */
	public boolean updateByData(int oldData, int newData) {
		//Empty case
		if(isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return false;
		}
		
		DNode temp = head;
		while(temp.next!=head) {
			if(temp.data==oldData) {
				temp.data = newData;
				return true;
			}
			
			temp = temp.next;
		}
		
		
		return false;
	}
	
	/*
	 * method to chick list is empty or not
	 */
	public boolean isEmpty() {
		if(head==null)
			return true;
			return false;
	}
}
