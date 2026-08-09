class Solution {
    int factorial(int n) {
        // code here
        if((n==0)||(n==1))
        return 1;
        int fact = 1;
        while(n>1){
            fact *=n;
            n--;
        }
        return fact;
    }
}
