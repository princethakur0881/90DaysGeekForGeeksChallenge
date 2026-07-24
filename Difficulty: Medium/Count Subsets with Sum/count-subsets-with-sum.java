class Solution {
    static int perfectSum(int[] arr, int target) {
        // code here
          int n=arr.length;
        int []prev = new int [target+1];
        prev[0]=1;
        for(int i=1;i<=n;i++){
            int [] curr = new int[target+1];
            for(int j=0;j<=target;j++){
                int take =0;
                if(j>=arr[i-1])take=prev[j-arr[i-1]];
                int nontake = prev[j];
                curr[j]=take+nontake;
            }
            prev=curr;
        }
        return prev[target];
    }
}