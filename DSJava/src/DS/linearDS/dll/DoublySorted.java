package DS.linearDS.dll;

public class DoublySorted {
	DNode head;
	
	public static void main(String[] args) throws Exception{
		DoublySorted slist = new DoublySorted();
		DNode node = new DNode();	
		node.data=30;
		
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data=5;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 29;
		slist.insert(node);
		slist.traverse();
		
		
		node=new DNode();
		node.data= 35;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 29;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 29;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 20;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 40;
		slist.insert(node);
		slist.traverse();
		
		node = new DNode();	
		node.data=30;
		
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data=5;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 29;
		slist.insert(node);
		slist.traverse();
		
		
		node=new DNode();
		node.data= 35;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 29;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 29;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 20;
		slist.insert(node);
		slist.traverse();
		
		node=new DNode();
		node.data= 40;
		slist.insert(node);
		slist.traverse();
	}
	
	public void insert(DNode node) {
		//1. empty case, if yes assign node to head
		//and return
		if(isEmpty()==true) {
			head=node;
			return;
		}
		
		//2. non-empty only but node.data is lesser than head.data
		else if(countNodes()==1)
			if(head.data>node.data)
			{
				node.next=head;
				head.prev=node;
				head=node;
				return;
			}
			else {
				head.next=node;
				node.prev=head;
				return;
			}
		
		//3. non-empty node.data fits at any position 
		//initialize temp to head
		DNode temp = head;
		DNode t=null;
		//traverse till last node or temp.data<=node.data
		while( temp.next!=null) {
			if(temp.data > node.data)
				break;
			t=temp;
			temp = temp.next;
		}
			
		if(temp.next!=null) {
			node.next=temp;
			node.prev=t;
			t.next=node;
			temp.prev=node;
		}
		else if(temp.data<node.data){
			node.prev=temp;
			temp.next=node;
		}
		else {
			node.next=temp;
			node.prev=t;
			temp.prev=node;
			t.next=node;
		}
		
	}
	
	/*
	 * Traversal of nodes in the list
	 */
	public void traverse() {
		if(this.isEmpty()==true) {
			System.out.println("List is Empty!!!");
			return;
		}
		DNode temp=head;
		System.out.println();
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		//System.out.print("null");
	}
	
	/*
	 * count the nodes in the list
	 */
	public int countNodes() {
		DNode temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
