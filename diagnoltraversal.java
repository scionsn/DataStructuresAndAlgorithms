import java.util.ArrayList;
import java.util.HashMap;

public class diagnoltraversal {
    ArrayList<Integer> diagnolTraversal(TreeNode root) {

        if (root == null)
            return null;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        helper(root, map, 0);
        System.out.println(map);
        for (int keys : map.keySet()) {
            for (int i = 0; i < map.get(keys).size(); i++) {
                int node = map.get(keys).get(i);
                res.add(node);
            }
        }

        return res;
    }

    void helper(TreeNode root, HashMap<Integer, ArrayList<Integer>> map, int lvl) {
        if (root == null)
            return;
        if (map.get(lvl) == null) {
            ArrayList<Integer> node = new ArrayList<>();
            node.add(root.val);
            map.put(lvl, node);

        } else if (map.get(lvl) != null) {
            ArrayList<Integer> nodes = map.get(lvl);
            nodes.add(root.val);
            map.put(lvl, nodes);
        }
        // condition to get diagnol traversal:-
        // the level of left child should be one more than the level of root node
        //the level of right child should be same as that of the root node.

        helper(root.left, map, lvl + 1);
        helper(root.right, map, lvl);
    }
}
