class Solution {
    int[][] dp;
    int[][] matrix;

    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;

        int m = matrix.length;
        int n = matrix[0].length;

        dp = new int[m][n];

        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(i, j));
            }
        }

        return ans;
    }

    private int dfs(int i, int j) {

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int[] directions = {-1, 0, 1, 0, -1};

        for (int k = 0; k < 4; k++) {

            int x = i + directions[k];
            int y = j + directions[k + 1];

            if (x >= 0 && x < matrix.length &&
                y >= 0 && y < matrix[0].length &&
                matrix[x][y] > matrix[i][j]) {

                dp[i][j] = Math.max(dp[i][j], dfs(x, y));
            }
        }

        return ++dp[i][j];
    }
}