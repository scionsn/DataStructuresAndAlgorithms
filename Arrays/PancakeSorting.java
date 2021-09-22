//Given an array of integers A, We need to sort the array performing a series of pancake flips.
//
//In one pancake flip we do the following steps:
//
//Choose an integer k where 0 <= k < A.length.
//Reverse the sub-array A[0...k].
//For example, if A = [3,2,1,4] and we performed a pancake flip 
//choosing k = 2, we reverse the sub-array [3,2,1], so A = [1,2,3,4] after the pancake flip at k = 2.
//
//Return an array of the k-values of the pancake flips that should be
//performed in order to sort A. Any valid answer that sorts the array within 10 * A.length flips will be judged as correct.
//1 <= A.length <= 100
//1 <= A[i] <= A.length
//All integers in A are unique (i.e. A is a permutation of the integers from 1 to A.length).

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
public static List<Integer> pancakeSort(int[] A) {
        List<Integer> res=new ArrayList<>();
        int ending=A.length;
        while(ending!=1) {
        	int index=findvalue(A,ending);
        	flip(A,index);
        	flip(A,ending-1);
        	res.add(index+1);
        	res.add(ending);
        	ending--;
        }
        return res;
    }
public  static int findvalue(int arr[],int value) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==value)
			return i;
	}
	return -1;

}
public static void flip(int arr[],int end) {
	int start=0;
while(start<end) {
	int temp=arr[start];
		arr[start++]=arr[end];
		arr[end--]=temp;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
