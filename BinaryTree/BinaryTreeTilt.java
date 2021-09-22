//tilt is abs  diff bw sum of all left subtree nodes and right subtree nodes.
//return sum of every nodes tilt

public class BinaryTreeTilt {
	 int sum=0;
	    public int findTilt(TreeNode root) {
	    sum(root);
	        return sum;

	    }
	    int sum(TreeNode root){
	        if(root==null)
	            return 0;
	int left=sum(root.left);
	        int right=sum(root.right);
	        sum+=Math.abs(left-right);
	        return left+right+root.val;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
