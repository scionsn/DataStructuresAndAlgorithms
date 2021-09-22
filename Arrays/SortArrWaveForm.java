//ref gfg
//trick- even idx are greater than the prev odd index and the next odd idx
//if they arent , then just swap the values
class SortArrWaveForm
{
	static void swap(int arr[],int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	static int[] sortwave(int arr[])
	  {
		for(int i=0;i<arr.length;i+=2)
		{
//			this cant check for zero as it would give underflow
			if(i>0&&arr[i]<arr[i-1])
			{
				swap(arr,i,i-1);
			}
//			this can check for zero idx but not last idx as it would give overflow
			if(i<arr.length-1&&arr[i]<arr[i+1])
			{
				swap(arr,i,i+1);
			}
		}
		return arr;
	       }
	public static void main(String[] args)
	{
		int arr[]= {10, 5, 6, 3, 2, 20, 100, 80};
		for(int i:sortwave(arr))
			System.out.println(i);
	}
}