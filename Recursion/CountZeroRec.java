/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 count no. of 0's in a number
 */
public class CountZeroRec {
        static int countzero(int arr[],int index,int count){
            if(index==arr.length){
                return count;
            }
            if(arr[index]==0){
              return  countzero(arr,index+1,count+1);
            }
            else return countzero(arr,index+1,count);
        }
       
    public static void main(String[] args) {
        int arr[]={0,1,0,0};
     int res=   countzero(arr,0,0);
        System.out.println(res>0?"count of 0 is "+res:" zero doesnt exist");
    }
    
}
