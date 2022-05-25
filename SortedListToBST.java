
//convert the sorted linked list to a height balanced bst
public  class SortedListToBST {
    public TreeNode sortedList2BST(ListNode head) {
        if(head==null)
            return null;
             return helper(head,null);
             
         }
         TreeNode helper(ListNode head,ListNode tail)
         {
             if(head==tail)
                 return null;
           ListNode mid=  middleNode(head,tail);
             TreeNode root=new TreeNode(mid.val);
             root.left=helper(head,mid);
             root.right=helper(mid.next,tail);
             return root;
         }
     
     ListNode middleNode(ListNode head,ListNode tail) {
         //tail acts as the final node of the linked list
             ListNode fast=head;
             ListNode slow=head;
             while(fast!=tail&&fast.next!=tail)
             {
                 slow=slow.next;
                 fast=fast.next.next;
             }
         return slow;
     }
}    
         class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
            this.left = left;
         this.right = right;
         }
     }