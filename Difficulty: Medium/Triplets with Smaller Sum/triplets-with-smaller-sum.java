class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int ans =0;
        for(int i=0;i<arr.length-2;i++){
            int l = i+1;
            int r=arr.length-1;
            while(l<r){
                int totalSum = arr[i]+arr[l]+arr[r];
                if(sum>totalSum){
                  ans= ans +(r-l);
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return ans;
    }
}