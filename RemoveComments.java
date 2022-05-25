
public class RemoveComments {
    static String remComment(String s) {
        boolean single_cmnt=false;
        boolean multi_cmnt=false;
String res="";
for(int i=0;i<s.length();i++)
{
    if(s.charAt(i)=='/'&&s.charAt(i+1)=='*')
    {
       multi_cmnt=true;
}
else if(s.charAt(i)=='/'&&s.charAt(i+1)=='/')
{
    single_cmnt=true;
}

else if(multi_cmnt==true&&s.charAt(i)=='*'&&s.charAt(i+1)=='/')
{

    multi_cmnt=false;
    // incrementing 'i' so that it jumps the closing multiline comment '/' and doesn't include in output
    i++;

}
else if(single_cmnt==true&&s.charAt(i)=='\n')
{
    single_cmnt=false;

}
else if(single_cmnt||multi_cmnt)
{
    continue;
}
else 
res+=s.charAt(i);
     
    }
    return res;
}

    public static void main(String[] args) {
        String s = " /* Test program */ \n int main()  \n {           \n // variable declaration \n int a, b, c;    \n /* This is a test  \n  multiline     \n comment for   \ntesting */      \na = b + c;       \n}           \n";
        System.out.println(remComment(s));
    }
}
