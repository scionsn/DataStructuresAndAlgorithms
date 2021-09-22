import java.util.Stack;
//ref techie sharma
//reverse the existing stack and then pop the elements and put into destination stack
public class CloneStackWithoutXtraSpace {
static void reversestack(Stack<Integer> stk) {
	if(stk.isEmpty())
		return;
	int temp=stk.pop();
	reversestack(stk);
//	System.out.println(temp);
	addToLast(stk,temp);	
}
static void addToLast(Stack<Integer> stk,int val){
	if(stk.isEmpty())
	{
		System.out.println(val);
		stk.push(val);
		return;
	}
	int temp=stk.pop();
	addToLast(stk,val);
	stk.push(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> stk=new Stack<>();
stk.push(3);
stk.push(2);
stk.push(1);
reversestack(stk);
//for(int i=0;i<=stk.size();i++)
//{
//	System.out.println(stk.pop());
//}

	}

}
