class Solution {
    public boolean isFibonacci(int n) {
        // code here
        int a=5*n*n+4;
        int b=5*n*n-4;
        boolean x=Math.floor(Math.sqrt(a)) == Math.ceil(Math.sqrt(a));
        boolean y=Math.floor(Math.sqrt(b)) == Math.ceil(Math.sqrt(b));
        if(x||y){
            return true;}
            else{
        return false;}
    }
}