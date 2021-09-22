// check if graph is non cyclic and connected 
//ref gfg, if we can traveerse the entire graph from a single source this means that our graph is connected,
//and also we check for cycle
public class CheckIfGraphIsTree {
	static boolean CheckIfTree(int graph[][]) {
		boolean vis[] = new boolean[graph.length];
	int src=0;
			if (vis[src] == false) {
//		we pass -1 as the parent of src node as it has no parent
//		this method returns if cycle exists or not, true means cycle exists and vice versa
			boolean cycExist=dfsHelperCycle(graph, vis, src, -1);
			if(cycExist)
			{
				return false;

			}
			}
		for(int i=0;i<vis.length;i++)
		{
			if(vis[i]==false)
			{
				System.out.println(i);
				return false;
			}

		}
		return true;
	}

//	cycle exists only if we visit a vertex that has already been visited and that vertex isnt the 
//	parent of the current vertex and thus we pass the parent along
	static boolean dfsHelperCycle(int graph[][], boolean vis[], int src, int parent) {
		vis[src] = true;
		for (int i = 0; i < graph.length; i++) {
			if (graph[src][i] != 0 ) {
				if(vis[i] == false)
				{
					// passing the parent of vertex that we are going to visit
//				checks for each subproblem if there is a cycle or not, if cycle is there
//					we check if the current vertex forms a cycle with parent , if it does
//					this means no cyccle else cycle
					if (dfsHelperCycle(graph, vis, i, src))
					{
						return true;

					}	
				}
				
//			cycle exists only if we visited  a vertex thats been vis before and 
//				the adj node is not a parentof cuurent vertex
				else if(i!=parent)
					
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 0, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0}, { 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 1 }, { 0, 0, 0, 1, 0 } };
		System.out.println(CheckIfTree(mat));
	}

}
