//ref gfg
public class PrefixSum {
public static int[] prefsum(int arr[]) {
	int[] res=new int[arr.length];
	res[0]=arr[0];
	for(int i=1;i<arr.length;i++)
		res[i]=arr[i]+res[i-1];
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,10,15,20,21};
for(int i:prefsum(arr))
System.out.println(i);
	}

}
