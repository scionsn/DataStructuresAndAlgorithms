// ref- codebix
public class deleteNodeBT {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left != null && root.right != null) {
                int maxleft = findMaxNode(root.left);
                root.val = maxleft;
                // delete duplicate values , the maxleft is now the root of that subtree
                root.left = deleteNode(root.left, maxleft);
                return root;
            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;
    }

    int findMaxNode(TreeNode root) {
        if (root.right == null)
            return root.val;
        return findMaxNode(root.right);

    }
}
