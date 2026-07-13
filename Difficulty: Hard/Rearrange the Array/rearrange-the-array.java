class Solution {
    
        // code here
        int gcd(int a, int b) {

        while (b != 0) {

            int temp = a % b;

            a = b;

            b = temp;

        }

        return a;

    }

    long lcm(long a, long b) {

        return (a / gcd((int)a, (int)b)) * b;

    }

    int minOperations(int[] b) {

        int n = b.length;

        boolean[] visited = new boolean[n];

        long ans = 1;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                int len = 0;

                int curr = i;

                while (!visited[curr]) {

                    visited[curr] = true;

                    curr = b[curr] - 1;

                    len++;

                }

                ans = lcm(ans, len);

            }

        }

        return (int)(ans % 1000000007);
    }
}