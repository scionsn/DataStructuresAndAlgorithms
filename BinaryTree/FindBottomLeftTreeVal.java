import java.util.LinkedList;

public class FindBottomLeftTreeVal {
	public int findBottomLeftValue(TreeNode root) {
        if(root==null)
            return 0;
        int res=0;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(root);;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
               TreeNode removed=q.poll();
                if(i==0)
                    res=removed.val;
                if(removed.left!=null)
                    q.addLast(removed.left);
                if(removed.right!=null)
                    q.addLast(removed.right);
             
            }
        }
        return res;
    }
}
