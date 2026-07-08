class Solution {
    public static int nthDay(int d, int n) {
        // write your code here
        n=n%7;
        int day =d-n;
        if(day>=0) return day;
        else return(day+7)%7;
    }
}