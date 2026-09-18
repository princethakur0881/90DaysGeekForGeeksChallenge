class Solution {
    public double medianOf2(int a[], int b[]) {
            // Your Code Here

            int n= a.length;
            int total= 2*n;
            int al=0;
            int bl=0;
            int i=0;
            int left= Integer.MIN_VALUE;
            int right= Integer.MIN_VALUE;

            while ((al < a.length || bl < b.length) && (left == Integer.MIN_VALUE || right == Integer.MIN_VALUE)) {
                int val;
                if (bl >= b.length || (al < a.length && a[al] < b[bl])) {
                    val = a[al++];
                } else {
                    val = b[bl++];
                }
                if (i == (total - 1) / 2) {
                    left = val;
                }
                if (i == total / 2) {
                    right = val;
                    break; 
                }
                i++;
            }
            return (double) (left + right) / 2;
        }
    }
