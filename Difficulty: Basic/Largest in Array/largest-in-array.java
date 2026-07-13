class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        int largst = arr[0];
        for(int i=0;i<n;i++){
            
            if(arr[i]>largst){
                largst =arr[i];
            }
        }
        return largst;
    }
}
