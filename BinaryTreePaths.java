import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return null;

        List<String> res = new ArrayList<>();

        helper(res, root, "");
        return res;
    }
// based on preorder traversal
    void helper(List<String> res, TreeNode root, String s) {
        if (root == null)
            return;
// if the node is a leaf node then we dont actually ahve to add the arrown to its end
        if (root.left == null && root.right == null) {
            s += String.valueOf(root.val);
            res.add(s);
            return;
        }
        String val = String.valueOf(root.val) + "->";
        s += val;
        helper(res, root.left, s);
        helper(res, root.right, s);

    }
}
