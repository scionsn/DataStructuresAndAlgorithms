import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeypadProb {
  
//	  ref codebix
	  
	  public static List<String> letterCombination(String digits) {
		  List<String> ans=new ArrayList<>();
	        if(digits.length()==0)
	        return ans;
	         HashMap<Character,String> map=new HashMap<>();
	        map.put('2',"abc");
	        map.put('3',"def");
	        map.put('4',"ghi");
	        map.put('5',"jkl");
	        map.put('6',"mno");
	        map.put('7',"pqrs");
	        map.put('8',"tuv");
	        map.put('9',"wxyz");
	        helper(ans,map,0,digits,new StringBuilder());
	        return  ans;
	    }
	  static  void helper(List<String> ans,  HashMap<Character,String> map,int idx,String orig,StringBuilder sb)
	    {
	        if(idx==orig.length())

	        {
	            ans.add(sb.toString());
	            return ;
	        }
	        String val=map.get(orig.charAt(idx));
	        for(int k=0;k<val.length();k++)
	        {
	            sb.append(val.charAt(k));
//	             here we pass idx+1 and not k+1 because idx is related to the orig string while k is related to 
//	             the value associated to the character in map.
	            helper(ans,map,idx+1,orig,sb);
//	             backtrack and remove the last added character to the string in order to try more combinations .
	            sb.deleteCharAt(sb.length()-1);    
	        }   
	    }
public static void main(String args[]) {
	String str="23";
   System.out.println(letterCombination((str)));
}
}
