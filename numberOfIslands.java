//simple recursion, same as max area of land
public class numberOfIslands {
    public int islandPerimeter(int[][] grid) {
        int res = 0;

        // using label to exit the outer loop as break only exits from the inner loop .

        outerloop: for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res = dfs_perimeter(grid, i, j);
                    // since there is only a single island in the grid(given in description) , or
                    // only 1 connected
                    // component in the grid so when we get '1' once, this means we can then
                    // traverse the entire
                    // graph through it either in horizontal or vert direction, so therefore we just
                    // break
                    // from the outer loop after getting '1'
                    // doing this brings down the Time complexity of code.
                    break outerloop;
                }

            }

        }
        return res;
    }

    int dfs_perimeter(int grid[][], int i, int j) {
        // we return 1 here since we are at the boundary of the grid which will
        // definitely contribute to the boundary
        // or if we have an adjacent cell '0' since boundaries exist near water.
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        // as -1 indicates a conquered cell so it wont contribute to the perimeter or
        // length of the boundary, since there doesn't exists any boundary between two
        // adjacent 1 cells
        if (grid[i][j] == -1)
            return 0;

        // lets conquere this cell and put some value other than 0 or 1 , so that it
        // doesn't gets traversed again
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
