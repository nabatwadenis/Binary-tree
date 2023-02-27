package binarytree;

class Node{
	char key;
	Node left, right;
	
	Node(char key){
		this.key =key;
	}
}
class TreeTraversal{
	Node root;
	void preorder(Node n) {
		if(n != null) {
			System.out.print(n.key +" ");
			preorder(n.left);
			preorder(n.right);
		}
	}
	void postorder(Node n) {
		if(n != null) {
			preorder(n.left);
			preorder(n.right);
			System.out.print(n.key +" ");
		}
	}
	void inorder(Node n) {
		if(n != null) {
			preorder(n.left);
			System.out.print(n.key +" ");
			preorder(n.right);
		}
	}
}
public class Binarytree {

	public static void main(String[] args) {
		TreeTraversal tts = new TreeTraversal();
		tts.root = new Node('A');
		tts.root.left = new Node('B');
		tts.root.right = new Node('C');
		tts.root.left.left = new Node('D');
		tts.root.left.right = new Node('E');
		tts.root.right.left =new Node('F');
		tts.preorder(tts.root);
		System.out.println();
		tts.postorder(tts.root);
		System.out.println();
		tts.inorder(tts.root);
		
		

	}

}
