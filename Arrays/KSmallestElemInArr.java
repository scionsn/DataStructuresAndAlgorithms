import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
//ref gfg
public class KSmallestElemInArr {
static void printKSmallest(int arr[],int k)
{
//	maxheap stores the k smallest elements , so I have to print the maxheap in order to get the k smallest elements
//	collections .reverorder reverse the natureal flow i.e changes from asc to desc
	PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<k;i++)
	{
	maxheap.add(arr[i]);	
	}
//	as the root of maxheap contain the largest elements, so if we found an elem lesser than root
//	simply ad it into the maxheap and so on ,so now our maxheap will contain k smallest elem in the array
	for(int i=k;i<arr.length;i++)
	{
		if(maxheap.peek()>arr[i])
		{
			maxheap.poll();
			maxheap.add(arr[i]);
			
		}
	
	}
	Iterator i=maxheap.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,6,5,4,1,2};
printKSmallest(arr,3);
	}

}
