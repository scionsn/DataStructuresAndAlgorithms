import java.util.ArrayList;

//Given an array arr[] of size N of positive integers which may have duplicates. 
//The task is to find the maximum and second maximum from the array,
//and both of them should be distinct, so If no second max exists, then the second max will be -1.
public class MaxAndSecondMax {
	 public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
	    {
	ArrayList<Integer> res=new ArrayList<>();
	int max=arr[0];
	for(int i=0;i<arr.length;i++){
	    if(arr[i]>max){
	        max=arr[i];
	    }
	}
	res.add(max);
	int sec_max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++){
	   if(arr[i]==max){
	       continue;
	   }
	   if(arr[i]>sec_max){
	       sec_max=arr[i];
	   }
	}
//	if secondmax doesnt exist then add -1 instead
	if(sec_max==Integer.MIN_VALUE)
	    res.add(-1);
	else
	res.add(sec_max);
	return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
