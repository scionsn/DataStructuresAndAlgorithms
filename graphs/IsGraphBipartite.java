import java.util.LinkedList;

//bipartite graphs are used in online ads etc
public class IsGraphBipartite {
	public boolean isBipartite(int[][] graph) {
		int colors[] = new int[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if (colors[i] == 1 || colors[i] == -1)
				continue;
			LinkedList<Integer> queue = new LinkedList<>();
			queue.addLast(i);
			colors[i] = 1;
			while (!queue.isEmpty()) {
				int node = queue.removeFirst();

				for (int neighbr : graph[node]) {
					if (colors[neighbr] == 0) {
						colors[neighbr] = -colors[node];
						queue.addLast(neighbr);
					}
					if (colors[neighbr] == colors[node])
						return false;
				}
			}
		}
		return true;

	}

//    using dfs
	public boolean isBipartiteDFS(int[][] graph) {
//      we  maintain the visited as well as color here , to be diff bw adj and parent
		int visited_color[] = new int[graph.length];

//      here the graph is given to us in the form of an araylist
//  this loop is added so that we can traverse disconnected components of a graph as well and check if they are 
//      bipartite
		for (int i = 0; i < graph.length; i++) {
//          if the nodes are already colored/visited , no need to go there.
			if (visited_color[i] == 1 || visited_color[i] == -1)
				continue;
			LinkedList<Integer> stk = new LinkedList<>();
			stk.addFirst(i);
			visited_color[i] = 1;
			while (!stk.isEmpty()) {
				int node = stk.poll();
				System.out.println(node);
//              the graph though is a 2d array but is given in the form of an arraylist
				for (int adj : graph[node]) {
					System.out.println(adj);
					if (visited_color[adj] == 0) {
						visited_color[adj] = -visited_color[node];
						stk.addFirst(adj);
					}
//                  this case handles if any of the adjacent node is same color as the parent node then
//                  simply return false as we cant partition the graph
//                  this happens in case of odd number of vertices
					if (visited_color[node] == visited_color[adj]) {
						System.out.println(adj);

						System.out.println(visited_color[node]);
						return false;

					}

				}
			}

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
