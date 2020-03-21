package DS.linearDS.dll;

public class DNode {
	//data part
	public int data;
	
	//link for previous node
	public DNode prev;
	
	//link for next node
	public DNode next;
	
	//zero parameter constructor
	public DNode() {
		this.data=0;
		this.prev=null;
		this.next=null;
	}
}
