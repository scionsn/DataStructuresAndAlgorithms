//ref tushar roy
public class KMP {
	public static int[] lps(String pattern) {
		char arr[] = pattern.toCharArray();
		int res[] = new int[arr.length];
		int j = 0;
//		1st idx in res is always 0 , as no prefix or suffix is calc for single length str.
		for (int i = 1; i < arr.length;) {
//			if both  chars  at i and j are equal then inc the value of lps at that idx by j+1
			if (arr[j] == arr[i]) {
				res[i] = j + 1;
				i++;
				j++;
			}
//			if they are nt equal then if j is not at 0 then we go to prev idx , check the value at that idx
//			and move j to that value ,we do this because when there is a mismatch we check the lps upto that index
			else {
				if (j != 0) {
					j = res[j - 1];
				}
//				if j is at 0 idx and the value at i and j are still not equal simply put 0 at lps as
//				 there is no longest lps there
				else {
					res[i] = 0;
					i++;
				}
			}
		}

		return res;
	}

	public static boolean kmpalgo(String str, String pattern) {
		int i = 0, j = 0;
		int lps[] = lps(pattern);
		char main[] = str.toCharArray();
		char patt[] = pattern.toCharArray();
		for (i = 0, j = 0; i < main.length && j < patt.length;) 
		{
			if (main[i] == patt[j]) {
				i++;
				j++;
			} 
			else {
				if (j != 0) {
					j = lps[j - 1];
				}
//		if j==0 means that just increase the pointer of main string and check if it matches to the current j.
				else {
					i++;
				}
			}
		}
// if j traverses the entire pattern then , this means the pattern exists in main else it doesnt
		if (j == patt.length)
			return true;
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main = "abcabb";
		String patt = "bac";
		System.out.println(kmpalgo(main, patt));
	}

}
