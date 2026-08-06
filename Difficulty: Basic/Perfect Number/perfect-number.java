class Solution {
    int isPerfect(int N) {
        // code here
        int n = N;
        int temp=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(temp==sum){
            return 1;
        }else{
            return 0;
    }
}
}