import java.util.HashMap;

public class AlienDictionary {
	 public  boolean isAlienSorted(String[] words, String order) {
	    int arr[]=new int[26];
	    for(int i=0;i<order.length();i++) {
//	    	in  this step we just put the priority of the character according to
//	    	the order of alien language in the  int array.
	    	arr[order.charAt(i)-'a']=i;
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    
	    for(int i=1;i<words.length;i++) {
	    	if(!order(words[i-1],words[i],arr))
	    	{
	    		return false;
	    	}
	    }
	    return true;
	    
	 }
	 boolean  order(String a,String b,int arr[]) {
		 for(int i=0;i<a.length()&&i<b.length();i++) {
			 if(a.charAt(i)==b.charAt(i)) {
				 continue;
			 }
			  if(a.charAt(i)!=b.charAt(i)) {
				 
			 if(arr[a.charAt(i)-'a']>arr[b.charAt(i)-'a']) {
				 System.out.println("in if");
break;			 
}
		 }
		 }
		 if(a.length()>b.length()) {
			 return false;
		 }
		 return true;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"hello","leetcode"};
String order="hlabcdefgijkmnopqrstuvwxyz";
AlienDictionary obj=new AlienDictionary();
System.out.println(obj.isAlienSorted(arr,order));
	}

}
