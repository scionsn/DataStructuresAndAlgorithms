//ref codebix
public class DetectCycleInUndirecGraph {
	static boolean cycleExist(int graph[][]) {
		boolean vis[] = new boolean[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if (vis[i] == false) {
//		we pass -1 as the parent of src node as it has no parent
//		this method returns if cycle exists or not, true means cycle exists and vice versa
				if (dfsHelperCycle(graph, vis, i, -1))
					return true;
			}

		}
		return false;
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

	public static void main(String args[]) {
		int mat[][] = { { 0, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 1 }, { 0, 0, 0, 1, 0 } };
		System.out.println(cycleExist(mat));
	}
}
