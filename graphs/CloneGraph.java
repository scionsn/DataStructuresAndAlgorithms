import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
//bfs
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneGraph {
    public Node cloneGraph(Node node) {
	 if(node==null)
         return node;
     LinkedList<Node> queue=new LinkedList<>();
     HashMap<Node,Node> map=new HashMap<>();
     queue.addLast(node);
     map.put(node,new Node(node.val,new ArrayList<>()));
     while(!queue.isEmpty()){
         Node n=queue.removeFirst();
         for(Node neighbr:n.neighbors){
             if(!map.containsKey(neighbr)){
                 map.put(neighbr,new Node(neighbr.val,new ArrayList<>()));
                 queue.addLast(neighbr);
             }
             map.get(n).neighbors.add(map.get(neighbr));
         }
     }
 return map.get(node);
 }
}
