//condition-
//if leftsubtree.left==rightsubtree.right&&leftsubtree.right==rightsubtree.left;
//
public class SymmetricTree {
	 public static boolean isSymmetric(Node root)
	    {
	if(root==null)
	return true;
	return helper(root.left,root.right);
	    }
	    static boolean helper(Node left_subt,Node right_subt)
	    {
	        if(left_subt==null&&right_subt==null)
	        return true;
	        if(left_subt!=null&&right_subt!=null)
	        {
	            return (left_subt.data==right_subt.data
	            &&helper(left_subt.left,right_subt.right)
	            &&helper(left_subt.right,right_subt.left));
	        }
	        return false;
	    }
}
