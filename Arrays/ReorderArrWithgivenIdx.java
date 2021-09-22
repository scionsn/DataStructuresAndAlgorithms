//ref gfg
public class ReorderArrWithgivenIdx {
static int[] func(int arr[],int indexes[])
{
//	the other array just puts the valuess acc to idx value associated with the arr
	int temp[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
		temp[indexes[i]]=arr[i];
	for(int i=0;i<arr.length;i++)
		arr[i]=temp[i];
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {1,2,3,4};
int idx[]= {1,0,3,2};
for(int i:func(arr,idx))
	System.out.println(i);
	}

}
