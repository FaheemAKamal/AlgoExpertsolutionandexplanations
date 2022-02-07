class Solution {
     public int findPaths(int m, int n, int N, int i, int j) {
        if (N == 0) {
            return 0;
        }
         
        int num = (int)Math.pow(10, 9) + 7;
         
        int[][] prev = new int[m][n];
         
        for (int k = 1; k <= N; k++) {
            int[][] curr = new int[m][n];
            for (int row = 0; row < m; row++) {
                for (int col = 0; col < n; col++) {
                    curr[row][col] = (curr[row][col] + (row == 0 ? 1 : prev[row - 1][col])) % num;
                    curr[row][col] = (curr[row][col] + (row == m - 1 ? 1 : prev[row + 1][col])) % num;
                    curr[row][col] = (curr[row][col] + (col == 0 ? 1 : prev[row][col - 1])) % num;
                    curr[row][col] = (curr[row][col] + (col == n - 1 ? 1 : prev[row][col + 1])) % num;
                }
            }
             
            prev = curr;
        }
         
        return (int)(prev[i][j] % num);
    }
}
