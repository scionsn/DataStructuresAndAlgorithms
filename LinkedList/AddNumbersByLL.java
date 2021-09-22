//You are given two non-empty linked lists representing two non-negative integers. 
//The digits are stored in reverse order and each of their nodes contain a single
//digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Example:
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddNumbersByLL {
	   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int sum=0,carry=0,v1=0,v2=0,remainder=0;
	        ListNode res=new ListNode(-1);
	        ListNode ptr=res;
//	        there might be a case where length of both lists differ,
//	        in that case we use or operation and the values v1 and v2 are 0
//	        as they dont exist only to be added to the result.
	        while(l1!=null||l2!=null) {
	        	if(l1!=null) {
	        		v1=l1.val;
	        		l1=l1.next;
	        		
	        	}
	        	else v1=0;
	        	if(l2!=null) {
	        		v2=l2.val;
	        		l2=l2.next;
	        	}
	        	else v2=0;
	        	sum=v1+v2+carry;
	        	carry=sum/10;
	        	remainder=sum%10;
	        	ListNode temp=new ListNode(remainder);
	        	ptr.next=temp;
	        	ptr=ptr.next;
	        }
	        if(carry!=0) {
	        	ListNode temp=new ListNode(carry);
	        	ptr.next=temp;
	        }
//	        the ans is also in reverse format 
	        return res.next;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
