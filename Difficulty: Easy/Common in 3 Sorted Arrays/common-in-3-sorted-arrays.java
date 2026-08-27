class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int ai = 0, bi = 0, ci = 0;
        int prev = Integer.MIN_VALUE;

        while(ai < a.length && bi < b.length && ci < c.length){
            int smallest = Math.min(a[ai], Math.min(b[bi], c[ci]));
            if(smallest != prev && a[ai] == b[bi] && b[bi] == c[ci]){
                list.add(smallest);
                prev = smallest;
            }
            if(smallest == a[ai])
                ai++;
            if(smallest == b[bi])
                bi++;
            if(smallest == c[ci])
                ci++;
        }

        return list;
    }
}