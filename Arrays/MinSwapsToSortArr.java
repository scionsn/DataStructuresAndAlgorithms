import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//ref gfg
//can be done using slection sort too, but the tc will be O n^2, and constant space,
class p
{
	int val;
	int idx;
	public p(int val,int idx)
	{
		this.val=val;
		this.idx=idx;
	}
}
public class MinSwapsToSortArr {
static int swapcount(int arr[]) {
	int ans=0;
	if(arr.length==0)
		return 0;
	ArrayList<p> lis=new ArrayList<p>();
	for(int i=0;i<arr.length;i++)
	{
		p val=new p(arr[i],i);
		lis.add(val);
	}
	Collections.sort(lis,new Comparator<p>() {
		public int compare(p x,p y)
		{
			return x.val-y.val;
		}
	});
	for(int i=0;i<arr.length;i++)
	{
		if(lis.get(i).idx==i)
			continue;
		else
		{
//			swpping the elements to their index as that in the input array
			p temp=lis.get(lis.get(i).idx);
			lis.set(lis.get(i).idx, lis.get(i));
			lis.set(i, temp);
			ans++;
		}
//		the element that we just swapped, we check if its on its correct idx as it was in the prev array.
		if(lis.get(i).idx!=i)
		{
//			we go to the prev idx. so that we can place that point to its current idx,
			i--;
		}
	}
	
	return ans;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,5,4};
		System.out.println(swapcount(arr));
	}

}

