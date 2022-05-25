class bstfrompreord {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 1)
            return new TreeNode(preorder[0]);
        // first node will always be the root in case of preorder traversal
        TreeNode root = new TreeNode(preorder[0]);
        // iterating rest of the nodes and placing them where they belong
        for (int i = 1; i < preorder.length; i++) {
            helper(root, preorder[i]);
        }
        return root;
    }

    void helper(TreeNode root, int node) {
        if (root == null)
            return;

        if (node < root.val) {
            // if root.left is null then just place the smaller node on the left of root ,
            // same goes for the greater ndoe
            if (root.left == null) {
                root.left = new TreeNode(node);

            }
            helper(root.left, node);
        } else if (root.val < node) {

            if (root.right == null)

            {
                root.right = new TreeNode(node);

            }
            helper(root.right, node);
        }

    }
}