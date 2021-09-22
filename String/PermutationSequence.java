import java.util.ArrayList;

//The set [1,2,3,...,n] contains a total of n! unique permutations.
//
//By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
//
//"123"
//"132"
//"213"
//"231"
//"312"
//"321"
//Given n and k, return the kth permutation sequence.
public class PermutationSequence {
	  static ArrayList<String> perm(String str){
		  if(str.length()==0){
		      ArrayList<String> blank=new ArrayList<>();
		     //it is important to add a blank string in the arraylist,so as to make the loop traversal possible, as 
		     //by adding blank ,the arraylist has one value ,  therefore the loop will traverse one time initially and then some no. of times.
		      blank.add("");
		      return blank;
		  }
		  char currentchar=str.charAt(0);
		  String remainingstring=str.substring(1);
		            ArrayList<String> result=new ArrayList<>();
		                  ArrayList<String> temp=perm(remainingstring);
//		          post processing
		                  for(String s:temp){
		                for(int i=0;i<=s.length();i++){
		                    StringBuffer sb=new StringBuffer(s);//we use string buffer because here the string  itsef is getting changed.
		                    sb.insert(i, currentchar);
		                    result.add(sb.toString());//here we convert sb to string because it is of type string buffer and result 
//		                    is of type string.
		                }
		            }
		            return result;

		     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="123";
		 int k=3;
	        ArrayList<String> res=perm(str);
	System.out.println(res.get(k-1));
	System.out.println(res);

	}

}
