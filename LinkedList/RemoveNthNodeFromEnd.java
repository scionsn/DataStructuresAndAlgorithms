
public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		int size = length(head);
		int pos = size - n;
		if (pos == size)
			return head;
		if (pos == 0) {
			head = head.next;
			return head;
		}

		ListNode temp = head;
		for (int i = 1; i <= pos; i++) {
			if (i == pos)

			{
				temp.next = temp.next.next;
			}
			temp = temp.next;

		}
		return head;
	}

	int length(ListNode head) {
		int size = 0;
		ListNode temp = head;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
