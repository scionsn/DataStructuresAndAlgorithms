
// ref - takeuforward
import java.util.LinkedList;

public class maxWidthBT {
   

    // this code passes all test cases on leetcode
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        LinkedList<index> q = new LinkedList<>();
        q.addLast(new index(root, 1));
        int width = 0;
        while (!q.isEmpty()) {
            // first and last indicate the index of first and last ndoe of that level so as
            // to find the
            // width
            // this code works on the concept that if we can give index to each nodein a
            // binary tree,
            // then calculating max width gets really simple, all we have to do is subtract the
            // index of the first node from the index of the last node, and then add 1 to the result to get the width
            int first = 0, last = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                index remove = q.poll();
                if (i == 0)
                    first = remove.index;
                if (i == size - 1)
                    last = remove.index;
                if (remove.node.left != null)
                    q.addLast(new index(remove.node.left, 2 * remove.index));
                if (remove.node.right != null)
                    q.addLast(new index(remove.node.right, 2 * remove.index + 1));
            }
            width = Math.max(width, last - first + 1);

        }
        return width;
    }
}

class index {
    TreeNode node;
    int index;

    index(TreeNode node, int index) {
        this.node = node;
        this.index = index;

    }
}
