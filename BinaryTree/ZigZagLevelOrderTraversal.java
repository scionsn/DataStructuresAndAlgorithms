import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
public class ZigZagLevelOrderTraversal {
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    
	    ArrayList<Integer> res=new ArrayList<>();
       LinkedList<Node> s1=new LinkedList<>();
        LinkedList<Node> s2=new LinkedList<>();
        s1.addFirst(root);
    while(!s1.isEmpty()||!s2.isEmpty()){
        
        while(!s1.isEmpty()){
                Node rem1=s1.removeFirst();
res.add(rem1.data);
if(rem1.left!=null){
            s2.addFirst(rem1.left);
        }
        if(rem1.right!=null){
            s2.addFirst(rem1.right);
        }
        }
    while(!s2.isEmpty()){
                Node rem2=s2.removeFirst();
res.add(rem2.data);
if(rem2.right!=null){
            s1.addFirst(rem2.right);
        }
        if(rem2.left!=null){
            s1.addFirst(rem2.left);
        }
    }
    }
        return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
