import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
//		top at first row , btm at last row, left at first colm and right at last colm
		int top = 0, btm = matrix.length - 1, left = 0, right = matrix[0].length - 1;
		int dir = 0;
		while (left <= right && top <= btm) {
			if (dir == 0) {
				for (int i = left; i <= right; i++) {
					res.add(matrix[top][i]);

				}
				top++;

			} else if (dir == 1) {
				for (int i = top; i <= btm; i++) {
					res.add(matrix[i][right]);

				}
				right--;
			} else if (dir == 2) {
				for (int i = right; i >= left; i--) {
					res.add(matrix[btm][i]);

				}
				btm--;
			} else if (dir == 3) {
				for (int i = btm; i >= top; i--) {
					res.add(matrix[i][left]);

				}
				left++;
			}
//		             modulus 4 ensures that my valueof dir remains between 0 and 3 only
			dir = (dir + 1) % 4;
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
