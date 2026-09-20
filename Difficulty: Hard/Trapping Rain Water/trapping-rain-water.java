class Solution {
    public int maxWater(int arr[]) {
       int left = 0, right = arr.length - 1;
       int leftMax = 0, rightMax = 0;
       int total = 0;

       while (left < right) {

           if (arr[left] <= arr[right]) {

               if (arr[left] >= leftMax) {
                   leftMax = arr[left];
               } else {
                   total += leftMax - arr[left];
               }

               left++;

           } else {

               if (arr[right] >= rightMax) {
                   rightMax = arr[right];
               } else {
                   total += rightMax - arr[right];
               }

               right--;
           }
       }

       return total;
        
    }
}
