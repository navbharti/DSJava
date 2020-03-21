package linkedlist;

public class LinkedListDemo {

	static Node head;
	public static void main(String[] args) {
		head = new Node(10);
		Node node = new Node(20);
		Node node1 = new Node(30);
		Node node2 = new Node(40);
		Node node3 = new Node(50);
		Node node4 = new Node(60);
		head.setLink(node);
		head.getLink().setLink(node1);
		head.getLink().getLink().setLink(node2);
		head.getLink().getLink().getLink().setLink(node3);
		head.getLink().getLink().getLink().getLink().setLink(node4);
		//System.out.println(head.getLink()+"->"+head.getData());
		//System.out.println(head.getLink().getLink()+"->"+head.getLink().getData());
		//System.out.println(head.getLink().getLink()+"->"+head.getLink().getLink().getData());
		for(Node n=head ;n!=null; n=n.getLink())
			System.out.println(n.getData());
	}
	
	public LinkedListDemo() {
		
	}
	
	 

}
