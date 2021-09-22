import java.util.Stack;

// Definition for a Node.
class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;
};
/*
 * explanation-
if a node has a child and a next node then the next node
is then shifted to stack, and the prev pointer of the next node is made
null, also with the child node, the next pointer of the current node
now points to child node and prev pointer of child node which was
firstly null , now points to the current node,and child pointer of 
the current node is made null since the whole purpose of the question
is to flatten the linked list and flatten means without any levels.
this process continues till curr becomes null. we also keep a tail 
pointer along with curr which is one step behind the curr pointer
, once the curr pointer becomes null, then we pop the stack and store that 
value in current and then point the tail to the curr and the prev of curr to the tail.
then we move the loop fwd again till curr becomes null and when it does we pop the
stack again, and do the same task as above. we again move the curr pointer till it
becomes null and then if stack is empty then we exit the loop and get 
a flattend linked list.
*/
public class FlattenMultilevelDoublyLL {
	public Node flatten(Node head) {
		Node curr=head;
		Node tail=head;
		Stack<Node> stack=new Stack<>();
		while(curr!=null){
			if(curr.child!=null){
				Node bacha=curr.child;
				if(curr.next!=null){
					stack.push(curr.next);
					curr.next.prev=null;
				}
				curr.next=bacha;
				bacha.prev=curr;
				curr.child=null;


			}
			tail=curr;
			curr=curr.next;
		}
		while(!stack.isEmpty()){
			curr= stack.pop();
			tail.next=curr;
			curr.prev=tail;
			while(curr!=null){
				tail=curr;
				curr=curr.next;
			}

		}
		return head;

	}
}

