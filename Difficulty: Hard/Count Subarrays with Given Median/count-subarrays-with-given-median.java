class Solution {
    
public static int getSubarrayCount(int n,int []arr,int m){
    int [] freq =new int[2*n+1];
    int  total=0,count=0;
    int curSum=n;
    freq[curSum]++;

    for(int i=0; i<n; i++){
        int diff=-1;
        if(arr[i]>=m){
            diff=1;

        }
        if (diff==-1){
            total-=freq[(curSum+diff)];
        }else{
            total += freq[curSum];
        }
        curSum+=diff;
        count+=total;
        freq[curSum]++;
    }
    return count;
    }

    
   int  countSubarray(int[] arr, int m) {
        int N =arr.length;
       return getSubarrayCount(N,arr,m)-getSubarrayCount(N,arr,m+1);
        
    }
}