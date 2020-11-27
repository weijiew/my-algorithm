//Given a matrix A, return the transpose of A.
//
// The transpose of a matrix is the matrix flipped over it's main diagonal, swit
//ching the row and column indices of the matrix.
//
//
//
//
//
//
//
// Example 1:
//
//
//Input: [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
//
//
//
// Example 2:
//
//
//Input: [[1,2,3],[4,5,6]]
//Output: [[1,4],[2,5],[3,6]]
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 1000
// 1 <= A[0].length <= 1000
//
//
// Related Topics 数组
// 👍 125 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] transpose(int[][] A) {
        int r = A.length , c = A[0].length;
        int [][] a = new int[c][r];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                a[j][i] = A[i][j];
            }
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
