import java.math.BigInteger;
// using biginteger
public class FactOfLargeNum {
   static BigInteger calcFact(int num){


BigInteger res=new BigInteger("1");
for(int i=1;i<=num;i++)
{
res=res.multiply(BigInteger.valueOf(i));
}
return res;
    }
    public static void main(String[] args) {

System.out.println( calcFact(20));       
    }
}
