class Solution {
    int[][] sortedMatrix(int mat[][]) {
        // code here
    List<Integer> ans = new ArrayList<>();
   int n = mat.length;
   for(int row=0;row<n;row++){
       for(int col=0;col<n;col++){
           ans.add(mat[row][col]);
       }
   }
   ans.sort(Comparator.naturalOrder());
   int k=0;
    for(int row=0;row<n;row++){
       for(int col=0;col<n;col++){
          mat[row][col] = ans.get(k++);
       }
   }
   return mat;
    }
};