class Solution {
    public ArrayList<Integer> pattern(int n) {
        // code here
ArrayList<Integer>ans=new ArrayList<>();
            solve(n,ans,n);
            return ans;

        }
            private void solve(int curr,ArrayList<Integer>ans,int orig){
            ans.add(curr);

            if(curr<=0) return;

            solve(curr-5,ans,orig);

            ans.add(curr);
    }
}