class Solution {
    public int minProd(int[] arr) {
        // code here
        int n = arr.length;
        int maxNeg = Integer.MIN_VALUE;
        int minPOS =Integer.MAX_VALUE;
        int countneg = 0;
        int product = 1;
        int countzero = 0;

        if(n==1)return arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
               countzero++;
                continue;
            }
            if(arr[i]<0){
               countneg++;
                maxNeg=Math.max(maxNeg,arr[i]);
            }else{
                minPOS = Math.min(arr[i],minPOS);
            }
           product*=arr[i];
        }

        if(countneg==0){
        if(countzero>0)return 0;
        return minPOS;
        }

        if(countneg%2==0){
            product/=maxNeg;
        }

        return product;
    }
}