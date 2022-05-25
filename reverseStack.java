//stack can be reversed in O(n) space using another stack.
// to reverse stack in O(1) space we should represstnt stack as a linked list
// as we caqn reverse a lionkedd list in O(1) space.
// but both take O(n) time.
// ref- GFG
public class reverseStack {
    // head points to the top of stack.
    StackNode head;

    void push(int data) {
        if (head == null) {
            // when pushing the frst elemeent just make the head point to it
            this.head = new StackNode(data);
        }
        //
        StackNode node = new StackNode(data);
        node.next = this.head;
        this.head = node;
    }

    void pop() {
        if (head == null) {
            System.out.println("no more elements to pop");
        }
        this.head = head.next;

    }

    void reverseStk() {
        StackNode prev = null, curr = head, ahead = null;
        while (curr != null) {
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        // wehen the list gets reversed then the new head will be the last element(now
        // the top element of stack)
        this.head = prev;

    }

    public static void main(String[] args) {

    }
}

class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}
