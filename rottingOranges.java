// grid based graph question
import java.util.LinkedList;

public class rottingOranges {
    public int orangesRotting(int[][] grid) {
        LinkedList<coordinate> q = new LinkedList<>();
        int tot_orange = 0, time = 0, rot = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    // add roten first in queue as they are the source for the bfs.
                    q.addLast(new coordinate(i, j));
                }
                if (grid[i][j] == 2 || grid[i][j] == 1)
                    tot_orange++;
            }
        }
        // if there are no oranges itself in the grid return 0
        if (tot_orange == 0)
            return time;
        while (!q.isEmpty()) {
            // the queue contains rotten orane only , so the curernt size give the number of
            // rotten
            // orange in queue
            int size = q.size();
            rot += size;
            if (rot == tot_orange)
                return time;
            // in 1 traversal the time increases byh 1 unit.
            time++;

            for (int i = 0; i < size; i++) {
                coordinate rotten = q.removeFirst();
                if (rotten.x - 1 >= 0 && grid[rotten.x - 1][rotten.y] == 1) {
                    // make above orange as rotten
                    grid[rotten.x - 1][rotten.y] = 2;
                    q.addLast(new coordinate(rotten.x - 1, rotten.y));
                }
                if (rotten.x + 1 < grid.length && grid[rotten.x + 1][rotten.y] == 1) {
                    // make below orange as rotten
                    grid[rotten.x + 1][rotten.y] = 2;
                    q.addLast(new coordinate(rotten.x + 1, rotten.y));
                }
                if (rotten.y - 1 >= 0 && grid[rotten.x][rotten.y - 1] == 1) {
                    // make left orange as rotten
                    grid[rotten.x][rotten.y - 1] = 2;
                    q.addLast(new coordinate(rotten.x, rotten.y - 1));
                }
                if (rotten.y + 1 < grid[0].length && grid[rotten.x][rotten.y + 1] == 1) {
                    // make right orange as rotten
                    grid[rotten.x][rotten.y + 1] = 2;
                    q.addLast(new coordinate(rotten.x, rotten.y + 1));
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        
    }
}

class coordinate {
    int x;
    int y;

    coordinate(int x, int y) {
        this.x = x;
        this.y = y;

    }
}
