class Solution {
    public int reverseBits(int n) {
        // code here
        return Integer.valueOf(new StringBuilder(Integer.toString(n,2)).reverse().toString(),2);


    }
}