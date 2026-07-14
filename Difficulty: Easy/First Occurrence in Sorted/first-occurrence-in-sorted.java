class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(k==arr[i]){
                return i;
            }
            
        }
        return -1;
    }
}