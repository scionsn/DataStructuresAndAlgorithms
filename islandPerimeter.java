public class islandPerimeter {
    public int islandPerimetercode(int[][] grid) {
        int res = 0;
        // using label to exit the ouiter loop as break only exits from the inner loop

        outerloop: for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res = dfs_perimeter(grid, i, j);
                    // since there is only a single island in the grid , or only 1 connnected
                    // component
                    // in the grid so when we get 1 once, this means we can then traverse the entire
                    // graph
                    // thorugh it either in horizontal or vert direction, so therefore we just break
                    // from the outer loop after getting one.
                    break outerloop;
                }

            }

        }
        return res;
    }

    int dfs_perimeter(int grid[][], int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        // as -1 indicates a conquered cell so it wont contibute to the perimeter or
        // lenght of the boundary
        if (grid[i][j] == -1)
            return 0;
        // lets conquere this cell , so that it doesnt gets traversed again
        grid[i][j] = -1;
        int up = dfs_perimeter(grid, i - 1, j);
        int down = dfs_perimeter(grid, i + 1, j);
        int left = dfs_perimeter(grid, i, j - 1);
        int right = dfs_perimeter(grid, i, j + 1);
        return up + down + left + right;

    }

    public static void main(String[] args) {

    }
}
