// ref- nireesh tirupali
public class longestUnivaluePath {
    int path = 0;

    public int longestUnivaluePathfunc(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root);
        return path;
    }

    int dfs(TreeNode root) {
        if (root == null)
            return 0;
        // postorder traversal
        int left_path = dfs(root.left);
        int right_path = dfs(root.right);
        int left_check = 0;
        int right_check = 0;
        // left check identifies if the root matches with left child and adds 1 to the
        // left_val
        if (root.left != null && root.val == root.left.val)
            left_check = 1 + left_path;
        // right check identifies if the root matches with right child and adds 1 to the
        // right_val

        if (root.right != null && root.val == root.right.val)
            right_check = 1 + right_path;
        path = Math.max(path, left_check + right_check);
        // we return the max of left check and right check since if the root value
        // matches with the
        // left or right subchild then the longest of them will be taken into account
        // for the path
        return Math.max(left_check, right_check);
    }
}
