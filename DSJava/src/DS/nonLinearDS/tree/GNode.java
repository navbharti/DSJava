package DS.nonLinearDS.tree;

import java.util.ArrayList;
/*
 * This class GNode definition is for General Tree case for Node representation
 */
public class GNode {
	public int data;
	public ArrayList<GNode> children;
	public GNode() {
		this.data=0;
		children = new ArrayList<GNode>();
	}
	public GNode(int data) {
		this.data = data;
		children = new ArrayList<GNode>();
	}
}
