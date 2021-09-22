import java.util.Arrays;

public class SortFirstKAscendRestDesc {
public static int[] sortfirstk(int arr[],int k) {
	int n=arr.length;
	int arr1[]=new int[k];
	int arr2[]=new int[n-k];
	for(int i=0;i<k;i++)
	{
		arr1[i]=arr[i];
	}
	for(int i=k;i<arr.length;i++)
	{
		arr2[i-k]=arr[i];
	}
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	int arr2lenvar=arr2.length;
	for(int i=0;i<arr.length;i++)
	{
	if(i<k)
	{
		arr[i]=arr1[i];
	}
	else
	{
	arr[i]=arr2[arr2lenvar-1];
	arr2lenvar--;
	}
	}
	return arr;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,6,2,1,3,8,9};
for(int i:sortfirstk(arr,4))
{
	System.out.println(i);
}
	}

}
