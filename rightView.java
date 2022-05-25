import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class rightView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null)
            return res;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                // at i==0 we will get the first and the rightmost value of the level since we
                // are putting right node first in queue and doing  reverse level order
                // traversal.
                if (i == 0)
                    res.add(node.val);
                // here we do reverse level order traversal, such that instead of putting the
                // lft node first , we put the right node firs , so that we can get the right
                // view of the tree
                if (node.right != null) {
                    q.addLast(node.right);
                }
                if (node.left != null) {
                    q.addLast(node.left);
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
