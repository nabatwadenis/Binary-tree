package binarytree;


class Nodes{
	char key;
	Nodes left, right;
	
	Nodes(char key){
		this.key = key;
	}
}
class Binarysln{
	Nodes root;
	
	public void insertkey(char key) {
		root = insertInTree(root, key);
		
	}
	Nodes insertInTree(Nodes root, char key) {
		if(root == null) {
			root = new Nodes(key);
		}
		if(key < root.key) {
			root.left =insertInTree(root.left, key);
		}else if(key > root.key) {
			root.right = insertInTree(root.right, key);
		}
		return root;
	}
	void preorderTraversal(Nodes root) {
		if(root != null) {
			System.out.print(root.key+ " ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		
	}
	void inorderTraversal(Nodes root) {
		if(root != null) {
			inorderTraversal(root.left);
			System.out.print(root.key+ " ");
			inorderTraversal(root.right);
		}
		
	}
	void postorderTraversal(Nodes root) {
		if(root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.key+ " ");
		}
		
	}
}
public class Binarysearchtree {

	public static void main(String[] args) {
		Binarysln bs = new Binarysln();
		bs.insertkey('C');
		bs.insertkey('B');
		bs.insertkey('F');
		bs.insertkey('J');
		bs.insertkey('A');
		bs.preorderTraversal(bs.root);

	}

}
