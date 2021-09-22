/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 v have a sorted array,every element appears twice except one, find that element.
 * can be done using xor operation.

*/
 public class array_prob {
     static int singleelem(int arr[]){
         int res=arr[0];
       for(int i=1;i<arr.length;i++){
             res=res^arr[i];
         }  
       return res;
     }
     public static void main(String[] args) {
         int arr[]={1,1,2,2,3,3,4,50,50,65,65};
int res=singleelem(arr);        
         System.out.println(res);
         
//       int arr2[]=new int[66];
//       for(int i=0;i<arr.length;i++){
//           arr2[arr[i]]++;
//       }
////       for(int i:arr2){
////           System.out.println(i);
////       }
//       for(int i=0;i<arr2.length;i++){
//          if(arr2[i]==1){
//              System.out.println("the element that appears only once is: "+i);
//          }
//       }
     }
}
