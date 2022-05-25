import java.util.ArrayList;
import java.util.LinkedList;

public class CourseSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int n = numCourses;
        int arr[][] = prerequisites;

        boolean[] vis = new boolean[n];
        boolean[] currentdfs = new boolean[n];
        LinkedList<Integer> stk = new LinkedList<>();
        ArrayList<ArrayList<Integer>> adjlis = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjlis.add(new ArrayList<>());
        }
        // creating an adjlis based on the input from the matrix,storing in normal
        // adjlis format
        for (int i = 0; i < arr.length; i++) {
            adjlis.get(arr[i][0]).add(arr[i][1]);
        }
        boolean is_cyclic = false;
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                boolean ans = detectcyc_dfs(adjlis, vis, currentdfs, i);

                // System.out.println(vis[0]+""+vis[1]);

                if (ans == true)
                    is_cyclic = true;
                if (is_cyclic)
                    return new int[] {};
                // else
                // // if cycle then topo sort not possible so just return empty array.
                // return new int[]{};
            }
        }
        // using a seperate visited array for the topo sort method, since the first vis
        // array
        // was used by cyclic method
        boolean[] new_vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (new_vis[i] == false) {
                topo_sort(adjlis, new_vis, stk, i);
            }
        }
        // adding the elemets in rev from stack since order of work done from top sort
        // is given by reversing the stk

        int res[] = new int[stk.size()];
        System.out.println(stk.size());
        int i = stk.size() - 1;
        while (!stk.isEmpty()) {
            res[i--] = stk.poll();
        }
        return res;
    }

    static boolean detectcyc_dfs(ArrayList<ArrayList<Integer>> adjlis, boolean[] vis, boolean[] currentdfs, int i) {
        vis[i] = true;
        currentdfs[i] = true;
        for (int node : adjlis.get(i)) {
            if (currentdfs[node] == true)
                return true;
            // we check if the node we are checking is unvisited so that we should traverse
            // that node or not
            // visited array contains if our node has been traversed before or not,
            // so it doesnt makes any sense traversing it again,
            // while currentdfs changes in backtracking , vis remains same
            if (vis[node] == false) {
                boolean ans = detectcyc_dfs(adjlis, vis, currentdfs, node);
                if (ans == true)
                    return true;
            }
        }
        // backtracking and making the node as unvisited so that when prev nodes trverse
        // to their unvis adj nodes,
        // then we dont get any unneccary cycle
        currentdfs[i] = false;
        return false;
    }

    static void topo_sort(ArrayList<ArrayList<Integer>> adjlis, boolean[] vis, LinkedList<Integer> stk, int i) {
        vis[i] = true;
        for (int node : adjlis.get(i)) {
            if (vis[node] == false) {
                topo_sort(adjlis, vis, stk, node);

            }
        }
        stk.addFirst(i);

    }

    public static void main(String[] args) {

    }
}
