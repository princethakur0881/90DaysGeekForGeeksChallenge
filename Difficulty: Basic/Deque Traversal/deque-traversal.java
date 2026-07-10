class Solution {
    public static void printDeque(ArrayDeque<Integer> deq) {
        // code here
        deq.forEach(num->System.out.print(num+" "));
        System.out.println();
    }
}