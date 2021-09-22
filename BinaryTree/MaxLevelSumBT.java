import java.util.LinkedList;

public class MaxLevelSumBT {
public int maxLevelSum(Node root)
{
	if(root==null)
		return 0;
	LinkedList<Node> q=new LinkedList<>();
	q.addLast(root);
int max=0;
while(!q.isEmpty())
{
	int size=q.size();
	for(int i=0;i<size;i++)
	{
		Node rem=q.poll();
		int val=0;
		for(int i=0;i<size;i++)
		{
			val+=q.get(index);
			
		}
		if(val>max)
			max=val;
		if(rem.left!=null)
		{
			q.addLast(rem.left);
		}
		if(rem.right!=null)
		{
			q.addLast(rem.right);
		}
	}
}
return max;

}
}
