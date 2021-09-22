

/**
 find the first,second ,third largest element in the array.
 * note:-
1)Initialize two variables first and second to 0.
2) Start traversing the array,
   a) If the current element in array say arr[i] is greater
      than first. Then update first and second as,
      second = first
      first = arr[i]
   b) If the current element is in between first and second,
      then update second to store the value of current variable as
      second = arr[i]
3) Return the value stored in second.
 */
public class nth_largest_elem {
    public static void main(String[] args) {
        int arr[]={12,13,1,2,5,8,10};
        int first=0,second=0,third=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
                
            }
            else if(arr[i]>second&&arr[i]!=first){
                second=arr[i];
            }
            else if(arr[i]>third&&arr[i]!=first&&arr[i]!=second){
                third=arr[i];
            }
            
        }
        System.out.println(first+" "+second+" "+third);
        
//        for(int i=1;i<arr.length;i++){
//            if(max<arr[i]){
//                max=arr[i];
//                System.out.println(i);
//                 temp=arr[arr.length-1];
//                 arr[arr.length-1]=arr[i];
//                 arr[i]=temp;
//            }
//        }
//       
            
        
        
    
    }
}
