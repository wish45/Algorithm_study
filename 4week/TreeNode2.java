package Coding_Interview;

public class TreeNode2{
	public int data;
	public TreeNode left, right, parent;
	private int size = 0;

	public TreeNode2(int d) {
		data = d;
		size = 1;
	}
	public void insertInOrder(int d) {
		if(d <= data) {
			if(left == null) {
				setLeftChild(new TreeNode(d));
			}else {
				left.insertInOrder(d);
			}
		}else {
			if(right == null) {
				setRightChild(new TreeNode(d));
			}else {
				right.insertInOrder(d);
			}
		}
		size++;
	}
	public void setLeftChild(TreeNode left ) {
		this.left = left;
		if(left !=null) {
			left.parent = this;
		}
	}
	public void setRightChild(TreeNode right) {
		this.right = right;
		if(right != null) {
			right.parent = this;
		}
	}
	public int size() {
		return size;
	}

	
}










