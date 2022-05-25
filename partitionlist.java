
class partition
{
    ListNode partitionlist(ListNode node)
{
    if(node==null)
    return node;
    if(node.next==null)
    return node;
return null;

}
    public static void main(String args[])
    {

  }
}

 class ListNode{
    int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
