class Solution {
    public int dayBefore(int d, int n) {
        // code here
            int a = (d-n) %7;
        
        if(a<0)  a+=7;
        return a;
    }
}