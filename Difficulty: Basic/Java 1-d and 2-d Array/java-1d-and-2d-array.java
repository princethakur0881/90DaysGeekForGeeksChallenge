class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        ArrayList<Integer> ans = new ArrayList<>();
        
        int digsum = 0;
        for(int row = 0;row<n;row++){
            for(int col =0;col<n;col++ ){
                if(row==col){
                    digsum += a[row][col];
                }
            }
        }
        ans.add(digsum);
        int maxi=0;
        for(int i=0;i<b.length;i++){
          
            maxi= Math.max(maxi,b[i]);
        }
        ans.add(maxi);
        return ans;
    }
}
