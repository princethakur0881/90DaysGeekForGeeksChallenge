class Solution {
    static String delAlternate(String s) {
        // code here
        String str ="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                str +=s.charAt(i);
            }
          
        }
        return str;
    }
}