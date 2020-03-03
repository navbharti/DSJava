package linearDS;

public class MyLinkedList {
	 Node head;
	 public static  void main(String args[]) {
		 MyLinkedList list = new MyLinkedList();
		 //create a new node 
		 Node node = new Node();
		 node.data=300;
		 list.insertBegin(node);
		 node=new Node();
		 node.data=500;
		 list.insertBegin(node);
		 list.traverseList();
	 }
	public void insertBegin(Node node) {
		
		if(head==null) {
			head=node;
		}
		else {
			node.next=head;
			head=node;
		}
		
	}
	
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
	
	public boolean isEmpty() {
		if(this.head==null)
			return true;
		return false;
	}
}
