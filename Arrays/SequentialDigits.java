import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
	 public List<Integer> sequentialDigits(int low, int high) {
//       highest seq is of 9 digits as given in constraints. and highest possible 9 digit seq is 123456789.
//		 so we can obtain every sequnce from the string.
       String s="123456789";
       List<Integer> res=new ArrayList<>();
//        we start from i=2 as in constraints the lowest value of  low can be 10.
//       j+i is added so that the numbers picked are of fixed length only.
       for(int i=2;i<10;i++){
           for(int j=0;j+i<10;j++){ 
               int check=Integer.parseInt(s.substring(j,j+i));
               if(check>=low){
                   if(check<=high){
                       res.add(check);
                   }
                    else{
                   return res;
               }
                  
               }
                
              
           }
       }
       return res;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
