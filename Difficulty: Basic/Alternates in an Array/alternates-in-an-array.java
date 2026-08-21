class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i+=2){
            ans.add(arr[i]);
        }
        return ans;
    }
}