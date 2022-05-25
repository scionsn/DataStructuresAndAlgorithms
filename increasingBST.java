import java.util.ArrayList;
import java.util.List;

public class increasingBST {
    public TreeNode increasingBSTfunction(TreeNode root) {
        if (root.left == null && root.right == null)
            return root;
        List<Integer> lis = new ArrayList<>();
        helper(root, lis);
        // System.out.println(lis.size());
        TreeNode res = new TreeNode(lis.get(0));
        helper2(res, lis, 1);
        return res;
    }

    void helper(TreeNode root, List<Integer> lis) {
        if (root == null)
            return;
        helper(root.left, lis);
        lis.add(root.val);
        helper(root.right, lis);
    }

    void helper2(TreeNode root, List<Integer> lis, int i) {
        if (i > lis.size() - 1)
            return;
        // System.out.println(i);
        root.right = new TreeNode(lis.get(i));
        helper2(root.right, lis, i + 1);
    }
}
