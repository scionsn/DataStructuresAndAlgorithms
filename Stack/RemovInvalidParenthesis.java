import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

// ref pepcoding
public class RemovInvalidParenthesis {
	public List<String> removeInvalidParentheses(String s) {
		List<String> res = new ArrayList<>();
		HashSet<String> uniq = new HashSet<>();
//		the minimum removed allowed are the min characters to be removed from string to make it balanced
		int min_rem_allow = getMin(s);
		helper(s, uniq, min_rem_allow);
		for (String str : uniq) {
			res.add(str);
		}
		return res;
	}

//	     this method returns the minimum number of removals that we need to make to make the brackets balanced
	int getMin(String s) {
		LinkedList<Character> stk = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stk.addFirst(s.charAt(i));
			} else {
				if (stk.size() == 0) {
					stk.addFirst(s.charAt(i));
				} else if (stk.peek() == '(') {
					stk.removeFirst();
				} else
					stk.addFirst(s.charAt(i));

			}
		}
		return stk.size();
	}

//	     this method  takes the min removals and then removed the chars from string to make a balanced string and then
//	     returns non duplicate values of it
	void helper(String s, HashSet<String> uniq, int min_rem_allow) {
		if (min_rem_allow == 0) {
			int res = getMin(s);
			if (res == 0) {
				System.out.println(s);
				if (!uniq.contains(s)) {
					uniq.add(s);
				}
			}
			return;
		}

		for (int i = 0; i < s.length(); i++) {
//          left and right are taken to not include the character at ith index,
//			now the min_rem_allow gets reduces by 1
//			as we are ignoring each charctaer frm the string
//			recursion does the work of removing each char and then from that string 
//			removing each char from it further and checking for balanced version of string
//			which we get ig getmin returns 0, which means that a string is balanced
			String left = s.substring(0, i);
			String right = s.substring(i + 1);
			helper(left + right, uniq, min_rem_allow - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
