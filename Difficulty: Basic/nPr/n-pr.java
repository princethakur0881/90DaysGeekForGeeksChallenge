class Solution {
    public long nPr(int n, int r) {
        // code here
    // code here
    long result = 1;
    for(long i = 0; i < r; i++){
        result = result*(n-i);
    }
    return result;    
    }
}