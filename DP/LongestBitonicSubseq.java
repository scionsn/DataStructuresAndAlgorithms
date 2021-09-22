
public class LongestBitonicSubseq {
public static int dp(int nums[]) {
	int LIS[]=new int[nums.length];
	int LDS[]=new int[nums.length];
	int res[]=new int[nums.length];
	for(int i=0;i<nums.length;i++) {
		LIS[i]=1;
		LDS[i]=1;
	}
	for(int i=1;i<LIS.length;i++) {
		for(int j=0;j<i;j++) {
			if(nums[i]>nums[j]) {
				LIS[i]=Math.max(1+LIS[j], LIS[i]);
			}
		}
	}
	for(int i:LIS) {
		System.out.println("LIS "+i);
	}
	for(int i=LDS.length-2;i>=0;i--) {
		for(int j=LDS.length-1;j>i;j--) {
			if(nums[i]>nums[j]) {
				LIS[i]=Math.max(1+LIS[j], LIS[i]);
			}
		}
	}
	for(int i:LDS) {
		System.out.println("LDS "+i);
	}
//	we do this step because the middle elem 10 appears twice in both inc. and dec array
//	eg.- 1,5,10(inc). 10,4,3(dec)
	for(int i=0;i<res.length;i++) {
		res[i]=LIS[i]+LDS[i]-1;
	}
	int max=res[0];
	for(int i=0;i<res.length;i++) {
		if(res[i]>max)
			max=res[i];
	}
	return max;

	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,5,2,10,4,3,9};
System.out.println(dp(arr));

	}

}
