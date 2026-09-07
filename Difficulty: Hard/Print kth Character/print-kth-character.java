class Solution {
    public char findKthChar(String s, int k) {
           int n = s.length();

           int[] sa = suffixArray(s);

           int[] lcp = lcpArray(s, sa);



           int i = 0;

           while (i < n && k - sum(lcp[i] + 1, n - sa[i]) > 0) {

               k -= sum(lcp[i] + 1, n - sa[i]);

               i++;

           }

           if (i == n) {

               return (char)-1;

           }

           int r = lcp[i] + 1;

           while (k > r) {

               k -= r++;

           }

           return s.charAt(sa[i] + k - 1);

       }



       private int sum(int l, int r) { return (r - l + 1) * (l + r) / 2; }



       private int[] suffixArray(String str) {

           int n = str.length() + 1;

           int[] arr = new int[n];

           int[] rank = new int[n];

           int[] newRank = new int[n];

           int[] newArr = new int[n];

           for (int i = 0; i < n - 1; i++) {

               rank[arr[i] = i] = str.charAt(i);

           }

           rank[arr[n - 1] = n - 1] = 0;



           sort(rank, arr, newArr, n, 123);

           for (int shift = 1; shift <= n; shift <<= 1) {

               newRank[arr[0]] = 0;

               for (int i = 1; i < n; i++) {

                   newRank[arr[i]] = newRank[arr[i - 1]];

                   if (rank[arr[i]] != rank[arr[i - 1]] ||

                       rank[(arr[i] + shift / 2) % n] !=

                           rank[(arr[i - 1] + shift / 2) % n]) {

                       ++newRank[arr[i]];

                   }

               }

               rank = newRank.clone();

               for (int i = 0; i < n; i++) {

                   arr[i] = (arr[i] - shift + n) % n;

               }

               sort(rank, arr, newArr, n, n);

           }

           return Arrays.copyOfRange(arr, 1, n);

       }



       private void sort(int[] rank, int[] arr, int[] newArr, int n, int charBound) {

           int[] count = new int[charBound];

           int[] pos = new int[charBound];

           for (int r : rank) {

               count[r]++;

           }

           for (int i = 1; i < charBound; i++) {

               pos[i] = pos[i - 1] + count[i - 1];

           }

           for (int x : arr) {

               newArr[pos[rank[x]]++] = x;

           }

           System.arraycopy(newArr, 0, arr, 0, n);

       }



       private int[] lcpArray(String str, int[] sa) {

           int n = sa.length;

           int[] lcp = new int[n];

           int[] rank = new int[n];

           for (int i = 0; i < n; i++) {

               rank[sa[i]] = i;

           }

           for (int i = 0, k = 0; i<n; i++, k -= k> 0 ? 1 : 0) {

               if (rank[i] > 0) {

                   int j = sa[rank[i] - 1];

                   while (i + k < str.length() && j + k < str.length() &&

                          str.charAt(i + k) == str.charAt(j + k)) {

                       ++k;

                   }

                   lcp[rank[i]] = k;

               }

           }

           return lcp;
        
    }
}