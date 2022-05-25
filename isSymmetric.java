//ref-striver

public class isSymmetric {
    public boolean isSymmetricTree(TreeNode root) {
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }

    // we compare the left value of the root and right value of the root tigether to
    // see if they match and the tree is symmetric
    boolean helper(TreeNode leftsub, TreeNode rightsub) {
        // both should be null in order for them to be symmetric
        if (leftsub == null || rightsub == null)
            return leftsub == rightsub;

        if (leftsub.val == rightsub.val) {
            boolean left = helper(leftsub.left, rightsub.right);
            boolean right = helper(leftsub.right, rightsub.left);
            return left && right;
        }
        return false;

    }

    public static void main(String[] args) {

    }
}
