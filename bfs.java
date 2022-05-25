import java.util.LinkedList;

public class bfs {
    public static void main(String[] args) {
        int adj[][] = {
                { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 0, 1, 0, 1 },
                { 1, 0, 0, 1, 0 }
        };
        bfs_graph(adj, 0);
    }

    static void bfs_graph(int adj[][], int start) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean vis[] = new boolean[adj.length];
        vis[start] = true;
        queue.addLast(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);
            for (int i = 0; i < vis.length; i++) {
                if (adj[node][i] != 0 && vis[i] == false) {
                    queue.addLast(i);
                    vis[i] = true;
                }
            }
        }
    }
}
