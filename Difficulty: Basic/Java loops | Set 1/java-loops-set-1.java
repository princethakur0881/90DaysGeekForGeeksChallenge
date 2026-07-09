class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        int evensum = 0;
        int oddsum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=N;i>=0;i--){
            if(i%2==0){
            evensum+=i;
            }
            else{
                oddsum+=i;
            }
        }
        ans.add(Integer.valueOf(evensum));
      ans.add(Integer.valueOf(oddsum));
        return ans;
            
    }
}