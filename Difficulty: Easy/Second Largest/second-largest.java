class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
            seclargest = largest;
            largest =num;
        }
        else if(num > seclargest && num != largest){
            seclargest = num;
        }
        }
        if(seclargest == Integer.MIN_VALUE){
            return -1;
        }
        return seclargest;
    }
}