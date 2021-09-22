
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCION
 */
public class UncrossedLines {
     public static int maxUncrossedLines(int[] A, int[] B) {
        int count=0;
        int asize=A.length;
        int bsize=B.length;
        boolean flag;
           for(int i=0;i<asize;i++){
              for(int j=0;j<asize;j++){
                  if(A[i]==B[j]){
                      count++;
                      System.out.println("print");
                      flag=true;
                      break;
                  }
              }
           }
           return count;
       
      
   
}
    public static void main(String[] args) {
        int a[]={2,5,1,2,5};
        int b[]={10,5,2,1,5,2};
        System.out.println(maxUncrossedLines(a,b));
    }
}
