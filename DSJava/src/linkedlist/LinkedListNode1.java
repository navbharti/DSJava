package linkedlist;

public class LinkedListNode1 {
	static Node1 head;
	public static void main(String[] args) {
		head=new Node1(10);
		System.out.println(head+" : "+head.data);
		head.next=new Node1(20);
		System.out.println(head.next+" : "+head.next.data);
		head.next.next=new Node1(30);
		System.out.println(head.next.next+" : "+head.next.next.data);
	LinkedListNode1 list= new LinkedListNode1();
	System.out.println(list.head);
	list.insertEnd(new Node1(100));
	list.show();
	list.insertBegin(new Node1(500));
	System.out.println();
	list.show();
	list.insertMiddle(new Node1(5000), 10);
	System.out.println();
	list.show();
	
	System.out.println("Total Nodes: "+list.count());
	
	Node1 n = list.deleteFromBegin();
	System.out.println(n.data+" is deleted!!!");
	n=null;
	
	list.show();
	
	n=list.deleteFromEnd();
	System.out.println();
	System.out.println(n.data+" is deleted!!!");
	n=null;
	
	list.show();
	System.out.println();
	
	list.show1(head);
	}

	public void insertEnd(Node1 node) {
		if(this.head==null)
			this.head=node;
		
		else {
			Node1 temp=this.head;
			while(temp!=null)
				temp=temp.next;
			temp=node;
		}
	}
	
	public void insertBegin(Node1 node) {
		node.next=head;
		head=node;
	}
	
	public void insertMiddle(Node1 node, int pos) {
		Node1 temp=this.head;
		int i=1;
		while(i<pos-1&&temp.next!=null) {
			temp = temp.next;
			i++;
		}
		node.next=temp.next;
		temp.next=node;
	}
	
	/*
	 * delete from begin
	 */
	public Node1 deleteFromBegin() {
		Node1 temp=head;
		head=head.next;
		return temp;
	}
	
	/*
	 * delete from end
	 */
	public Node1 deleteFromEnd() {
		Node1 temp=head;
		Node1 n=head;
		while(temp.next!=null) {
			n=temp;
			temp=temp.next;
		}
			
		n.next=null;
		return temp;
	}
	public int count() {
		int c=0;
		Node1 temp=head;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
	}
	public void show() {
		if(this.head==null) {
			System.out.println("LinkedList is Empty!!!");
			return;
		}
		Node1 temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp= temp.next;
		}
	}
	
	/*
	 * method to print the list in reverse order
	 */
	public void show1(Node1 node) {
		if(node==null) {
			return;
		}
		show1(node.next);
		System.out.print(node.data+"->");
			
	}
}
