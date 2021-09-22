
public class CountAndSay {
public static String countAndSay(int n) {
if(n==1)
	return "1";
if(n==2)
	return "11";
String s="11";
for(int i=3;i<=n;i++)
{
	//delimeter indicates end of string,also as this is at the end
//	so my last char i.e delim and second last char will always be diff and thus the string upto the number 
//	n will be stored in temp and finally in String s.
	s+="$";
	
	String temp="";
	int count=1;
	for(int j=1;j<s.length();j++)
	{
		if(s.charAt(j)==s.charAt(j-1))
		{
			count++;
			
		}
		else
		{
			temp+=String.valueOf(count);
temp+=s.charAt(j-1);
count=1;
		}
	}
	s=temp;
}
return s;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(countAndSay(3)); 
	}

}
