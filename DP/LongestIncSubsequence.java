
public class LongestIncSubsequence {
	public static int meth(int nums[]){
		if(nums.length==0)
			return 0;
		return helper(-1,0,nums);
	 	
	}
	static int helper(int prev,int curr,int nums[]) {
		if(curr==nums.length)
			return 0;
		int inc=0;
		if(prev==-1||nums[prev]<nums[curr]) {
			 inc=1+helper(curr,curr++,nums);
		}
		
			int notinc=helper(prev,curr++,nums);
	
	return Math.max(inc, notinc);
	}
		
	public static int dp(int nums[]) {
		if(nums.length==0) {
			return 0;
		}
		int lis[]=new int[nums.length];
//		we place 1 in array as each element can be considered a seperate elementwith size 1
		for(int i=0;i<lis.length;i++) {
			lis[i]=1;
		}
		for(int i=1;i<lis.length;i++) {
			for(int j=0;j<i;j++) {
		if(nums[i]>nums[j]) {
//			adding one is because we are including the number in our subsequence
			lis[i]=Math.max(lis[i],lis[j]+1);
		}
		}
		}
		for(int i:lis) {
			System.out.println(i);
		}
		int max=lis[0];
		for(int i=1;i<lis.length;i++) {
			if(lis[i]>max)
				max=lis[i];
		}
		return max;
	}

	public static void main(String[] args) {
int nums[]= {5,7,8,1,9};
System.out.println("LIS is:-"+dp(nums));
	}

}
