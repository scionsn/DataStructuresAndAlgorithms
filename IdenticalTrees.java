public class IdenticalTrees {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            // this only means that both should be null if either one of them is, or both
            // of them are, if only one of them is null , then this stmt would return false.
            return p == q;
        
        if (p.val == q.val) {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return left && right;
        } else
            return false;

    }

    public static void main(String[] args) {

    }
}
