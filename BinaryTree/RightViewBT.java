 import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
// will involve a certain change on bfs.
//this is based on reversed level order traversal
//we start traversing from right and add the val of first node in list
public class RightViewBT {
	 public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> res =new ArrayList<>();
	       
	              LinkedList<TreeNode> q=new LinkedList<>();
	           q.addLast(root);
	          while(!q.isEmpty()) {
	        	  int size=q.size();
	        	  for(int i=0;i<size;i++) {
	        		  TreeNode rem=q.poll();
	        		  if(i==0)
	        			  res.add(rem.val);
	        		  if(rem.right!=null)
q.addLast(rem.right);
	        		  if(rem.left!=null)
	        			  q.addLast(rem.left);
	        	  }
	          }
	 return res;
	        
	    }
	public static void main(String[] args) {
		
	}

}
