class Solution {
    public String isAutomorphic(int n) {
          // code here
        int sq = n * n;
        int temp = n;
        int pow = 1;
        
        // find 10^digits
        while(temp > 0){
            pow *= 10;
            temp /= 10;
        }
        
        if(sq % pow == n)
            return "Automorphic";
        else
            return "Not Automorphic";
    }
}