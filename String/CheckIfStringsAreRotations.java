
public class CheckIfStringsAreRotations {
	
	 static boolean areRotations(String str1, String str2)
	    {
	        // There lengths must be same and str2 must be 
	        // a substring of str1 concatenated with str1.  
	       boolean length_check=str1.length()==str2.length();
	       int substring_check=str1.indexOf(str2);
	       if(length_check&&substring_check==0)
	    	   return true;
	      return false;
	    }
	      
	public static void main(String args[])
	{
		String s1="abcd";
		String s2=new String("abcde");
	System.out.println(s1.indexOf(s2));
	}
}
