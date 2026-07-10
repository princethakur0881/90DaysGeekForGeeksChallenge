class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // code here
        List<Integer> list = new ArrayList<>(deq);
        list.remove(X);
        deq.clear();
        deq.addAll(list);
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        
       List<Integer> list = new ArrayList<>(deq);
        for (int i = end - 1; i >= start; i--) {
            list.remove(i);
        }
        deq.clear();
        deq.addAll(list);
    
    }

        
    public static void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}