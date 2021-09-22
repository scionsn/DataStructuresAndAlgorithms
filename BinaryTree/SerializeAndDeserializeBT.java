import java.util.LinkedList;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class SerializeAndDeserializeBT {
	public String serialize(TreeNode root) {
		if (root == null)
			return "$";
//preorder traversal to process root fiest
		String left = serialize(root.left);
		String right = serialize(root.right);
//my root will be processed first and then the left and right subchild,as in preorder
		return root.val + "," + left + "," + right;
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		String arr[] = data.split(",");
		LinkedList<String> q = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			q.addLast(arr[i]);
		}
		return MakeTreeFromQueue(q);
	}

	TreeNode MakeTreeFromQueue(LinkedList<String> q) {
		String val = q.removeFirst();
//	    	if val is special char then jjust return null
		if (val.equals("$"))
			return null;
//	    make the tree in preorder format only, 
//	    	first adding the root Nd then fillin the left and right subchild
//		each elem in queue is a node and we fill its left and right subchild by 
//		removing from the queue, and making the tree in preorder format
		TreeNode root = new TreeNode(Integer.parseInt(val));
		root.left = MakeTreeFromQueue(q);
		root.right = MakeTreeFromQueue(q);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
