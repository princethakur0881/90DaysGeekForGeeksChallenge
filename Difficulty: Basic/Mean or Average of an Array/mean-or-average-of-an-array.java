class Solution {
    public static int findMean(int[] arr) {
        // code here\
        // int n = arr.length;
        // int low = 0;
        // int high= n-1;
        // int mid  = (low+(high-low))/2;
        // if(n%2==0){
        //     nums
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int res = sum/n;
        return res;
        }
    
};