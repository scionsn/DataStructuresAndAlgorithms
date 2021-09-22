//ref anurag codes
public class WildcardPatternMatching {
	static boolean wildCard(String pattern, String str) {
		return helper(pattern, str, 0, 0);
	}

	static boolean helper(String patt, String s, int i, int j) {
//		  base cases
//		 we return true if both ptr reach end of string indicating there are equal chars and all chars match
		if (i == s.length() && j == patt.length())
		{
			System.out.println("hit");
			return true;

		}
//		 if my inp string ptr has reach the end and the patt ptr hasnt , we have to make sure that the remaininig chars
//		  in the patt are * so that we can inclue blank spaces else its not possible to make both strs equal
		if (i == s.length() && j != patt.length()) {
			for (int k = j; k < patt.length(); k++) {
				if (patt.charAt(k) == '*')
					return true;
			}
		}
//		 our inp string is longer than patt and hence we cant make the entire patt equal with our input
		if (j == patt.length() && i != s.length())
			return false;
		boolean ans = false;
		
		
		
		
		if (patt.charAt(j) == '?') {
			System.out.println("ques");
//			 we can make a single  char at j equal to curr char at i ,so just move both ptr to next loc 
			if (helper(patt, s, i + 1, j + 1))
				ans = true;
		} 
		else if (patt.charAt(j) == '*') {
//			include blank character
			if (helper(patt, s, i, j + 1)) {
				ans = true;
			}
//			 include single character
			if (helper(patt, s, i + 1, j + 1))
				ans = true;
//			 include multiple character which is achievd by including current char at i and again
//			 ading * after that char so as to include multiple  chars
			if (helper(patt, s, i + 1, j))
				ans = true;
		}
//		 both my chars at i and j are alphab
		else {
			if (s.charAt(i) == patt.charAt(j)) {
				if (helper(patt, s, i + 1, j + 1))
					ans = true;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wildCard("abcde", "abcd?"));
	}

}
