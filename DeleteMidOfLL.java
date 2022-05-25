public class DeleteMidOfLL {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)
            return null;
      
   int len= getSize(head);
        // since there is never a 0th node , and alwasy a first node so setting value
//          of i as 1
        int i=1;
        ListNode temp=head;
        while(i++<len/2)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        
    }
    int getSize(ListNode root)
    {
        if(root==null)
            return 0;
        ListNode temp=root;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }
}
