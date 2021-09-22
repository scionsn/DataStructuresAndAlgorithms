//convert string to number and handle corner cases
public class ImplementATOI {
	int atoi(String str)
    {
        // method 1
//        char[] arr=str.toCharArray();
//        int j=0;
//        int res=0;
//        for(int i=arr.length-1;i>=0;i--){
//             int num=arr[i];
//              if(num==45){
//res*=-1;
//continue;
//    }
//            if(num>=48&&num<=57){
//                 int val=Integer.parseInt(String.valueOf(arr[i]));
//
//            double add=val*Math.pow(10,j++);
//
//            res+=(int)add;
//            }
//            else{
//            return -1;
//            }
//        
//        }
//        return res;
		
        // method2  
 int res=0;
 int j=0;
 for(int i=str.length()-1;i>=0;i--){
     int val=str.charAt(i);
     if(val==45){
 res*=-1;
 continue;
     }
 if((val>=48&&val<=57)){
       int num=Integer.parseInt(String.valueOf(str.charAt(i))) ;
       double add=num*Math.pow(10,j++);
       res+=(int)add;
     }
     else{
     return -1;
 }
 }
 return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
