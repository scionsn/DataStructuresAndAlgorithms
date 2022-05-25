import java.util.HashSet;

public class detectCycle {
    public ListNode detectCycleLL(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        HashSet<ListNode> h = new HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            if (h.contains(temp)) {
                return temp;
            } else {
                h.add(temp);
            }
            temp = temp.next;
        }
        return null;
    }
    // using floyd algorithm
    // if(head==null)
    // return null;
    // if(head.next==null)
    // return null;
    // ListNode fast=head;
    // ListNode slow=head;
    // while(fast!=null&&fast.next!=null)

    // {
    // fast=fast.next.next;
    // slow=slow.next;
    // if(fast==slow)
    // break;//break from the loop since we now want to find the node where the
    // cycle begins
    // }

    // if(slow!=fast)//no cycle
    // return null;
    // slow=head;

    // while(fast!=slow)
    // {
    // fast=fast.next;
    // slow=slow.next;
    // }
    // return slow;
    // }
}
