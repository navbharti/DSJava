package DS.nonLinearDS;

public class NodeDemo {

	public static void main(String[] args) {
		GNode node = new GNode(12);
		node.children.add(new GNode(10));
		node.children.add(new GNode(20));
		node.children.add(new GNode(30));
		
		System.out.println(node.data+"\n "+ node.children.get(0).data+" "+ node.children.get(1).data+" "+ node.children.get(2).data);
	}
}
