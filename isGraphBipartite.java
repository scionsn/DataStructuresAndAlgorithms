import java.util.HashMap;
import java.util.LinkedList;

// ref - striver and codebix
// a graph with only 1 vertex is also bipartite.
public class isGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        LinkedList<Integer> q = new LinkedList<>();
        // hashmap plays the role of visited array here as well, and also helps in
        // coloring the vtxs
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            // 0 indicates unvisited/uncolored
            mp.put(i, 0);
        }
        // since this graph contains disconnected components and for a graph to
        // be bipartite all the components should be bipartite
        for (int i = 0; i < graph.length; i++) {
            if (mp.get(i) == 0) {
                if (bfs(q, i, mp, graph) == false)
                    return false;
            }
        }
        return true;
    }

    boolean bfs(LinkedList<Integer> q, int vtx, HashMap<Integer, Integer> mp, int[][] graph) {
        q.addLast(vtx);
        // one indicates color 'a' or set a
        mp.put(vtx, 1);
        while (!q.isEmpty()) {
            int node = q.removeFirst();

            for (int nbr : graph[node]) {

                if (mp.get(nbr) == 0) {
                    // we are coloring the child vtx as opposite to the color of parent vtx
                    // opposite color indicates set 'b'
                    mp.put(nbr, -1 * mp.get(node));
                    q.addLast(nbr);
                }
                // if the color of parent vtx isn't opposte to that of child vtx ,
                // this means that bi-partition isnt possible
                else if (mp.get(nbr) != (-1 * mp.get(node))) {
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
