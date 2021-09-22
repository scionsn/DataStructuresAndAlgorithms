
public class PathSum1 {
	 public boolean hasPathSum(TreeNode root, int targetSum) {
	        if(root==null)
	            return false;
//	         if i have reached the leaf node and my sum is still not zero , then this is not the path to 
//	         find the target sum, and if it is thebn return true
	        System.out.println(targetSum);
	       if(root.left==null&&root.right==null&&targetSum-root.val==0)
	           return true;
	        boolean left=hasPathSum(root.left,targetSum-root.val);
	        boolean right=hasPathSum(root.right,targetSum-root.val);
	        return left||right;

	    }
}
