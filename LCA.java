public class LCA
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return root;
           if(p==root||q==root)
           {
               return root;
           }
           TreeNode left=lowestCommonAncestor(root.left,p,q);
           TreeNode right=lowestCommonAncestor(root.right,p,q);
   //         case 1: my x and y are on either side of the root node
           if(left!=null&&right!=null)
               return root;
   //         case 2: my x or y are found only on one side, this means that the node on which they are found
   //         is my lcs
           if(right!=null)
               return right;
           return left;
       }
    public static void main(String[] args) {
        
    }
}