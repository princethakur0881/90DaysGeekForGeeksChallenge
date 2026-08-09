class Solution {
   public static long reverse(long a){
        long num=0;
        while(a!=0){
            long rem = a%10;
            a = a/10;
            num=num*10+rem;
        }
        return num;
    }
    static long isSumPalindrome(long n) {
        // code here
        int i =0;
        long R = 0;
        if(n==reverse(n))
           return n;
        while(i<5){
            R = n + reverse(n);
            if(R!=reverse(R)){
               n =R;
               i++;
            }
            else{
             return R;
            }
        }
        return -1;
    }
}