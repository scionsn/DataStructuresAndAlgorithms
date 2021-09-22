import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
	List<Integer> list=new ArrayList<>(); 
	public TreeNode increasingBST(TreeNode root) {
		if(root==null)
			return root;
		inorder(root);
		TreeNode node=new TreeNode(list.get(0));
		constructTree(node,1); 
		return node;
	}
	void inorder(TreeNode root){
		if(root==null)
			return ;
		inorder(root.left);
		list.add(root.val);
		inorder(root.right);
	}
	void constructTree(TreeNode root,int index){
		if(index>list.size()-1)
			return ;
		root.right=new TreeNode(list.get(index));

		constructTree(root.right,index+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
