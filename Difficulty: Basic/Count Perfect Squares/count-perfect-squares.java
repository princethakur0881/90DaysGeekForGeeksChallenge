class Solution {
    static int countSquares(int n) {
        // code here
         int l = 1;
        int h = n;
        int ans = 0;

        while (l <= h) {

            int mid = l + (h - l) / 2;
            long square = 1L * mid * mid;

            if (square < n) {
                ans = mid;
                l = mid + 1;
            } else if (square > n) {
                h = mid - 1;
            } else {
                return mid - 1;
            }
        }

        return ans;
    }
}