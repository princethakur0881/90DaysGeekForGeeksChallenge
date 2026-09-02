class Solution {
   
        
    static int fun(int n){

         if(n%4==1)return 1;
         if(n%4==2)return n+1;
         if(n%4==3)return 0;
         if(n%4==0)return n;

         return 0;
     }

     public static int findXOR(int l, int r) {

           return (fun(l-1)^fun(r));
     }
}