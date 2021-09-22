import java.util.ArrayList;
import java.util.HashMap;

public class ZigZagTraversal {
	public static int[] findDiagonalOrder(int[][] matrix) {
		int res[] = new int[matrix.length * matrix[0].length];
//	        hashmap to store the sum of the indices along with the values
//	        associated with those indices
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (!map.containsKey(i + j)) {
					map.put(i + j, new ArrayList<Integer>());
				}
//		adding the values of the matrix to list with sum equal to sum of indices
				map.get(i + j).add(matrix[i][j]);
			}
		}
		int idx = 0;
		boolean flag = false;
		for (int val : map.keySet()) {
			if (flag) {
				int size = map.get(val).size();
				for (int i = 0; i < size; i++) {
					int e = map.get(val).get(i);
					res[idx++] = e;
				}
			} else {
				int size = map.get(val).size();
				for (int i = size - 1; i >= 0; i--) {
					int e = map.get(val).get(i);
					res[idx++] = e;
				}

			}
			flag = !flag;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int val : findDiagonalOrder(arr))
			System.out.println(val);
	}

}
