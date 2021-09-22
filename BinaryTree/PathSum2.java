import java.util.ArrayList;
import java.util.List;
// ref leetcode discuss java backtrack heisenberg
public class PathSum2 {
	 List<List<Integer>> result=new ArrayList<>();
	    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        if(root==null)
	            return result;
	        List<Integer> path=new ArrayList<>();
	        helper(root,path,targetSum);
	        return result;
	    }
	    void helper(TreeNode root,List<Integer> path,int targetSum)
	    {
	        if(root==null)
	            return ;
	        path.add(root.val);
	        if(root.left==null&&root.right==null&&targetSum-root.val==0)
	            result.add(new ArrayList<>(path));
	        helper(root.left,path,targetSum-root.val);
	        helper(root.right,path,targetSum-root.val);
//	         backtrack i.e remove the last value of the node from the list from when we are returning from it
	// so as to include other node in the path
	        path.remove(path.size()-1);
	    }
}
