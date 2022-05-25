// ref - takeuforward
// soluitn without globl variabel
public class diameterBT {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        // // we had to take an array an not variable to store the max vlaue.
        // because the variable can't be passeed by reference, which means that if i
        // pass the variable
        // then its only call by val so its actual value won't be affected , even if the
        // function
        // makes some changes to it, while collection and array s in jaava are call by
        // refence,
        // so if function makes any. changes to it , it will be visible outside too
        int arr[] = { 0 };
        helper(root, arr);
        return arr[0];
    }

    int helper(TreeNode root, int arr[]) {
        if (root == null)
            return 0;
        int left = helper(root.left, arr);
        int right = helper(root.right, arr);
        arr[0] = Math.max(arr[0], left + right);
        return 1 + Math.max(left, right);
    }
}

// solution using global variable

// class Solution {
// // usually for good practices , global variable is not preferred
// int max=0;
// public int diameterOfBinaryTree(TreeNode root) {
// if(root==null)
// return max;
// // // we had to take an array an not variable to store the max vlaue.
// // because the variable can't be passeed by reference, which means that if i
// pass the variable
// // then its only call by val so its actual value won't be affected , even if
// the function
// // makes some changes to it, while collection and array s in jaava are call
// by refence,
// // so if function makes any. changes to it , it will be visible outside too
// // int arr[]={0};
// // helper(root,arr);
// // return arr[0];
// helper(root);
// return max;
// }
// int helper(TreeNode root)
// {
// if(root==null)
// return 0;
// int left= helper(root.left);
// int right= helper(root.right);
// max=Math.max(max,left+right);
// return 1+Math.max(left,right);
// }
// }