
public class LongestMountainArray {
	 public int longestMountain(int[] A) {
	        int count=0;
	        if(A.length<3){
	            return 0;
	        }
		        for(int i  =1;i < A.length&&i+1<A.length;i++){
//		        	finding the peak of the array.
		           if(A[i]>A[i-1]&&A[i]>A[i+1])
	                   
	               {
	                   int left=i;
	                    int right=i ;

	                    while(left>0&&A[left]>A[left-1]){
	           left-=1;
	       }
	               while(right<A.length-1&&A[right]>A[right+1]){
	           right+=1;
	       }
//	               length is given by right index -left index+1
	count=Math.max(count,right-left+1);
	               }
	                
	            }
	       return count;
	      
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
