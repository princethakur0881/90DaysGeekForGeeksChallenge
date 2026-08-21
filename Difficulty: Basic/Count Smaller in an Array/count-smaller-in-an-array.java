
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count=0;
        for(int i:arr){
            if(x>=i){
                count++;
            }
        }
        return count;
    }
}