class Solution {
    public int squareFactor(int n) {
        // code here
        int N =n;
         int sum=0;
        for(long i=1;i<=(int)Math.sqrt(N);i++){
            if(N%(i*i)==0)sum++;
        }
        return sum;
    }
}