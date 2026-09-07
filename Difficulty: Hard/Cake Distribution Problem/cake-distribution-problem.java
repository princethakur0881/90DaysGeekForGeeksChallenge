class Solution {
   private boolean canDivide(int[] sweetness, int minSweetness, int K) {
           int currentSum = 0;
           int pieces = 0;

           for (int i = 0; i < sweetness.length; i++) {
               currentSum += sweetness[i];
               if (currentSum >= minSweetness) {
                   pieces++;
                   currentSum = 0; // Start a new piece
               }
               if (pieces >= K + 1) {
                   return true; // We can divide the cake into at least K+1 pieces
               }
           }

           return false;
       }

       // Main function to find the maximum minimum sweetness
       public int maxSweetness(int[] sweetness, int K) {
           // Binary search for the maximum possible minimum sweetness
           int low = 1, high = 0;
           int N = sweetness.length;

           // Calculate total sweetness
           for (int i = 0; i < N; i++) {
               high += sweetness[i];
           }

           int result = low;

           // Perform binary search to find the maximum possible minimum sweetness
           while (low <= high) {
               int mid = (low + high) / 2;

               if (canDivide(sweetness, mid, K)) {
                   result = mid;
                   low = mid + 1; // Try for a higher value
               } else {
                   high = mid - 1; // Try for a smaller value
               }
           }

           return result;
       }
}