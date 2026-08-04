class Solution {
    public int commonDivisor(int a, int b) {
        // code here
          // Complete the function
    int x=Math.min(a,b);
    int ans=0;
    for(int i=1;i<=x;i++)
    {
        if(a%i==0 && b%i==0)
            ans++;
        
    }
    return(ans);
    }
}