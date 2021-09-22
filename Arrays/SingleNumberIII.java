import java.util.HashMap;

public class SingleNumberIII {
	 public static int[] singleNumber(int[] nums) {
		 int res[];
		 int j=0,count=0;
	        HashMap<Integer,Integer> map =new HashMap<>();
	        for(int i=0;i<nums.length;i++) {
	        	map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
	        }
	        for(int i:map.keySet()) {
	        	if(map.get(i)==1) {
	        	count++;
	        	}
	        }
	        res=new int[count];
	        for(int i:map.keySet()) {
	        	if(map.get(i)==1) {
	        	res[j++]=i;
	        	}
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,2,1,5};
		singleNumber(arr);
	}

}
