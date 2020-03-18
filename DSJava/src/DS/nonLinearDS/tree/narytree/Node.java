package DS.nonLinearDS.tree.narytree;

import java.util.ArrayList;

public class Node {
	public int data;
	public ArrayList<Node> children;
	public int totalChildren;
	
	public Node(int data) {
		this.data=data;
		children = new ArrayList<Node>();
		this.totalChildren=0;
	}
}