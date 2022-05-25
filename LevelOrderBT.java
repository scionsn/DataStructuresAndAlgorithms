import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderBT {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return null;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        while (!q.isEmpty()) {
            List<Integer> sub = new ArrayList<Integer>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.peek();
                if (node.left != null)
                    q.addLast(node.left);
                if (node.right != null)
                    q.addLast(node.right);
                int poll = q.removeFirst().val;
                System.out.println(poll);
                sub.add(poll);
            }
            res.add(sub);

        }
        return res;
    }


    // List<List<Integer>> level(TreeNode root)
    // {
    //     if(root==null)
    //     return null;
    //     List<List<Integer>> res=new ArrayList<>();
    //     LinkedList<TreeNode> q=new LinkedList<>();
    //     q.addLast(root);
    //     while(!q.isEmpty())
    //     {
    //     List<Integer> sublis=new ArrayList<>();
    //     int size=q.size();
    //     for(int i=0;i<size;i++)
    //     {
    //     TreeNode node=q.poll();
    //     if(node.left!=null)
    //     {
    //         q.addLast(node.left);
    //     }
    //     if(node.right!=null)
    //     {
    //         q.addLast(node.right);
    //     }
    //     sublis.add(node.val);
    //     }
    //     res.add(sublis);
    //     }
        
    // }

    public static void main(String args[]) {

    }
}
