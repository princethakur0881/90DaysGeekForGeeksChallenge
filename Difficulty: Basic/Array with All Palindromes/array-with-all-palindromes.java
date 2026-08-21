class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        // code here.
        int n = arr.length;

        for(int i = 0; i<n; i++){
               int first = arr[i];
                int reverse = 0;
           while(arr[i]>0){
               int last = arr[i]%10;
               reverse = (reverse*10)+last;
               arr[i] = arr[i]/10;
           }
           if(first != reverse){

               return false;
           }
        }
        return true;
    }
}