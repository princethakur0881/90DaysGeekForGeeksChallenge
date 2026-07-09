class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
      
        int n = arr.length;
          int brr[] = new int[n];
        for(int i=0;i<n;i++){
             brr[i] = arr[i]-1;
            
        }
        return brr;
    }
}