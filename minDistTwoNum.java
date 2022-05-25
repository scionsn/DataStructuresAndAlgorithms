// ref-gfg
// By analyzing closely it can be seen that every x 
// followed by a y or vice versa can only be the closest pair (minimum distance) so ignore all other pairs.

public class minDistTwoNum {
    int minDist(int a[], int n, int x, int y) {
        // prev_idx stores the idx of x or y
        int prev_idx = -1, min_dist = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x || a[i] == y) {
                if (prev_idx != -1 && a[i] != a[prev_idx])
                    min_dist = Math.min(min_dist, i - prev_idx);
                // update prev_idx when there is a match
                prev_idx = i;

            }
        }

        return min_dist == Integer.MAX_VALUE ? -1 : min_dist;
    }
}
