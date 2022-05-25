import java.util.ArrayList;
import java.util.List;
//treemap so as to keep the keys in sorted format
import java.util.TreeMap;

public class VerticalTravesalBt {
    ArrayList<Integer> verticalorder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        TreeMap<Integer, ArrayList<Integer>> mp = new TreeMap<>();
        helper(0, mp, root);
        System.out.println(mp);
        // for(Map.Entry<Integer,ArrayList<Integer>> nodes:mp.entrySet())
        // {
        // System.out.println(nodes.getValue().);
        // }
        for (int keys : mp.keySet()) {

            for (int i = 0; i < mp.get(keys).size(); i++) {

                int val = mp.get(keys).get(i);
                res.add(val);
            }

        }
        return res;
    }

    void helper(int lvl, TreeMap<Integer, ArrayList<Integer>> mp, TreeNode root) {
        if (root == null)
            return;
        if (mp.get(lvl) != null) {
            ArrayList<Integer> node = mp.get(lvl);
            node.add(root.val);
        }

        else {
            mp.put(lvl, new ArrayList<>(root.val));
        }
         // condition to get vertical traversal:-
        // the level of left child should be one less than the level of root node
        //the level of right child should be one more than that of the root node.

        helper(lvl - 1, mp, root.left);
        helper(lvl + 1, mp, root.right);
    }




    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        TreeMap<Integer,ArrayList<Integer>> mp=new TreeMap<>();
        helper(root,mp,0);
        for(ArrayList<Integer> val:mp.values())
        {
            // System.out.println(val);
            res.add(val);
        }
        return res;
    }
    
    void helper(TreeNode root, TreeMap<Integer,ArrayList<Integer>> mp,int level){
        if(root==null)
            return ;
        if(mp.get(level)==null)
        {
            ArrayList<Integer> li=new ArrayList<>();
            li.add(root.val);
            mp.put(level,li);
                        // System.out.println("first"+mp.get(level));

        }
        else if(mp.get(level)!=null)
        {
            ArrayList<Integer> lis=mp.get(level);
            lis.add(root.val);
            mp.put(level,lis);
        // System.out.println("other"+mp.get(level));

        }
        helper(root.left,mp,level-1);
        helper(root.right,mp,level+1);
        
    }
}
