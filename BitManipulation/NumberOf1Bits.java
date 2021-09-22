//Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).


public class NumberOf1Bits {
    // you need to treat n as an unsigned value

    // ">>>" operator is used for right shifting in case of unsigned int shifting

public int hammingWeight(int n) {
   int count=0;
   while(n!=0){
      if((n&1)==1){
          count++;
      }
       n>>>=1;
   }
       return count;

}
public static void main(String args[]) {
	
}
}
