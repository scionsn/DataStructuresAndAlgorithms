import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1)
            return intervals;
        // sorting the intervals in ascending order of thier start time.
        Arrays.sort(intervals, (i1, i2) -> {
            return i1[0] - i2[0];
        });

        List<int[]> res = new ArrayList<>();
        int comp_interval[] = intervals[0];
        res.add(comp_interval);
        for (int i = 1; i < intervals.length; i++) {
            // since we have already added first interval to the comp interval,
            // so just compare the value the value of the first idx of current with the
            // second index of comp interval, if its less or equal , update the comp, since
            // the comp_interval is an array so its call by reference and the value gets
            // updatred in res list as well , if the idx is not less or equal,
            // then just update the comp_interval with the current , so that it can now be
            // compared with the others and add it into the list
            if (comp_interval[1] >= intervals[i][0]) {
                comp_interval[1] = Math.max(comp_interval[1], intervals[i][1]);
            } else {
                comp_interval = intervals[i];
                res.add(comp_interval);
            }
        }
        // declare it like this only , else it gives an error
        return res.toArray(new int[res.size()][2]);

    }
}
