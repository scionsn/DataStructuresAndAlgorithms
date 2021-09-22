
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 * Given a set of distinct positive integers, find the largest subset 
 * such that every pair (Si, Sj) of elements in this subset satisfies:

Si % Sj = 0 or Sj % Si = 0.

If there are multiple solutions, return any subset is fine.
* it will be solved using recursion and backtracking
 */

public class LargestDivisibleSubset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> op=new ArrayList<>();

                   return op;
    
}
    public static void main(String[] args) {
        int arr[]={2,3,17,19};
        System.out.println();
        System.out.println(largestDivisibleSubset(arr)); 
        
    }
}
