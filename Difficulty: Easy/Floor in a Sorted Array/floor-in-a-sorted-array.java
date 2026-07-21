class Solution {
    public int findFloor(int[] arr, int x) {
        int f=-1;
       for(int i=0;i<arr.length;i++){
           if(arr[i]<=x){
               f=i;
           }
       }
       return f;
        
    }
}