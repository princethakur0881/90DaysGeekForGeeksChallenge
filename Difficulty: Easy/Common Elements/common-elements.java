class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        
        Arrays.sort(a);
        Arrays.sort(b);
         ArrayList<Integer> output = new ArrayList<>();
        int i=0;
        int j=0;
       
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                output.add(a[i]);
                i++;
                j++;
                
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
            
        }
        return output;
    }
}