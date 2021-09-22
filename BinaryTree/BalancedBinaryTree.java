//a height balanced binary tree is a tree in which the
//the left and right subtree height of any node doesnt differ by more than one.
public class BalancedBinaryTree {
	  public boolean isBalanced(TreeNode root) {
	        if(root==null)
	            return true;
	return helper(root)!=-1;
	    }
	    int helper(TreeNode root){
	        if(root==null)
	            return 0;
	        int left=helper(root.left);
	        int right=helper(root.right);
	        if(left==-1||right==-1||Math.abs(left-right)>1)
	            return -1;
	        return Math.max(left,right)+1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
