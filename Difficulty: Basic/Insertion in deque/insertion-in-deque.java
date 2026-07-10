class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        ArrayDeque <Integer> dq = new ArrayDeque<Integer>();
        for(int i:arr){
            dq.offer(i);
        }
        return dq;
    }
}