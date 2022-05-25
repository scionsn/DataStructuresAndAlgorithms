// ref- coding decoded
public class RemoveDupliate2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode prev = dummy;
        while (temp != null && temp.next != null) {
            boolean duplic = false;
            // move ahead till we reach a postion where the node and its next isn't
            // duplicate
            while (temp != null && temp.next != null && temp.val == temp.next.val) {
                duplic = true;
                temp = temp.next;
            }
            if (duplic) {
                prev.next = temp.next;
            } else {
                // if no duplicates are present then simply move the prev pointer ahead
                prev = prev.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}
