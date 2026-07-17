class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
           int x=n;
        while(n!=0)
        {
              int digit=n%10;
              if(digit!=0 && x% digit==0)
              count++;
              n/=10;
        }
        return count;
    }
}