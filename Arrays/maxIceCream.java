import java.util.Arrays;

public class maxIceCream {
	 public int maxIceCream(int[] costs, int coins) {
//		 greedy approach , picking the coins with minim costs first so that we can buy max ice creams
         Arrays.sort(costs);
        int max=0;
        int i=0;
//        we can subrtact from coins only if the value at that index is less than or equal to
//        the value of coins
//        this techniq doesnt give error
        while(i<costs.length && coins >= costs[i]) {
            coins = coins - costs[i++];
            max++;
        }
    return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
