//ref-pepcoding

import java.util.ArrayList;
import java.util.PriorityQueue;

class graph {
    int value;
    int wt;

    graph(int node, int wt) {
        this.value = node;
        this.wt = wt;
    }
}

class pair implements Comparable<pair> {
    int value;
    int wt;
    int parent_vtx;

    pair(int value, int wt, int parent_vtx) {
        this.value = value;
        this.wt = wt;
        this.parent_vtx = parent_vtx;
    }

    public int compareTo(pair p) {
        return this.wt - p.wt;
    }
}

public class prims {
    static void prims_algo(ArrayList<ArrayList<graph>> adjlis, int src) {
        System.out.println(adjlis.size());
        boolean vis[] = new boolean[adjlis.size()];
        PriorityQueue<pair> minheap = new PriorityQueue<>();
        // we add -1 as parent of 0 i.e src since -1 is a dummy node and 0 dosnt
        // actually has any parent
        minheap.add(new pair(src, 0, -1));
        while (!minheap.isEmpty()) {

            pair current = minheap.poll();
            if (vis[current.value] == true)
                continue;
            vis[current.value] = true;
            for (graph g : adjlis.get(current.value)) {
                if (vis[g.value] == false) {
                    minheap.add(new pair(g.value, g.wt, current.value));
                }
            }
        }
    }

}
