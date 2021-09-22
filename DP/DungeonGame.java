import java.util.HashMap;

public class DungeonGame {
	public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon == null || dungeon.length == 0 || dungeon[0].length == 0)
           return 0;
       HashMap<String,Integer> mp=new HashMap<>();
       return rec(0, 0, dungeon,mp);
   }
 private int rec(int i, int j, int[][] dungeon,HashMap<String,Integer> mp) {
     if(i >= dungeon.length || j >= dungeon[0].length)
         return Integer.MAX_VALUE;
    String key=i+"part"+j;
     if(mp.containsKey(key)){
         return mp.get(key);
     }
     int next= Math.min(rec(i+1, j, dungeon,mp), rec(i, j+1, dungeon,mp));
     // int health = Math.min(rec(i+1, j, dungeon), rec(i, j+1, dungeon));
 
     if(next == Integer.MAX_VALUE)
        next  = 1;
     
     int res =Math.max(next-dungeon[i][j],1);
     mp.put(key,res);
     return res;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 }

