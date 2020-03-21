package DS.linearDS.sll;

public class NodeDemo {

	public static void main(String[] args) {	
		Node n=new Node();
		System.out.println(n);
		System.out.println(n.data);
		n.data=10;
		System.out.println(n.data);
		
		//create n1 with value 30
		Node n1= new Node();
		n1.data=30;
		//create n2 with value 50
		Node n2= new Node();
		n2.data=50;
		//create n3 with value 70
		Node n3= new Node();
		n3.data=70;
		
		//connect n and n1
		n.next=n1;
		n1.next=n2;
		n2.next=n3;
		
		System.out.println(n.data);
		System.out.println(n.next.data);
		System.out.println(n.next.next.data);
		System.out.println(n.next.next.next.data);
		System.out.println(n.next.next.next.next.data);
	}

}
