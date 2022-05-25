import java.util.ArrayList;

// using detect cycle in a directed graph algo

public class CourseSchedule1 {

    public static void main(String[] args) {
        int preq[][] = { { 0, 1 } };
        int n = 2;
        System.out.println(canFinish(n, preq));

    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        int arr[][] = prerequisites;
        boolean[] vis = new boolean[n];
        boolean[] currentdfs = new boolean[n];
        ArrayList<ArrayList<Integer>> adjlis = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjlis.add(new ArrayList<>());
        }
        // creating an adjlis based on the input from the matrix,storing in normal
        // adjlis format
        for (int i = 0; i < arr.length; i++) {
            adjlis.get(arr[i][0]).add(arr[i][1]);
        }
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                boolean ans = detectcyc_dfs(adjlis, vis, currentdfs, i);
                if (ans == true)
                    return false;
            }
        }
        return true;
    }

    static boolean detectcyc_dfs(ArrayList<ArrayList<Integer>> adjlis, boolean[] vis, boolean[] currentdfs, int i) {
        vis[i] = true;
        currentdfs[i] = true;
        for (int node : adjlis.get(i)) {
            System.out.println(node);
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
}
