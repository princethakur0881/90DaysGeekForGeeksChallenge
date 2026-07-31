class Solution {
    static int nthCarol(int N) {
        int n1 = (int) Math.pow(4, N);
        int n2 = (int) Math.pow(2, N + 1);
        int ans = n1 - n2 - 1;
        return ans;
    }
}