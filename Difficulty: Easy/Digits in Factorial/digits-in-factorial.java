class Solution {
    public int digitsInFactorial(int n) {
        // code here
        double res = 1;
        for(int i = 2; i<=n; i++){

            // (n!) = Math.log10(n!)

            res = res+Math.log10(i);
        }
         return (int)(Math.floor(res));
    }
}
