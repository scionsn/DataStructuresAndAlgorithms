//ref tushar roy
public class LargestBstInABt {
	public int LargestBstBt(TreeNode root) {
		return LargestBst(root).size;
	}

	public properties LargestBst(TreeNode root) {
//	if we reached a null node all we return are some default values. we consider an 
//	emptty tree to be a bst too with size as 0,min and max with integer.max and integer.min values
//	so that leaf node can compare their value and return true as well.
		if (root == null)
			return new properties();
		properties left = LargestBst(root.left);
		properties right = LargestBst(root.right);
//    contains all the values for the curent node.
		properties node = new properties();
		if (root.val < left.max || root.val >= right.min || left.isbst == false || right.isbst == false) {
//    	if either one of these values are true
			node.isbst = false;
//    	we just return the max  size of the either the left or right bst which ever is bigger to the parent node 
			node.size = Math.max(left.size, right.size);
return node;
		}
		node.isbst = true;
//		if the current tree is bst then size is size of left subtree and right subtree and the current node
		node.size = 1 + left.size + right.size;
//		for a leaf node we pass the values of the root as min  and max
		
		
//		if the left node isnt there of the current node then min value for this tree is the value of the 
//		current node itself else min val of left subtree is the min value of the current node
		node.min = left == null ? root.val : left.min;
//		if the right node isnt there then the max val for this tree is the value of currnt node itseld
//		and else the value is the max value of the right subtree
		node.max = right == null ? root.val : right.max;
		return node;
	}

	class properties {
//		size means the size of the largest bst upto that node
		int size;
		boolean isbst;
//		min means min value in that tree ,which we can get from left subtree
		int min;
//		max means max value in that tree which  we can get from right subtree
		int max;
//		this min and max help us identify if the tree is bst or not

//		initializing with default props
		properties() {
			size = 0;
			isbst = true;
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
