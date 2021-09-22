
public class BinarySearch {
	  public int search(int[] nums, int target) {
	        if(nums.length==1&&nums[0]==target)
	            return 0;
	 int  low=0;
	        int high=nums.length-1;
	        while(low<=high){
//	        	this code isnt 100% bug-free
//	        	That is, it fails for larger values of int variables low and high.
//	        	Specifically, it fails if the sum of low and high is greater than the
//	        	maximum positive int value(231 – 1 ).
//
//	        	The sum overflows to a negative value and the value stays
//	        	negative when divided by 2. In java, it throws ArrayIndexOutOfBoundException.
//	                int mid=(low+high)/2;
	        	int mid=low+(high-low)/2;

	            if(nums[mid]==target)
	                return mid;
	            if(nums[mid]>target)
	                high=mid-1;
	            else
	                low=mid+1;

	        }
	    return -1;
	    }
	  public static int bSearchRecur(int arr[], int low,int high,int key)
	  {
		  if(high>=low)
		  {
			  int mid=low+(high-low)/2;
				 if(arr[mid]==key)
		return mid;
				 if(arr[mid]>key)
					return bSearchRecur(arr,low,mid-1,key);
				 else
					return bSearchRecur(arr,mid+1,high,key);

		  }
		 		 return -1;
	  }
	  public static void main(String args[]) {
		  int arr[]={2,5,7,9,11,20};
		 int res= bSearchRecur(arr,0,arr.length-1,9);
		 System.out.println("key found at index "+res);
	  }
}
