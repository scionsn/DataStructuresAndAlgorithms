//codebix

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
class point{
	TreeNode root;
	int x;
	int y;
	point(TreeNode root,int x,int y){
		this.root=root;
		this.x=x;
		this.y=y;
	}
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      } 
      }
//leetcode involving x and y
public class VerticalTraversalBT {
	 public List<List<Integer>> verticalTraversal(TreeNode root) {
	        List<List<Integer>> res=new ArrayList<>();
	        if(root==null)
	        	return null;
	        TreeMap<Integer,PriorityQueue<point>> map=new TreeMap<>();
//	        treemap so that our x i.e our key remains sorted
	        Queue<point> queue=new LinkedList<>();
	        Comparator<point> comp=(a,b)->{
	        	if(a.y==b.y)
	        		return a.root.val-b.root.val;
	        	
	        	else
	        		return a.y-b.y;
	        };
	        queue.add(new point(root,0,0));
while(!queue.isEmpty()) {
	point p1=queue.remove();
	root=p1.root;
	map.putIfAbsent(p1.x,new PriorityQueue<point>(comp) );
	map.get(p1.x).add(p1);
	if(root.left!=null) {
		queue.add(new point(root.left,p1.x-1,p1.y+1));
		
	}
	if(root.right!=null) {
		queue.add(new point(root.right,p1.x+1,p1.y+1));
		
	}
	
}
for(int key:map.keySet()) {
	PriorityQueue<point> heap=map.get(key);
	List<Integer> sublist=new ArrayList<>();
	while(!heap.isEmpty()) {
		sublist.add(heap.poll().root.val);
	}
	res.add(sublist);
}


return res;
	        
	    }
//	 involving  only vertical dist i.e y
//	 void vertical(TreeNode root) {
//		 LinkedList<TreeNode> queue=new LinkedList<>();
//		 TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
//		 
//		 int verticaldist=0;
//		 if(root==null)
//			 return ;
//		 queue.addLast(root);
//		 while(!queue.isEmpty()) {
//			 int size=queue.size();
//			 for(int i=0;i<size;i++) {
//				 TreeNode rem=queue.removeFirst();
//				 map.put(verticaldist,root.val);
//				 if(rem.left!=null) {
//					 
//					 queue.addLast(rem.left);
//				 map.put(verticaldist-1,rem.left.val );
//				 }
//				 if(rem.right!=null) {
//					 queue.addLast(rem.right);
//			 map.put( verticaldist+1,rem.right.val);
//				 }
//			 }
//		 }
		 
		 
//	 }
	 public void vertialTraversal(Node root) {
		 TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
		 int vert_dist=0;
		 helper(root,map,vert_dist);
		 for(Map.Entry<Integer,ArrayList<Integer>> treenode:map.entrySet())
		 {
			 System.out.println(treenode.getValue());
		 }
	 }
	 void helper(Node root,TreeMap<Integer,ArrayList<Integer>> map,int vert_dist) {
		 if(root==null)
			 return;
		 if(map.get(vert_dist)==null)
		 {
			 ArrayList<Integer> nodes=new ArrayList<>();
			 nodes.add(root.val);
			 map.put(vert_dist,nodes);
			 
		 }
		 else
		 {
			 ArrayList<Integer> nodes=map.get(vert_dist);
			 nodes.add(root.val);
			 map.put(vert_dist,nodes);
		 }
		 helper(root.left,map,vert_dist-1);
		 helper(root.right,map,vert_dist+1);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
