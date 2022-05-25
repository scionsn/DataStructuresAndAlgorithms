public class reverseLL {
    // my code school utube
    ListNode new_head = null;

    public ListNode reverseListRecur(ListNode head) {
        if (head == null)
            return head;
        helper(head);
        return new_head;
    }

    void helper(ListNode node) {
        if (node.next == null) {
            new_head = node;
            return;
        }
        helper(node.next);
        ListNode store = node.next;
        store.next = node;
        node.next = null;
    }

    public ListNode reverseListIterative(ListNode head) {
        if (head == null)
            return head;
        else if (head.next == null)
            return head;
        else {

            ListNode current = head, prev = null, next = null;
            while (current != null) {
                // next pointer stores the address of the node next to current, so that
                // the address isn't lost while we assign the next of the current node to
                // to some other value.
                // current points to the current node and previous points to the node before
                // current.
                next = current.next;
                // reverse the link
                current.next = prev;
                // move the links fwd
                prev = current;
                current = next;
            }
            // after travering the prev pointetr wull be on the last node.
            return prev;

        }
    }
}
