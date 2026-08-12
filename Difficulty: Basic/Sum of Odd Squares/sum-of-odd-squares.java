class Solution {
    public int sumofodd(int n) {
        // code here
         int count = 0 ;
        int sum = 0 ;
        for(int i = 1; i>=1; i++){
            long square = 0;
            if(i%2!=0){
                square = i*i;
                count++;
                sum+=square;
            }
            if(count == n){
                break;
            }
            
        }
        return sum;
    }
};