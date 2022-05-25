// gfg article for modulo-https://www.geeksforgeeks.org/modulo-1097-1000000007/
// perform simple multiplication, unlike addition problem

public class multiplyLL {
    public long multiplyTwoLists(Node l1, Node l2) {
        long M = 1000000007;
        Node temp1 = l1;
        Node temp2 = l2;
        int pow1 = getsize(l1) - 1;
        int pow2 = getsize(l2) - 1;
        long val1 = 0, val2 = 0;

        while (temp1 != null || temp2 != null) {
            if (temp1 != null) {
                // it is important to perform modulo each time while computing the result,so
                // that the answer is correct and to avoid overflow
                val1 += (temp1.data * Math.pow(10, pow1--)) % M;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                val2 += (temp2.data * Math.pow(10, pow2--)) % M;
                temp2 = temp2.next;
            }
        }
     
        return (val1) % M * (val2) % M;
    }

    int getsize(Node node) {
        Node temp = node;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {

    }
}
