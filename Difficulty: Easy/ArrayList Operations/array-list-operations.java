class Solution {

    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        // Your code here
        A.addLast(x);

        // Just add, don't print anything
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {

        Collections.sort(A);
        // Your code here
        // Just sort, don't print anything
    }

        
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Just reverse, don't print anything
        Collections.reverse(A);
    }
        

    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Return the size of ArrayList 
      return A.size();
        
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        // Your code here
          
        // Sort in descending order
        Collections.sort(A, Collections.reverseOrder());
        
        // Just sort in desc order, don't print anything
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Print the elements of A, don't add new line
        for (Integer a: A) {
    System.out.print(a+" ");
}
    }
}
