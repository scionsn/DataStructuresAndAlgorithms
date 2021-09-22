import java.util.HashMap;

public class SmallestNumberByRearrangeDigitsOfNum {
public static int func(int number)
{
	int res=0;
	HashMap<Integer,Integer> map=new HashMap<>();
while(number>0)
{
	int temp=number%10;
	map.put(temp,map.getOrDefault(temp, 0)+1);
	number=number/10;
}
System.out.println(map);
//starting from 1 as leading zeroes are not allowed
for(int i=1;i<10;i++)
{
	if(map.get(i)!=null)
	{
		res=i;
//		decreasing the count of i once its included in the result
		map.put(i,map.get(i)-1);
		break;
	}
}
//now we can include zeroes after adding the leftmost digit in the result
for(int i=0;i<10;i++)
{
//	checking if the value exists in the map and also if its count isnt zero so that we can include it in the result
	if(map.get(i)!=null&&map.get(i)!=0)
	{
//		including the digits of the given num in ascending order
		res=res*10+i;
		map.put(i,map.get(i)-1);
	}
}
return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(func(846903));
	}

}
