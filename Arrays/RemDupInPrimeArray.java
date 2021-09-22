import java.util.HashMap;

public class RemDupInPrimeArray {
	static int[] removeDuplicate(int arr[], int n)
	    {
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++){
		 map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
	}
	int res[]=new int[map.size()];
	int j=0;
	for(int i:map.keySet()) {
		res[j++]=i;
	}
	return res;
	    }
	public static void main(String[] args) {
		int arr[]= {2,2,3,3,7,5};
		for(int i:removeDuplicate(arr,arr.length)) {
			System.out.println(i);
		}
	}

}
