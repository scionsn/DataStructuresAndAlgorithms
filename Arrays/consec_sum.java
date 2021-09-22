/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_algo;

/**
 * find the sum of consecutive n elements.
 */
public class consec_sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5,6,2};
        int i=0,j=1,k=2;
        int sum=0;
        for(int c=0;c<arr.length;c++){
            if(k<arr.length){
            sum=arr[i++]+arr[j++]+arr[k++];
            System.out.println(sum);
            }
        }
//        System.out.println(sum);
    }
}
