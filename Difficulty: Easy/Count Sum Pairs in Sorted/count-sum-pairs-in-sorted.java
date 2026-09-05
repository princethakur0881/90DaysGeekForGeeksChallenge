class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
      
        int l=0;
        int r = arr.length-1;
        int count=0;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum==target){
                if(arr[l]==arr[r]){
                    int len = r-l+1;
                    count +=(len*(len-1))/2;
                    break;
                }
                int leftCount=1;
                while(l<r && arr[l]==arr[l+1]){
                    leftCount++;
                    l++;
                }
                int rightCount=1;
                while(l<r && arr[r]==arr[r-1]){
                    rightCount++;
                    r--;
                }
                count +=leftCount* rightCount;
                l++;
                r--;
                
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
            }
        }
        return count;
    }
}
