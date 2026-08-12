class Solution {
    public int[] findSum(int n) {
        // Code here
        int oddCount = (n + 1) / 2;
        int oddSum = oddCount * oddCount;

        int evenCount = n / 2; 
        int evenSum = evenCount * (evenCount + 1);

        return new int[]{oddSum, evenSum};
    }
}