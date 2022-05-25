public class ChildrenSumBT {
    public static void main(String[] args) {

    }

    boolean isChildrenSum(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null) {
            // in case of a leaf node
            return true;
        }
        else if (root.left != null && root.right == null && root.val == root.left.val) {
            return true;
        }
        else if (root.right != null && root.left == null && root.val == root.right.val) {
            return true;

        }
        else if (root.right != null && root.left != null && root.val == (root.left.val + root.right.val)) {
           boolean left= isChildrenSum(root.left);
            boolean right=isChildrenSum(root.right);
            return left&&right;
        }
        else
        return false;

    }
}
