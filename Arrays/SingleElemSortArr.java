/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. 
 * Find this single element that appears only once.
 */
public class SingleElemSortArr {
     public static int singleNonDuplicate(int[] nums) {
 int size=nums.length;
         int res = nums[0]; 
        for (int i = 1; i <size; i++) {
            res = res ^ nums[i]; 
        }
        return res;

    }
    
    public static void main(String[] args) {
        int arr[]={1,1,2,5,4,4,3,2,3};
       int res= singleNonDuplicate(arr);
        System.out.println(res);
    }
}
