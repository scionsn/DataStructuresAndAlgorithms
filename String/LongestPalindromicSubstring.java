
public class LongestPalindromicSubstring {
	static int resLen=0;
	static int startLongPalin=0;
public  static String longestPalin(String s)
{
	if(s.length()<2)
	{
		return s;
	}
	for(int i=0;i<s.length();i++)
		{
//		for odd length string
		helper(s,i,i);
//		for even length string
		helper(s,i,i+1);
		}
	System.out.println(startLongPalin+""+resLen);
	return s.substring(startLongPalin, resLen+startLongPalin);
}
 static void helper(String s,int start,int end)
{
while((start>=0&&end<s.length())&&s.charAt(start)==s.charAt(end))
{
	start--;
	end++;
}
int palinLen=end-start-1;

if(resLen<palinLen)
{
	resLen=palinLen;
//	my loop ends when start < 0 so start becomes -1 , so as to make it a valid index we add 1 
	startLongPalin=start+1;
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalin("cbbd")); 
	}

}
