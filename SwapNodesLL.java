public class SwapNodesLL {
    public ListNode swapNodes(ListNode head, int k) {

        int k_end = (getSize(head) - k) + 1;
        int end_val = getNodeAtIdx(head, k_end).val;
        int temp = getNodeAtIdx(head, k).val;
        SetVal(head, end_val, k);
        SetVal(head, temp, k_end);
        return head;

    }

    int SetVal(ListNode head, int val, int idx) {
        if (head == null)
            return 0;
        ListNode temp = head;
        int i = 1;
        while (i++ < idx) {
            temp = temp.next;
        }
        temp.val = val;
        return val;
    }

    ListNode getNodeAtIdx(ListNode root, int idx) {
        int i = 1;
        ListNode temp = root;
        while (i++ < idx) {
            temp = temp.next;
        }
        return temp;
    }

    int getSize(ListNode root) {
        if (root == null)
            return 0;
        ListNode temp = root;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}
