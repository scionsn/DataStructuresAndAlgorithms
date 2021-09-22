
public class fullBinaryTree {
	boolean isFullTree(Node node)
    {
if(node==null)
return true;
return helper(node);

    }
boolean helper(Node root){
    if(root==null)
   return true;
   if(root.left==null&&root.right==null)
   return true;
   if((root.left!=null)&&(root.right!=null)){
       return (helper(root.left)&&helper(root.right));
   }
//   this case is only for single node
   return false;
   
}
}
