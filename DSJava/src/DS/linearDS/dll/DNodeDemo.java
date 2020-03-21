package DS.linearDS.dll;

public class DNodeDemo {

	public static void main(String[] args) {
		//Create reference of DNode
		DNode head;
		
		//Create a node n
		DNode n=new DNode();
		n.data=100;
		head=n;
		
		//Create another node n1
		DNode n1 = new DNode();
		n1.data=200;
		
		//link n and n1
		n.next=n1;
		n1.prev=n;
		
		//print the data
		System.out.println("n: "+n);
		System.out.println("n.prev: "+n.prev);
		System.out.println("n.data: "+n.data);
		System.out.println("n.next: "+n.next);
		
		System.out.println("n1: "+n1);
		System.out.println("n1.prev: "+n1.prev);
		System.out.println("n1.data: "+n1.data);
		System.out.println("n1.next: "+n1.next);
		
		System.out.println("head.next.data: "+head.next.data);
		System.out.println("n.next.data: "+n.next.data);
		System.out.println("n1.data: "+n1.data);
	}

}
