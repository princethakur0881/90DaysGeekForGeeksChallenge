
class Solution {
    public String average(int arr[]) {
        // code her
        int total =0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
      double  avg = (double)total/arr.length;
        return String.format("%.2f",avg);
    }
}