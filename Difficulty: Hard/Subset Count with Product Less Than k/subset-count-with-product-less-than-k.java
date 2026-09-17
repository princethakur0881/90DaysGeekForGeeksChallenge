class Solution {
   int solve(int a[], int n, int k,int i,int m){
         if(m>k)return 0;
         if(i==n) return 1;

         return solve(a,n,k,i+1,m*a[i]) + solve(a,n,k,i+1,m);


      }
      int numOfSubsets(int arr[],int k) {
          int n =arr.length;

          return solve(arr,n,k,0,1)-1;
      }


};