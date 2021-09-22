//ref-GFG
//using binary search
public class RowWithMaxOne {
	static int rowWithMax1s(int arr[][]) {
        int max_count_one=Integer.MIN_VALUE;
        int max_one_row=-1;
for(int i=0;i<arr.length;i++)
{
    int index=findFirstOne(arr[i],0,arr[0].length-1);
if(index==-1)
continue;
   int count_one=arr[0].length-index;
   if(index!=-1&&count_one>max_count_one)
   {
       max_count_one=count_one;
       max_one_row=i;
   }

}
return max_one_row;
    }
   static int  findFirstOne(int arr[],int low,int high)
    {
        if(high>=low)
        {
            int mid=low+(high-low)/2;
//            the condition after && checks if either my index is 0 st first one is at zero index
//            or my elem before 1 is 0 st we have found first one now.
            if(arr[mid]==1&&(mid==0||arr[mid-1]==0))
            return mid;
            else if(arr[mid]==0)
             return  findFirstOne(arr,mid+1,high);
            else
              return findFirstOne(arr,low,mid-1);
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{0,0,1,1},
				{0,1,1,1},
				{0,0,0,1},
				{1,1,1,1}
				};
System.out.println(rowWithMax1s(arr));
	}

}
