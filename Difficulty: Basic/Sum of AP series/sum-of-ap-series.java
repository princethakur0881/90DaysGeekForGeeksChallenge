class Solution {
    public int sumOfAP(int n, int a, int d) {
        // code here
       int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a;
            a=a+d;
        }
        return sum;
    }
};