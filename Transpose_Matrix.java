    /*
     * Problem: Transpose Matrix (LeetCode 867)
     *
     * Approach:
     * The transpose of a matrix flips it over its diagonal.
     * Rows become columns and columns become rows.
     *
     * Given:
     * Original matrix size  -> m x n
     * Transposed matrix    -> n x m
     *
     * Since the matrix can be rectangular,
     * in-place transpose is not possible.
     * So we create a new matrix.
     *
     * Logic:
     * Traverse each element of the original matrix
     * Place matrix[i][j] into result[j][i]
     *
     * Example:
     * Input:
     * 1 2 3
     * 4 5 6
     *
     * Output:
     * 1 4
     * 2 5
     * 3 6
     *
     * Time Complexity: O(m * n)
     * Space Complexity: O(m * n)
     */
class Solution{
    public int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
