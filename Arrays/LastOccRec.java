/*
 Q:-to find the last occurrence of a character
 */

public class LastOccRec {
     static int lastoccur(int arr[],int data,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==data){
            return index;
            
        }
        else
            System.out.println("func. called");
            return lastoccur(arr,data,index-1);
    }
    public static void main(String[] args) {
      int arr[]={1,2,1,2,3};
      int find=2;
       int res= lastoccur(arr,find,arr.length-1);
        System.out.println(res==-1?find+ "  doesnt occur":find+" last found at index "+res);
    }
    
}
