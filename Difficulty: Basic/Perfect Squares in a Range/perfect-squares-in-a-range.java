class Solution {
    static int numOfPerfectSquares(int a, int b) {
        // code here
        int i=(int)(Math.ceil(Math.sqrt(a)));//2
        int result=1;
        int count=0;
        while(b>=result)
        {
            result=i*i;
            i++;
            if(result<=b)
            count++;
        }
        return count;
    }
};