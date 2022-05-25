public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        // if the tree is balancedd then the output will never be -1.
        return helper(root) != -1;
    }

    int helper(TreeNode root) {
        // if no node is present return 0, as no node means no height
        if (root == null)
            return 0;
        // we do a postorder traversal.
        int left = helper(root.left);
        int right = helper(root.right);
        // but if the difference between the height of left and rihgt subtree at each node exceeds 1 then return
        // -1
        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        // return height of subtree normally
        return 1 + Math.max(left, right);
    }
}
