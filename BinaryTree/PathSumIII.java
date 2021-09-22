import java.util.HashMap;

//You are given a binary tree in which each node contains an integer value.
//
//Find the number of paths that sum to a given value.
//
//The path does not need to start or end at the root or a leaf,
//but it must go downwards (traveling only from parent nodes to child nodes).
//
//The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
//ref codebix
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class PathSumIII {
	int count = 0;

//O(n^2)
	int nsquare(TreeNode root, int k) {
		if (root == null)
			return 0;
//		the idea is that we take each node , trverse all its left and right subtree to find the target
//		if we do then just inc the count, though this method takes time.
		helper(root, k, 0);
		nsquare(root.left, k);
		nsquare(root.right, k);
		return count;
	}

	void helper(TreeNode root, int k, int sum) {
		if (root == null)
			return;
		sum += root.val;
		if (sum == k)
			count++;
		helper(root.left, k, sum);
		helper(root.right, k, sum);

	}

//	O(n)
//	ref codebix, using prefix sum, we bring the tc to O (n), similar to subarray sum to k problem
	int number = 0;

	public int pathSum(TreeNode root, int targetSum) {
		if (root == null)
			return 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		helper(root, 0, targetSum, map);
		return number;

	}

	void helper(TreeNode root, int currentsum, int target, HashMap<Integer, Integer> map) {
		if (root == null)
			return;
		currentsum += root.val;
		int gain = currentsum - target;
		if (map.containsKey(gain)) {
			number += map.get(gain);

		}
//	         current sum is already maintained by recursion in its states
		map.put(currentsum, map.getOrDefault(currentsum, 0) + 1);
		helper(root.left, currentsum, target, map);
		helper(root.right, currentsum, target, map);
//	          decreasing the count of the child node when backrtrakcing to parent node so that the value of current sum
//	          remains intact while traversing thorugh tree
//	          this means that 
		map.put(currentsum, map.get(currentsum) - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
