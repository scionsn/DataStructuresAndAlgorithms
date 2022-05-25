
// ref-pepcoding
import java.util.ArrayList;
import java.util.LinkedList;

public class TopologSort {

    public static ArrayList<Integer> topsort(int matr[][]) {
        boolean vis[] = new boolean[matr.length];
        LinkedList<Integer> stk = new LinkedList<>();
        for (int i = 0; i < matr.length; i++) {
            // we check if the node is visited already since we don't want to visit it again
            if(vis[i]==false)
            helper(matr, stk, i, vis);
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stk.isEmpty()) {
           int val= stk.poll();
           System.out.println(val);
            res.add(val);
        }
        return res;
    }

    public static void helper(int matr[][], LinkedList<Integer> stk, int v, boolean[] vis) {
        vis[v] = true;
        for (int i = 0; i < matr.length; i++) {
            if (matr[v][i] == 1 && vis[i] == false) {
                helper(matr, stk, i, vis);
            }
        }
        // this usually adds the vertex while backtracing, as soon as we see that there
        // are no outgoing
        // edges from a vertex.
        stk.addFirst(v);

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 0, 1, 0, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 0 }
        };
       topsort(arr);
       

    }
}
