class Solution {
    int minDist(int arr[], int x, int y) {
       int indx1=-1,indx2=-1,min=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==x)
           {

               indx1=i;
           }
           if(arr[i]==y)
           {

               indx2=i;

           }
           if(indx1!=-1 && indx2!=-1){
               int dis=Math.abs(indx1-indx2);
            min=Math.min(min,dis);
       }

       }
       if(min!=Integer.MAX_VALUE){
           return min;
       }

       return -1;
    }
}