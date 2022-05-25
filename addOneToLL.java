public class addOneToLL {
    public static Node addOne(Node head) {
        // firs reverse the original number
        head = reverse(head);
        // add one to the reversed number
        int carry = 1, sum = 0, remainder = 0;
        Node res = head;

        while (head.next != null) {
            sum = head.data + carry;
            if (sum >= 10)
                carry = 1;
            else
                carry = 0;
            remainder = sum % 10;
            head.data = remainder;
            head = head.next;
        }
        // take oare of the last carry
        if (carry == 1) {
            sum = carry + head.data;
            // if the last number is 9 so adding cary woul make it 10, so remainder is 0 and
            // add the carry at the end, to make 10.
            if (sum >= 10) {
                head.data = sum % 10;
                head.next = new Node(1);
            }
            // else for sum less than 10, just update the value
            else
                head.data = carry + head.data;

        }
// reverse the final val again
        return reverse(res);

    }

    static Node reverse(Node head) {
        Node curr = head, prev = null, ahead = null;
        while (curr != null) {
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;

    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}