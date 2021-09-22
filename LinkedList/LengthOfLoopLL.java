//note the location at which fast is equal to slow and then run the loop again using another
//pointer at which its next==common point. this gives length of loop.
//length of a circular track  can be found when we start from a position and reach to that position again.
public class LengthOfLoopLL {
	 static int countNodesinLoop(Node head)
	    {
	 Node fast=head;
	        Node slow=head;
	        while(fast!=null&&fast.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;
	            if(slow==fast){
	                return lengthofloop(slow);
	            }
	        }
	        return 0;

	    }

	    static int lengthofloop(Node ptr){
	        Node temp=ptr;
	        int res=1;
	        while(temp.next!=ptr){
	            temp=temp.next;
	            res++;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
