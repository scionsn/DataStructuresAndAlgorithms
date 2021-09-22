
public class MergeTwoBinaryTrees {
	 public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//       we follow preorder traversal
//       if both are null simply return null
      if(root1==null&&root2==null)
          return null;
//       if root1 is null cinsider root 2 and vice versa
      else if(root1==null)
          return root2;
      
      else if(root2==null)
          return root1;
//      , we create a new tree
//       and fill accordingly by comparing the values of the nodoes at both the trees.
//       its simple dfs and the tree is constructed as first root and then we recurse and the left subtree is added 
//      to its left and right subtree to its right, this happens for all the nodes as its simple recursion
//       both the parts then simple attach to the root.
      TreeNode node=new TreeNode(root1.val+root2.val);
    node.left=  mergeTrees(root1.left,root2.left);
     node.right= mergeTrees(root1.right,root2.right);
//     return the root after forming the desired tree
      return node;
      
  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
