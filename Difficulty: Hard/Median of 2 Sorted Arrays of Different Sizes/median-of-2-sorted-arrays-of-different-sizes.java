class Solution {
    public double medianOf2(int a[], int b[]) {
       int n=a.length;
               int m= b.length;
               int totalsz=n + m;
               int count=totalsz%2==0?(totalsz-2)/2 : totalsz/2;
               if(count==0)return (a[0]*1.0 + b[0]*1.0)/2.0;
               double ans=Double.MAX_VALUE;
               int i=0;
               int j=0;

               while(i<n && j<m){
                   if(a[i]<=b[j])i++;
                   else j++;
                   count--;

                   if((totalsz%2==0)&& (count==0)){
                       if(i<n && j<m) ans=(a[i]*1.0+b[j]*1.0)/2.0;
                       if(j<m && i<n-1){
                           ans=Math.min(ans,(b[j]*1.0 + a[i+1]*1.0)/2.0);
                       }
                       if(i<n-1){
                           ans=Math.min(ans,(a[i]*1.0 + a[i+1]*1.0)/2.0);
                       }

                       if(j<m-1){
                          ans=Math.min(ans,(b[j]*1.0 + b[j+1]*1.0)/2.0); 
                       }
                       if(i<n && j<m-1){
                           ans=Math.min(ans,(a[i]*1.0 + b[j+1]*1.0)/2.0);
                       }

                       return ans;
                   }else if(i<n && j<m && (totalsz%2!=0)&& (count==0)){
                       ans=Math.min(a[i]*1.0,b[j]*1.0);
                       return ans;
                   }

               }
               while(i<n){
                   if(count==0 && totalsz%2==0){
                        ans=Math.min(ans,(a[i]*1.0 + a[i+1]*1.0)/2.0);
                   }
                   if(count ==0 && totalsz%2!=0){
                       ans=a[i]*1.0;
                       return ans;
                   }
                   i++;
                   count--;
               }
               while(j<m){
                   if(count==0 && totalsz%2==0){
                        ans=Math.min(ans,(b[j]*1.0 + b[j+1]*1.0)/2.0);
                   }
                   if(count ==0 && totalsz%2!=0){
                       ans=b[j]*1.0;
                       return ans;
                   }
                   j++;
                   count--;
               }
              return ans;
    }
}