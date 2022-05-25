// djikstra algo
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class networkDelayTime {
    public int networkDelay(int[][] times, int n, int k) {

        ArrayList<ArrayList<graph>> adjlis = new ArrayList<>();
        PriorityQueue<info> q = new PriorityQueue<>((info node1, info node2) -> {
            return node1.wsf - node2.wsf;
        });
        // hashmap to keep the cost to reach all the vtx of the graph
        HashMap<Integer, Integer> mp = new HashMap<>();
        boolean vis[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            adjlis.add(new ArrayList<>());
        }
        for (int i = 0; i < times.length; i++) {
            adjlis.get(times[i][0]).add(new graph(times[i][1], times[i][2]));
        }
        q.add(new info(k, 0));
        while (!q.isEmpty()) {
            info curr = q.poll();
            if (mp.containsKey(curr.value))
                continue;
            else
                mp.put(curr.value, curr.wsf);

            vis[curr.value] = true;

            for (graph g : adjlis.get(curr.value)) {
                if (vis[g.value] == false) {
                    q.add(new info(g.value, curr.wsf + g.wt));
                }
            }
        }
        // if the size of the hashmap is less than the number of vtx then we havent
        // visited
        // all the vtx of the graph,so return -1 as we cant traverse to all the vtxs
        int res = -1;
        if (mp.size() != n) {
            return res;
        }
        // values method returns all the values mapped to all the keys in the map
        for (int i : mp.values()) {
            res = Math.max(i, res);
        }

        return res;

    }
    public static void main(String[] args) {
        
    }
}

class graph {
    int value;
    int wt;

    graph(int node, int wt) {
        this.value = node;
        this.wt = wt;
    }
}

class info {
    int value;
    int wsf;

    info(int value, int wsf) {
        this.value = value;
        this.wsf = wsf;
    }
}
