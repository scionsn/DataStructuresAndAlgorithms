//simple recursion
public class maxAreaOfLand {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    area = Math.max(dfs_maxarea(grid, i, j), area);
                }
            }
        }
        return area;
    }

    int dfs_maxarea(int grid[][], int i, int j) {
        // if the value of grid is anything other than 1 we dont want to trsverse the
        // gridn further
        // and just return from it.
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        // -1 indicates that we already traversed that one block before , so that we
        // dont traverse
        // it again so we change it to a different value other than one.
        grid[i][j] = -1;

        int up = dfs_maxarea(grid, i - 1, j);
        int down = dfs_maxarea(grid, i + 1, j);
        int left = dfs_maxarea(grid, i, j - 1);
        int right = dfs_maxarea(grid, i, j + 1);
        return 1 + up + down + left + right;

    }
    public static void main(String[] args) {
        
    }
}
