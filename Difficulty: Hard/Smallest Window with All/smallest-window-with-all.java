class Solution {
    public static String minWindow(String s, String p) {
int n = s.length();
       int m = p.length();

       // Frequency count for pattern string p
       int[] targetCount = new int[26];
       int uniqueCharsRequired = 0;
       for (int i = 0; i < m; i++) {
           if (targetCount[p.charAt(i) - 'a'] == 0) uniqueCharsRequired++;
           targetCount[p.charAt(i) - 'a']++;
       }

       int[] windowCount = new int[26];
       int uniqueCharsFound = 0;
       int j = 0; // Left pointer
       int minLen = Integer.MAX_VALUE;
       int startIdx = -1;
       int endIdx = -1;

       for (int i = 0; i < n; i++) {
           char curr = s.charAt(i);
           windowCount[curr - 'a']++;

           // If this character's count matches the required count in p
           if (targetCount[curr - 'a'] > 0 && windowCount[curr - 'a'] == targetCount[curr - 'a']) {
               uniqueCharsFound++;
           }

           // When all required characters are found, try to shrink the window
           while (uniqueCharsFound == uniqueCharsRequired) {
               // Update minimum window indices
               if (i - j + 1 < minLen) {
                   minLen = i - j + 1;
                   startIdx = j;
                   endIdx = i;
               }

               char leftChar = s.charAt(j);
               windowCount[leftChar - 'a']--;

               // If removing leftChar breaks the "valid window" condition
               if (targetCount[leftChar - 'a'] > 0 && windowCount[leftChar - 'a'] < targetCount[leftChar - 'a']) {
                   uniqueCharsFound--;
               }
               j++;
           }
       }

       if (startIdx == -1) return "";
       return s.substring(startIdx, endIdx + 1);
    }
}