import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TopView {
	static ArrayList<Integer> topView(Node root)
    {
       ArrayList<Integer> res=new ArrayList<>();
 TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
		 int vert_dist=0;
		 helper(root,map,vert_dist);
		 for(Map.Entry<Integer,ArrayList<Integer>> treenode:map.entrySet())
		 {
			 //System.out.println(treenode.getValue());
			 
//			 getvalue returns an arraylist so we need to get the first value of that arraylist as thats what is the
//			 top view for the BT
			 int topview_node=treenode.getValue().get(0);
			 res.add(topview_node);
		 }
		 return res;
    }
   static void helper(Node root,TreeMap<Integer,ArrayList<Integer>> map,int vert_dist) {
		 if(root==null)
			 return;
		 if(map.get(vert_dist)==null)
		 {
			 ArrayList<Integer> nodes=new ArrayList<>();
			 nodes.add(root.data);
			 map.put(vert_dist,nodes);
			 
		 }
		 else
		 {
			 ArrayList<Integer> nodes=map.get(vert_dist);
			 nodes.add(root.data);
			 map.put(vert_dist,nodes);
		 }
		 helper(root.left,map,vert_dist-1);
		 helper(root.right,map,vert_dist+1);
	 }
}
