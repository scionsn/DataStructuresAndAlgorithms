//Initialize two pointers oddNode and evenNode as head and head.next respectively.
//Keep a reference to the first even node (head.next) as wee need to attach it the last odd node's tail.
//Now simply rewire as follows:
//oddNode.next = oddNode.next.next
//oddNode = oddNode.next;
//evenNode.next = evenNode.next.next;
//evenNode = evenNode.next;
//Finally attach the oddNode to the first evenNode.
//Looping condition:
//There can be two cases only: number of nodes are odd or they are even.
//If the number of nodes are odd, our loop should run only when odd.next != null (Last node will be odd).
//If the number of nodes are even, our loop should run only when odd.next.next != null (Penultimate node will be odd)
//So final condition will be while(odd.next != null && odd.next.next != null)
public class OddEvenLL {
	 public ListNode oddEvenList(ListNode head) {
	        if(head==null||head.next==null||head.next.next==null)
	            return head;
	       ListNode odd=head;
	        ListNode even=head.next;
	        ListNode storeEven=even;
	        while(odd.next!=null&&odd.next.next!=null)
	        {
	            odd.next=odd.next.next;
	            odd=odd.next;
	            even.next=even.next.next;
	            even=even.next;
	        }
	        odd.next=storeEven;
	        return head;
	    }
}
