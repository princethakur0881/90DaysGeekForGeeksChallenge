class Solution {

    int[][] dp;

    int solve(int pos, int sum, int n) {
        if (sum < 0)
            return 0;

        if (pos == n)
            return (sum == 0) ? 1 : 0;

        if (dp[pos][sum] != -1)
            return dp[pos][sum];

        int ans = 0;
        int start = (pos == 0) ? 1 : 0;

        for (int digit = start; digit <= 9; digit++) {
            if (sum >= digit) {
                ans += solve(pos + 1, sum - digit, n);
            }
        }

        return dp[pos][sum] = ans;
    }

    public int countWays(int n, int sum) {

        if (sum > 9 * n)
            return -1;

        dp = new int[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        int ans = solve(0, sum, n);

        return ans == 0 ? -1 : ans;
    }
}