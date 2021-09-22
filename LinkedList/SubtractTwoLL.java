
public class SubtractTwoLL {
	public ListNode subtract(ListNode l1, ListNode l2) {
//lets assume that both the linked list are in reverse order like in add linked lists
		int v1 = 0, v2 = 0, borrow = 0;
		ListNode res = new ListNode(-1);
		ListNode ptr = res;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				v1 = l1.val;
				l1 = l1.next;
			} else
				v1 = 0;
			if (l2 != null) {
				v2 = l2.val;
				l2 = l2.next;
			} else
				v2 = 0;
			ListNode temp = new ListNode();
			if (borrow + v1 >= v2) {
				temp.val = (borrow + v1) - v2;
				ptr.next = temp;
				ptr = ptr.next;
			} else {
				temp.val = (borrow + v1 + 10) - v2;
				ptr.next = temp;
				ptr = ptr.next;
				borrow = -1;
			}
		}
//		the ans is in reverse format , we have to make sure to skip leading zeroes, wehen we rev the ans
//		we get the actual ans
		return res.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
