class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
    String s3 = s1+s2;
    StringBuilder str = new StringBuilder(s3);
    str.reverse();
    return str.toString();
      
    }
}