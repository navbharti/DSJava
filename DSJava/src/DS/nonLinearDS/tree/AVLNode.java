package DS.nonLinearDS.tree;

public class AVLNode {
	int data;
	AVLNode left;
	AVLNode right;
	int height;
	
	public AVLNode() {
		// TODO Auto-generated constructor stub
	}
	
	public AVLNode(int data){
		this.data = data;
		left=right=null;
		height=0;
	}
}
