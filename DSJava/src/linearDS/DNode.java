package linearDS;

public class DNode {
	//data part
	int data;
	
	//link for previous node
	DNode prev;
	
	//link for next node
	DNode next;
	
	//zero parameter constructor
	public DNode() {
		this.data=0;
		this.prev=null;
		this.next=null;
	}
}
