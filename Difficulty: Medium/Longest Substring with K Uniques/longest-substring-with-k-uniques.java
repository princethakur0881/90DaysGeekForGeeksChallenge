class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        if(s==null || s.length()==0|| s.length()<k|| k==0){
            return -1;
        }
        int n =s.length();
        int maxLength = -1;
        int low = 0;
    //   int freq [] = new int[26];
    //   int unique = 0;
    //     HashMap<Character,Integer> freq = new HashMap<>();
    //     int low =0;
    //     for(int high=0;high<n;high++){
    //         int indx = s[high]-'a';
    //         if(freq[indx]==0)  unique++;
    //         freq[s[high]]++;
    //         while(freq.size()>k){
    //             freq[s[low]]--;
    //             if(freq[s[low]]==0) 
    //             {freq.remove();}
    //             low++;
    //         }
    //     }
    // HashSet<Integer> set = new Hashset<>();
    // for(int high =0;high<n;high++){
    //     set.add(s.charAt(high));
    // }
    // while(set.size()>k){
    //     set.remove(s.charAt(low));
    // }
    //     if(set.size()==k){
    //         maxLength = Math.max(maxLength,high-low+1);
    //     }
    Map<Character, Integer> freq = new HashMap<>();
    int left = 0, maxLen = -1;

    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        freq.put(c, freq.getOrDefault(c, 0) + 1);

        // Shrink window if more than k distinct
        while (freq.size() > k) {
            char leftChar = s.charAt(left);
            freq.put(leftChar, freq.get(leftChar) - 1);
            if (freq.get(leftChar) == 0) {
                freq.remove(leftChar);
            }
            left++;
        }

        // Check if exactly k distinct
        if (freq.size() == k) {
            maxLen = Math.max(maxLen, right - left + 1);
        }
    }
        return maxLen;
    }
}