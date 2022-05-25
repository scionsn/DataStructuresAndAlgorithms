import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectOfArr {

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> lis = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null) {
                if (lis.contains(nums2[i])) {
                    continue;
                } else
                    lis.add(nums2[i]);
            }
        }
        int res[] = new int[lis.size()];
        int i = 0;
        for (int e : lis) {
            res[i++] = e;
        }
        return res;
    }
}
