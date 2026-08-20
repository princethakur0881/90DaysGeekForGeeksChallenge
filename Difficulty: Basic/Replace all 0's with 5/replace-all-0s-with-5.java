class Solution {
    public int convertFive(int n) {
        // code here
        int rev =0;
        if(n==0){
        return 5;
        }
        while(n!=0) {
        int rem=n%10;
        if(rem==0) {
        rem+=5;
        }
        rev=rev*10+rem;
        n/=10;
        }

        while(rev!=0) {
        int rem=rev%10;
        n=n*10+rem;
        rev/=10;
        }
        return n;
            }
        }
