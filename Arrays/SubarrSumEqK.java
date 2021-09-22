import java.util.HashMap;
//ref codebix
public class SubarrSumEqK {
    public int subarraySum(int[] nums, int k) {
        int prefsum=0, res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            prefsum+=nums[i];
//             we check if we have any gain in our map from the prefsum till that index - k
            int gain=prefsum-k;
            if(map.containsKey(gain))
//                 if increase the value of res by the freq and not by one , as in  case of negative elem,
//                 our prefsum might repeat , so in that case value of result depends upon the freq of prefsum
                res+=map.get(gain);
                    map.put(prefsum,map.getOrDefault(prefsum,0)+1);

        }
            return res;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
