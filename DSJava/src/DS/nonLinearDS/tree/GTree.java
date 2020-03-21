package DS.nonLinearDS.tree;

/*
 * This GTree class is for general tree case
 */
public class GTree {

	static GNode root;
	public static void main(String[] args) {
		root = new GNode(12);
		System.out.println("Root Data: "+root.data);
		
		//create three nodes n1, n2, n3 and add to root as children
		GNode n1 = new GNode(10);
		GNode n2 = new GNode(20);
		GNode n3 = new GNode(30);
		root.children.add(n1);
		root.children.add(n2);
		root.children.add(n3);
		
		System.out.println("Root Children: "+root.children.size());
		System.out.println(root.children.get(0).data+" "+root.children.get(1).data+" "+root.children.get(2).data);
	}

}
