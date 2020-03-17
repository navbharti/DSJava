package DS.nonLinearDS;

import java.util.ArrayList;

public class GNode {
	int data;
	ArrayList<GNode> children ;
	
	public GNode(int data) {
		this.data=data;
		children = new ArrayList<GNode>();
	}
}
