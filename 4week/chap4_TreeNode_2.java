package Coding_Interview;

class chap4_TreeNode_2 {
	int data;
	chap4_TreeNode_2 left;
	chap4_TreeNode_2 right;
	chap4_TreeNode_2 root;

	private static chap4_TreeNode_2 rootNode;

	
	private chap4_TreeNode_2 insertKey(chap4_TreeNode_2 root, int x) {
		if (root == null) {
			chap4_TreeNode_2 newNode = new chap4_TreeNode_2();
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


	private static void printNode(chap4_TreeNode_2 N) {
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

		chap4_TreeNode_2 asd = new chap4_TreeNode_2();
		for(int i=0; i<10; i++) {
			asd.insert(array[i]);
		}
		printBST();

	}
	
}









