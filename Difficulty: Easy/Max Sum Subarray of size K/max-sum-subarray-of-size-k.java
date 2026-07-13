class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
              int sum =0;
            
           for(int i=0;i<k;i++){
              
               sum+=arr[i];}
               
               int res =sum;
               int low=0;
               int high=k;
              while (high < n) {
            sum = sum - arr[low] + arr[high];
            low++;
            high++;
            res = Math.max(res, sum);
        }

           return res;
    }
}