/*
 */
package ds_algo;

/**
 given an array,find a pair whose sum is equal to k.
 * should be  solved using hashing,
 * by making a duplicate array to get time comp. O(n).
 */
public class pair_arr {
    
    public static void main(String[] args) {
        //time comp. O(n2)
    int arr[]={2,9,6,3,1,10,4};
    int k=6;
    int j=0;
    for(int i=0;i<arr.length-1;i++)
    {
      int find=k-arr[i];
     for(j=i+1;j<arr.length;j++)
    {
     if(find==arr[j]){
    System.out.println(arr[i]+ " "+arr[j]);   
    }       
    }
    }
    }
    }
