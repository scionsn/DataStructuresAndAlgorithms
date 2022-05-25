import java.util.LinkedList;

public class dfs {
    public static void main(String[] args) {
        int adj[][] = {
                { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 0, 1, 0, 1 },
                { 1, 0, 0, 1, 0 }
        };
        dfs_graph(adj, 0);
    }

    static void dfs_graph(int adj[][], int start) {
        LinkedList<Integer> stack = new LinkedList<>();
        boolean vis[] = new boolean[adj.length];
        vis[start] = true;
        stack.addFirst(start);
        while (!stack.isEmpty()) {
            int node = stack.poll();
            System.out.println(node);
            for (int i = 0; i < vis.length; i++) {
                if (adj[node][i] != 0 && vis[i] == false) {
                    stack.addFirst(i);
                    vis[i] = true;
                }
            }
        }
    }
}
