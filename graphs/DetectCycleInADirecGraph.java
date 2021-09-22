import java.util.ArrayList;
import java.util.HashMap;

//ref codebix
//visited just keeps all the visited nodes whereas helper changes the node state while backtracking.so as to not provide invalid input
// some cases where there is no cycle present. visited array isnt changed , it helps keep track of all the visited
// nodes so that they are not traversed again.
public class DetectCycleInADirecGraph {
	static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int V) {
		boolean vis[] = new boolean[V];
		boolean currentdfs[] = new boolean[V];
		for (int i = 0; i < adj.size(); i++) {
			if (vis[i] == false) {
				boolean ans = cyclehelper(adj, vis, currentdfs, i);
//				if cycle return true else false
				if (ans == true)
					return true;
			}

		}
		return false;
	}

	static boolean cyclehelper(ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] currentdfs, int i) {
		vis[i] = true;
		currentdfs[i] = true;
		for (int node : adj.get(i)) {
			if (currentdfs[node] == true)
				return true;
//          we check if the node we are checking is unvisited so that we should  traverse that node or not
			// visited array contains if our node has been traversed before or not,
//			so it doesnt makes any sense traversing it again, 
//			while currentdfs changes in backtracking , vis remains same		
			if (vis[node] == false) {
				boolean ans = cyclehelper(adj, vis, currentdfs, node);
				if (ans == true)
					return true;
			}

		}
//		backtracking and making the node as unvisited so that when prev nodes trverse to their unvis adj nodes,
//		then we dont get any unnecessary cycle
		currentdfs[i] = false;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
