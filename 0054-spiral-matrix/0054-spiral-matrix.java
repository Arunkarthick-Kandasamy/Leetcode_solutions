public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (up <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= down; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (up <= down) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
            }
            down--;
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}
