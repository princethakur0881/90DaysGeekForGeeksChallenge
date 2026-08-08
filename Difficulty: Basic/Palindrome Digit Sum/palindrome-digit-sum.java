class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
            
        // Step 1: Find sum of digits
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
    
        // Step 2: Check if sum is palindrome
        int original = sum;
        int rev = 0;
        while (sum > 0) {
            rev = rev * 10 + sum % 10;
            sum /= 10;
        }
        
        // Step 3: Return result
        return original == rev;
        
    }
}