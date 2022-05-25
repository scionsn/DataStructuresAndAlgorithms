//ref-pepcoding and gfg

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
    int wsf;
    String node_trvld;

    pair(int value, int wsf, String node_trvld) {
        this.value = value;
        this.wsf = wsf;
        this.node_trvld = node_trvld;
    }

    public int compareTo(pair p) {
        return this.wsf - p.wsf;
    }
}

public class Djikstra {

    static void djikstra_algo(ArrayList<ArrayList<graph>> adjlis, int src) {
        System.out.println(adjlis.size());
        boolean vis[] = new boolean[adjlis.size()];
        PriorityQueue<pair> minheap = new PriorityQueue<>();
        minheap.add(new pair(src, 0, src + ""));
        while (!minheap.isEmpty()) {
            pair current = minheap.poll();
            if (vis[current.value] == true)
                continue;
            vis[current.value] = true;
            for (graph g : adjlis.get(current.value)) {
                if (vis[g.value] == false) {
                    minheap.add(new pair(g.value, g.wt + current.wsf, current.value + "" + g.value));
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<graph>> adjlist = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
			adjlist.add(new ArrayList<>());
		}
        adjlist.get(0).add(new graph(1, 10));
        adjlist.get(0).add(new graph(3, 40));
        adjlist.get(1).add(new graph(2, 10));
        adjlist.get(1).add(new graph(0, 10));
        adjlist.get(2).add(new graph(3, 10));
        adjlist.get(2).add(new graph(1, 10));
        adjlist.get(3).add(new graph(4, 2));
        adjlist.get(0).add(new graph(0, 40));
        adjlist.get(4).add(new graph(3, 2));
        adjlist.get(4).add(new graph(5, 3));
        adjlist.get(4).add(new graph(6, 8));
        adjlist.get(5).add(new graph(4, 3));
        adjlist.get(5).add(new graph(6, 3));
        adjlist.get(6).add(new graph(4, 8));
        adjlist.get(6).add(new graph(5, 3));
        int src = 0;
        djikstra_algo(adjlist, src);
    }
}
