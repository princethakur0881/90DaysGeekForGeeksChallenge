class Solution {
    public int sumOfMatrix(int[][] mat) {
        // code here
        int sum=0;
        int n =mat.length;
        for(int row=0;row<n;row++){
            for(int col=0;col<mat[row].length;col++){
                sum+=mat[row][col];
            }
        }
        return sum;
    }
}