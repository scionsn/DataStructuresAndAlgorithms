;

/**
 v have a sorted array,every element appears twice except one, find that element.
 * here 

*/
 public class twice_and_one {
     public static void main(String[] args) {
         int arr[]={1,1,2,2,3,3,4,50,50,65,65};
       int arr2[]=new int[66];
       for(int i=0;i<arr.length;i++){
           arr2[arr[i]]++;
       }
//       for(int i:arr2){
//           System.out.println(i);
//       }
       for(int i=0;i<arr2.length;i++){
          if(arr2[i]==1){
              System.out.println("the element that appears only once is: "+i);
          }
       }
     }
}
