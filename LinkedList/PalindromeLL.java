import java.util.Stack;

public class PalindromeLL {
	  public boolean isPalindrome(ListNode head) {
	        if(head.next==null||head==null)
	        {
	            return true;
	        }
	        Stack<Integer> stack=new Stack<>();
	        ListNode temp=head;
	        while(temp!=null)
	        {
	            stack.push(temp.val);
	            temp=temp.next;
	        }
	   while(!stack.isEmpty())
	        {
	            int node=stack.pop();
	       if(node!=head.val)
	           return false;;
	       head=head.next;
	        }
	        return true;
	    
	}
}
