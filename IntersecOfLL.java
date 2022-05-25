public class IntersecOfLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = getSize(headA);
        int size2 = getSize(headB);
        ListNode start1 = null;
        ListNode start2 = null;
        int diff = 0;
        if (size1 > size2) {
            diff = size1 - size2;
            start1 = headA;
            start2 = headB;
        } else {
            diff = size2 - size1;
            start1 = headB;
            start2 = headA;
        }
        // we can only calculate the intersection point if both the ptrs start from same
        // postion..
        // for this we calc the differnce bw the length of both the linked lst, and the
        // linked list
        // at greater length is which needs to have its start ptr adjusted.
        // we need to move the start ptr of bigger list further ahead upto 'diff' number
        // of steps
        // so that both the pts move at same speed i.e one step at one time and cover
        // same distacne
        // such that we can find the intersection point of both lists if it exists.
        for (int i = 0; i < diff; i++) {
            start1 = start1.next;
        }
        while (start1 != null && start2 != null) {
            if (start1 == start2) {
                return start1;
            }
            start1 = start1.next;
            start2 = start2.next;
        }
        return null;

    }

    int getSize(ListNode head)

    {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
