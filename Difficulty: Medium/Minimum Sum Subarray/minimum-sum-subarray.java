class Solution {
    public int minSubarraySum(int[] arr) {
     
            int minSum = arr[0];
            int result = arr[0];
            for(int i=1;i<arr.length;i++){
          
                minSum = Math.min(arr[i],arr[i]+minSum);
                result = Math.min(minSum,result);
            }
            return result;
        }
    }
