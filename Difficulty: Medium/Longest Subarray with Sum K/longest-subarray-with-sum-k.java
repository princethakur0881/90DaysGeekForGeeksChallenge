class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> ob=new HashMap<>();
        
        int n=arr.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==k){
             max=i+1;
            }
            if(ob.containsKey(sum-k)){
                max=Math.max(max,i-ob.get(sum-k));
            }
            if(!ob.containsKey(sum)){
                ob.put(sum,i);
            }
        }
       
        
         return max;
    }
}
