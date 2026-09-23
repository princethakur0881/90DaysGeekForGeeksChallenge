class Solution {
    public int minChar(String s) {
    int a=s.length();
            String t = new StringBuilder(s).reverse().toString();
            int b=compute(s+"#"+t);
            return a-b;
        }
        private int compute(String s){
            int n=s.length();
            int arr[]=new int[n];
            int i=1;
            int l=0;
            while(i<n){
                if(s.charAt(i)==s.charAt(l)){
                    l++;
                    arr[i]=l;
                    i++;
                }
                else{
                    if(l!=0){
                        l=arr[l-1];
                    }
                    else{
                        i++;
                    }
                }
            }
            return arr[n-1];
    }
}