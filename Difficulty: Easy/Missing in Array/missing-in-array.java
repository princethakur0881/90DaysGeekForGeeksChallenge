class Solution {
    int missingNum(int arr[]) {
        // code here
         int n =arr.length+1;
        int sum=0;
       
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
       
 long expectedSum = 1L * n * (n + 1) / 2;
    
        return (int)(expectedSum-sum);
    }
}