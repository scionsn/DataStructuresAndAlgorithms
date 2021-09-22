
public class MaxSumPathInTwoArrays {
	 public int maxSum(int[] nums1, int[] nums2) {
	        int res=0,i=0,j=0;
	long sum1=0,sum2=0;
	    while(i<nums1.length&&j<nums2.length){
	        if(nums1[i]<nums2[j]){
	            sum1+=nums1[i++];
	        }
	        else if(nums2[j]<nums1[i]){
	            sum2+=nums2[j++];
	        }
	        else
	        {
	            res+=Math.max(sum1,sum2)+nums1[i];
	            sum1=0;
	            sum2=0;
	            i++;
	            j++;
	        }
	    }
	        while(i<nums1.length){
	            sum1+=nums1[i++];
	        }
	        while(j<nums2.length){
	            sum2+=nums2[j++];
	        }
	       
	        res+=Math.max(sum1,sum2);
//	        tackle large inputs
	        long ans=res%1000000007;
	        return (int)ans;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
