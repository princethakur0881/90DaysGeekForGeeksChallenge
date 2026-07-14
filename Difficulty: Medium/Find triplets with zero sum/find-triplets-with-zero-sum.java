class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        Arrays.sort(arr);
        int n = arr.length;
    for(int i=0;i<n-2;i++){
        int l=i+1;
        int r = n-1;
        
        while(l<r){
            int target = arr[i]+arr[l]+arr[r];
            if(target==0){
                return true;
                
            }
            else if(target<0){
                l++;
            }
            else{
                r--;
            }
        }
    }
    return false;
    }
}