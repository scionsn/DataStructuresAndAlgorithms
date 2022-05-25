import java.util.HashMap;
import java.util.PriorityQueue;

class pair implements Comparable<pair>
{
int num;
int count;
pair(int num,int count)
{
this.num=num;
this.count=count;
}

@Override
public int compareTo(pair o) {
    //sort in ascending orer of the count 
    return this.count-o.count;
}
}
class minDistinctElem
{
    static void func(int arr[],int m)
    {
HashMap<Integer,Integer> map=new HashMap<>();
PriorityQueue<pair> minheap=new PriorityQueue<>();
for(int i=0;i<arr.length;i++)
{
    map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
}
System.out.println(map);

for(int keys:map.keySet())
{
    minheap.add(new pair(keys,map.get(keys)));
}
System.out.println(minheap.size());
for(int i=0;i<minheap.size();i++)
{
pair head=minheap.peek();
if(head.count<=m)
{
m=m-head.count;


}
else{

}
System.out.println(head.num+""+head.count);
}

// System.out.println(map);
    }
    public static void main(String args[]) {
        int arr[]={1,2,2,1,4};
        func(arr,3);
    }
}