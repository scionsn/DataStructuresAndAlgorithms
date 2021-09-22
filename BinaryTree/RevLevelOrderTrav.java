import java.util.ArrayList;
import java.util.LinkedList;

public class RevLevelOrderTrav {
	public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
if(node==null)
return null;
    
    ArrayList<Integer> res=new ArrayList<>();
    LinkedList<Node> q=new LinkedList<>();
    LinkedList<Node> stk=new LinkedList<>();
q.addLast(node);
    while(!q.isEmpty())
    {
        Node rem=q.poll();
        stk.addFirst(rem);
        if(rem.right!=null)
        {
            q.addLast(node.right);
        }
        if(rem.left!=null)
        {
            q.addLast(node.left);
        }
        
    }
    while(!stk.isEmpty())
    {
        Node val=stk.pop();
    res.add(val.data);
    }
    return res;
}
