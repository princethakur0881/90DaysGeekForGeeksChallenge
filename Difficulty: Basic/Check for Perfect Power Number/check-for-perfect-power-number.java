class Solution {
    public boolean checkPower(int n) {
        // code here\
        int N = n;
           if(N==1) return true;
        for(int i=2;i<=Math.sqrt(N);i++){
            int m=1;
            if(N%i==0){
                for(int j=1;j<=N/2;j++){
                    m*=i;
                    if(m==N) return true;
                }
            }
        }
        return false;
    }
};