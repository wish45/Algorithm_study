package Coding_Interview;

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
			
			printNode(N.left);
			System.out.print("(");
			System.out.print(N.data);
			System.out.print(")");
			printNode(N.right);
			
		}
	}
	
	static void printBST() {
		printNode(rootNode);
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};

		TreeNode asd = new TreeNode();
		for(int i=0; i<3; i++) {
			asd.insert(array[i]);
		}
		printBST();

	}
	
}









