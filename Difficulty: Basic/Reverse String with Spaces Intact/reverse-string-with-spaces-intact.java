class Solution {
    String reverses(String s) {
        // your code here
        String str = s.replace(" ", "");
               int count = str.length() - 1;

               StringBuilder sb = new StringBuilder();

               for(int i=0; i<s.length(); i++){
                   if(s.charAt(i) == ' '){
                       sb.append(' ');
                   }
                   else{
                       sb.append(str.charAt(count--));
                   }
               }

               return sb.toString();
    }
}