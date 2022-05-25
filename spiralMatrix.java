import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        // left points to first col, top to first row, bottom to last row and righgt to
        // last column
        int left = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    ans.add(matrix[top][i]);
                }
                top++;
            }
            if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                right--;
            }
            if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
            // since there are only 4 directions and it moves in these 4 directions again
            // and again
            direction = (direction + 1) % 4;

        }
        return ans;
    }
}
