class Solution {
    static int nthEvenFibonacci(int n) {
        // code here
          long targetIndex = 3 * n;
        
        if (targetIndex == 0) return 0;
        
        long a = 0; // F(0)
        long b = 1; // F(1)
        long c = 0;
        
        for (int i = 2; i <= targetIndex; i++) {
            c = a + b; // Removed % mod
            a = b;
            b = c;
        }
        
        return (int)b; 
    }
}