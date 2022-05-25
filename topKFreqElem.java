import java.util.HashMap;
import java.util.PriorityQueue;

public class topKFreqElem {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        // we want to sort our maxheap based on the occuernce of value in our map
        PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b)->{return map.get(b)-map.get(a);});
        for(int i=0;i<nums.length;i++)
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        for(int keys:map.keySet())
        {
            maxheap.add(keys);
        }
         int i=0;
      while(i<k)
    res[i++]=maxheap.poll();
        
        return res;
    }
}
