class Solution {
   
         
   
        // code here
         static long gcd(long a,long b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
     public static long getSmallestDivNum(int n){
        long ans=1;
        for(int i=2;i<=n;i++){
            ans=(ans*i)/gcd(ans,i);
        }
        return ans;
    }
}