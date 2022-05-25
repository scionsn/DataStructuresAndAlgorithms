public class reorderList {
    public void reorderListcode(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return;
        ListNode slow = head;
        ListNode fast = head;
        // using slow and fast since we have to partition the list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode first = head;
        ListNode second = slow.next;
        // make slow.next as null so as to make two linklists.
        slow.next = null;
        // reverse the second linklist so that the last node becones the first and so on
        ListNode new_sec = revPtrs(second);
        ListNode init = new ListNode(-1);
        ListNode res = init;
        // we traverse the first list first since we want 1st val to appear first
        // and after we reverse the second list we have the last value at first so
        // we just have to append it at the next of first and keep on going iuntil one
        // if them is null
        while (first != null || new_sec != null) {
            if (first != null) {
                init.next = first;
                init = init.next;
                first = first.next;
            }
            if (new_sec != null) {
                init.next = new_sec;
                init = init.next;
                new_sec = new_sec.next;
            }
        }
        head = res.next;
    }

    ListNode revPtrs(ListNode node) {
        if (node == null || node.next == null)
            return node;
        ListNode prev = null, curr = node, ahead = null;

        while (curr != null) {
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}
