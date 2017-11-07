package Coding_Interview;
//
//
//class TreeNode{
//	private int data;
//	private TreeNode left,right;
//	
//	public TreeNode insertNode(TreeNode root, int x) {
//		TreeNode pointNode = root;
//		TreeNode newNode = new TreeNode();
//
//		newNode.data=x;
//		newNode.left=null;
//		newNode.right=null;
//
//		if(pointNode == null) return newNode;
//		else if(newNode.data < pointNode.data){
//			pointNode.left = insertNode(pointNode.left, x);
//			return pointNode;
//		}
//		else if(newNode.data > pointNode.data){
//			pointNode.right = insertNode(pointNode.right, x);
//			return pointNode;
//		}
//		else return pointNode;
//	}
//	
//	public void insert(int x){
//		TreeNode root = new TreeNode();
//		root = insertNode(root, x);
//	}
//
//	public static void main(String[] args) {
//		TreeNode root = new TreeNode();
//		
//	}
//
//}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode root;

	private static TreeNode rootNode;

	
	private TreeNode insertKey(TreeNode root, int x) {
		if (root == null) {
			TreeNode newNode = new TreeNode();
			newNode.data = x;
			return newNode;
		} else if (x < root.data) {
			root.left = insertKey(root.left, x);
			return root;
		} else if (x > root.data) {
			root.right = insertKey(root.right, x);
			return root;
		} else {
			return root;
		}
	}


	void insert(int x) {
		rootNode = insertKey(rootNode, x);
	}


	private static void printNode(TreeNode N) {
		if (N != null) {
			System.out.print("(");
			printNode(N.left);
			System.out.print(N.data);
			printNode(N.right);
			System.out.print(")");
		}
	}
	
	static void printBST() {
		printNode(rootNode);
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};

		TreeNode asd = new TreeNode();
		for(int i=0; i<10; i++) {
			asd.insert(array[0]);
		}
		printBST();

	}
	
}









