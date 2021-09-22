
public class ShortestCommSuperseq {
	public static int scs(String str1,String str2) {
		int res=lcs(str1,str2);
		return (str1.length()+str2.length()-res);
	}
	public static int lcs(String m,String n) {
		
		if(m.length()==0||n.length()==0) {
			return 0;
		}
		if(m.charAt(0)==n.charAt(0)) {
			return 1+lcs(m.substring(1),n.substring(1));
		}
		else {
			return Math.max(lcs(m.substring(1),n), lcs(m,n.substring(1)));
		}
		
	}
	void printscs() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="abac";
String str2="cab";
System.out.println(scs(str1,str2));

	}

}
