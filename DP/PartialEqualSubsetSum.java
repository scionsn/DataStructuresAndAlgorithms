//Given a non-empty array nums containing only positive integers, 
//find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
//ref techdose
public class PartialEqualSubsetSum {
	 boolean SubsetSum(int arr[],int sum,int n)
	    {
	        if(sum==0)
	            return true;
	        if(sum>0&&n==0)
	            return false;
	        else if(sum<0&&n==0)
	            return false;
	        if(arr[n]>sum)
	            SubsetSum(arr,sum,n-1);
	        return SubsetSum(arr,sum,n-1)||SubsetSum(arr,sum-arr[n],n-1);
	    }
	    public boolean canPartition(int[] nums) {
	     if(nums.length==1)
	         return false;
	        int sum=0;
	        for(int i=0;i<nums.length;i++)
	            sum+=nums[i];
//	         odd sum  cant be divided into two subarrays of equal sum as odd divided by two gives a decimal
	        if(sum%2!=0)
	            return false;
	        int target=sum/2;
	        return SubsetSum(nums,target,nums.length-1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
