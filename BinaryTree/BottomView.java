
public class BottomView {
	class point{
	    Node root;
	    int x=0;
	    int y=0;
	    point(Node root,int x,int y){
			this.root=root;
			this.x=x;
			this.y=y;
		}
	}
	class Tree
	{
	 
	    // Method that returns the bottom view.
	    public ArrayList <Integer> bottomView(Node root)
	    {
	        ArrayList<Integer> res=new ArrayList<>();
		        if(root==null)
		        	return null;
		        TreeMap<Integer,PriorityQueue<point>> map=new TreeMap<>();
//		        treemap so that our x i.e our key remains sorted
		        Queue<point> queue=new LinkedList<>();
		        Comparator<point> comp=(a,b)->{
		        	if(a.y==b.y)
		        		return a.root.data-b.root.data;
		        	
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
		int size=heap.size();
		for(int i=0;i<size;i++){
		    if(i==size-1){
		        res.add(heap.poll().root.data);
		    }
		    heap.poll();
		}
//	 	List<Integer> sublist=new ArrayList<>();
//	 	while(!heap.isEmpty()) {
//	 		sublist.add(heap.poll().root.val);
//	 	}
		
//	 	res.add(sublist);
	}


	return res;
}
	    
	    
	    
//	    recursive implementation but not fully working
	    public ArrayList <Integer> bottomView(Node root)
	    {

		  ArrayList<Integer> res=new ArrayList<>();
		 TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
				 int vert_dist=0;
				 helper(root,map,vert_dist);
				 for(Map.Entry<Integer,ArrayList<Integer>> treenode:map.entrySet())
				 {
					 //System.out.println(treenode.getValue());
					 ArrayList<Integer> nodes=treenode.getValue();
//					 getting the last value from the arraylist
					int btmview_node= nodes.get(nodes.size()-1);
					 res.add(btmview_node);
				 }
				 return res;    
		    }

		     static void helper(Node root,TreeMap<Integer,ArrayList<Integer>> map,int vert_dist) 
		     {
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
