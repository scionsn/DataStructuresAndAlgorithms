//ref gfg
//there are two methods one is space effic for arr and second one isnt
//we will implement the second meth
public class ImplementTwoStacksInAnArray {
	int arr[];
	int top1;
	int top2;
	int size;

	ImplementTwoStacksInAnArray(int n) {
		arr = new int[n];
		size = n;
//		stk1
		top1 = 0;
//		stk2
		top2 = n - 1;
	}

	void push1(int elem) {
//	if check if there is space for atleast 1 elem to be added in stk 1 and this is posible
//	if top1 is atleast 2 steps  behind top2
		if (top1 < top2 - 1) {
			arr[top1] = elem;
			top1++;
		} else {
			System.out.println("stk 1 overflow,not enough space");
			return;
		}

	}

	void push2(int elem) {
//	same condition is checked for the posn of stk 1 and stk2 pointer
		if (top1 < top2 - 1) {
			arr[top2] = elem;
			top2--;

		} else {
			System.out.println("overflow for stk2 ");
			return;
		}
	}

	int pop1() {
//	we pop till top1 is greater than equal to zero else it will result  in underflow
		if (top1 >= 0) {
			int elem = arr[top1];
			top1--;
			return elem;
		} else {
			System.out.println("underflow in stk1 , not enough elem to pop");
			return -1;
		}
	}

	int pop2() {
//	we pop stk2 till it reaches the last idx as that is where we started ading elem in stk2
		if (top2 < size) {
			int elem = arr[top2];
			top2++;
			return elem;
		} else {
			System.out.println("underflow in stk1, no elem to pop");
			return -1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
