//ref tushar roy O(n )time O(1) space
public class CheckifBTIsBST {
	public boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;
		if (root.left == null && root.right == null)
			return true;
//passing long due to test inputs
		return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	boolean helper(TreeNode root, long min, long max) {
		if (root == null)
			return true;
//	        if the node calue lies within the range then return  true else reutrn false
		if (root.val <= min || root.val >= max)
			return false;
		boolean left = helper(root.left, min, root.val);

		boolean right = helper(root.right, root.val, max);
//		if both subtrees are bst then return true elase flse;
		if (left && right)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
