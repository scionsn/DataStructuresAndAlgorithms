import java.util.HashSet;
import java.util.LinkedList;

public class CountPairsThatSumToX {
	 public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
             int x) {
                 if(head1==null||head2==null)
                 return 0;
HashSet<Integer> set=new HashSet<>();
int count=0;
for(int i=0;i<head1.size();i++)
{
set.add(head1.get(i));
}
for(int i=0;i<head2.size();i++)
{
int val=x-head2.get(i);
if(set.contains(val))
{
count++;
}
}
return count;
}
}
