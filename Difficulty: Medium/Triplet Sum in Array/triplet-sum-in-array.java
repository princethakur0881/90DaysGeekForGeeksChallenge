class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int n = arr.length;
        if(n<=2 || n<0)return false;
        for(int i=0;i<n-2;i++){
            
            int l=i+1;
            int r = n-1;
            while(l<r){
                int sum = arr[i]+arr[l]+arr[r];
                 if(target==sum){
                     return true;
                 }
                 else if(target>sum){
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
